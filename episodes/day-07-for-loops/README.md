[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 07 — Java For Loops

**YouTube title:** Java For Loops Explained in 15 Minutes | Day 7

**Learning objectives**

Students will learn:
- Why loops are useful.
- The structure of a `for` loop.
- Initialization, condition, and increment.
- How to iterate through arrays.
- How to avoid common off-by-one errors.

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

        for (int i = 0; i < environments.length; i++) {
            System.out.println(
                    "Checking environment: " + environments[i]
            );
        }
    }
}
```

**Expected output**

```text
Checking environment: DEV
Checking environment: QA
Checking environment: STG
Checking environment: PROD
```

**Student challenge:** Create an array of five application names and print each application using a loop.

**Connection to Day 4:** Students revisit arrays and learn how to process every element without manually referencing each index.

**Complete topic scope:** The three parts of a counted loop, `i++`, array traversal, and off-by-one errors.

**Teaching notes:** Trace i as 0, 1, 2, 3, then explain why 4 stops the loop. `i++` increases i by one. Introduce the indexed loop first; enhanced for loops can wait.

**Common beginner mistake:** Use `i < environments.length`, not `<=`. Avoid a stray semicolon after the loop header.

**Challenge acceptance criteria:** Print each of five applications exactly once, in array order.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 8 repeats based on changing success and attempt conditions.

[Previous lesson](../day-06-switch/README.md) · [Next lesson](../day-08-while-loops/README.md)
