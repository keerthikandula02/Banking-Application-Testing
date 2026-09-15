# Banking Application Testing

Portfolio QA project combining manual testing artifacts, SQL validation, and Selenium + Java automation against the public ParaBank demo application.

## Scope
- Functional and negative testing of login, account overview, and fund-transfer navigation
- Test planning, test cases, test data, bug reporting, and SQL validation
- Selenium WebDriver automation using Java, JUnit 5, Maven, and Page Object Model

## Automation
The `src/test/java` suite contains smoke scenarios for:
1. Valid login and account-service availability
2. Invalid login error handling
3. Access to the Transfer Funds page

The automation targets the ParaBank demo application: https://parabank.parasoft.com/parabank/index.htm

> Note: ParaBank is a public demo/test application. The automation uses the documented demo credentials `john` / `demo` for portfolio testing. Do not use real banking credentials or real financial data.

## Project Structure
```text
Banking-Application-Testing/
├── Bug-Reports/
├── Screenshots/
├── SQL/
├── Test-Cases/
├── Test-Data/
├── Test-Plan/
├── src/test/java/com/keerthi/qa/
│   ├── BaseTest.java
│   ├── LoginPage.java
│   ├── AccountsPage.java
│   └── BankingSmokeTest.java
├── pom.xml
└── .gitignore
```

## Tech Stack
Java 17 | Selenium WebDriver | JUnit 5 | Maven | SQL | Manual Testing | Page Object Model

## Run Automation
Prerequisites: JDK 17+, Maven, and Google Chrome.

```bash
mvn clean test
```

Selenium Manager handles the browser driver setup in current Selenium versions.

## Manual Testing Artifacts
- Test cases for banking workflows
- Test plan and test data
- Sample bug reports
- SQL queries for transaction/balance validation
- UI reference screenshots

This repository is a portfolio project designed to demonstrate QA test design, automation structure, SQL validation, and defect documentation.
