# Java in 15 Minutes — Finalized Episodes 1–10
**Season 1: Java Fundamentals | Module 1**

This progressive curriculum takes learners with **zero Java experience** from writing their first variable to building a small application using methods, loops, and conditional logic.

Each episode introduces a distinct concept, reinforces earlier skills, and contributes toward the Day 30 Deployment Manager project.


> A faceless, beginner-friendly Java series with narration using an AI clone of the creator’s own voice. Learn through a continuing application-and-deployment theme, one concept at a time.

**Audience:** Complete Java beginners. **Baseline:** Java 21. **Lesson length:** Approximately 15 minutes. **Module outcome:** A small console-based Deployment Health Checker.

## Contents

- [Getting started](#getting-started)
- [Finalized curriculum](#finalized-10-episode-curriculum)
- [Detailed Episode Breakdown](#detailed-episode-breakdown--agreed-timing)
- [Day 01](#day-01--java-variables--data-types) · [Day 02](#day-02--java-strings-working-with-text) · [Day 03](#day-03--java-operators--calculations)
- [Day 04](#day-04--java-arrays-explained) · [Day 05](#day-05--java-ifelse-statements) · [Day 06](#day-06--java-switch-statements)
- [Day 07](#day-07--java-for-loops) · [Day 08](#day-08--java-while-loops) · [Day 09](#day-09--java-methods-explained) · [Day 10](#day-10--java-method-parameters--return-values)
- [Day 10 milestone](#day-10-milestone--deployment-health-checker)
- [Continuity and curriculum decisions](#continuity-and-curriculum-decisions)
- [Production standards](#production-standards)
- [Repository organization](#repository-organization)

## Getting started

Install a Java 21 JDK and use IntelliJ IDEA or another Java editor. Check your setup:

```sh
java -version
javac -version
```

Both should report version 21. No cloud account, external libraries, build tool, or paid service is needed to run the lessons. “Pods” and “replicas” mean running copies of an application in these examples; environments such as DEV, QA, STG, and PROD mean development, testing, staging, and production.

Each demonstration below is a complete, independent program. Save it as **Main.java**, then run these commands from its directory:

```sh
javac Main.java
java Main
```

Use a separate folder for each example and challenge solution because they all declare `public class Main`. In IntelliJ, choose JDK 21 and run the `main` method. The surrounding class and `main` method are starter scaffolding; their full meaning is introduced later.

For each day: watch the explanation, type and run the demo, predict the output after changing an input, attempt the challenge, then compare with the collapsed solution. Challenge code is also a complete `Main.java` program.

## Finalized 10-Episode Curriculum

| Day | Episode Title | Primary Learning Objective | Practical Demonstration |
|---|---|---|---|
| **01** | Java Variables & Data Types Explained | Declare, initialize, print, and update variables | Store application information |
| **02** | Java Strings: Working with Text | Concatenation, length, equality, and basic String methods | Build deployment messages |
| **03** | Java Operators & Calculations | Arithmetic, assignment, comparison, and logical operators | Calculate application health |
| **04** | Java Arrays Explained | Create arrays, access elements, and understand indexes | Store cloud environments |
| **05** | Java If/Else Statements | Make decisions using conditions | Approve or reject deployments |
| **06** | Java Switch Statements | Handle multiple possible choices | Select deployment environments |
| **07** | Java For Loops | Repeat operations using counters | Check multiple environments |
| **08** | Java While Loops | Repeat operations while a condition remains true | Simulate deployment retries |
| **09** | Java Methods Explained | Define and call reusable methods | Create deployment operations |
| **10** | Java Method Parameters & Return Values | Pass information into methods and return results | Build a deployment health checker |

**Key adjustment:** We combine method parameters and return values into Day 10 rather than spending three separate episodes introducing methods.

This gives us room to introduce operators on Day 3, which students need before learning conditional statements and loops.

---

## Detailed Episode Breakdown — agreed timing

Every episode follows this agreed teaching structure:

| Segment | Target Duration | Purpose |
|---|---|---|
| Hook | 0:00–0:30 | Show what students will accomplish |
| Concept | 0:30–3:00 | Explain the new Java concept |
| Coding demonstration | 3:00–9:00 | Build and execute working code |
| Student challenge | 9:00–12:00 | Apply the concept independently |
| Solution walkthrough | 12:00–14:00 | Explain the solution |
| Recap and next episode | 14:00–15:00 | Reinforce learning and preview the next lesson |

These are production targets, not rigid timestamps. Prioritize clarity over filling exactly 15 minutes.

## Day 01 — Java Variables & Data Types

**YouTube title:** Learn Java Variables & Data Types in 15 Minutes | Day 1

**Learning objectives**

Students will understand:
- What variables are and why programs need them.
- How to declare and initialize variables.
- The difference between `String`, `int`, `double`, and `boolean`.
- How to print variables using `System.out.println()`.
- How to update existing variables.
- Why incompatible types cause compilation errors.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String application = "booking-api";
        int replicas = 3;
        double cpuUsage = 72.5;
        boolean healthy = true;

        System.out.println("Application: " + application);
        System.out.println("Replicas: " + replicas);
        System.out.println("CPU Usage: " + cpuUsage);
        System.out.println("Healthy: " + healthy);
    }
}
```

**Expected output**

```text
Application: booking-api
Replicas: 3
CPU Usage: 72.5
Healthy: true
```

**Student challenge:** Create variables describing a cloud environment and print their values.

**Production status:** AI narration script completed.

**Important:** Retain the existing voice-optimized Day 1 script.

**Complete topic scope:** Declaration, initialization, assignment, four types, console output, and a deliberate type mismatch. Add `cpuUsage = 81.2;` and print it again to demonstrate updating an existing variable.

**Teaching notes:** `String` is a reference type; `int`, `double`, and `boolean` are primitive types. Use double quotes for text, lowercase boolean literals, and a semicolon at the end of statements. Show the incompatible assignment separately, then restore working code.

**Common beginner mistake:** Do not redeclare a variable to update it. `"3"` is text; `3` is a number.

**Challenge acceptance criteria:** Choose appropriate types and print four labeled values. Optional extension: update one value and print it again.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        String environment = "PROD";
        int servers = 5;
        double cpuUsage = 64.8;
        boolean healthy = true;
        System.out.println("Environment: " + environment);
        System.out.println("Servers: " + servers);
        System.out.println("CPU Usage: " + cpuUsage);
        System.out.println("Healthy: " + healthy);
    }
}
```

**Expected output**

```text
Environment: PROD
Servers: 5
CPU Usage: 64.8
Healthy: true
```

</details>

**Continuity and next episode:** Day 2 uses the same application information to construct text messages.

---

## Day 02 — Java Strings: Working with Text

**YouTube title:** Java Strings Explained in 15 Minutes | Day 2

**Learning objectives**

Students will learn:
- What a String represents.
- How to combine Strings.
- How to find String length.
- How to compare Strings using `.equals()`.
- How to convert text to uppercase or lowercase.
- Why Strings use `.equals()` rather than `==` for content comparison.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String application = "booking-api";
        String environment = "PROD";

        String message = "Deploying " + application
                + " to " + environment;

        System.out.println(message);

        System.out.println(application.length());

        System.out.println(environment.toLowerCase());

        System.out.println(environment.equals("PROD"));
    }
}
```

**Expected output**

```text
Deploying booking-api to PROD
11
prod
true
```

**Student challenge:** Create a deployment message using two variables, then print its length and uppercase version.

**Connection to Day 1:** Students already know how to declare Strings. We immediately move into manipulating them rather than reteaching variable declarations.

**Complete topic scope:** Concatenation, `.length()`, `.equals()`, `.toUpperCase()`, and `.toLowerCase()`. Add an uppercase call after the baseline demonstration.

**Teaching notes:** Use `.equals()` for text content. `==` compares references for Strings and can appear to work with literals, which makes it misleading. String methods return results; assigning `environment = environment.toLowerCase();` retains the new text.

**Common beginner mistake:** Strings use `.length()`; arrays later use `.length` without parentheses.

**Challenge acceptance criteria:** Build a message from two variables and print its length and uppercase version.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        String application = "booking-api";
        String environment = "QA";
        String message = "Deploying " + application + " to " + environment;
        System.out.println(message);
        System.out.println("Length: " + message.length());
        System.out.println(message.toUpperCase());
    }
}
```

**Expected output**

```text
Deploying booking-api to QA
Length: 27
DEPLOYING BOOKING-API TO QA
```

</details>

**Continuity and next episode:** Day 3 introduces calculations and boolean expressions without reteaching declarations.

---

## Day 03 — Java Operators & Calculations

**YouTube title:** Java Operators Explained with Real Examples | Day 3

**Learning objectives**

Students will learn:
- Arithmetic operators: `+`, `-`, `*`, `/`, `%`.
- Assignment operators: `=`, `+=`, `-=`.
- Comparison operators: `>`, `<`, `>=`, `<=`, `==`, `!=`.
- Logical operators: `&&`, `||`, `!`.
- Integer versus floating-point division.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        int totalPods = 10;
        int healthyPods = 8;

        double healthPercentage =
                (healthyPods * 100.0) / totalPods;

        boolean healthy = healthPercentage >= 80;

        System.out.println("Health: " + healthPercentage + "%");
        System.out.println("Healthy: " + healthy);
    }
}
```

**Expected output**

```text
Health: 80.0%
Healthy: true
```

**Student challenge:** Calculate the percentage of healthy servers when 7 out of 10 are healthy.

**Connection to Day 2:** Students move from working with text to calculating numeric values and producing boolean results.

**Complete topic scope:** Arithmetic `+ - * / %`, assignment `= += -=`, comparison `> < >= <= == !=`, logical `&& || !`, parentheses, and integer division.

**Teaching notes:** Before the health demo, run small expressions: `7 / 10` is `0`, `7 / 10.0` is `0.7`, and `7 % 3` is `1`. Show `healthyPods += 1;` and `healthyPods -= 1;`. Compare `(healthPercentage >= 80 && totalPods > 0)`, `(healthPercentage >= 95 || healthyPods == totalPods)`, and `!healthy`. The baseline assumes a positive total.

**Common beginner mistake:** Use `100.0` so the percentage calculation uses floating-point division. `=` assigns; `==` compares primitive values.

**Challenge acceptance criteria:** Calculate 70.0% for seven healthy servers out of ten and explain why it is below 80%.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        int totalServers = 10;
        int healthyServers = 7;
        double healthPercentage = healthyServers * 100.0 / totalServers;
        System.out.println("Health: " + healthPercentage + "%");
        System.out.println("Healthy: " + (healthPercentage >= 80));
    }
}
```

**Expected output**

```text
Health: 70.0%
Healthy: false
```

</details>

**Continuity and next episode:** Day 4 groups related values; these operators return in decisions and loops.

---

## Day 04 — Java Arrays Explained

**YouTube title:** Java Arrays Explained for Complete Beginners | Day 4

**Learning objectives**

Students will learn:
- Why arrays are useful.
- How to declare and initialize arrays.
- How to access elements by index.
- Why Java arrays start at index zero.
- How to retrieve array length.
- What happens when an index is out of bounds.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String[] environments = {
                "DEV",
                "QA",
                "STG",
                "PROD"
        };

        System.out.println(environments[0]);
        System.out.println(environments[3]);

        System.out.println(
                "Total environments: " + environments.length
        );
    }
}
```

**Expected output**

```text
DEV
PROD
Total environments: 4
```

**Student challenge:** Create an array containing five AWS services and print the first, third, and last service.

**Connection to Day 3:** Students can now store multiple related values instead of declaring separate variables.

**Important distinction:** Array indexing is introduced here; iterating through an entire array is reserved for Day 7.

**Complete topic scope:** Array declaration, initialization, zero-based indexing, reading and replacing elements, fixed length, and invalid indexes.

**Teaching notes:** Show `environments[1] = "TEST";` as a follow-up. An array of four items has valid indexes 0–3. Demonstrate `environments[4]` separately as an intentional runtime error, then remove it.

**Common beginner mistake:** The last index is `length - 1`. An out-of-bounds access compiles but fails at runtime.

**Challenge acceptance criteria:** Create exactly five service names and print indexes 0, 2, and 4 without a loop.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        String[] services = {"EC2", "S3", "RDS", "Lambda", "ECS"};
        System.out.println(services[0]);
        System.out.println(services[2]);
        System.out.println(services[services.length - 1]);
    }
}
```

**Expected output**

```text
EC2
RDS
ECS
```

</details>

**Continuity and next episode:** Day 5 adds decisions; full-array traversal waits until Day 7.

---

## Day 05 — Java If/Else Statements

**YouTube title:** Java If/Else Statements Explained | Day 5

**Learning objectives**

Students will learn:
- How Java makes decisions.
- How `if` statements work.
- How to use `else`.
- How to introduce additional conditions with `else if`.
- How comparison and logical operators control execution.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        double healthPercentage = 92.5;

        if (healthPercentage >= 95) {
            System.out.println("Deployment approved");
        } else if (healthPercentage >= 80) {
            System.out.println("Deployment requires review");
        } else {
            System.out.println("Deployment rejected");
        }
    }
}
```

**Expected output**

```text
Deployment requires review
```

**Student challenge:** Create deployment approval logic using these conditions:

- Health ≥ 95%: Approved
- Health ≥ 80% and < 95%: Review required
- Health < 80%: Rejected

**Connection to Day 3:** Students apply the comparison operators they learned earlier.

**Complete topic scope:** Boolean conditions, `if`, `else if`, `else`, ordered thresholds, and combining conditions.

**Teaching notes:** Test health values 95, 94.9, 80, and 79.9. Descending thresholds avoid repeating the upper bound. As an extension, add `boolean approvedByOwner = true;` and require it with `&&` for approval.

**Common beginner mistake:** Check the highest threshold first. Braces keep the branch body clear.

**Challenge acceptance criteria:** Produce Approved, Review required, and Rejected at the correct boundaries.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        double health = 79.9;
        if (health >= 95) {
            System.out.println("Approved");
        } else if (health >= 80) {
            System.out.println("Review required");
        } else {
            System.out.println("Rejected");
        }
    }
}
```

**Expected output**

```text
Rejected
```

</details>

**Continuity and next episode:** Day 6 selects among named choices instead of numeric ranges.

---

## Day 06 — Java Switch Statements

**YouTube title:** Java Switch Statements Made Easy | Day 6

**Learning objectives**

Students will learn:
- When a `switch` statement is useful.
- How to define cases.
- How `break` prevents fall-through in traditional switch statements.
- How to handle unexpected values using `default`.
- When to choose `switch` instead of `if/else`.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String environment = "QA";

        switch (environment) {
            case "DEV":
                System.out.println("Development deployment");
                break;

            case "QA":
                System.out.println("Testing deployment");
                break;

            case "PROD":
                System.out.println("Production deployment");
                break;

            default:
                System.out.println("Unknown environment");
        }
    }
}
```

**Expected output**

```text
Testing deployment
```

**Student challenge:** Add a staging environment and test what happens when the selected environment is invalid.

**Connection to Day 5:** Students learn another way to implement decision-making.

**Complete topic scope:** Traditional String switch, `case`, `break`, `default`, and selecting exact values.

**Teaching notes:** Use the traditional statement consistently to explain fall-through. Mention that Java 21 also supports arrow cases and switch expressions, but reserve them for a later extension. Switch is useful for discrete choices; if/else handles ranges and compound conditions.

**Common beginner mistake:** Missing `break` can execute the next case. Case text must match exactly.

**Challenge acceptance criteria:** Add STG, confirm staging output, then change the input to UNKNOWN and confirm default output.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        String environment = "STG";
        switch (environment) {
            case "DEV": System.out.println("Development deployment"); break;
            case "QA": System.out.println("Testing deployment"); break;
            case "STG": System.out.println("Staging deployment"); break;
            case "PROD": System.out.println("Production deployment"); break;
            default: System.out.println("Unknown environment");
        }
    }
}
```

**Expected output**

```text
Staging deployment
```

</details>

**Continuity and next episode:** Day 7 repeats work across the environment array.

---

## Day 07 — Java For Loops

**YouTube title:** Java For Loops Explained in 15 Minutes | Day 7

**Learning objectives**

Students will learn:
- Why loops are useful.
- The structure of a `for` loop.
- Initialization, condition, and increment.
- How to iterate through arrays.
- How to avoid common off-by-one errors.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String[] environments = {
                "DEV",
                "QA",
                "STG",
                "PROD"
        };

        for (int i = 0; i < environments.length; i++) {
            System.out.println(
                    "Checking environment: " + environments[i]
            );
        }
    }
}
```

**Expected output**

```text
Checking environment: DEV
Checking environment: QA
Checking environment: STG
Checking environment: PROD
```

**Student challenge:** Create an array of five application names and print each application using a loop.

**Connection to Day 4:** Students revisit arrays and learn how to process every element without manually referencing each index.

**Complete topic scope:** The three parts of a counted loop, `i++`, array traversal, and off-by-one errors.

**Teaching notes:** Trace i as 0, 1, 2, 3, then explain why 4 stops the loop. `i++` increases i by one. Introduce the indexed loop first; enhanced for loops can wait.

**Common beginner mistake:** Use `i < environments.length`, not `<=`. Avoid a stray semicolon after the loop header.

**Challenge acceptance criteria:** Print each of five applications exactly once, in array order.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        String[] applications = {"booking-api", "payment-api", "catalog-api", "user-api", "notification-api"};
        for (int i = 0; i < applications.length; i++) {
            System.out.println("Application: " + applications[i]);
        }
    }
}
```

**Expected output**

```text
Application: booking-api
Application: payment-api
Application: catalog-api
Application: user-api
Application: notification-api
```

</details>

**Continuity and next episode:** Day 8 repeats based on changing success and attempt conditions.

---

## Day 08 — Java While Loops

**YouTube title:** Java While Loops Explained with Examples | Day 8

**Learning objectives**

Students will learn:
- How `while` loops work.
- The difference between `for` and `while`.
- How to use counters.
- How to prevent infinite loops.
- How to implement simple retry logic.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        int attempts = 0;
        int maxAttempts = 3;
        boolean deploymentSuccessful = false;

        while (!deploymentSuccessful && attempts < maxAttempts) {

            attempts++;

            System.out.println("Deployment attempt: " + attempts);

            if (attempts == 3) {
                deploymentSuccessful = true;
            }
        }

        System.out.println(
                "Deployment successful: " + deploymentSuccessful
        );
    }
}
```

**Expected output**

```text
Deployment attempt: 1
Deployment attempt: 2
Deployment attempt: 3
Deployment successful: true
```

**Student challenge:** Simulate a health check that retries up to five times and succeeds on the fourth attempt.

**Connection to Day 7:** Students learn when condition-controlled repetition is more suitable than counter-controlled repetition.

**Teaching note:** This is simulated retry logic. Real deployment retries require additional considerations such as delays, timeouts, and error classification.

**Complete topic scope:** A condition checked before each iteration, counters, bounded retries, state changes, and termination.

**Teaching notes:** Trace both parts of the condition. Change the success attempt beyond the maximum and verify that the loop still ends with false. If success starts true, the loop runs zero times. This is a simulation with no cloud calls, delays, or waiting.

**Common beginner mistake:** Update the counter inside the loop and impose a maximum. Real retries also need timeouts, delays, and error classification.

**Challenge acceptance criteria:** Use a maximum of five checks, succeed on check four, and stop after four printed attempts.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        int attempts = 0;
        int maxAttempts = 5;
        boolean healthy = false;
        while (!healthy && attempts < maxAttempts) {
            attempts++;
            System.out.println("Health check attempt: " + attempts);
            if (attempts == 4) {
                healthy = true;
            }
        }
        System.out.println("Healthy: " + healthy);
    }
}
```

**Expected output**

```text
Health check attempt: 1
Health check attempt: 2
Health check attempt: 3
Health check attempt: 4
Healthy: true
```

</details>

**Continuity and next episode:** Day 9 organizes operations into named reusable methods.

---

## Day 09 — Java Methods Explained

**YouTube title:** Java Methods Explained for Beginners | Day 9

**Learning objectives**

Students will learn:
- What a method is.
- Why methods improve code organization.
- How to declare a method.
- How to call a method.
- What `void` means.
- How `main()` differs from methods they create.

**Practical demonstration**

```java
public class Main {

    public static void main(String[] args) {

        checkApplicationHealth();
        deployApplication();
    }

    public static void checkApplicationHealth() {
        System.out.println("Checking application health...");
    }

    public static void deployApplication() {
        System.out.println("Deploying application...");
    }
}
```

**Expected output**

```text
Checking application health...
Deploying application...
```

**Student challenge:** Create three methods named `startDeployment()`, `runSecurityScan()`, and `completeDeployment()`. Call them from `main()`.

**Connection to Day 8:** Students learn how to organize previously written procedural code into reusable operations.

**Scope boundary:** Day 9 covers methods without parameters or return values. Those are introduced in Day 10.

**Complete topic scope:** Method declaration, method body, calling methods, `void`, execution order, and the main entry point.

**Teaching notes:** Keep methods at class scope, outside main. Use static helper methods so they can be called directly from static main; explain static more fully during OOP. Call a helper twice to show reuse.

**Common beginner mistake:** Defining a method does not run it. A void method does not return a result.

**Challenge acceptance criteria:** Declare all three named methods and call them in the requested order.

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        startDeployment();
        runSecurityScan();
        completeDeployment();
    }
    public static void startDeployment() {
        System.out.println("Starting deployment...");
    }
    public static void runSecurityScan() {
        System.out.println("Running security scan...");
    }
    public static void completeDeployment() {
        System.out.println("Deployment complete.");
    }
}
```

**Expected output**

```text
Starting deployment...
Running security scan...
Deployment complete.
```

</details>

**Continuity and next episode:** Day 10 adds inputs and returned results to these methods.

---

## Day 10 — Java Method Parameters & Return Values

**YouTube title:** Java Method Parameters & Return Values | Day 10

**Learning objectives**

Students will learn:
- How to pass arguments to methods.
- How parameters receive values.
- The difference between `void` and methods that return values.
- How to use the `return` keyword.
- How to combine methods with conditional logic.

**Practical demonstration**

```java
public class Main {

    public static void main(String[] args) {

        String application = "booking-api";
        double health = 96.5;

        boolean approved = checkHealth(health);

        if (approved) {
            deployApplication(application);
        } else {
            System.out.println("Deployment blocked");
        }
    }

    public static boolean checkHealth(double health) {
        return health >= 95;
    }

    public static void deployApplication(String application) {
        System.out.println("Deploying " + application);
    }
}
```

**Expected output**

```text
Deploying booking-api
```

**Student challenge:** Create a method that accepts the total number of pods and healthy pods, calculates the health percentage, and returns that percentage.

**Connection to Day 9:** Students extend simple methods to accept inputs and produce outputs.

**Complete topic scope:** Parameters versus arguments, declared return types, `return`, storing results, void methods with inputs, and branching on returned booleans.

**Teaching notes:** In `checkHealth(health)`, health is the argument; in the declaration, `double health` is the parameter. Printing is an observable action; returning makes a result available to the caller. The percentage challenge assumes totalPods > 0 and 0 <= healthyPods <= totalPods.

**Common beginner mistake:** A non-void method must return a compatible value on every reachable path. Use 100.0 to avoid integer truncation.

**Challenge acceptance criteria:** Return 70.0 for (10, 7), 100.0 for (10, 10), and 0.0 for (10, 0).

<details>
<summary>Student challenge — reference solution</summary>

```java
public class Main {
    public static void main(String[] args) {
        double health = calculateHealthPercentage(10, 7);
        System.out.println("Health: " + health + "%");
    }
    public static double calculateHealthPercentage(int totalPods, int healthyPods) {
        return healthyPods * 100.0 / totalPods;
    }
}
```

**Expected output**

```text
Health: 70.0%
```

</details>

**Continuity and next episode:** The milestone combines prior concepts; OOP follows in the next module.

---

## Day 10 milestone — Deployment Health Checker

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

## Continuity and curriculum decisions

| Day | Capability added | Contribution to the continuing project |
|---|---|---|
| 1 | Store and update typed values | Application metadata |
| 2 | Manipulate text | Deployment messages |
| 3 | Calculate and compare numbers | Health percentages |
| 4 | Group related values | Environment list |
| 5 | Branch on conditions | Approval policy |
| 6 | Select a discrete option | Environment routing |
| 7 | Traverse arrays | Checks across environments |
| 8 | Repeat until success or a limit | Retry simulation |
| 9 | Name reusable operations | Deployment workflow methods |
| 10 | Pass inputs and return results | Deployment Health Checker |

The agreed curriculum decisions are:

1. **Retain Day 1’s existing AI speech-optimized script.** The reference demo here supports that script; it does not replace its narration or screen directions.
2. **Remove overlap in Days 1–4.** Day 1 introduces variables and four types; Day 2 manipulates Strings; Day 3 covers operators; Day 4 introduces arrays. There is no separate repeated primitive-types episode in this module.
3. **Allow brief reinforcement, not repeated introductions.** Day 1 previews concatenation for labeled output; Day 2 teaches it explicitly. Day 3 teaches comparisons before Days 5–8 use them.
4. **Keep arrays and traversal separate.** Day 4 teaches storage and indexing; Day 7 teaches iteration.
5. **Teach methods in two episodes.** Day 9 covers parameter-free void helpers; Day 10 adds parameters and return values.
6. **Use Java 21 and traditional switch statements consistently.** Newer syntax can be introduced as a later extension.
7. **Keep cloud terms as context.** No AWS, Kubernetes, Docker, or deployment experience is a prerequisite.
8. **Build toward the Day 30 Deployment Manager.** This module establishes procedural foundations. Classes, constructors, OOP, external APIs, Spring Boot, Docker, AWS, CI/CD, and Kubernetes are later stages, not requirements for these ten lessons.

**Production status:** The referenced conversation records Day 1’s narration script as complete and the ten-episode outline, learning objectives, and baseline demos as finalized. Days 2–10 still need full narration scripts and visual storyboards. The challenge solutions, expanded teaching notes, and milestone implementation in this README are supporting additions to that agreed outline; they do not imply that videos have been recorded or published.

## Production standards

### Teaching and pacing

- Use the agreed six-part timing table as the standard template. Prioritize understanding over exactly filling 15 minutes.
- Preserve the detailed Day 1 script’s existing timing, which targets roughly 14 minutes 30 seconds within its original 12–15 minute range. Its microsegments do not exactly match the later general template.
- Introduce one primary concept per episode, demonstrate real code, explain one deliberate beginner mistake, and include a challenge and solution walkthrough.
- For the challenge segment, explain requirements, expected behavior, and a useful hint. Ask viewers to pause; keep the challenge card visible for about five seconds. Avoid long stretches of silence to fill the allotted three minutes.
- Reveal code progressively, ask learners to predict output, then run it. Separate intentionally broken examples from the final working code.

### AI-cloned narration

Use the creator’s own cloned voice, with ElevenLabs as the planned narration tool. Aim for a professional, approachable, conversational teaching voice.

- Generate narration by section so individual clips can be corrected independently.
- Keep spoken narration separate from `[PAUSE]`, `[SCREEN]`, and editor directions; do not send those directions to speech synthesis.
- Explain the code’s meaning instead of reading punctuation character by character.
- Target approximately 125–145 spoken words per minute; slow down for new technical ideas.
- Use pauses of roughly 0.3–0.8 seconds between ideas and 1–1.5 seconds for major transitions. Let the viewer inspect the code.
- Review an opening sample of 30–45 seconds before generating the remaining narration. Avoid exaggerated enthusiasm, announcer delivery, and dramatic pauses after every sentence.

| On-screen term | Spoken form |
|---|---|
| Java | Jah-vuh |
| IntelliJ | in-TELL-ih-jay |
| int | int |
| boolean | BOO-lee-un |
| CPU / API | C-P-U / A-P-I |
| PROD | prod |
| cpuUsage | CPU usage |
| booking-api | booking API |
| System.out.println | print, or print to the console |

For example, `String application = "booking-api";` is explained as: “We’re creating a String named application and storing the text booking API inside it.”

### Visuals and Remotion

Use Remotion for concept animations, syntax highlighting, progressive code reveals, and transitions. Use IntelliJ demonstrations for executable code and actual console output. The following are practical production defaults supporting the agreed approach:

- Produce a consistent 16:9 frame, preferably 1920 × 1080, with readable code and strong contrast.
- Highlight the line being explained and match reveals to narration. Hold output long enough to read it.
- Keep fonts, colors, segment labels, transitions, and episode numbering consistent.
- Verify captions against narration, especially Java keywords and identifiers. Keep captions clear of code and console output.
- Review the rendered video for clipped text, incorrect output, abrupt audio edits, and transitions that obscure the lesson.

### Release checklist

- [ ] Demo and challenge solution compile and run using Java 21.
- [ ] Recorded output matches the repository example.
- [ ] Learning objectives, topic boundaries, and challenge acceptance criteria agree.
- [ ] Intentional errors are explained and corrected before the final run.
- [ ] Narration and code reveals align; production directions are absent from spoken audio.
- [ ] Captions, code, output, and challenge cards remain readable.
- [ ] Title, thumbnail, description, and playlist use consistent episode numbering.
- [ ] The description links to this repository and the relevant episode folder.
- [ ] The recap states what was learned and previews the next topic.

## Repository organization

Suggested structure when publishing the course code; these are intended repository paths, not links to files bundled with this README:

```text
README.md
episodes/
  day-01-variables/
    demo/Main.java
    challenge/README.md
    solution/Main.java
    narration.md
    storyboard.md
  day-02-strings/
  day-03-operators/
  day-04-arrays/
  day-05-if-else/
  day-06-switch/
  day-07-for-loops/
  day-08-while-loops/
  day-09-methods/
  day-10-parameters-returns/
projects/
  deployment-health-checker/Main.java
production/
  style-guide.md
  pronunciation.md
```

Repeat Day 1’s folder layout for each episode. Run each demo and solution from its own directory so the repeated Main class names do not conflict. Keep generated `.class` files out of version control, for example with `*.class` in `.gitignore`.

Each challenge README should contain the task, starting assumptions, acceptance criteria, and expected behavior without revealing the solution immediately. Each narration file should separate spoken text from production directions. Each storyboard should map narration clips to code reveals, demonstrations, challenge cards, and output.

**Recommended next production step:** Prepare the full Day 2 narration and storyboard using the established Day 1 voice and visual style, then proceed through Days 3–10 in order.
