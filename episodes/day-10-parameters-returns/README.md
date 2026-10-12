[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 10 — Java Method Parameters & Return Values

**YouTube title:** Java Method Parameters & Return Values | Day 10

**Learning objectives**

Students will learn:
- How to pass arguments to methods.
- How parameters receive values.
- The difference between `void` and methods that return values.
- How to use the `return` keyword.
- How to combine methods with conditional logic.

**Practical demonstration**

```java
public class Main {

    public static void main(String[] args) {

        String application = "booking-api";
        double health = 96.5;

        boolean approved = checkHealth(health);

        if (approved) {
            deployApplication(application);
        } else {
            System.out.println("Deployment blocked");
        }
    }

    public static boolean checkHealth(double health) {
        return health >= 95;
    }

    public static void deployApplication(String application) {
        System.out.println("Deploying " + application);
    }
}
```

**Expected output**

```text
Deploying booking-api
```

**Student challenge:** Create a method that accepts the total number of pods and healthy pods, calculates the health percentage, and returns that percentage.

**Connection to Day 9:** Students extend simple methods to accept inputs and produce outputs.

**Complete topic scope:** Parameters versus arguments, declared return types, `return`, storing results, void methods with inputs, and branching on returned booleans.

**Teaching notes:** In `checkHealth(health)`, health is the argument; in the declaration, `double health` is the parameter. Printing is an observable action; returning makes a result available to the caller. The percentage challenge assumes totalPods > 0 and 0 <= healthyPods <= totalPods.

**Common beginner mistake:** A non-void method must return a compatible value on every reachable path. Use 100.0 to avoid integer truncation.

**Challenge acceptance criteria:** Return 70.0 for (10, 7), 100.0 for (10, 10), and 0.0 for (10, 0).

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** The milestone combines prior concepts; OOP follows in the next module.

[Previous lesson](../day-09-methods/README.md) · [Milestone project](../../projects/deployment-health-checker/README.md)
