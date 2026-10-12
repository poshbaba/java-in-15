# Day 30 — Build Your First Java Application — Deployment Manager

[Course homepage](../../README.md) · [Runnable demo](demo/src/main/java/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Build Your First Java Application — Deployment Manager in 15 Minutes | Day 30

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Load and validate a JSON application inventory.
- Select an application and enum environment from a console menu.
- Apply health policy before deploying.
- Bound simulated retries and report success or failure.
- Run unit tests and explain the responsibility of each class.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show a successful QA deployment and a review-required deployment that is blocked. |
| Concept | 0:30–3:00 | Explain Integration of application objects, private state, interface behavior, lists, maps, enums, file input, JSON parsing, menu validation, decisions, retries, and tests |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Integration of application objects, private state, interface behavior, lists, maps, enums, file input, JSON parsing, menu validation, decisions, retries, and tests.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

**Supporting files:** [applications.json](demo/config/applications.json) · [pom.xml](demo/pom.xml) · [Application.java](demo/src/main/java/Application.java) · [Configuration.java](demo/src/main/java/Configuration.java) · [Deployable.java](demo/src/main/java/Deployable.java) · [DeploymentService.java](demo/src/main/java/DeploymentService.java) · [Environment.java](demo/src/main/java/Environment.java) · [HealthPolicy.java](demo/src/main/java/HealthPolicy.java) · [DeploymentManagerTest.java](demo/src/test/java/DeploymentManagerTest.java)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

**Menu input**

For the demo, enter `1` for booking-api and `2` for QA, each on a separate line. The solution also asks for a maximum retry limit; enter `3`. Terminal input echo is not included in the expected output below.

The JSON fixture includes three applications: booking-api at 95% health, payment-api at 85%, and catalog-api at 75%. A selected environment is a simulated target; choosing PROD does not contact cloud infrastructure.

**Project responsibilities**

| File | Responsibility |
|---|---|
| Main.java | Menu, input validation, decisions, and user feedback |
| Application.java | Encapsulated identity, validated replica counts, simulated attempt behavior |
| Deployable.java | Common deployment contract |
| Environment.java | DEV, QA, STG, and PROD constants |
| Configuration.java | JSON validation and ordered inventory loading; map detects duplicate names |
| HealthPolicy.java | Percentage calculation and approval classification |
| DeploymentService.java | Bounded retry loop |
| DeploymentManagerTest.java | Business-rule and configuration tests |

The solution adds a UTF-8 report for every completed decision. File-write failures remain visible errors; the program does not claim successful reporting when a write fails. Review-required and rejected applications are blocked before retry execution. Exhausted retries and malformed inputs exit nonzero.

**Main.java**

```java
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Path config = Path.of(args.length > 0 ? args[0] : "config/applications.json");
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Application> applications = Configuration.load(config);
            System.out.println("DEPLOYMENT MANAGER");
            for (int i = 0; i < applications.size(); i++) {
                System.out.println((i + 1) + ". " + applications.get(i).getName());
            }
            System.out.println("Select application:");
            Application application = applications.get(readChoice(input, applications.size()) - 1);
            Environment[] environments = Environment.values();
            for (int i = 0; i < environments.length; i++) {
                System.out.println((i + 1) + ". " + environments[i]);
            }
            System.out.println("Select environment:");
            Environment environment = environments[readChoice(input, environments.length) - 1];
            double health = application.healthPercentage();
            String decision = HealthPolicy.classify(health);
            System.out.println("Application: " + application.getName());
            System.out.println("Environment: " + environment);
            System.out.println("Health: " + health + "%");
            System.out.println("Decision: " + decision);
            if (!decision.equals("Approved")) {
                System.out.println("Deployment blocked: " + decision);
                return;
            }
            boolean successful = DeploymentService.deploy(application, environment, 3, System.out);
            System.out.println("Deployment successful: " + successful);
            if (!successful) { System.exit(1); }
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Cannot run deployment: " + exception.getMessage());
            System.exit(1);
        }
    }
    private static int readChoice(Scanner input, int max) {
        if (!input.hasNextLine()) { throw new IllegalArgumentException("A menu selection is required"); }
        int choice = Integer.parseInt(input.nextLine().trim());
        if (choice < 1 || choice > max) { throw new IllegalArgumentException("Selection must be between one and " + max); }
        return choice;
    }
}
```

**Expected program output** (Maven build logs omitted)

```text
DEPLOYMENT MANAGER
1. booking-api
2. payment-api
3. catalog-api
Select application:
1. DEV
2. QA
3. STG
4. PROD
Select environment:
Application: booking-api
Environment: QA
Health: 95.0%
Decision: Approved
Deployment attempt: 1
Deployment attempt: 2
Deployment successful: true
```

**Demo test result:** 7 tests, 0 failures, 0 errors, 0 skipped.

**Solution test result:** 7 tests, 0 failures, 0 errors, 0 skipped.

## Teaching notes

This is a guided integration episode. Provide the complete scaffold before recording; focus on the data-to-decision-to-deployment path rather than typing every class in fifteen minutes. Independent capstone work is separate practice. HTTP was taught on Day 27 but is intentionally not needed to run this offline simulation.

**Common beginner mistake:** Letting review-required applications deploy, allowing invalid menu indexes, accepting zero total replicas, or retrying indefinitely.

## Student challenge

Extend the baseline with a validated maximum-attempts menu (1–5) and a UTF-8 deployment-report.txt recording application, environment, decision, and result for successful, blocked, and exhausted runs.

**Acceptance criteria:** booking-api at QA with limit three succeeds on attempt two. payment-api is blocked for review and catalog-api is rejected without retries. Limit one exhausts booking-api and exits nonzero. Reports identify SUCCESS, BLOCKED, or FAILED accurately.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/src/main/java/Main.java)

```java
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Path config = Path.of(args.length > 0 ? args[0] : "config/applications.json");
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Application> applications = Configuration.load(config);
            System.out.println("DEPLOYMENT MANAGER");
            for (int i = 0; i < applications.size(); i++) {
                System.out.println((i + 1) + ". " + applications.get(i).getName());
            }
            System.out.println("Select application:");
            Application application = applications.get(readChoice(input, applications.size()) - 1);
            Environment[] environments = Environment.values();
            for (int i = 0; i < environments.length; i++) {
                System.out.println((i + 1) + ". " + environments[i]);
            }
            System.out.println("Select environment:");
            Environment environment = environments[readChoice(input, environments.length) - 1];
            double health = application.healthPercentage();
            String decision = HealthPolicy.classify(health);
            System.out.println("Application: " + application.getName());
            System.out.println("Environment: " + environment);
            System.out.println("Health: " + health + "%");
            System.out.println("Decision: " + decision);
            if (!decision.equals("Approved")) {
                writeReport(application, environment, decision, "BLOCKED");
                System.out.println("Deployment blocked: " + decision);
                return;
            }
            System.out.println("Select maximum attempts (1-5):");
            int maxAttempts = readChoice(input, 5);
            boolean successful = DeploymentService.deploy(application, environment, maxAttempts, System.out);
            writeReport(application, environment, decision, successful ? "SUCCESS" : "FAILED");
            System.out.println("Deployment successful: " + successful);
            if (!successful) { System.exit(1); }
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Cannot run deployment: " + exception.getMessage());
            System.exit(1);
        }
    }
    private static void writeReport(Application application, Environment environment, String decision, String result) throws IOException {
        String report = "Application: " + application.getName() + "\nEnvironment: " + environment
                + "\nDecision: " + decision + "\nResult: " + result + "\n";
        Files.writeString(Path.of("deployment-report.txt"), report, StandardCharsets.UTF_8);
        System.out.println("Report: deployment-report.txt");
    }
    private static int readChoice(Scanner input, int max) {
        if (!input.hasNextLine()) { throw new IllegalArgumentException("A menu selection is required"); }
        int choice = Integer.parseInt(input.nextLine().trim());
        if (choice < 1 || choice > max) { throw new IllegalArgumentException("Selection must be between one and " + max); }
        return choice;
    }
}
```

**Expected program output** (Maven build logs omitted)

```text
DEPLOYMENT MANAGER
1. booking-api
2. payment-api
3. catalog-api
Select application:
1. DEV
2. QA
3. STG
4. PROD
Select environment:
Application: booking-api
Environment: QA
Health: 95.0%
Decision: Approved
Select maximum attempts (1-5):
Deployment attempt: 1
Deployment attempt: 2
Report: deployment-report.txt
Deployment successful: true
```

**Solution supporting files:** [applications.json](solution/config/applications.json) · [pom.xml](solution/pom.xml) · [Application.java](solution/src/main/java/Application.java) · [Configuration.java](solution/src/main/java/Configuration.java) · [Deployable.java](solution/src/main/java/Deployable.java) · [DeploymentService.java](solution/src/main/java/DeploymentService.java) · [Environment.java](solution/src/main/java/Environment.java) · [HealthPolicy.java](solution/src/main/java/HealthPolicy.java) · [DeploymentManagerTest.java](solution/src/test/java/DeploymentManagerTest.java)

</details>

## Continuity

Days 11–29 supplied the components. Day 30 combines them; the next module can organize packages and introduce backend development without changing these rules.

[Previous lesson](../day-29-git-github/README.md) · [Completed capstone](../../projects/deployment-manager/README.md)
