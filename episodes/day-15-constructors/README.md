# Day 15 — Java Constructors

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-14-objects/README.md) · [Next lesson](../day-16-encapsulation/README.md)
