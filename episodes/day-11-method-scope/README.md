# Day 11 — Java Method Scope & Local Variables

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-10-parameters-returns/README.md) · [Next lesson](../day-12-method-overloading/README.md)
