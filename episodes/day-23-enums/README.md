# Day 23 — Java Enums

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Java Enums in 15 Minutes | Day 23

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Define a fixed set of environment values.
- Use enum constants in a switch.
- Iterate through values().
- Convert validated text with valueOf and handle invalid input.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Enum declaration, name(), values(), equality, and case-sensitive valueOf conversion |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Enum declaration, name(), values(), equality, and case-sensitive valueOf conversion.

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
        Environment selected = Environment.QA;
        for (Environment environment : Environment.values()) {
            System.out.println("Environment: " + environment.name());
        }
        switch (selected) {
            case DEV: System.out.println("Development selected"); break;
            case QA: System.out.println("Testing selected"); break;
            case STG: System.out.println("Staging selected"); break;
            case PROD: System.out.println("Production selected"); break;
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected output**

```text
Environment: DEV
Environment: QA
Environment: STG
Environment: PROD
Testing selected
```

## Teaching notes

Use explicit enum names, not ordinal values, for persistent configuration. Enum == compares the constants safely. Show normalization deliberately; this lesson keeps accepted input uppercase.

**Common beginner mistake:** Expecting valueOf("prod") to accept lowercase, or persisting ordinals whose meaning changes when constants are reordered.

## Student challenge

Parse STG and UNKNOWN from a String array. Catch the invalid value and show an informative message.

**Acceptance criteria:** STG converts successfully; UNKNOWN reports an error without terminating the program.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        String[] inputs = {"STG", "UNKNOWN"};
        for (String input : inputs) {
            try {
                Environment environment = Environment.valueOf(input);
                System.out.println("Selected: " + environment);
            } catch (IllegalArgumentException exception) {
                System.out.println("Unknown environment: " + input);
            }
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected output**

```text
Selected: STG
Unknown environment: UNKNOWN
```

</details>

## Continuity

Day 22 described behavior. Day 23 constrains environment values; Day 24 loads configuration from a file.

[Previous lesson](../day-22-interfaces/README.md) · [Next lesson](../day-24-file-handling/README.md)
