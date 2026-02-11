## 📌 Exercise Statement

This module focuses on **lambda expressions and the Streams API** introduced in Java 8. Each exercise has been completed and documented following the **Conventional Commits** standard.

- Exercises reinforce writing **concise, expressive, and declarative code**.
- You will learn to **filter, transform, and sort collections** using lambdas and streams.
- The module also introduces **functional interfaces** and how to use them to encapsulate behavior.
- All exercises use **Java 8+ features** to practice modern, functional-style programming.

---

### Level 1 — Exercise 1: Filter Strings Containing 'o'

- Given a list of `String`s, a method was implemented to return all strings containing the letter `'o'`.
- The result is printed to the console using lambda expressions.

---

### Level 1 — Exercise 2: Filter Strings Containing 'o' with Length > 5

- Extended the previous method to return strings that **contain `'o'` and have more than 5 characters**.
- The resulting list is printed using a lambda.

---

### Level 1 — Exercise 3: Print Months Using Lambda

- A list of month names was created.
- All elements of the list are printed using a **lambda expression**.

---

### Level 1 — Exercise 4: Print Months Using Method Reference

- The same list of month names is printed using a **method reference** instead of a lambda.

---

### Level 1 — Exercise 5: Functional Interface getPiValue()

- A **Functional Interface** was created with a method `getPiValue()` returning a `double`.
- In the `main()` method, the interface was instantiated with a lambda returning `3.1415`.
- The value of `getPiValue()` is printed to verify correctness.

---

### Level 1 — Exercise 6: Sort List by String Length (Ascending)

- A list containing numbers and strings was sorted by **string length in ascending order** using a lambda comparator.

---

### Level 1 — Exercise 7: Sort List by String Length (Descending)

- The same list from Exercise 6 was sorted in **descending order by string length** using a lambda comparator.

---

### Level 1 — Exercise 8: Functional Interface reverse()

- A **Functional Interface** `Reverser` was created with a method `reverse()` accepting and returning a `String`.
- In `main()`, the interface is implemented using a lambda that returns the **reversed string**.
- The method is invoked with a sample string, and the output is printed to verify correctness.

---

## ✨ Features

- Using **lambda expressions** to filter, transform, and print collections
- Using **method references** for concise code
- Creating and using **custom functional interfaces**
- Sorting collections with **lambda-based comparators**
- Practicing **functional, declarative programming** with Java 8+ Streams

---

## 🛠 Technologies

- **Backend**: Java 21 (LTS)

---

## 🚀 Installation & Execution

1. Clone the repository by running `git clone <repository-url>` and navigate to the project folder.
2. Compile all Java source files using `javac -d out src/**/*.java`. This will create `.class` files in the `out` directory.
3. Run the program with `java -cp out Main`. This executes the main program demonstrating lambda expressions, streams, sorting, and functional interfaces.
