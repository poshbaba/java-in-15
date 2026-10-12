# Day 14 — Java Objects & References

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Java Objects & References in 15 Minutes | Day 14

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Create two independent instances from one class.
- Read and update instance-specific data.
- Explain an alias that refers to the same object.
- Distinguish an object from a variable holding its reference.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Multiple instances, independent state, reference assignment, and aliasing |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Multiple instances, independent state, reference assignment, and aliasing.

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
        Application booking = new Application();
        booking.name = "booking-api";
        booking.replicas = 3;
        Application payment = new Application();
        payment.name = "payment-api";
        payment.replicas = 2;
        Application alias = booking;
        alias.replicas = 4;
        booking.printSummary();
        payment.printSummary();
        System.out.println("Same object: " + (alias == booking));
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
booking-api: 4 replicas
payment-api: 2 replicas
Same object: true
```

## Teaching notes

Trace two new expressions, then contrast them with assigning booking to alias. Assignment copies a reference value; it does not copy the object.

**Common beginner mistake:** Expecting Application alias = booking to produce a separate application.

## Student challenge

Create inventory-api and notification-api objects. Set replicas to two and four. Change only inventory-api to five and print both.

**Acceptance criteria:** The final replica counts are five and four, showing independent objects. Do not use one object for both references.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Application inventory = new Application();
        inventory.name = "inventory-api";
        inventory.replicas = 2;
        Application notifications = new Application();
        notifications.name = "notification-api";
        notifications.replicas = 4;
        inventory.replicas = 5;
        inventory.printSummary();
        notifications.printSummary();
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
inventory-api: 5 replicas
notification-api: 4 replicas
```

</details>

## Continuity

Day 13 supplied the class definition. Day 14 uses independent instances; Day 15 initializes them through constructors.

[Previous lesson](../day-13-classes/README.md) · [Next lesson](../day-15-constructors/README.md)
