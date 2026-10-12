# Day 17 — Java ArrayLists

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Java ArrayLists in 15 Minutes | Day 17

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Create a typed ArrayList.
- Add, retrieve, and remove elements.
- Compare size() with array length.
- Traverse a list of application objects using an enhanced for loop.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Imports, ArrayList<Application>, basic generic type notation, add/get/remove/size, and enhanced for traversal |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Imports, ArrayList<Application>, basic generic type notation, add/get/remove/size, and enhanced for traversal.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Application> apps = new ArrayList<>();
        apps.add(new Application("booking-api"));
        apps.add(new Application("payment-api"));
        System.out.println("First: " + apps.get(0).getName());
        for (Application app : apps) {
            System.out.println("Application: " + app.getName());
        }
        System.out.println("Count: " + apps.size());
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
}
```

**Expected output**

```text
First: booking-api
Application: booking-api
Application: payment-api
Count: 2
```

## Teaching notes

Generics here restrict the element type; designing generic classes is out of scope. Contrast fixed array length with list size changing after a removal. Explain the enhanced for syntax before using it.

**Common beginner mistake:** Using list[index] or list.length, or removing items directly from the list during an enhanced for loop.

## Student challenge

Add three applications, remove index one, then print the remaining names and size.

**Acceptance criteria:** booking-api and catalog-api remain in insertion order; size is two.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Application> apps = new ArrayList<>();
        apps.add(new Application("booking-api"));
        apps.add(new Application("payment-api"));
        apps.add(new Application("catalog-api"));
        apps.remove(1);
        for (Application app : apps) {
            System.out.println("Application: " + app.getName());
        }
        System.out.println("Count: " + apps.size());
    }
}
class Application {
    private final String name;
    Application(String name) { this.name = name; }
    String getName() { return name; }
}
```

**Expected output**

```text
Application: booking-api
Application: catalog-api
Count: 2
```

</details>

## Continuity

Day 16 supplied application objects. Day 17 creates a dynamic inventory; Day 18 adds lookup by key.

[Previous lesson](../day-16-encapsulation/README.md) · [Next lesson](../day-18-hashmaps/README.md)
