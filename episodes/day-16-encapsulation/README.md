# Day 16 — Java Encapsulation

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Java Encapsulation in 15 Minutes | Day 16

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Hide fields with private.
- Read state through a getter.
- Change state through a controlled operation.
- Preserve a simple object invariant.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Private fields, getters, controlled updates, immutable identity, and maintaining positive replica counts |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Private fields, getters, controlled updates, immutable identity, and maintaining positive replica counts.

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
        Application app = new Application("booking-api");
        System.out.println("Scaled: " + app.scaleTo(3));
        System.out.println("Scaled: " + app.scaleTo(-1));
        app.printSummary();
    }
}
class Application {
    private final String name;
    private int replicas = 1;
    Application(String name) { this.name = name; }
    boolean scaleTo(int replicas) {
        if (replicas < 1) { return false; }
        this.replicas = replicas;
        return true;
    }
    String getName() { return name; }
    void printSummary() {
        System.out.println(name + ": " + replicas + " replicas");
    }
}
```

**Expected output**

```text
Scaled: true
Scaled: false
booking-api: 3 replicas
```

## Teaching notes

The constructor starts at one replica. scaleTo returns false when the request is invalid, so callers can respond without exceptions. Exceptions are introduced on Day 19. A getter or setter is not automatically required for every field.

**Common beginner mistake:** Making fields private but adding an unrestricted setter that still accepts invalid state.

## Student challenge

Add getReplicas(). Scale to five, attempt zero, and print both results plus the final count.

**Acceptance criteria:** The valid update returns true; zero returns false; final replicas remain five.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        Application app = new Application("booking-api");
        System.out.println("Scale to 5: " + app.scaleTo(5));
        System.out.println("Scale to 0: " + app.scaleTo(0));
        System.out.println("Final replicas: " + app.getReplicas());
    }
}
class Application {
    private final String name;
    private int replicas = 1;
    Application(String name) { this.name = name; }
    boolean scaleTo(int replicas) {
        if (replicas < 1) { return false; }
        this.replicas = replicas;
        return true;
    }
    String getName() { return name; }
    int getReplicas() { return replicas; }
}
```

**Expected output**

```text
Scale to 5: true
Scale to 0: false
Final replicas: 5
```

</details>

## Continuity

Day 15 initialized objects. Day 16 constrains changes; Day 17 stores several objects in a resizable collection.

[Previous lesson](../day-15-constructors/README.md) · [Next lesson](../day-17-arraylists/README.md)
