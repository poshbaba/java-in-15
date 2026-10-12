# Day 28 — Unit Testing with JUnit

[Course homepage](../../README.md) · [Runnable demo](demo/src/main/java/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Unit Testing with JUnit in 15 Minutes | Day 28

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

## Learning objectives

- Write a JUnit Jupiter test using @Test.
- Assert computed values and decisions.
- Test threshold boundaries and invalid input.
- Run tests with Maven and interpret failures.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain Test source layout, test-scoped dependencies, assertEquals with tolerance, assertThrows, and arrange/act/assert |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

Test source layout, test-scoped dependencies, assertEquals with tolerance, assertThrows, and arrange/act/assert.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

**Supporting files:** [pom.xml](demo/pom.xml) · [HealthPolicy.java](demo/src/main/java/HealthPolicy.java) · [HealthPolicyTest.java](demo/src/test/java/HealthPolicyTest.java)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

The [HealthPolicy source](demo/src/main/java/HealthPolicy.java) holds business rules; test source belongs under `src/test/java`. JUnit Jupiter 5.11.4 is test-scoped. The lambda passed to `assertThrows` supplies the operation under test.

**Demo tests**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HealthPolicyTest {
    @Test void calculatesPercentageWithoutIntegerTruncation() {
        assertEquals(70.0, HealthPolicy.percentage(10, 7), 0.0001);
    }
    @Test void classifiesThresholdBoundaries() {
        assertEquals("Approved", HealthPolicy.classify(95));
        assertEquals("Review required", HealthPolicy.classify(94.9));
        assertEquals("Review required", HealthPolicy.classify(80));
        assertEquals("Rejected", HealthPolicy.classify(79.9));
    }
    @Test void rejectsZeroTotal() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(0, 0));
    }
}
```

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        double health = HealthPolicy.percentage(10, 7);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + HealthPolicy.classify(health));
    }
}
```

**Expected program output** (Maven build logs omitted)

```text
Health: 70.0%
Decision: Rejected
```

**Demo test result:** 3 tests, 0 failures, 0 errors, 0 skipped.

**Solution test result:** 6 tests, 0 failures, 0 errors, 0 skipped.

## Teaching notes

The tiny lambda in assertThrows supplies an operation to execute; broader lambda syntax is deferred. Test externally observable rules, not console formatting. Change a threshold temporarily to make a test fail, then restore it.

**Common beginner mistake:** Testing only the happy path or catching an exception inside a test without asserting that it occurred.

## Student challenge

Add tests for healthy counts -1 and 11 with total ten; check zero and full health; reject NaN and 101 percent.

**Acceptance criteria:** The demo runs three tests. The solution runs six, all passing; invalid inputs must throw rather than return a misleading percentage.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/src/main/java/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        double health = HealthPolicy.percentage(10, 7);
        System.out.println("Health: " + health + "%");
        System.out.println("Decision: " + HealthPolicy.classify(health));
    }
}
```

**Expected program output** (Maven build logs omitted)

```text
Health: 70.0%
Decision: Rejected
```

**Added test cases**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HealthPolicyTest {
    @Test void calculatesPercentageWithoutIntegerTruncation() {
        assertEquals(70.0, HealthPolicy.percentage(10, 7), 0.0001);
    }
    @Test void classifiesThresholdBoundaries() {
        assertEquals("Approved", HealthPolicy.classify(95));
        assertEquals("Review required", HealthPolicy.classify(94.9));
        assertEquals("Review required", HealthPolicy.classify(80));
        assertEquals("Rejected", HealthPolicy.classify(79.9));
    }
    @Test void rejectsZeroTotal() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(0, 0));
    }    @Test void rejectsInvalidHealthyCounts() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(10, -1));
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(10, 11));
    }
    @Test void handlesZeroAndFullHealth() {
        assertEquals(0.0, HealthPolicy.percentage(10, 0), 0.0001);
        assertEquals(100.0, HealthPolicy.percentage(10, 10), 0.0001);
    }
    @Test void rejectsInvalidPercentage() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.classify(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.classify(101));
    }
}
```

**Solution supporting files:** [pom.xml](solution/pom.xml) · [HealthPolicy.java](solution/src/main/java/HealthPolicy.java) · [HealthPolicyTest.java](solution/src/test/java/HealthPolicyTest.java)

</details>

## Continuity

Day 27 introduced failure cases. Day 28 protects rules with tests; Day 29 records changes in Git before the capstone.

[Previous lesson](../day-27-http-requests/README.md) · [Next lesson](../day-29-git-github/README.md)
