[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 09 — Java Methods Explained

**YouTube title:** Java Methods Explained for Beginners | Day 9

**Learning objectives**

Students will learn:
- What a method is.
- Why methods improve code organization.
- How to declare a method.
- How to call a method.
- What `void` means.
- How `main()` differs from methods they create.

**Practical demonstration**

```java
public class Main {

    public static void main(String[] args) {

        checkApplicationHealth();
        deployApplication();
    }

    public static void checkApplicationHealth() {
        System.out.println("Checking application health...");
    }

    public static void deployApplication() {
        System.out.println("Deploying application...");
    }
}
```

**Expected output**

```text
Checking application health...
Deploying application...
```

**Student challenge:** Create three methods named `startDeployment()`, `runSecurityScan()`, and `completeDeployment()`. Call them from `main()`.

**Connection to Day 8:** Students learn how to organize previously written procedural code into reusable operations.

**Scope boundary:** Day 9 covers methods without parameters or return values. Those are introduced in Day 10.

**Complete topic scope:** Method declaration, method body, calling methods, `void`, execution order, and the main entry point.

**Teaching notes:** Keep methods at class scope, outside main. Use static helper methods so they can be called directly from static main; explain static more fully during OOP. Call a helper twice to show reuse.

**Common beginner mistake:** Defining a method does not run it. A void method does not return a result.

**Challenge acceptance criteria:** Declare all three named methods and call them in the requested order.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 10 adds inputs and returned results to these methods.

[Previous lesson](../day-08-while-loops/README.md) · [Next lesson](../day-10-parameters-returns/README.md)
