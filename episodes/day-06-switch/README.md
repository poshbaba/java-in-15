[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 06 — Java Switch Statements

**YouTube title:** Java Switch Statements Made Easy | Day 6

**Learning objectives**

Students will learn:
- When a `switch` statement is useful.
- How to define cases.
- How `break` prevents fall-through in traditional switch statements.
- How to handle unexpected values using `default`.
- When to choose `switch` instead of `if/else`.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String environment = "QA";

        switch (environment) {
            case "DEV":
                System.out.println("Development deployment");
                break;

            case "QA":
                System.out.println("Testing deployment");
                break;

            case "PROD":
                System.out.println("Production deployment");
                break;

            default:
                System.out.println("Unknown environment");
        }
    }
}
```

**Expected output**

```text
Testing deployment
```

**Student challenge:** Add a staging environment and test what happens when the selected environment is invalid.

**Connection to Day 5:** Students learn another way to implement decision-making.

**Complete topic scope:** Traditional String switch, `case`, `break`, `default`, and selecting exact values.

**Teaching notes:** Use the traditional statement consistently to explain fall-through. Mention that Java 21 also supports arrow cases and switch expressions, but reserve them for a later extension. Switch is useful for discrete choices; if/else handles ranges and compound conditions.

**Common beginner mistake:** Missing `break` can execute the next case. Case text must match exactly.

**Challenge acceptance criteria:** Add STG, confirm staging output, then change the input to UNKNOWN and confirm default output.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 7 repeats work across the environment array.

[Previous lesson](../day-05-if-else/README.md) · [Next lesson](../day-07-for-loops/README.md)
