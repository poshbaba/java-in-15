# Day 25 — Introduction to Maven

[Course homepage](../../README.md) · [Runnable demo](demo/src/main/java/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Introduction to Maven in 15 Minutes | Day 25

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Explain the role of pom.xml.
- Recognize Maven source directories and dependency coordinates.
- Compile and package with Java 21.
- Distinguish compile, test, and package phases.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Project coordinates, standard layout, pinned plugin versions, compiler release, and the build lifecycle |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Project coordinates, standard layout, pinned plugin versions, compiler release, and the build lifecycle.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean package
java -cp target/lesson-1.0-SNAPSHOT.jar Main
```

The POM sets compiler release 21 and pins the build plugins. `compile` compiles; `test` compiles and runs tests; `package` also creates a JAR. The default-package Main is retained to avoid adding the later packages lesson here.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Built with Maven and Java 21");
    }
}
```

**Expected program output** (Maven build logs omitted)

```text
Application: booking-api
Built with Maven and Java 21
```

## Teaching notes

Maven downloads plugins and dependencies on the first run. Day 25 uses no external Java library; Day 26 adds Jackson. Explain that Maven deploy is artifact publication, not deploying the application to a cloud environment.

**Common beginner mistake:** Running Maven outside the directory containing pom.xml, or using the wrong JDK for the build.

## Student challenge

Change the application summary to include QA and three replicas, then run mvn clean package and the packaged program.

**Acceptance criteria:** The build succeeds under JDK 21 and java -cp target/lesson-1.0-SNAPSHOT.jar Main prints the updated summary.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/src/main/java/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Environment: QA");
        System.out.println("Replicas: 3");
        System.out.println("Built with Maven and Java 21");
    }
}
```

**Expected program output** (Maven build logs omitted)

```text
Application: booking-api
Environment: QA
Replicas: 3
Built with Maven and Java 21
```

</details>

## Continuity

Day 24 read local text. Day 25 establishes dependency management; Day 26 parses structured JSON.

[Previous lesson](../day-24-file-handling/README.md) · [Next lesson](../day-26-json/README.md)
