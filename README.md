# Car Builder Pattern Implementation 

**A simple Java example of the Builder design pattern with Clean Code principles.**

**Student:** Bek Madias 
**Course:** Software Design Patterns  
**Instructor:** Temirgaly Dinmukhammed

---

## Project overview
This repository demonstrates the Builder Pattern using a `Car` class and nested `Builder`. The implementation emphasizes Clean Code: small functions, expressive names, immutability, validation, and readable method chaining.

---

## Project structure
```
CarBuilderProject/
├── src/
│   ├── Car.java
│   └── Main.java
├── report/
│   └── Assignment_Report.md
├── README.md
└── .gitignore
```

---

## Build & run (local)
### Unix / macOS / Linux (bash)
```bash
# Compile
javac -d out src/*.java

# Run
java -cp out Main
```

### Windows (PowerShell / cmd)
```powershell
# Compile
javac -d out src\*.java

# Run
java -cp out Main
```

### Expected output
```
Sports Car: Car {Seats=2, Engine='V8 Turbo', Color='Red', GPS=true, TripComputer=true}
Family Car: Car {Seats=5, Engine='V6', Color='Black', GPS=false, TripComputer=false}
```

---

## Report
The detailed assignment report is in `report/Assignment_Report.md`.  
To convert it to PDF (optional):
- Open the `.md` file in a browser (or VSCode) and print → Save as PDF, or
- Use `pandoc`:
  ```bash
  pandoc report/Assignment_Report.md -o report/Assignment_Report.pdf
  ```

---

## Clean Code checklist (what I applied)
- Small, single-purpose methods in the builder  
- Expressive method names (`enableGPS()` vs `setGPS(true)`)  
- Immutable `Car` (final fields, no setters)  
- Centralized validation in `build()`  
- Sensible default values (`color = "Black"`)

---

## License
This project is for educational purposes only and does not include a public license.

---

## Contact
If you need any changes (extra features, UML diagram, unit tests), open an issue or contact: **github.com/Rtyrrx**.


