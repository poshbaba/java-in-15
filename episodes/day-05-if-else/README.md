[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 05 — Java If/Else Statements

**YouTube title:** Java If/Else Statements Explained | Day 5

**Learning objectives**

Students will learn:
- How Java makes decisions.
- How `if` statements work.
- How to use `else`.
- How to introduce additional conditions with `else if`.
- How comparison and logical operators control execution.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        double healthPercentage = 92.5;

        if (healthPercentage >= 95) {
            System.out.println("Deployment approved");
        } else if (healthPercentage >= 80) {
            System.out.println("Deployment requires review");
        } else {
            System.out.println("Deployment rejected");
        }
    }
}
```

**Expected output**

```text
Deployment requires review
```

**Student challenge:** Create deployment approval logic using these conditions:

- Health ≥ 95%: Approved
- Health ≥ 80% and < 95%: Review required
- Health < 80%: Rejected

**Connection to Day 3:** Students apply the comparison operators they learned earlier.

**Complete topic scope:** Boolean conditions, `if`, `else if`, `else`, ordered thresholds, and combining conditions.

**Teaching notes:** Test health values 95, 94.9, 80, and 79.9. Descending thresholds avoid repeating the upper bound. As an extension, add `boolean approvedByOwner = true;` and require it with `&&` for approval.

**Common beginner mistake:** Check the highest threshold first. Braces keep the branch body clear.

**Challenge acceptance criteria:** Produce Approved, Review required, and Rejected at the correct boundaries.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 6 selects among named choices instead of numeric ranges.

[Previous lesson](../day-04-arrays/README.md) · [Next lesson](../day-06-switch/README.md)
