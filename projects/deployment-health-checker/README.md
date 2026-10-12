[Course homepage](../../README.md)

# Day 10 milestone — Deployment Health Checker

**Goal:** Combine the first ten lessons in one small console program. This is an optional consolidation exercise after Day 10, rather than extra material to squeeze into the 15-minute lesson.

Store an application name and a list of environments, calculate health in a method, classify the result, select an environment with a switch, iterate through environments, and simulate bounded deployment retries. The three-level status preserves Day 5’s thresholds; only Approved proceeds to deployment. Review required remains blocked pending review.

```java
public class Main {
    public static void main(String[] args) {
        String application = "booking-api";
        String[] environments = {"DEV", "QA", "STG", "PROD"};
        double health = calculateHealthPercentage(20, 19);
        String status = classifyHealth(health);

        System.out.println("Application: " + application);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + status);
        for (int i = 0; i < environments.length; i++) {
            System.out.println("Checking environment: " + environments[i]);
        }
        selectEnvironment("PROD");
        if (status.equals("Approved")) {
            deployApplication(application);
        } else {
            System.out.println("Deployment blocked: " + status);
        }
    }

    public static double calculateHealthPercentage(int totalPods, int healthyPods) {
        // This beginner version requires valid counts and a positive total.
        return healthyPods * 100.0 / totalPods;
    }

    public static String classifyHealth(double health) {
        if (health >= 95) {
            return "Approved";
        } else if (health >= 80) {
            return "Review required";
        } else {
            return "Rejected";
        }
    }

    public static void selectEnvironment(String environment) {
        switch (environment) {
            case "DEV": System.out.println("Development deployment"); break;
            case "QA": System.out.println("Testing deployment"); break;
            case "STG": System.out.println("Staging deployment"); break;
            case "PROD": System.out.println("Production deployment"); break;
            default: System.out.println("Unknown environment");
        }
    }

    public static void deployApplication(String application) {
        int attempts = 0;
        int maxAttempts = 3;
        boolean successful = false;
        while (!successful && attempts < maxAttempts) {
            attempts++;
            System.out.println("Deploying " + application + ": attempt " + attempts);
            if (attempts == 2) {
                successful = true;
            }
        }
        System.out.println("Deployment successful: " + successful);
    }
}
```

**Expected output**

```text
Application: booking-api
Health: 95.0%
Decision: Approved
Checking environment: DEV
Checking environment: QA
Checking environment: STG
Checking environment: PROD
Production deployment
Deploying booking-api: attempt 1
Deploying booking-api: attempt 2
Deployment successful: true
```

**Milestone challenge:** Change healthy pods to 17, then to 15. Predict and verify the decision and whether retry messages appear. Add a fifth environment to the array and its matching switch case. Explain which part of the program comes from each earlier episode.

**Completion criteria:** With 19 of 20 healthy pods, approve at 95.0%; with 17, require review at 85.0%; with 15, reject at 75.0%. The latter two runs must print a blocked message and make no deployment attempts. The new environment must appear once during the loop and have a defined switch case.

This program models decisions and retries locally. It does not deploy infrastructure, measure real application health, or connect to AWS. Input validation, exceptions, persistent state, classes, and real integrations belong in later lessons.


Run from this directory with `javac Main.java` followed by `java Main`.
