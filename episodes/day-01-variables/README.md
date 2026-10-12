[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 01 — Java Variables & Data Types

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

**Complete topic scope:** Declaration, initialization, assignment, four types, console output, and a deliberate type mismatch. Add `cpuUsage = 81.2;` and print it again to demonstrate updating an existing variable.

**Teaching notes:** `String` is a reference type; `int`, `double`, and `boolean` are primitive types. Use double quotes for text, lowercase boolean literals, and a semicolon at the end of statements. Show the incompatible assignment separately, then restore working code.

**Common beginner mistake:** Do not redeclare a variable to update it. `"3"` is text; `3` is a number.

**Challenge acceptance criteria:** Choose appropriate types and print four labeled values. Optional extension: update one value and print it again.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 2 uses the same application information to construct text messages.

[Next lesson](../day-02-strings/README.md)
