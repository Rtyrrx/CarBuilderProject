# Assignment Report – Builder Pattern Implementation

**Course:** Software Design Patterns  
**Student:** _[Your Name]_  
**Instructor:** Almas Ospanov  
**Date:** _[Submission Date]_

---

## Introduction

The **Builder Pattern** is a _creational design pattern_ that provides a flexible solution for constructing complex objects step by step.  
Instead of using constructors with many parameters, the Builder pattern separates **object construction** from its **representation**.

### Why Builder Pattern?

- Avoids **telescoping constructors** (constructors with too many parameters)
- Makes object creation **readable** and **maintainable**
- Allows creating different variations of the same object

---

## Implementation

This project demonstrates the Builder Pattern using a `Car` class with several configurable properties:

- `seats`
- `engine`
- `color`
- `GPS`
- `Trip Computer`

The object is immutable — once built, it cannot be modified.  
Construction is done through a **nested `Builder` class**, which supports _method chaining_ for readability.

### Example Code (Client Side)

```java
Car sportsCar = new Car.Builder()
        .setSeats(2)
        .setEngine("V8 Turbo")
        .setColor("Red")
        .enableGPS()
        .enableTripComputer()
        .build();
```
