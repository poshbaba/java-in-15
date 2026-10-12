[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md)

# Day 02 — Java Strings: Working with Text

**YouTube title:** Java Strings Explained in 15 Minutes | Day 2

**Learning objectives**

Students will learn:
- What a String represents.
- How to combine Strings.
- How to find String length.
- How to compare Strings using `.equals()`.
- How to convert text to uppercase or lowercase.
- Why Strings use `.equals()` rather than `==` for content comparison.

**Practical demonstration**

```java
public class Main {
    public static void main(String[] args) {

        String application = "booking-api";
        String environment = "PROD";

        String message = "Deploying " + application
                + " to " + environment;

        System.out.println(message);

        System.out.println(application.length());

        System.out.println(environment.toLowerCase());

        System.out.println(environment.equals("PROD"));
    }
}
```

**Expected output**

```text
Deploying booking-api to PROD
11
prod
true
```

**Student challenge:** Create a deployment message using two variables, then print its length and uppercase version.

**Connection to Day 1:** Students already know how to declare Strings. We immediately move into manipulating them rather than reteaching variable declarations.

**Complete topic scope:** Concatenation, `.length()`, `.equals()`, `.toUpperCase()`, and `.toLowerCase()`. Add an uppercase call after the baseline demonstration.

**Teaching notes:** Use `.equals()` for text content. `==` compares references for Strings and can appear to work with literals, which makes it misleading. String methods return results; assigning `environment = environment.toLowerCase();` retains the new text.

**Common beginner mistake:** Strings use `.length()`; arrays later use `.length` without parentheses.

**Challenge acceptance criteria:** Build a message from two variables and print its length and uppercase version.

[Attempt the challenge](challenge/README.md), then compare with the [reference solution](solution/Main.java).

**Continuity and next episode:** Day 3 introduces calculations and boolean expressions without reteaching declarations.

[Previous lesson](../day-01-variables/README.md) · [Next lesson](../day-03-operators/README.md)
