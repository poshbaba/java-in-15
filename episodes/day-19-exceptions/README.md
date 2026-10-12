# Day 19 — Java Exceptions & Validation

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-18-hashmaps/README.md) · [Next lesson](../day-20-try-catch/README.md)
