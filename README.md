
---

## How to Run

1. Open in IntelliJ IDEA
2. Navigate to any `Main.java` file inside `src/patterns/<pattern-name>/`
3. Right-click → Run 'Main'

---

## Tools & Technologies

- Java 17+
- IntelliJ IDEA
- No external dependencies

---

## Author

Created by [Shahar Mamok](https://github.com/Shahar-Mamok)  
Focused on modular design, clean architecture, and practical pattern usage for real-world systems.

---

## Use Case

Inspired by NICE CXone’s real-life call & screen recording infrastructure, this project simulates how common patterns support:
- Scalability
- Maintainability
- Testability
- Secure, compliant recording

---

## Design Patterns Included

| #  | Pattern Name       | Purpose in Recording System                          |
|----|--------------------|------------------------------------------------------|
| 1  | Observer           | Notify compliance/DB when a recording is saved       |
| 2  | Factory            | Create different recording modes (audio/screen/both) |
| 3  | Singleton          | Ensure a shared manager instance                     |
| 4  | Strategy           | Apply dynamic processing (encrypt/mask/none)         |
| 5  | Decorator          | Layer extra behaviors (e.g., encrypt+mask)           |
| 6  | Command            | Encapsulate actions like start/stop recording        |
| 7  | Adapter            | Integrate with external APIs like Twilio             |
| 8  | Builder            | Construct full session objects cleanly               |
| 9  | Proxy              | Role-based access to recordings                      |
| 10 | Template Method    | Define skeleton of the recording process             |

---


