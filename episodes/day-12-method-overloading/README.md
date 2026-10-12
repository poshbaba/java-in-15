# Day 12 — Java Method Overloading

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-11-method-scope/README.md) · [Next lesson](../day-13-classes/README.md)
