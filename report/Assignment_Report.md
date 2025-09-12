# Assignment Report – Builder Pattern Implementation

**Course:** Software Design Patterns  
**Student:** Bek Madias  
**Instructor:** Temirgaly Dinmukhammed
**Date:** 9/12/2025

---

## 1 Introduction

The **Builder Pattern** is a _creational design pattern_ that provides a flexible solution for constructing complex objects step by step.  
Instead of using constructors with many parameters, the Builder pattern separates **object construction** from its **representation**.

### Why Builder Pattern?

- Avoids **telescoping constructors** (constructors with too many parameters)
- Makes object creation **readable** and **maintainable**
- Allows creating different variations of the same object

---

## 2 Implementation

This project demonstrates the Builder Pattern using a `Car` class with several configurable properties:

- `brand`
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
        .setBrand("Toyota")
        .setSeats(2)
        .setEngine("V8 Turbo")
        .setColor("Red")
        .enableGPS()
        .enableTripComputer()
        .build();
```

This is much clearer than calling a constructor like:

```java
new Car("Toyota", 2, "V8 Turbo", "Red", true, true);
```

---

## 3 Clean Code Principles Applied

| Principle           | How It Was Applied                                                |
| ------------------- | ----------------------------------------------------------------- |
| **Small Functions** | Each setter in `Builder` performs exactly one task                |
| **Readable Names**  | `enableGPS()` is more expressive than `setGPS(true)`              |
| **Immutability**    | No setters in `Car`; object state cannot change after creation    |
| **Validation**      | `build()` checks that brand and engine are not null and seats > 0 |
| **Method Chaining** | Allows step-by-step readable construction                         |

---

## 4 Advantages

- **Clarity:** Code reads like natural language, easy to understand
- **Flexibility:** Can create many variations of `Car` without changing client code
- **Maintainability:** Easy to add new fields in the future (just add setter in Builder)
- **Safety:** Validation prevents creating invalid objects

---

## 5 Conclusion

The Builder Pattern made the `Car` class **readable, safe, and extensible**.  
Applying **Clean Code principles** improved code quality, making it maintainable and easy to defend during review.

---

## Example Output

```
Sports Car: Car {Brand='Toyota', Seats=2, Engine='V8 Turbo', Color='Red', GPS=true, TripComputer=true}
Family Car: Car {Brand='Honda', Seats=5, Engine='V6', Color='Black', GPS=false, TripComputer=false}
```

---

## References

- Lecture Notes – _Creational Design Patterns – Builder Pattern_ (Almas Ospanov)
- [Refactoring Guru – Builder Pattern](https://refactoring.guru/design-patterns/builder)
