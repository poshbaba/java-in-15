[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 04 — Java Arrays Explained

**YouTube title:** Java Arrays Explained for Complete Beginners | Day 4

**Learning objectives**

Students will learn:
- Why arrays are useful.
- How to declare and initialize arrays.
- How to access elements by index.
- Why Java arrays start at index zero.
- How to retrieve array length.
- What happens when an index is out of bounds.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String[] environments = {
                "DEV",
                "QA",
                "STG",
                "PROD"
        };

        System.out.println(environments[0]);
        System.out.println(environments[3]);

        System.out.println(
                "Total environments: " + environments.length
        );
    }
}
```

**Expected output**

```text
DEV
PROD
Total environments: 4
```

**Student challenge:** Create an array containing five AWS services and print the first, third, and last service.

**Connection to Day 3:** Students can now store multiple related values instead of declaring separate variables.

**Important distinction:** Array indexing is introduced here; iterating through an entire array is reserved for Day 7.

**Complete topic scope:** Array declaration, initialization, zero-based indexing, reading and replacing elements, fixed length, and invalid indexes.

**Teaching notes:** Show `environments[1] = "TEST";` as a follow-up. An array of four items has valid indexes 0–3. Demonstrate `environments[4]` separately as an intentional runtime error, then remove it.

**Common beginner mistake:** The last index is `length - 1`. An out-of-bounds access compiles but fails at runtime.

**Challenge acceptance criteria:** Create exactly five service names and print indexes 0, 2, and 4 without a loop.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 5 adds decisions; full-array traversal waits until Day 7.

[Previous lesson](../day-03-operators/README.md) · [Next lesson](../day-05-if-else/README.md)
