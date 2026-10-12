# Day 24 — Java File Handling

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Java File Handling in 15 Minutes | Day 24

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Read UTF-8 configuration using Path and Files.
- Handle IOException.
- Write a local report.
- Explain how working directories affect relative paths.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Path.of, Files.readString/writeString, explicit UTF-8, IOException, and relative file paths |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Path.of, Files.readString/writeString, explicit UTF-8, IOException, and relative file paths.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Supporting files:** [config.txt](demo/config.txt)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

The fixture `config.txt` is read relative to the current directory. The solution creates or replaces only `report.txt` in its working directory. Generated reports are ignored by Git.

**Main.java**

```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            String config = Files.readString(Path.of("config.txt"), StandardCharsets.UTF_8);
            System.out.print(config);
        } catch (IOException exception) {
            System.err.println("Cannot read config.txt: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
application=booking-api
environment=QA
```

## Teaching notes

The supplied fixture config.txt is read from the demo directory. Files.readString handles its own stream lifecycle; APIs that return an open stream require try-with-resources. The challenge writes only its local report.txt.

**Common beginner mistake:** Running from the repository root while expecting a path relative to the demo folder, or ignoring a failed write.

## Student challenge

Read the supplied configuration and write a report containing Application: booking-api and Status: ready. Read it back and print it.

**Acceptance criteria:** The report is written in the solution directory as UTF-8 and its two lines are printed. A missing config prints an error and exits nonzero.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            String config = Files.readString(Path.of("config.txt"), StandardCharsets.UTF_8);
            if (!config.contains("application=booking-api")) {
                throw new IllegalArgumentException("Expected booking-api configuration");
            }
            Path report = Path.of("report.txt");
            Files.writeString(report, "Application: booking-api\nStatus: ready\n", StandardCharsets.UTF_8);
            System.out.print(Files.readString(report, StandardCharsets.UTF_8));
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Cannot create report: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
Application: booking-api
Status: ready
```

**Solution supporting files:** [config.txt](solution/config.txt)

</details>

## Continuity

Day 23 defined valid environments. Day 24 reads external text; Day 25 supplies a build tool before a JSON dependency.

[Previous lesson](../day-23-enums/README.md) · [Next lesson](../day-25-maven/README.md)
