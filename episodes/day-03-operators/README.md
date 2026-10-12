[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 03 — Java Operators & Calculations

**YouTube title:** Java Operators Explained with Real Examples | Day 3

**Learning objectives**

Students will learn:
- Arithmetic operators: `+`, `-`, `*`, `/`, `%`.
- Assignment operators: `=`, `+=`, `-=`.
- Comparison operators: `>`, `<`, `>=`, `<=`, `==`, `!=`.
- Logical operators: `&&`, `||`, `!`.
- Integer versus floating-point division.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        int totalPods = 10;
        int healthyPods = 8;

        double healthPercentage =
                (healthyPods * 100.0) / totalPods;

        boolean healthy = healthPercentage >= 80;

        System.out.println("Health: " + healthPercentage + "%");
        System.out.println("Healthy: " + healthy);
    }
}
```

**Expected output**

```text
Health: 80.0%
Healthy: true
```

**Student challenge:** Calculate the percentage of healthy servers when 7 out of 10 are healthy.

**Connection to Day 2:** Students move from working with text to calculating numeric values and producing boolean results.

**Complete topic scope:** Arithmetic `+ - * / %`, assignment `= += -=`, comparison `> < >= <= == !=`, logical `&& || !`, parentheses, and integer division.

**Teaching notes:** Before the health demo, run small expressions: `7 / 10` is `0`, `7 / 10.0` is `0.7`, and `7 % 3` is `1`. Show `healthyPods += 1;` and `healthyPods -= 1;`. Compare `(healthPercentage >= 80 && totalPods > 0)`, `(healthPercentage >= 95 || healthyPods == totalPods)`, and `!healthy`. The baseline assumes a positive total.

**Common beginner mistake:** Use `100.0` so the percentage calculation uses floating-point division. `=` assigns; `==` compares primitive values.

**Challenge acceptance criteria:** Calculate 70.0% for seven healthy servers out of ten and explain why it is below 80%.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 4 groups related values; these operators return in decisions and loops.

[Previous lesson](../day-02-strings/README.md) · [Next lesson](../day-04-arrays/README.md)
