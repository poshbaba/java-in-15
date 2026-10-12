# Day 22 — Java Interfaces

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

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

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

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

[Previous lesson](../day-21-inheritance/README.md) · [Next lesson](../day-23-enums/README.md)
