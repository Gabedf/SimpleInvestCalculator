## 📄 README.md

```markdown
# 💰 Investment Calculator

A simple **Spring Boot** web application that simulates compound interest with **initial investment, monthly contributions, and annual interest rate**.  
It also includes a **basic HTML/CSS/JS front-end** served by Spring Boot.

---

## 🚀 Features
- REST API built with **Spring Boot**  
- Calculates compound interest with:
  - Initial investment
  - Monthly contribution
  - Annual interest rate
  - Investment period (years)
- Simple **front-end (HTML/CSS/JS)** integrated with the API
- Result formatted as **currency** (e.g., `$12,345.67`)

---

## 🛠️ Technologies
- **Java 24**  
- **Spring Boot 3.5.5**  
- **Maven**  
- **HTML / CSS / JavaScript**

---

## 📂 Project Structure
```

src/main/java/com/develsolutions/Invest/Calculator/
├── controller/
│    ├── InvestmentController.java   # REST API for calculation
│    └── HomeController.java         # Redirects "/" to index.html
├── service/
│    └── InvestmentService.java      # Business logic (compound interest)
└── InvestCalculatorApplication.java # Main class
src/main/resources/static/
├── index.html   # Front-end page
├── style.css    # Stylesheet
└── script.js    # API integration logic

````

---

## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/invest-calculator.git
````

2. Navigate into the project:

   ```bash
   cd invest-calculator
   ```
3. Run the application:

   ```bash
   mvn spring-boot:run
   ```
4. Open your browser:

   ```
   http://localhost:8080/
   ```

---

## 🌐 API Endpoint

The API is available at:

```
GET /api/calculate
```

### Parameters

| Name                | Type   | Description                             |
| ------------------- | ------ | --------------------------------------- |
| `initialValue`      | double | Initial investment amount               |
| `contributionValue` | double | Monthly contribution amount             |
| `rate`              | double | Annual interest rate (e.g., 0.12 = 12%) |
| `time`              | int    | Investment period in years              |

### Example

```
GET http://localhost:8080/api/calculate?initialValue=1000&contributionValue=200&rate=0.12&time=5
```

Response:

```json
17581.23
```

---

## 🎨 Front-End

The application also serves a simple **web page** at:

```
http://localhost:8080/
```

Where you can fill in the form and see the calculated result directly.

---

## 📜 License

This project is licensed under the MIT License.
Feel free to use, modify, and share it.

```