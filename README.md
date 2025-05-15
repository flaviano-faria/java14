# Java 14 Feature Demo

This project demonstrates some of the new features introduced in Java 14.

## Java 14 Features Used

### 1. Enhanced Switch Expressions
- The `switchExpression(String event)` method in `Service` class uses the new switch expression syntax introduced in Java 14, which allows multiple labels per case and the use of `->` for concise case bodies.

### 2. Helpful NullPointerExceptions
- The `stackTraceNullPointer()` method demonstrates the improved NullPointerException stack traces in Java 14, which provide more detailed information about what was `null` when the exception was thrown.

---

Explore the code in `src/main/java/com/java14/service/Service.java` for examples of these features.

Service class:
 - public void switchExpression(String event):
Demonstrates enhanced switch expressions;

- public void stackTraceNullPointer():
Demonstrates stack trace detailed information released in this java version
