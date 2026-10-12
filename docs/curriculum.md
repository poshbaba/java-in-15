# Java in 15 Minutes — Episodes 1–30 — Curriculum
**Season 1: Java Fundamentals → Object-Oriented Programming → First Application**

This progressive curriculum takes learners with **zero Java experience** from writing their first variable to building a small application using methods, loops, and conditional logic.

Each episode introduces a distinct concept, reinforces earlier skills, and contributes toward the Day 30 Deployment Manager project.


> A faceless, beginner-friendly Java series with narration using an AI clone of the creator’s own voice. Learn through a continuing application-and-deployment theme, one concept at a time.

**Audience:** Complete Java beginners. **Baseline:** Java 21. **Lesson length:** Approximately 15 minutes. **Module outcome:** A small console-based Deployment Health Checker.

## Contents

- [Getting started](#getting-started)
- [Days 11–30 extension](#extension-days-1130)
- [Finalized curriculum](#finalized-10-episode-curriculum)
- [Detailed Episode Breakdown](#detailed-episode-breakdown--agreed-timing)
- [Day 01](#day-01--java-variables--data-types) · [Day 02](#day-02--java-strings-working-with-text) · [Day 03](#day-03--java-operators--calculations)
- [Day 04](#day-04--java-arrays-explained) · [Day 05](#day-05--java-ifelse-statements) · [Day 06](#day-06--java-switch-statements)
- [Day 07](#day-07--java-for-loops) · [Day 08](#day-08--java-while-loops) · [Day 09](#day-09--java-methods-explained) · [Day 10](#day-10--java-method-parameters--return-values)
- [Day 10 milestone](#day-10-milestone--deployment-health-checker)
- [Continuity and curriculum decisions](#continuity-and-curriculum-decisions)
- [Production guide](../production/README.md)


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





## Extension: Days 11–30

The course continues through object-oriented programming and a local Deployment Manager capstone. The same six-segment episode timing, Java 21 baseline, and challenge/solution format apply throughout.

### Curriculum decisions for this extension

- Days 11–12 replace the earlier parameter/return-value repeats with scope and overloading because those fundamentals are already taught on Day 10.
- Days 13–24 retain the agreed classes, objects, constructors, encapsulation, collections, exceptions, inheritance, interfaces, enums, and file progression.
- Maven moves from the original Day 27 slot to Day 25 so dependency setup is taught before JSON. JSON becomes Day 26 and HTTP becomes Day 27. JUnit, Git, and the capstone remain Days 28–30.
- Day 27 uses a supplied local HTTP fixture; the capstone remains offline. Public APIs and real deployment are not prerequisites.
- Day 30 focuses on integration with a supplied scaffold. The full challenge requires practice beyond the 15-minute episode.
- Demo and solution code is complete and runnable. Full AI narration scripts, storyboards, audio, and published videos for Days 11–30 are still future production work.

| Day | Topic | Learning outcome | Practical demonstration |
|---|---|---|---|
| 11 | [Java Method Scope & Local Variables](../episodes/day-11-method-scope/README.md) | Identify where a local variable can be used | Local variables, method and block scope, primitive arguments passed by value, and returning an updated value. |
| 12 | [Java Method Overloading](../episodes/day-12-method-overloading/README.md) | Define methods with the same name and different parameter lists | Overloading by parameter count or types, method selection, and delegating a convenience overload. |
| 13 | [Java Classes Explained](../episodes/day-13-classes/README.md) | Describe a class as a definition of data and behavior | Class definition, instance fields, a basic instance method, and an initial object as the minimum needed to use the class. |
| 14 | [Java Objects & References](../episodes/day-14-objects/README.md) | Create two independent instances from one class | Multiple instances, independent state, reference assignment, and aliasing. |
| 15 | [Java Constructors](../episodes/day-15-constructors/README.md) | Initialize an object when it is created | Parameterized constructors, constructor name, no return type, this, and initialization. |
| 16 | [Java Encapsulation](../episodes/day-16-encapsulation/README.md) | Hide fields with private | Private fields, getters, controlled updates, immutable identity, and maintaining positive replica counts. |
| 17 | [Java ArrayLists](../episodes/day-17-arraylists/README.md) | Create a typed ArrayList | Imports, ArrayList<Application>, basic generic type notation, add/get/remove/size, and enhanced for traversal. |
| 18 | [Java HashMaps](../episodes/day-18-hashmaps/README.md) | Store key-value pairs with generic types | HashMap<String, String>, put/get/containsKey/remove/size and keys replacing an existing value. |
| 19 | [Java Exceptions & Validation](../episodes/day-19-exceptions/README.md) | Explain an exception as interrupted normal execution | IllegalArgumentException, fail-fast validation, throw, propagation, and the difference between a compile error and a runtime exception. |
| 20 | [Java Try/Catch & Safe Execution](../episodes/day-20-try-catch/README.md) | Handle a specific exception with try/catch | Try/catch, specific exception types, meaningful error messages, finally, and safe execution across multiple attempts. |
| 21 | [Java Inheritance & Overriding](../episodes/day-21-inheritance/README.md) | Extend a base class | An is-a relationship, extends, super, @Override, and runtime method selection. |
| 22 | [Java Interfaces](../episodes/day-22-interfaces/README.md) | Define a behavioral contract | Interface declaration, abstract method signature, public implementation, implements, and interface-based polymorphism. |
| 23 | [Java Enums](../episodes/day-23-enums/README.md) | Define a fixed set of environment values | Enum declaration, name(), values(), equality, and case-sensitive valueOf conversion. |
| 24 | [Java File Handling](../episodes/day-24-file-handling/README.md) | Read UTF-8 configuration using Path and Files | Path.of, Files.readString/writeString, explicit UTF-8, IOException, and relative file paths. |
| 25 | [Introduction to Maven](../episodes/day-25-maven/README.md) | Explain the role of pom.xml | Project coordinates, standard layout, pinned plugin versions, compiler release, and the build lifecycle. |
| 26 | [Working with JSON in Java](../episodes/day-26-json/README.md) | Recognize JSON objects, fields, and scalar types | JSON syntax, dependency management, readTree, JsonNode field access, and explicit schema checks. |
| 27 | [Making HTTP Requests in Java](../episodes/day-27-http-requests/README.md) | Build and send a GET request with HttpClient | URI, HttpClient, HttpRequest, HttpResponse, body handlers, timeouts, and try-with-resources. |
| 28 | [Unit Testing with JUnit](../episodes/day-28-junit/README.md) | Write a JUnit Jupiter test using @Test | Test source layout, test-scoped dependencies, assertEquals with tolerance, assertThrows, and arrange/act/assert. |
| 29 | [Git & GitHub for Java Developers](../episodes/day-29-git-github/README.md) | Inspect a working tree and stage a specific file | git status/diff/add/commit/log, branches, .gitignore, and an optional GitHub publication workflow. |
| 30 | [Build Your First Java Application — Deployment Manager](../episodes/day-30-deployment-manager/README.md) | Load and validate a JSON application inventory | Integration of application objects, private state, interface behavior, lists, maps, enums, file input, JSON parsing, menu validation, decisions, retries, and tests. |


# Day 11 — Java Method Scope & Local Variables

[Course homepage](../episodes/day-11-method-scope/../../README.md) · [Runnable demo](../episodes/day-11-method-scope/demo/Main.java) · [Challenge](../episodes/day-11-method-scope/challenge/README.md) · [Production guide](../episodes/day-11-method-scope/../../production/README.md)

**YouTube title:** Java Method Scope & Local Variables in 15 Minutes | Day 11

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Identify where a local variable can be used.
- Explain why a parameter is local to its method.
- Pass information between methods explicitly.
- Distinguish changing a primitive parameter from changing the caller’s variable.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Local variables, method and block scope, primitive arguments passed by value, and returning an updated value |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Local variables, method and block scope, primitive arguments passed by value, and returning an updated value.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        int replicas = 3;
        showUpdatedCount(replicas);
        System.out.println("Caller replicas: " + replicas);
    }
    public static void showUpdatedCount(int replicas) {
        replicas = replicas + 1;
        System.out.println("Inside method: " + replicas);
    }
}
```

**Expected output**

```text
Inside method: 4
Caller replicas: 3
```

## Teaching notes

Trace two different variables named replicas. Show an out-of-scope reference separately, then remove it. Reference arguments are also passed by value, but object mutation is reserved for later OOP lessons.

**Common beginner mistake:** Expecting a method’s local variable to be available in main, or assuming that assigning to an int parameter updates the caller.

## Student challenge

Create addReplica(int replicas) that returns replicas + 1. Store its result in main and print the count before and after.

**Acceptance criteria:** Before is 3; after is 4. Explain why calling the method without assigning its result leaves the original int unchanged.

[Open the exercise](../episodes/day-11-method-scope/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-11-method-scope/solution) · [Main.java](../episodes/day-11-method-scope/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        int replicas = 3;
        System.out.println("Before: " + replicas);
        replicas = addReplica(replicas);
        System.out.println("After: " + replicas);
    }
    public static int addReplica(int replicas) {
        return replicas + 1;
    }
}
```

**Expected output**

```text
Before: 3
After: 4
```

</details>

## Continuity

Day 10 supplied method inputs and outputs. Day 11 explains their scope; Day 12 offers multiple method signatures.

[Previous lesson](../episodes/day-11-method-scope/../day-10-parameters-returns/README.md) · [Next lesson](../episodes/day-11-method-scope/../day-12-method-overloading/README.md)


---

# Day 12 — Java Method Overloading

[Course homepage](../episodes/day-12-method-overloading/../../README.md) · [Runnable demo](../episodes/day-12-method-overloading/demo/Main.java) · [Challenge](../episodes/day-12-method-overloading/challenge/README.md) · [Production guide](../episodes/day-12-method-overloading/../../production/README.md)

**YouTube title:** Java Method Overloading in 15 Minutes | Day 12

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Define methods with the same name and different parameter lists.
- Recognize a method signature.
- Choose a default value through delegation.
- Explain why return type alone cannot distinguish overloads.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Overloading by parameter count or types, method selection, and delegating a convenience overload |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Overloading by parameter count or types, method selection, and delegating a convenience overload.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        deploy("booking-api");
        deploy("payment-api", "QA");
    }
    public static void deploy(String application) {
        deploy(application, "DEV");
    }
    public static void deploy(String application, String environment) {
        System.out.println("Deploying " + application + " to " + environment);
    }
}
```

**Expected output**

```text
Deploying booking-api to DEV
Deploying payment-api to QA
```

## Teaching notes

Use a one-argument overload that calls the two-argument version. Avoid ambiguous null arguments and boxing details in this introductory lesson.

**Common beginner mistake:** Changing only a return type and expecting Java to accept another method with the same parameter list.

## Student challenge

Add deploy(String application, String environment, int replicas). Delegate the two-argument overload to it with one replica.

**Acceptance criteria:** The convenience overload prints one replica; the explicit call prints three. Both use one shared implementation.

[Open the exercise](../episodes/day-12-method-overloading/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-12-method-overloading/solution) · [Main.java](../episodes/day-12-method-overloading/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        deploy("booking-api", "DEV");
        deploy("payment-api", "QA", 3);
    }
    public static void deploy(String application, String environment) {
        deploy(application, environment, 1);
    }
    public static void deploy(String application, String environment, int replicas) {
        System.out.println(application + " -> " + environment + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
booking-api -> DEV: 1 replicas
payment-api -> QA: 3 replicas
```

</details>

## Continuity

Day 11 explained local inputs. Day 12 introduces convenient APIs; Day 13 groups application data and behavior in a class.

[Previous lesson](../episodes/day-12-method-overloading/../day-11-method-scope/README.md) · [Next lesson](../episodes/day-12-method-overloading/../day-13-classes/README.md)


---

# Day 13 — Java Classes Explained

[Course homepage](../episodes/day-13-classes/../../README.md) · [Runnable demo](../episodes/day-13-classes/demo/Main.java) · [Challenge](../episodes/day-13-classes/challenge/README.md) · [Production guide](../episodes/day-13-classes/../../production/README.md)

**YouTube title:** Java Classes Explained in 15 Minutes | Day 13

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Describe a class as a definition of data and behavior.
- Declare instance fields and an instance method.
- Create a first instance using new.
- Call an instance method from main.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Class definition, instance fields, a basic instance method, and an initial object as the minimum needed to use the class |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Class definition, instance fields, a basic instance method, and an initial object as the minimum needed to use the class.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.name = "booking-api";
        app.replicas = 3;
        app.printSummary();
    }
}
class Application {
    String name;
    int replicas;
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
booking-api: 3 replicas
```

## Teaching notes

Keep Application as a second non-public top-level class in Main.java. Fields are deliberately directly accessible for this lesson; constructors and encapsulation follow in Days 15–16.

**Common beginner mistake:** Calling an instance method on the class name instead of an object, or placing one method inside another.

## Student challenge

Add an environment field to Application and include it in printSummary().

**Acceptance criteria:** The summary prints booking-api, QA, and three replicas using data stored on an Application instance.

[Open the exercise](../episodes/day-13-classes/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-13-classes/solution) · [Main.java](../episodes/day-13-classes/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.name = "booking-api";
        app.environment = "QA";
        app.replicas = 3;
        app.printSummary();
    }
}
class Application {
    String name;
    String environment;
    int replicas;
    void printSummary() {
        System.out.println(name + " -> " + environment + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
booking-api -> QA: 3 replicas
```

</details>

## Continuity

Day 12 organized method signatures. Day 13 defines Application; Day 14 compares multiple instances and references.

[Previous lesson](../episodes/day-13-classes/../day-12-method-overloading/README.md) · [Next lesson](../episodes/day-13-classes/../day-14-objects/README.md)


---

# Day 14 — Java Objects & References

[Course homepage](../episodes/day-14-objects/../../README.md) · [Runnable demo](../episodes/day-14-objects/demo/Main.java) · [Challenge](../episodes/day-14-objects/challenge/README.md) · [Production guide](../episodes/day-14-objects/../../production/README.md)

**YouTube title:** Java Objects & References in 15 Minutes | Day 14

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Create two independent instances from one class.
- Read and update instance-specific data.
- Explain an alias that refers to the same object.
- Distinguish an object from a variable holding its reference.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Multiple instances, independent state, reference assignment, and aliasing |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Multiple instances, independent state, reference assignment, and aliasing.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Application booking = new Application();
        booking.name = "booking-api";
        booking.replicas = 3;
        Application payment = new Application();
        payment.name = "payment-api";
        payment.replicas = 2;
        Application alias = booking;
        alias.replicas = 4;
        booking.printSummary();
        payment.printSummary();
        System.out.println("Same object: " + (alias == booking));
    }
}
class Application {
    String name;
    int replicas;
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
booking-api: 4 replicas
payment-api: 2 replicas
Same object: true
```

## Teaching notes

Trace two new expressions, then contrast them with assigning booking to alias. Assignment copies a reference value; it does not copy the object.

**Common beginner mistake:** Expecting Application alias = booking to produce a separate application.

## Student challenge

Create inventory-api and notification-api objects. Set replicas to two and four. Change only inventory-api to five and print both.

**Acceptance criteria:** The final replica counts are five and four, showing independent objects. Do not use one object for both references.

[Open the exercise](../episodes/day-14-objects/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-14-objects/solution) · [Main.java](../episodes/day-14-objects/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Application inventory = new Application();
        inventory.name = "inventory-api";
        inventory.replicas = 2;
        Application notifications = new Application();
        notifications.name = "notification-api";
        notifications.replicas = 4;
        inventory.replicas = 5;
        inventory.printSummary();
        notifications.printSummary();
    }
}
class Application {
    String name;
    int replicas;
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
inventory-api: 5 replicas
notification-api: 4 replicas
```

</details>

## Continuity

Day 13 supplied the class definition. Day 14 uses independent instances; Day 15 initializes them through constructors.

[Previous lesson](../episodes/day-14-objects/../day-13-classes/README.md) · [Next lesson](../episodes/day-14-objects/../day-15-constructors/README.md)


---

# Day 15 — Java Constructors

[Course homepage](../episodes/day-15-constructors/../../README.md) · [Runnable demo](../episodes/day-15-constructors/demo/Main.java) · [Challenge](../episodes/day-15-constructors/challenge/README.md) · [Production guide](../episodes/day-15-constructors/../../production/README.md)

**YouTube title:** Java Constructors in 15 Minutes | Day 15

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Initialize an object when it is created.
- Distinguish a constructor from a method.
- Use this to refer to instance fields.
- Explain why a declared constructor changes available creation syntax.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Parameterized constructors, constructor name, no return type, this, and initialization |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Parameterized constructors, constructor name, no return type, this, and initialization.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api", "QA", 3);
        app.printSummary();
    }
}
class Application {
    String name;
    String environment;
    int replicas;
    Application(String name, String environment, int replicas) {
        this.name = name;
        this.environment = environment;
        this.replicas = replicas;
    }
    void printSummary() {
        System.out.println(name + " -> " + environment + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
booking-api -> QA: 3 replicas
```

## Teaching notes

Compare repeated field assignments with one constructor call. Java supplies a no-argument constructor only when the class declares no constructors. Input validation follows after condition review and exceptions.

**Common beginner mistake:** Writing void before a constructor, or writing name = name instead of this.name = name.

## Student challenge

Add an overloaded constructor Application(String name) that delegates to the full constructor with DEV and one replica.

**Acceptance criteria:** One-argument creation produces DEV and one replica; full creation preserves the provided QA and three replicas.

[Open the exercise](../episodes/day-15-constructors/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-15-constructors/solution) · [Main.java](../episodes/day-15-constructors/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        new Application("booking-api").printSummary();
        new Application("payment-api", "QA", 3).printSummary();
    }
}
class Application {
    String name;
    String environment;
    int replicas;
    Application(String name) {
        this(name, "DEV", 1);
    }
    Application(String name, String environment, int replicas) {
        this.name = name;
        this.environment = environment;
        this.replicas = replicas;
    }
    void printSummary() {
        System.out.println(name + " -> " + environment + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
booking-api -> DEV: 1 replicas
payment-api -> QA: 3 replicas
```

</details>

## Continuity

Day 14 used objects with later assignments. Day 15 initializes them together; Day 16 protects state after creation.

[Previous lesson](../episodes/day-15-constructors/../day-14-objects/README.md) · [Next lesson](../episodes/day-15-constructors/../day-16-encapsulation/README.md)


---

# Day 16 — Java Encapsulation

[Course homepage](../episodes/day-16-encapsulation/../../README.md) · [Runnable demo](../episodes/day-16-encapsulation/demo/Main.java) · [Challenge](../episodes/day-16-encapsulation/challenge/README.md) · [Production guide](../episodes/day-16-encapsulation/../../production/README.md)

**YouTube title:** Java Encapsulation in 15 Minutes | Day 16

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Hide fields with private.
- Read state through a getter.
- Change state through a controlled operation.
- Preserve a simple object invariant.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Private fields, getters, controlled updates, immutable identity, and maintaining positive replica counts |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Private fields, getters, controlled updates, immutable identity, and maintaining positive replica counts.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api");
        System.out.println("Scaled: " + app.scaleTo(3));
        System.out.println("Scaled: " + app.scaleTo(-1));
        app.printSummary();
    }
}
class Application {
    private final String name;
    private int replicas = 1;
    Application(String name) { this.name = name; }
    boolean scaleTo(int replicas) {
        if (replicas < 1) { return false; }
        this.replicas = replicas;
        return true;
    }
    String getName() { return name; }
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
Scaled: true
Scaled: false
booking-api: 3 replicas
```

## Teaching notes

The constructor starts at one replica. scaleTo returns false when the request is invalid, so callers can respond without exceptions. Exceptions are introduced on Day 19. A getter or setter is not automatically required for every field.

**Common beginner mistake:** Making fields private but adding an unrestricted setter that still accepts invalid state.

## Student challenge

Add getReplicas(). Scale to five, attempt zero, and print both results plus the final count.

**Acceptance criteria:** The valid update returns true; zero returns false; final replicas remain five.

[Open the exercise](../episodes/day-16-encapsulation/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-16-encapsulation/solution) · [Main.java](../episodes/day-16-encapsulation/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api");
        System.out.println("Scale to 5: " + app.scaleTo(5));
        System.out.println("Scale to 0: " + app.scaleTo(0));
        System.out.println("Final replicas: " + app.getReplicas());
    }
}
class Application {
    private final String name;
    private int replicas = 1;
    Application(String name) { this.name = name; }
    boolean scaleTo(int replicas) {
        if (replicas < 1) { return false; }
        this.replicas = replicas;
        return true;
    }
    String getName() { return name; }
    int getReplicas() { return replicas; }
}
```

**Expected output**

```text
Scale to 5: true
Scale to 0: false
Final replicas: 5
```

</details>

## Continuity

Day 15 initialized objects. Day 16 constrains changes; Day 17 stores several objects in a resizable collection.

[Previous lesson](../episodes/day-16-encapsulation/../day-15-constructors/README.md) · [Next lesson](../episodes/day-16-encapsulation/../day-17-arraylists/README.md)


---

# Day 17 — Java ArrayLists

[Course homepage](../episodes/day-17-arraylists/../../README.md) · [Runnable demo](../episodes/day-17-arraylists/demo/Main.java) · [Challenge](../episodes/day-17-arraylists/challenge/README.md) · [Production guide](../episodes/day-17-arraylists/../../production/README.md)

**YouTube title:** Java ArrayLists in 15 Minutes | Day 17

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Create a typed ArrayList.
- Add, retrieve, and remove elements.
- Compare size() with array length.
- Traverse a list of application objects using an enhanced for loop.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Imports, ArrayList<Application>, basic generic type notation, add/get/remove/size, and enhanced for traversal |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Imports, ArrayList<Application>, basic generic type notation, add/get/remove/size, and enhanced for traversal.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Application> apps = new ArrayList<>();
        apps.add(new Application("booking-api"));
        apps.add(new Application("payment-api"));
        System.out.println("First: " + apps.get(0).getName());
        for (Application app : apps) {
            System.out.println("Application: " + app.getName());
        }
        System.out.println("Count: " + apps.size());
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
}
```

**Expected output**

```text
First: booking-api
Application: booking-api
Application: payment-api
Count: 2
```

## Teaching notes

Generics here restrict the element type; designing generic classes is out of scope. Contrast fixed array length with list size changing after a removal. Explain the enhanced for syntax before using it.

**Common beginner mistake:** Using list[index] or list.length, or removing items directly from the list during an enhanced for loop.

## Student challenge

Add three applications, remove index one, then print the remaining names and size.

**Acceptance criteria:** booking-api and catalog-api remain in insertion order; size is two.

[Open the exercise](../episodes/day-17-arraylists/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-17-arraylists/solution) · [Main.java](../episodes/day-17-arraylists/solution/Main.java)

```java
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Application> apps = new ArrayList<>();
        apps.add(new Application("booking-api"));
        apps.add(new Application("payment-api"));
        apps.add(new Application("catalog-api"));
        apps.remove(1);
        for (Application app : apps) {
            System.out.println("Application: " + app.getName());
        }
        System.out.println("Count: " + apps.size());
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
}
```

**Expected output**

```text
Application: booking-api
Application: catalog-api
Count: 2
```

</details>

## Continuity

Day 16 supplied application objects. Day 17 creates a dynamic inventory; Day 18 adds lookup by key.

[Previous lesson](../episodes/day-17-arraylists/../day-16-encapsulation/README.md) · [Next lesson](../episodes/day-17-arraylists/../day-18-hashmaps/README.md)


---

# Day 18 — Java HashMaps

[Course homepage](../episodes/day-18-hashmaps/../../README.md) · [Runnable demo](../episodes/day-18-hashmaps/demo/Main.java) · [Challenge](../episodes/day-18-hashmaps/challenge/README.md) · [Production guide](../episodes/day-18-hashmaps/../../production/README.md)

**YouTube title:** Java HashMaps in 15 Minutes | Day 18

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Store key-value pairs with generic types.
- Look up an environment by application name.
- Update and remove entries.
- Handle missing keys and explain map ordering.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain HashMap<String, String>, put/get/containsKey/remove/size and keys replacing an existing value |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

HashMap<String, String>, put/get/containsKey/remove/size and keys replacing an existing value.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> environments = new HashMap<>();
        environments.put("booking-api", "DEV");
        environments.put("payment-api", "QA");
        environments.put("booking-api", "PROD");
        System.out.println("booking-api: " + environments.get("booking-api"));
        System.out.println("Contains catalog-api: " + environments.containsKey("catalog-api"));
        System.out.println("Count: " + environments.size());
    }
}
```

**Expected output**

```text
booking-api: PROD
Contains catalog-api: false
Count: 2
```

## Teaching notes

HashMap iteration order is unspecified. Use direct lookup or a separately ordered list of keys for deterministic output. get can return null for a missing key; containsKey is useful when null values are permitted.

**Common beginner mistake:** Expecting put with an existing key to add a second entry, or assuming map iteration follows insertion order.

## Student challenge

Create booking-api -> DEV and payment-api -> QA, update booking-api to PROD, remove payment-api, and handle a missing catalog-api.

**Acceptance criteria:** booking-api maps to PROD; size is one; missing catalog-api prints a friendly message.

[Open the exercise](../episodes/day-18-hashmaps/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-18-hashmaps/solution) · [Main.java](../episodes/day-18-hashmaps/solution/Main.java)

```java
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> environments = new HashMap<>();
        environments.put("booking-api", "DEV");
        environments.put("payment-api", "QA");
        environments.put("booking-api", "PROD");
        environments.remove("payment-api");
        System.out.println("booking-api: " + environments.get("booking-api"));
        System.out.println("Count: " + environments.size());
        if (!environments.containsKey("catalog-api")) {
            System.out.println("catalog-api has no configured environment");
        }
    }
}
```

**Expected output**

```text
booking-api: PROD
Count: 1
catalog-api has no configured environment
```

</details>

## Continuity

Day 17 handled ordered inventory. Day 18 enables named lookup; Day 19 signals invalid operations with exceptions.

[Previous lesson](../episodes/day-18-hashmaps/../day-17-arraylists/README.md) · [Next lesson](../episodes/day-18-hashmaps/../day-19-exceptions/README.md)


---

# Day 19 — Java Exceptions & Validation

[Course homepage](../episodes/day-19-exceptions/../../README.md) · [Runnable demo](../episodes/day-19-exceptions/demo/Main.java) · [Challenge](../episodes/day-19-exceptions/challenge/README.md) · [Production guide](../episodes/day-19-exceptions/../../production/README.md)

**YouTube title:** Java Exceptions & Validation in 15 Minutes | Day 19

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Explain an exception as interrupted normal execution.
- Use throw to reject invalid input.
- Distinguish checked and unchecked exceptions at a basic level.
- Read an exception message and stack trace.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain IllegalArgumentException, fail-fast validation, throw, propagation, and the difference between a compile error and a runtime exception |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

IllegalArgumentException, fail-fast validation, throw, propagation, and the difference between a compile error and a runtime exception.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Health: " + calculateHealth(10, 9) + "%");
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total replicas must be positive");
        }
        return healthy * 100.0 / total;
    }
}
```

**Expected output**

```text
Health: 90.0%
```

## Teaching notes

The normal demo succeeds. Run an optional invalid call separately to see an uncaught exception and a nonzero exit. Do not promise an exact stack trace: line numbers and runtime details vary. Catching and recovery are Day 20’s focus.

**Common beginner mistake:** Confusing throw with throws, or calculating a health percentage before rejecting zero total replicas.

## Student challenge

Validate that total replicas is positive and healthy replicas is between zero and total. Calculate 70.0 for (10, 7).

**Acceptance criteria:** Valid input returns 70.0. Calls with (0, 0), (10, -1), or (10, 11) throw IllegalArgumentException. The normal solution run remains successful.

[Open the exercise](../episodes/day-19-exceptions/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-19-exceptions/solution) · [Main.java](../episodes/day-19-exceptions/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Health: " + calculateHealth(10, 7) + "%");
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total replicas must be positive");
        }
        if (healthy < 0 || healthy > total) {
            throw new IllegalArgumentException("Healthy replicas must be between zero and total");
        }
        return healthy * 100.0 / total;
    }
}
```

**Expected output**

```text
Health: 70.0%
```

</details>

## Continuity

Day 18 handled missing mappings explicitly. Day 19 signals invalid data; Day 20 catches and responds to failures.

[Previous lesson](../episodes/day-19-exceptions/../day-18-hashmaps/README.md) · [Next lesson](../episodes/day-19-exceptions/../day-20-try-catch/README.md)


---

# Day 20 — Java Try/Catch & Safe Execution

[Course homepage](../episodes/day-20-try-catch/../../README.md) · [Runnable demo](../episodes/day-20-try-catch/demo/Main.java) · [Challenge](../episodes/day-20-try-catch/challenge/README.md) · [Production guide](../episodes/day-20-try-catch/../../production/README.md)

**YouTube title:** Java Try/Catch & Safe Execution in 15 Minutes | Day 20

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Handle a specific exception with try/catch.
- Continue after a recoverable failure.
- Explain finally without treating it as success.
- Keep failure handling separate from normal results.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Try/catch, specific exception types, meaningful error messages, finally, and safe execution across multiple attempts |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Try/catch, specific exception types, meaningful error messages, finally, and safe execution across multiple attempts.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Health: " + calculateHealth(0, 0));
        } catch (IllegalArgumentException exception) {
            System.out.println("Cannot check health: " + exception.getMessage());
        } finally {
            System.out.println("Health check finished");
        }
        System.out.println("Program continues");
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) { throw new IllegalArgumentException("Total replicas must be positive"); }
        return healthy * 100.0 / total;
    }
}
```

**Expected output**

```text
Cannot check health: Total replicas must be positive
Health check finished
Program continues
```

## Teaching notes

Catch at the point where a useful response is possible. Do not swallow exceptions or report success in finally. Resource cleanup with try-with-resources is introduced for file and HTTP examples.

**Common beginner mistake:** Using catch(Exception) everywhere and continuing as though an operation succeeded.

## Student challenge

Process totals {10, 0, 5} with five healthy replicas. Catch invalid totals per item so the third check still runs.

**Acceptance criteria:** Print 50.0%, the error for zero total, then 100.0%, in that order.

[Open the exercise](../episodes/day-20-try-catch/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-20-try-catch/solution) · [Main.java](../episodes/day-20-try-catch/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        int[] totals = {10, 0, 5};
        for (int total : totals) {
            try {
                System.out.println("Health: " + calculateHealth(total, 5) + "%");
            } catch (IllegalArgumentException exception) {
                System.out.println("Cannot check health: " + exception.getMessage());
            }
        }
    }
    static double calculateHealth(int total, int healthy) {
        if (total <= 0) { throw new IllegalArgumentException("Total replicas must be positive"); }
        if (healthy < 0 || healthy > total) { throw new IllegalArgumentException("Invalid healthy count"); }
        return healthy * 100.0 / total;
    }
}
```

**Expected output**

```text
Health: 50.0%
Cannot check health: Total replicas must be positive
Health: 100.0%
```

</details>

## Continuity

Day 19 created a failure signal. Day 20 responds safely; Day 21 introduces inheritance for related application types.

[Previous lesson](../episodes/day-20-try-catch/../day-19-exceptions/README.md) · [Next lesson](../episodes/day-20-try-catch/../day-21-inheritance/README.md)


---

# Day 21 — Java Inheritance & Overriding

[Course homepage](../episodes/day-21-inheritance/../../README.md) · [Runnable demo](../episodes/day-21-inheritance/demo/Main.java) · [Challenge](../episodes/day-21-inheritance/challenge/README.md) · [Production guide](../episodes/day-21-inheritance/../../production/README.md)

**YouTube title:** Java Inheritance & Overriding in 15 Minutes | Day 21

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Extend a base class.
- Initialize inherited state through super.
- Override an instance method.
- Observe polymorphic behavior through a base reference.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain An is-a relationship, extends, super, @Override, and runtime method selection |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

An is-a relationship, extends, super, @Override, and runtime method selection.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Application app = new WebApplication("booking-api");
        app.deploy();
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
    void deploy() { System.out.println("Deploying " + name); }
}
class WebApplication extends Application {
    WebApplication(String name) { super(name); }
    @Override
    void deploy() { System.out.println("Deploying web application: " + getName()); }
}
```

**Expected output**

```text
Deploying web application: booking-api
```

## Teaching notes

WebApplication is an Application, so this example fits inheritance. Do not claim inheritance is the best way to share all code; composition is appropriate for many designs. Keep private base state behind a getter.

**Common beginner mistake:** Confusing overriding with overloading, or trying to access a private base field directly.

## Student challenge

Add BatchApplication with an overridden deploy() message. Put a WebApplication and BatchApplication into an Application array and call deploy on each.

**Acceptance criteria:** Two distinct implementation messages print in array order through Application references.

[Open the exercise](../episodes/day-21-inheritance/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-21-inheritance/solution) · [Main.java](../episodes/day-21-inheritance/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Application[] apps = {new WebApplication("booking-api"), new BatchApplication("report-job")};
        for (Application app : apps) { app.deploy(); }
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
    void deploy() { System.out.println("Deploying " + name); }
}
class WebApplication extends Application {
    WebApplication(String name) { super(name); }
    @Override void deploy() { System.out.println("Deploying web application: " + getName()); }
}
class BatchApplication extends Application {
    BatchApplication(String name) { super(name); }
    @Override void deploy() { System.out.println("Deploying batch application: " + getName()); }
}
```

**Expected output**

```text
Deploying web application: booking-api
Deploying batch application: report-job
```

</details>

## Continuity

Days 13–16 built classes. Day 21 models related types; Day 22 expresses shared behavior without requiring one base class.

[Previous lesson](../episodes/day-21-inheritance/../day-20-try-catch/README.md) · [Next lesson](../episodes/day-21-inheritance/../day-22-interfaces/README.md)


---

# Day 22 — Java Interfaces

[Course homepage](../episodes/day-22-interfaces/../../README.md) · [Runnable demo](../episodes/day-22-interfaces/demo/Main.java) · [Challenge](../episodes/day-22-interfaces/challenge/README.md) · [Production guide](../episodes/day-22-interfaces/../../production/README.md)

**YouTube title:** Java Interfaces in 15 Minutes | Day 22

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Define a behavioral contract.
- Implement an interface in unrelated classes.
- Use an interface reference.
- Explain the difference between implements and extends.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Interface declaration, abstract method signature, public implementation, implements, and interface-based polymorphism |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Interface declaration, abstract method signature, public implementation, implements, and interface-based polymorphism.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Deployable operation = new WebApplication();
        operation.deploy();
    }
}
interface Deployable { void deploy(); }
class WebApplication implements Deployable {
    @Override public void deploy() { System.out.println("Deploying web application"); }
}
```

**Expected output**

```text
Deploying web application
```

## Teaching notes

The simple interface contains only a method contract. Default methods and interface constants can wait. Implementing methods must be public because these interface methods are public.

**Common beginner mistake:** Omitting public on the implementation, or trying to instantiate an interface directly.

## Student challenge

Add DatabaseMigration implementing Deployable. Run a WebApplication and DatabaseMigration through a Deployable array.

**Acceptance criteria:** Both operations print their own messages through the same interface contract.

[Open the exercise](../episodes/day-22-interfaces/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-22-interfaces/solution) · [Main.java](../episodes/day-22-interfaces/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Deployable[] operations = {new WebApplication(), new DatabaseMigration()};
        for (Deployable operation : operations) { operation.deploy(); }
    }
}
interface Deployable { void deploy(); }
class WebApplication implements Deployable {
    @Override public void deploy() { System.out.println("Deploying web application"); }
}
class DatabaseMigration implements Deployable {
    @Override public void deploy() { System.out.println("Running database migration"); }
}
```

**Expected output**

```text
Deploying web application
Running database migration
```

</details>

## Continuity

Day 21 used a common parent. Day 22 uses a contract; Day 23 replaces arbitrary environment Strings with an enum.

[Previous lesson](../episodes/day-22-interfaces/../day-21-inheritance/README.md) · [Next lesson](../episodes/day-22-interfaces/../day-23-enums/README.md)


---

# Day 23 — Java Enums

[Course homepage](../episodes/day-23-enums/../../README.md) · [Runnable demo](../episodes/day-23-enums/demo/Main.java) · [Challenge](../episodes/day-23-enums/challenge/README.md) · [Production guide](../episodes/day-23-enums/../../production/README.md)

**YouTube title:** Java Enums in 15 Minutes | Day 23

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Define a fixed set of environment values.
- Use enum constants in a switch.
- Iterate through values().
- Convert validated text with valueOf and handle invalid input.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Enum declaration, name(), values(), equality, and case-sensitive valueOf conversion |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Enum declaration, name(), values(), equality, and case-sensitive valueOf conversion.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Environment selected = Environment.QA;
        for (Environment environment : Environment.values()) {
            System.out.println("Environment: " + environment.name());
        }
        switch (selected) {
            case DEV: System.out.println("Development selected"); break;
            case QA: System.out.println("Testing selected"); break;
            case STG: System.out.println("Staging selected"); break;
            case PROD: System.out.println("Production selected"); break;
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected output**

```text
Environment: DEV
Environment: QA
Environment: STG
Environment: PROD
Testing selected
```

## Teaching notes

Use explicit enum names, not ordinal values, for persistent configuration. Enum == compares the constants safely. Show normalization deliberately; this lesson keeps accepted input uppercase.

**Common beginner mistake:** Expecting valueOf("prod") to accept lowercase, or persisting ordinals whose meaning changes when constants are reordered.

## Student challenge

Parse STG and UNKNOWN from a String array. Catch the invalid value and show an informative message.

**Acceptance criteria:** STG converts successfully; UNKNOWN reports an error without terminating the program.

[Open the exercise](../episodes/day-23-enums/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-23-enums/solution) · [Main.java](../episodes/day-23-enums/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        String[] inputs = {"STG", "UNKNOWN"};
        for (String input : inputs) {
            try {
                Environment environment = Environment.valueOf(input);
                System.out.println("Selected: " + environment);
            } catch (IllegalArgumentException exception) {
                System.out.println("Unknown environment: " + input);
            }
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected output**

```text
Selected: STG
Unknown environment: UNKNOWN
```

</details>

## Continuity

Day 22 described behavior. Day 23 constrains environment values; Day 24 loads configuration from a file.

[Previous lesson](../episodes/day-23-enums/../day-22-interfaces/README.md) · [Next lesson](../episodes/day-23-enums/../day-24-file-handling/README.md)


---

# Day 24 — Java File Handling

[Course homepage](../episodes/day-24-file-handling/../../README.md) · [Runnable demo](../episodes/day-24-file-handling/demo/Main.java) · [Challenge](../episodes/day-24-file-handling/challenge/README.md) · [Production guide](../episodes/day-24-file-handling/../../production/README.md)

**YouTube title:** Java File Handling in 15 Minutes | Day 24

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Read UTF-8 configuration using Path and Files.
- Handle IOException.
- Write a local report.
- Explain how working directories affect relative paths.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Path.of, Files.readString/writeString, explicit UTF-8, IOException, and relative file paths |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Path.of, Files.readString/writeString, explicit UTF-8, IOException, and relative file paths.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Supporting files:** [config.txt](../episodes/day-24-file-handling/demo/config.txt)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

The fixture `config.txt` is read relative to the current directory. The solution creates or replaces only `report.txt` in its working directory. Generated reports are ignored by Git.

**Main.java**

```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            String config = Files.readString(Path.of("config.txt"), StandardCharsets.UTF_8);
            System.out.print(config);
        } catch (IOException exception) {
            System.err.println("Cannot read config.txt: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
application=booking-api
environment=QA
```

## Teaching notes

The supplied fixture config.txt is read from the demo directory. Files.readString handles its own stream lifecycle; APIs that return an open stream require try-with-resources. The challenge writes only its local report.txt.

**Common beginner mistake:** Running from the repository root while expecting a path relative to the demo folder, or ignoring a failed write.

## Student challenge

Read the supplied configuration and write a report containing Application: booking-api and Status: ready. Read it back and print it.

**Acceptance criteria:** The report is written in the solution directory as UTF-8 and its two lines are printed. A missing config prints an error and exits nonzero.

[Open the exercise](../episodes/day-24-file-handling/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-24-file-handling/solution) · [Main.java](../episodes/day-24-file-handling/solution/Main.java)

```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            String config = Files.readString(Path.of("config.txt"), StandardCharsets.UTF_8);
            if (!config.contains("application=booking-api")) {
                throw new IllegalArgumentException("Expected booking-api configuration");
            }
            Path report = Path.of("report.txt");
            Files.writeString(report, "Application: booking-api\nStatus: ready\n", StandardCharsets.UTF_8);
            System.out.print(Files.readString(report, StandardCharsets.UTF_8));
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Cannot create report: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
Application: booking-api
Status: ready
```

**Solution supporting files:** [config.txt](../episodes/day-24-file-handling/solution/config.txt)

</details>

## Continuity

Day 23 defined valid environments. Day 24 reads external text; Day 25 supplies a build tool before a JSON dependency.

[Previous lesson](../episodes/day-24-file-handling/../day-23-enums/README.md) · [Next lesson](../episodes/day-24-file-handling/../day-25-maven/README.md)


---

# Day 25 — Introduction to Maven

[Course homepage](../episodes/day-25-maven/../../README.md) · [Runnable demo](../episodes/day-25-maven/demo/src/main/java/Main.java) · [Challenge](../episodes/day-25-maven/challenge/README.md) · [Production guide](../episodes/day-25-maven/../../production/README.md)

**YouTube title:** Introduction to Maven in 15 Minutes | Day 25

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Explain the role of pom.xml.
- Recognize Maven source directories and dependency coordinates.
- Compile and package with Java 21.
- Distinguish compile, test, and package phases.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Project coordinates, standard layout, pinned plugin versions, compiler release, and the build lifecycle |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Project coordinates, standard layout, pinned plugin versions, compiler release, and the build lifecycle.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean package
java -cp target/lesson-1.0-SNAPSHOT.jar Main
```

The POM sets compiler release 21 and pins the build plugins. `compile` compiles; `test` compiles and runs tests; `package` also creates a JAR. The default-package Main is retained to avoid adding the later packages lesson here.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Built with Maven and Java 21");
    }
}
```

**Expected output**

```text
Application: booking-api
Built with Maven and Java 21
```

## Teaching notes

Maven downloads plugins and dependencies on the first run. Day 25 uses no external Java library; Day 26 adds Jackson. Explain that Maven deploy is artifact publication, not deploying the application to a cloud environment.

**Common beginner mistake:** Running Maven outside the directory containing pom.xml, or using the wrong JDK for the build.

## Student challenge

Change the application summary to include QA and three replicas, then run mvn clean package and the packaged program.

**Acceptance criteria:** The build succeeds under JDK 21 and java -cp target/lesson-1.0-SNAPSHOT.jar Main prints the updated summary.

[Open the exercise](../episodes/day-25-maven/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-25-maven/solution) · [Main.java](../episodes/day-25-maven/solution/src/main/java/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Environment: QA");
        System.out.println("Replicas: 3");
        System.out.println("Built with Maven and Java 21");
    }
}
```

**Expected output**

```text
Application: booking-api
Environment: QA
Replicas: 3
Built with Maven and Java 21
```

</details>

## Continuity

Day 24 read local text. Day 25 establishes dependency management; Day 26 parses structured JSON.

[Previous lesson](../episodes/day-25-maven/../day-24-file-handling/README.md) · [Next lesson](../episodes/day-25-maven/../day-26-json/README.md)


---

# Day 26 — Working with JSON in Java

[Course homepage](../episodes/day-26-json/../../README.md) · [Runnable demo](../episodes/day-26-json/demo/src/main/java/Main.java) · [Challenge](../episodes/day-26-json/challenge/README.md) · [Production guide](../episodes/day-26-json/../../production/README.md)

**YouTube title:** Working with JSON in Java in 15 Minutes | Day 26

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Recognize JSON objects, fields, and scalar types.
- Add Jackson through Maven.
- Parse a local configuration with ObjectMapper.
- Validate field types and required values before using them.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain JSON syntax, dependency management, readTree, JsonNode field access, and explicit schema checks |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

JSON syntax, dependency management, readTree, JsonNode field access, and explicit schema checks.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

**Supporting files:** [config.json](../episodes/day-26-json/demo/config.json) · [pom.xml](../episodes/day-26-json/demo/pom.xml)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

The [demo POM](../episodes/day-26-json/demo/pom.xml) includes Jackson Databind 2.18.2. This is a pinned course dependency, not a claim that it is the newest version. The fixture uses a JSON object with application, environment, and replicas.

```json
{"application":"booking-api","environment":"QA","replicas":3}
```

**Main.java**

```java
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            JsonNode config = new ObjectMapper().readTree(Path.of("config.json").toFile());
            if (config == null || !config.isObject() || !config.path("application").isTextual()
                    || config.path("application").asText().isBlank()
                    || !config.path("environment").isTextual()) {
                throw new IllegalArgumentException("Application and environment must be text fields");
            }
            Environment environment = Environment.valueOf(config.path("environment").asText());
            System.out.println("Application: " + config.path("application").asText());
            System.out.println("Environment: " + environment);
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Invalid configuration: " + exception.getMessage());
            System.exit(1);
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected output**

```text
Application: booking-api
Environment: QA
```

## Teaching notes

Java 21 has no general-purpose built-in JSON object mapper. Jackson 2.x is pinned for this teaching project, not described as the latest release. Do not parse JSON using String.split or regex. The fixture is local and deterministic.

**Common beginner mistake:** Using asInt or asText without validation and silently accepting missing or wrong-type fields.

## Student challenge

Add a positive integer replicas field to the supplied JSON and reject missing, fractional, or nonpositive replica values.

**Acceptance criteria:** The valid fixture prints three replicas. Invalid field types fail with a clear error and nonzero exit.

[Open the exercise](../episodes/day-26-json/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-26-json/solution) · [Main.java](../episodes/day-26-json/solution/src/main/java/Main.java)

```java
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            JsonNode config = new ObjectMapper().readTree(Path.of("config.json").toFile());
            if (config == null || !config.isObject() || !config.path("application").isTextual()
                    || config.path("application").asText().isBlank()
                    || !config.path("environment").isTextual()) {
                throw new IllegalArgumentException("Application and environment must be text fields");
            }
            JsonNode replicas = config.path("replicas");
            if (!replicas.isIntegralNumber() || !replicas.canConvertToInt() || replicas.intValue() < 1) {
                throw new IllegalArgumentException("Replicas must be a positive integer");
            }
            Environment environment = Environment.valueOf(config.path("environment").asText());
            System.out.println("Application: " + config.path("application").asText());
            System.out.println("Environment: " + environment);
            System.out.println("Replicas: " + replicas.intValue());
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Invalid configuration: " + exception.getMessage());
            System.exit(1);
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected output**

```text
Application: booking-api
Environment: QA
Replicas: 3
```

**Solution supporting files:** [config.json](../episodes/day-26-json/solution/config.json) · [pom.xml](../episodes/day-26-json/solution/pom.xml)

</details>

## Continuity

Day 25 manages dependencies. Day 26 loads structured data; Day 27 retrieves an HTTP response and inspects status.

[Previous lesson](../episodes/day-26-json/../day-25-maven/README.md) · [Next lesson](../episodes/day-26-json/../day-27-http-requests/README.md)


---

# Day 27 — Making HTTP Requests in Java

[Course homepage](../episodes/day-27-http-requests/../../README.md) · [Runnable demo](../episodes/day-27-http-requests/demo/Main.java) · [Challenge](../episodes/day-27-http-requests/challenge/README.md) · [Production guide](../episodes/day-27-http-requests/../../production/README.md)

**YouTube title:** Making HTTP Requests in Java in 15 Minutes | Day 27

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Build and send a GET request with HttpClient.
- Inspect status codes before using a response body.
- Set connection and request timeouts.
- Handle I/O failures and preserve interruption.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain URI, HttpClient, HttpRequest, HttpResponse, body handlers, timeouts, and try-with-resources |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

URI, HttpClient, HttpRequest, HttpResponse, body handlers, timeouts, and try-with-resources.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java DemoServer.java
java Main
```

**Supporting files:** [DemoServer.java](../episodes/day-27-http-requests/demo/DemoServer.java)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

`DemoServer.java` is supplied infrastructure, not a server-building lesson. It binds only to 127.0.0.1, selects an available port, and shuts down after the request. No internet connection or API credentials are used. The solution keeps this fixture and changes only the requested path.

**Main.java**

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class Main {
    public static void main(String[] args) {
        try (DemoServer server = new DemoServer();
             HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(2)).build()) {
            HttpRequest request = HttpRequest.newBuilder(URI.create(server.baseUrl() + "/health"))
                    .timeout(Duration.ofSeconds(3)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + response.statusCode());
            if (response.statusCode() == 200) {
                System.out.println("Body: " + response.body());
            } else {
                System.out.println("Health endpoint unavailable");
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.err.println("Health request interrupted");
            System.exit(1);
        } catch (IOException exception) {
            System.err.println("Health request failed: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
Status: 200
Body: healthy
```

## Teaching notes

The supplied DemoServer is a fixture running only on loopback and choosing an available port. Its implementation is not part of the student task. A local fixture avoids depending on a changing public service. Explain that remote services can fail and HTTP 503 is a response, not an IOException.

**Common beginner mistake:** Treating every HTTP response as successful, omitting a timeout, or ignoring an InterruptedException.

## Student challenge

Change the request to /health?unhealthy=true and print a friendly response for status 503.

**Acceptance criteria:** The demo prints Status: 200 and Body: healthy. The solution prints Status: 503 and Health endpoint unavailable. Both terminate cleanly.

[Open the exercise](../episodes/day-27-http-requests/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-27-http-requests/solution) · [Main.java](../episodes/day-27-http-requests/solution/Main.java)

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class Main {
    public static void main(String[] args) {
        try (DemoServer server = new DemoServer();
             HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(2)).build()) {
            HttpRequest request = HttpRequest.newBuilder(URI.create(server.baseUrl() + "/health?unhealthy=true"))
                    .timeout(Duration.ofSeconds(3)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + response.statusCode());
            if (response.statusCode() == 200) {
                System.out.println("Body: " + response.body());
            } else {
                System.out.println("Health endpoint unavailable");
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.err.println("Health request interrupted");
            System.exit(1);
        } catch (IOException exception) {
            System.err.println("Health request failed: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
Status: 503
Health endpoint unavailable
```

**Solution supporting files:** [DemoServer.java](../episodes/day-27-http-requests/solution/DemoServer.java)

</details>

## Continuity

Day 26 parsed configuration. Day 27 requests a health endpoint; Day 28 verifies business rules with JUnit.

[Previous lesson](../episodes/day-27-http-requests/../day-26-json/README.md) · [Next lesson](../episodes/day-27-http-requests/../day-28-junit/README.md)


---

# Day 28 — Unit Testing with JUnit

[Course homepage](../episodes/day-28-junit/../../README.md) · [Runnable demo](../episodes/day-28-junit/demo/src/main/java/Main.java) · [Challenge](../episodes/day-28-junit/challenge/README.md) · [Production guide](../episodes/day-28-junit/../../production/README.md)

**YouTube title:** Unit Testing with JUnit in 15 Minutes | Day 28

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Write a JUnit Jupiter test using @Test.
- Assert computed values and decisions.
- Test threshold boundaries and invalid input.
- Run tests with Maven and interpret failures.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Test source layout, test-scoped dependencies, assertEquals with tolerance, assertThrows, and arrange/act/assert |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Test source layout, test-scoped dependencies, assertEquals with tolerance, assertThrows, and arrange/act/assert.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

**Supporting files:** [pom.xml](../episodes/day-28-junit/demo/pom.xml) · [HealthPolicy.java](../episodes/day-28-junit/demo/src/main/java/HealthPolicy.java) · [HealthPolicyTest.java](../episodes/day-28-junit/demo/src/test/java/HealthPolicyTest.java)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

The [HealthPolicy source](../episodes/day-28-junit/demo/src/main/java/HealthPolicy.java) holds business rules; test source belongs under `src/test/java`. JUnit Jupiter 5.11.4 is test-scoped. The lambda passed to `assertThrows` supplies the operation under test.

**Demo tests**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HealthPolicyTest {
    @Test void calculatesPercentageWithoutIntegerTruncation() {
        assertEquals(70.0, HealthPolicy.percentage(10, 7), 0.0001);
    }
    @Test void classifiesThresholdBoundaries() {
        assertEquals("Approved", HealthPolicy.classify(95));
        assertEquals("Review required", HealthPolicy.classify(94.9));
        assertEquals("Review required", HealthPolicy.classify(80));
        assertEquals("Rejected", HealthPolicy.classify(79.9));
    }
    @Test void rejectsZeroTotal() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(0, 0));
    }
}
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        double health = HealthPolicy.percentage(10, 7);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + HealthPolicy.classify(health));
    }
}
```

**Expected output**

```text
Health: 70.0%
Decision: Rejected
```

**Demo test result:** 3 tests, 0 failures, 0 errors, 0 skipped.

**Solution test result:** 6 tests, 0 failures, 0 errors, 0 skipped.

## Teaching notes

The tiny lambda in assertThrows supplies an operation to execute; broader lambda syntax is deferred. Test externally observable rules, not console formatting. Change a threshold temporarily to make a test fail, then restore it.

**Common beginner mistake:** Testing only the happy path or catching an exception inside a test without asserting that it occurred.

## Student challenge

Add tests for healthy counts -1 and 11 with total ten; check zero and full health; reject NaN and 101 percent.

**Acceptance criteria:** The demo runs three tests. The solution runs six, all passing; invalid inputs must throw rather than return a misleading percentage.

[Open the exercise](../episodes/day-28-junit/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-28-junit/solution) · [Main.java](../episodes/day-28-junit/solution/src/main/java/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        double health = HealthPolicy.percentage(10, 7);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + HealthPolicy.classify(health));
    }
}
```

**Expected output**

```text
Health: 70.0%
Decision: Rejected
```

**Added test cases**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HealthPolicyTest {
    @Test void calculatesPercentageWithoutIntegerTruncation() {
        assertEquals(70.0, HealthPolicy.percentage(10, 7), 0.0001);
    }
    @Test void classifiesThresholdBoundaries() {
        assertEquals("Approved", HealthPolicy.classify(95));
        assertEquals("Review required", HealthPolicy.classify(94.9));
        assertEquals("Review required", HealthPolicy.classify(80));
        assertEquals("Rejected", HealthPolicy.classify(79.9));
    }
    @Test void rejectsZeroTotal() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(0, 0));
    }    @Test void rejectsInvalidHealthyCounts() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(10, -1));
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(10, 11));
    }
    @Test void handlesZeroAndFullHealth() {
        assertEquals(0.0, HealthPolicy.percentage(10, 0), 0.0001);
        assertEquals(100.0, HealthPolicy.percentage(10, 10), 0.0001);
    }
    @Test void rejectsInvalidPercentage() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.classify(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.classify(101));
    }
}
```

**Solution supporting files:** [pom.xml](../episodes/day-28-junit/solution/pom.xml) · [HealthPolicy.java](../episodes/day-28-junit/solution/src/main/java/HealthPolicy.java) · [HealthPolicyTest.java](../episodes/day-28-junit/solution/src/test/java/HealthPolicyTest.java)

</details>

## Continuity

Day 27 introduced failure cases. Day 28 protects rules with tests; Day 29 records changes in Git before the capstone.

[Previous lesson](../episodes/day-28-junit/../day-27-http-requests/README.md) · [Next lesson](../episodes/day-28-junit/../day-29-git-github/README.md)


---

# Day 29 — Git & GitHub for Java Developers

[Course homepage](../episodes/day-29-git-github/../../README.md) · [Runnable demo](../episodes/day-29-git-github/demo/Main.java) · [Challenge](../episodes/day-29-git-github/challenge/README.md) · [Production guide](../episodes/day-29-git-github/../../production/README.md)

**YouTube title:** Git & GitHub for Java Developers in 15 Minutes | Day 29

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Git. A GitHub account is only needed for the optional remote step.

## Learning objectives

- Inspect a working tree and stage a specific file.
- Create and review a local commit.
- Use a branch for an exercise.
- Distinguish Git history from a GitHub remote and pull request.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain git status/diff/add/commit/log, branches, .gitignore, and an optional GitHub publication workflow |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

git status/diff/add/commit/log, branches, .gitignore, and an optional GitHub publication workflow.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Local Git demonstration**

Run this from the parent directory of your `java-in-15` clone. Use a new scratch directory outside the cloned repository:

```sh
mkdir java-day29-practice
cp java-in-15/episodes/day-29-git-github/demo/Main.java java-day29-practice/
cd java-day29-practice
git init
```

Create `.gitignore` with these lines:

```gitignore
*.class
target/
```

If Git has no author configured, set your actual name and email for this scratch repository using `git config user.name` and `git config user.email`. Then:

```sh
javac Main.java
java Main
git status
git add Main.java .gitignore
git commit -m "Add application summary"
git switch -c lesson-29
```

Edit DEV to QA in `Main.java`, run it again, and inspect the change:

```sh
javac Main.java
java Main
git diff
git add Main.java
git commit -m "Select QA environment"
git log --oneline
git status
```

Commit identifiers and default branch names vary. The expected final state is a clean working tree on `lesson-29` with two commits and no tracked `.class` files. The Java solution supplies the final file, while the commands above create the history.

**Optional GitHub step:** Create a practice repository in your own account, add its actual URL as a remote, push your exercise branch, and open a pull request. Explain that pushing shares commits externally. This local lesson does not require publishing anything or changing the course repository.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Environment: DEV");
    }
}
```

**Expected output**

```text
Application: booking-api
Environment: DEV
```

## Teaching notes

Use a separate scratch folder, not an embedded Git repository inside the course clone. Source files belong in Git; generated class files and target directories do not. Configure your own author identity if needed. Remote URLs and authentication belong to the learner.

**Common beginner mistake:** Committing generated files or secrets, or running git init in a lesson subdirectory of the cloned repository.

## Student challenge

In a scratch repository, commit the baseline program, create a lesson-29 branch, change DEV to QA, inspect the diff, and commit the change.

**Acceptance criteria:** History contains a baseline and a QA change. git status is clean after committing, and generated .class files are ignored.

[Open the exercise](../episodes/day-29-git-github/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-29-git-github/solution) · [Main.java](../episodes/day-29-git-github/solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Environment: QA");
    }
}
```

**Expected output**

```text
Application: booking-api
Environment: QA
```

</details>

## Continuity

Day 28 verified behavior. Day 29 records source changes; Day 30 integrates the learned concepts into a tested project.

[Previous lesson](../episodes/day-29-git-github/../day-28-junit/README.md) · [Next lesson](../episodes/day-29-git-github/../day-30-deployment-manager/README.md)


---

# Day 30 — Build Your First Java Application — Deployment Manager

[Course homepage](../episodes/day-30-deployment-manager/../../README.md) · [Runnable demo](../episodes/day-30-deployment-manager/demo/src/main/java/Main.java) · [Challenge](../episodes/day-30-deployment-manager/challenge/README.md) · [Production guide](../episodes/day-30-deployment-manager/../../production/README.md)

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

**Supporting files:** [applications.json](../episodes/day-30-deployment-manager/demo/config/applications.json) · [pom.xml](../episodes/day-30-deployment-manager/demo/pom.xml) · [Application.java](../episodes/day-30-deployment-manager/demo/src/main/java/Application.java) · [Configuration.java](../episodes/day-30-deployment-manager/demo/src/main/java/Configuration.java) · [Deployable.java](../episodes/day-30-deployment-manager/demo/src/main/java/Deployable.java) · [DeploymentService.java](../episodes/day-30-deployment-manager/demo/src/main/java/DeploymentService.java) · [Environment.java](../episodes/day-30-deployment-manager/demo/src/main/java/Environment.java) · [HealthPolicy.java](../episodes/day-30-deployment-manager/demo/src/main/java/HealthPolicy.java) · [DeploymentManagerTest.java](../episodes/day-30-deployment-manager/demo/src/test/java/DeploymentManagerTest.java)

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

**Expected output**

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

[Open the exercise](../episodes/day-30-deployment-manager/challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](../episodes/day-30-deployment-manager/solution) · [Main.java](../episodes/day-30-deployment-manager/solution/src/main/java/Main.java)

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

**Expected output**

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

**Solution supporting files:** [applications.json](../episodes/day-30-deployment-manager/solution/config/applications.json) · [pom.xml](../episodes/day-30-deployment-manager/solution/pom.xml) · [Application.java](../episodes/day-30-deployment-manager/solution/src/main/java/Application.java) · [Configuration.java](../episodes/day-30-deployment-manager/solution/src/main/java/Configuration.java) · [Deployable.java](../episodes/day-30-deployment-manager/solution/src/main/java/Deployable.java) · [DeploymentService.java](../episodes/day-30-deployment-manager/solution/src/main/java/DeploymentService.java) · [Environment.java](../episodes/day-30-deployment-manager/solution/src/main/java/Environment.java) · [HealthPolicy.java](../episodes/day-30-deployment-manager/solution/src/main/java/HealthPolicy.java) · [DeploymentManagerTest.java](../episodes/day-30-deployment-manager/solution/src/test/java/DeploymentManagerTest.java)

</details>

## Continuity

Days 11–29 supplied the components. Day 30 combines them; the next module can organize packages and introduce backend development without changing these rules.

[Previous lesson](../episodes/day-30-deployment-manager/../day-29-git-github/README.md) · [Completed capstone](../episodes/day-30-deployment-manager/../../projects/deployment-manager/README.md)


[Back to homepage](../README.md)

## Technical references

- [Apache Maven: Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Jackson Databind documentation](https://github.com/FasterXML/jackson-databind)
- [JUnit Jupiter 5.11.4 user guide](https://docs.junit.org/5.11.4/user-guide/)
- [Java 21 HttpClient API](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpClient.html)
- [Git switch documentation](https://git-scm.com/docs/git-switch)
