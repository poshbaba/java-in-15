# Day 26 — Working with JSON in Java

[Course homepage](../../README.md) · [Runnable demo](demo/src/main/java/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Working with JSON in Java in 15 Minutes | Day 26

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Recognize JSON objects, fields, and scalar types.
- Add Jackson through Maven.
- Parse a local configuration with ObjectMapper.
- Validate field types and required values before using them.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain JSON syntax, dependency management, readTree, JsonNode field access, and explicit schema checks |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

JSON syntax, dependency management, readTree, JsonNode field access, and explicit schema checks.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

**Supporting files:** [config.json](demo/config.json) · [pom.xml](demo/pom.xml)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

The [demo POM](demo/pom.xml) includes Jackson Databind 2.18.2. This is a pinned course dependency, not a claim that it is the newest version. The fixture uses a JSON object with application, environment, and replicas.

```json
{"application":"booking-api","environment":"QA","replicas":3}
```

**Main.java**

```java
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            JsonNode config = new ObjectMapper().readTree(Path.of("config.json").toFile());
            if (config == null || !config.isObject() || !config.path("application").isTextual()
                    || config.path("application").asText().isBlank()
                    || !config.path("environment").isTextual()) {
                throw new IllegalArgumentException("Application and environment must be text fields");
            }
            Environment environment = Environment.valueOf(config.path("environment").asText());
            System.out.println("Application: " + config.path("application").asText());
            System.out.println("Environment: " + environment);
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Invalid configuration: " + exception.getMessage());
            System.exit(1);
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected program output** (Maven build logs omitted)

```text
Application: booking-api
Environment: QA
```

## Teaching notes

Java 21 has no general-purpose built-in JSON object mapper. Jackson 2.x is pinned for this teaching project, not described as the latest release. Do not parse JSON using String.split or regex. The fixture is local and deterministic.

**Common beginner mistake:** Using asInt or asText without validation and silently accepting missing or wrong-type fields.

## Student challenge

Add a positive integer replicas field to the supplied JSON and reject missing, fractional, or nonpositive replica values.

**Acceptance criteria:** The valid fixture prints three replicas. Invalid field types fail with a clear error and nonzero exit.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/src/main/java/Main.java)

```java
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            JsonNode config = new ObjectMapper().readTree(Path.of("config.json").toFile());
            if (config == null || !config.isObject() || !config.path("application").isTextual()
                    || config.path("application").asText().isBlank()
                    || !config.path("environment").isTextual()) {
                throw new IllegalArgumentException("Application and environment must be text fields");
            }
            JsonNode replicas = config.path("replicas");
            if (!replicas.isIntegralNumber() || !replicas.canConvertToInt() || replicas.intValue() < 1) {
                throw new IllegalArgumentException("Replicas must be a positive integer");
            }
            Environment environment = Environment.valueOf(config.path("environment").asText());
            System.out.println("Application: " + config.path("application").asText());
            System.out.println("Environment: " + environment);
            System.out.println("Replicas: " + replicas.intValue());
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Invalid configuration: " + exception.getMessage());
            System.exit(1);
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
```

**Expected program output** (Maven build logs omitted)

```text
Application: booking-api
Environment: QA
Replicas: 3
```

**Solution supporting files:** [config.json](solution/config.json) · [pom.xml](solution/pom.xml)

</details>

## Continuity

Day 25 manages dependencies. Day 26 loads structured data; Day 27 retrieves an HTTP response and inspects status.

[Previous lesson](../day-25-maven/README.md) · [Next lesson](../day-27-http-requests/README.md)
