# Day 29 — Git & GitHub for Java Developers

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Git & GitHub for Java Developers in 15 Minutes | Day 29

**Prerequisites:** Java 21 JDK and the preceding lessons. Install Git. A GitHub account is only needed for the optional remote step.

## Learning objectives

- Inspect a working tree and stage a specific file.
- Create and review a local commit.
- Use a branch for an exercise.
- Distinguish Git history from a GitHub remote and pull request.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain git status/diff/add/commit/log, branches, .gitignore, and an optional GitHub publication workflow |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

git status/diff/add/commit/log, branches, .gitignore, and an optional GitHub publication workflow.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Local Git demonstration**

Run this from the parent directory of your `java-in-15` clone. Use a new scratch directory outside the cloned repository:

```sh
mkdir java-day29-practice
cp java-in-15/episodes/day-29-git-github/demo/Main.java java-day29-practice/
cd java-day29-practice
git init
```

Create `.gitignore` with these lines:

```gitignore
*.class
target/
```

If Git has no author configured, set your actual name and email for this scratch repository using `git config user.name` and `git config user.email`. Then:

```sh
javac Main.java
java Main
git status
git add Main.java .gitignore
git commit -m "Add application summary"
git switch -c lesson-29
```

Edit DEV to QA in `Main.java`, run it again, and inspect the change:

```sh
javac Main.java
java Main
git diff
git add Main.java
git commit -m "Select QA environment"
git log --oneline
git status
```

Commit identifiers and default branch names vary. The expected final state is a clean working tree on `lesson-29` with two commits and no tracked `.class` files. The Java solution supplies the final file, while the commands above create the history.

**Optional GitHub step:** Create a practice repository in your own account, add its actual URL as a remote, push your exercise branch, and open a pull request. Explain that pushing shares commits externally. This local lesson does not require publishing anything or changing the course repository.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Environment: DEV");
    }
}
```

**Expected output**

```text
Application: booking-api
Environment: DEV
```

## Teaching notes

Use a separate scratch folder, not an embedded Git repository inside the course clone. Source files belong in Git; generated class files and target directories do not. Configure your own author identity if needed. Remote URLs and authentication belong to the learner.

**Common beginner mistake:** Committing generated files or secrets, or running git init in a lesson subdirectory of the cloned repository.

## Student challenge

In a scratch repository, commit the baseline program, create a lesson-29 branch, change DEV to QA, inspect the diff, and commit the change.

**Acceptance criteria:** History contains a baseline and a QA change. git status is clean after committing, and generated .class files are ignored.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Application: booking-api");
        System.out.println("Environment: QA");
    }
}
```

**Expected output**

```text
Application: booking-api
Environment: QA
```

</details>

## Continuity

Day 28 verified behavior. Day 29 records source changes; Day 30 integrates the learned concepts into a tested project.

[Previous lesson](../day-28-junit/README.md) · [Next lesson](../day-30-deployment-manager/README.md)
