# Day 20 — Java Try/Catch & Safe Execution

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-19-exceptions/README.md) · [Next lesson](../day-21-inheritance/README.md)
