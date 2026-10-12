[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 08 — Java While Loops

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

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 9 organizes operations into named reusable methods.

[Previous lesson](../day-07-for-loops/README.md) · [Next lesson](../day-09-methods/README.md)
