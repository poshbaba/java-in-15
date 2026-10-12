# Day 13 — Java Classes Explained

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-12-method-overloading/README.md) · [Next lesson](../day-14-objects/README.md)
