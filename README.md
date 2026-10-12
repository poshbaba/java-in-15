![Java in 15 Minutes — From your first variable to real applications](docs/assets/banner.svg)

# Java in 15 Minutes

Learn Java from scratch through thirty focused lessons, runnable examples, and hands-on challenges. Start with variables and build toward a console-based **Java Deployment Manager**.

**Java 21 · Complete beginners · Approximately 15 minutes per lesson**

[**Start Day 1 →**](episodes/day-01-variables/README.md) · [Browse episodes](#episodes-130) · [Full curriculum](docs/curriculum.md)

## Start here

1. Install a Java 21 JDK and open the examples in IntelliJ IDEA or your preferred editor.
2. Start with [Day 1: Variables & Data Types](episodes/day-01-variables/README.md).
3. Run the demo, attempt the challenge, and compare your work with the solution.

No cloud account or external libraries are required. Deployment examples are local simulations.

## Episodes 1–30

| Day | Lesson | Runnable demo | Lesson material |
|---|---|---|---|
| 01 | [Variables & Data Types](episodes/day-01-variables/README.md) | [Code](episodes/day-01-variables/demo/Main.java) | Available |
| 02 | [Strings: Working with Text](episodes/day-02-strings/README.md) | [Code](episodes/day-02-strings/demo/Main.java) | Available |
| 03 | [Operators & Calculations](episodes/day-03-operators/README.md) | [Code](episodes/day-03-operators/demo/Main.java) | Available |
| 04 | [Arrays](episodes/day-04-arrays/README.md) | [Code](episodes/day-04-arrays/demo/Main.java) | Available |
| 05 | [If/Else Statements](episodes/day-05-if-else/README.md) | [Code](episodes/day-05-if-else/demo/Main.java) | Available |
| 06 | [Switch Statements](episodes/day-06-switch/README.md) | [Code](episodes/day-06-switch/demo/Main.java) | Available |
| 07 | [For Loops](episodes/day-07-for-loops/README.md) | [Code](episodes/day-07-for-loops/demo/Main.java) | Available |
| 08 | [While Loops](episodes/day-08-while-loops/README.md) | [Code](episodes/day-08-while-loops/demo/Main.java) | Available |
| 09 | [Methods](episodes/day-09-methods/README.md) | [Code](episodes/day-09-methods/demo/Main.java) | Available |
| 10 | [Method Parameters & Return Values](episodes/day-10-parameters-returns/README.md) | [Code](episodes/day-10-parameters-returns/demo/Main.java) | Available |


### Methods and object-oriented programming — Days 11–20

| Day | Lesson | Runnable demo | Lesson material |
|---|---|---|---|
| 11 | [Method Scope & Local Variables](episodes/day-11-method-scope/README.md) | [Code](episodes/day-11-method-scope/demo/Main.java) | Available |
| 12 | [Method Overloading](episodes/day-12-method-overloading/README.md) | [Code](episodes/day-12-method-overloading/demo/Main.java) | Available |
| 13 | [Classes Explained](episodes/day-13-classes/README.md) | [Code](episodes/day-13-classes/demo/Main.java) | Available |
| 14 | [Objects & References](episodes/day-14-objects/README.md) | [Code](episodes/day-14-objects/demo/Main.java) | Available |
| 15 | [Constructors](episodes/day-15-constructors/README.md) | [Code](episodes/day-15-constructors/demo/Main.java) | Available |
| 16 | [Encapsulation](episodes/day-16-encapsulation/README.md) | [Code](episodes/day-16-encapsulation/demo/Main.java) | Available |
| 17 | [ArrayLists](episodes/day-17-arraylists/README.md) | [Code](episodes/day-17-arraylists/demo/Main.java) | Available |
| 18 | [HashMaps](episodes/day-18-hashmaps/README.md) | [Code](episodes/day-18-hashmaps/demo/Main.java) | Available |
| 19 | [Exceptions & Validation](episodes/day-19-exceptions/README.md) | [Code](episodes/day-19-exceptions/demo/Main.java) | Available |
| 20 | [Try/Catch & Safe Execution](episodes/day-20-try-catch/README.md) | [Code](episodes/day-20-try-catch/demo/Main.java) | Available |


### Intermediate Java and first project — Days 21–30

| Day | Lesson | Runnable demo | Lesson material |
|---|---|---|---|
| 21 | [Inheritance & Overriding](episodes/day-21-inheritance/README.md) | [Code](episodes/day-21-inheritance/demo/Main.java) | Available |
| 22 | [Interfaces](episodes/day-22-interfaces/README.md) | [Code](episodes/day-22-interfaces/demo/Main.java) | Available |
| 23 | [Enums](episodes/day-23-enums/README.md) | [Code](episodes/day-23-enums/demo/Main.java) | Available |
| 24 | [File Handling](episodes/day-24-file-handling/README.md) | [Code](episodes/day-24-file-handling/demo/Main.java) | Available |
| 25 | [Introduction to Maven](episodes/day-25-maven/README.md) | [Code](episodes/day-25-maven/demo/src/main/java/Main.java) | Available |
| 26 | [Working with JSON in Java](episodes/day-26-json/README.md) | [Code](episodes/day-26-json/demo/src/main/java/Main.java) | Available |
| 27 | [Making HTTP Requests in Java](episodes/day-27-http-requests/README.md) | [Code](episodes/day-27-http-requests/demo/Main.java) | Available |
| 28 | [Unit Testing with JUnit](episodes/day-28-junit/README.md) | [Code](episodes/day-28-junit/demo/src/main/java/Main.java) | Available |
| 29 | [Git & GitHub for Developers](episodes/day-29-git-github/README.md) | [Code](episodes/day-29-git-github/demo/Main.java) | Available |
| 30 | [Build Your First Application — Deployment Manager](episodes/day-30-deployment-manager/README.md) | [Code](episodes/day-30-deployment-manager/demo/src/main/java/Main.java) | Available |

Video links will be added as episodes are published.

## What you’ll build

The Day 10 [Deployment Health Checker](projects/deployment-health-checker/README.md) brings together variables, Strings, calculations, arrays, decisions, loops, and reusable methods. It calculates application health, classifies deployment readiness, and simulates bounded retries.

The Day 30 [Java Deployment Manager](projects/deployment-manager/README.md) extends those foundations with objects, collections, JSON configuration, validated menus, tests, and a saved deployment report.

## Run an example

Clone this repository, then compile and run Day 1:

```sh
git clone https://github.com/poshbaba/java-in-15.git
cd java-in-15/episodes/day-01-variables/demo
javac Main.java
java Main
```

Run each demo or solution from its own directory; the examples use the same `Main` class name. Expected outputs are included in the lessons. Days 25, 26, 28, and 30 use Maven; follow their lesson-specific commands. Day 27 includes a supplied local HTTP server fixture.

## Course resources

- [Complete curriculum and learning objectives](docs/curriculum.md)
- [Day 10 milestone project](projects/deployment-health-checker/README.md)
- [Day 30 Deployment Manager](projects/deployment-manager/README.md)
- [Production guide](production/README.md)

## Questions or corrections

[Open an issue](https://github.com/poshbaba/java-in-15/issues) and include the episode number, your Java version, and the behavior you observed.
