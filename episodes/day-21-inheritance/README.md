# Day 21 — Java Inheritance & Overriding

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-20-try-catch/README.md) · [Next lesson](../day-22-interfaces/README.md)
