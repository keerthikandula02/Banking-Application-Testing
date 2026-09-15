# 💳 Banking Application Testing

A manual testing portfolio project covering core retail-banking workflows with emphasis on functional correctness, data validation, security-minded negative testing and transaction integrity.

## Coverage
- Login and account access
- Account balance and statements
- Fund transfer
- Beneficiary management
- Bill payment
- Transaction history
- Input validation
- Session timeout/logout
- Negative and boundary testing
- Regression and smoke testing

## Structure
```text
Banking-Application-Testing/
├── README.md
├── Test-Cases/Banking_Test_Cases.md
├── Bug-Reports/Banking_Bug_Reports.md
├── Test-Data/banking_test_data.csv
├── Test-Plan/Banking_Test_Plan.md
└── Screenshots/
    ├── banking-dashboard.svg
    ├── fund-transfer.svg
    └── transaction-history.svg
```

## Screenshots
![Banking Dashboard](Screenshots/banking-dashboard.svg)

![Fund Transfer](Screenshots/fund-transfer.svg)

![Transaction History](Screenshots/transaction-history.svg)

> Screenshots are portfolio documentation mockups and do not contain real banking/customer information.

## Key Test Scenarios
| ID | Scenario | Expected |
|---|---|---|
| BANK-001 | Valid login | Dashboard displayed |
| BANK-002 | Invalid beneficiary account | Validation prevents submission |
| BANK-003 | Transfer within available balance | Transaction succeeds |
| BANK-004 | Transfer above available balance | Transaction rejected |
| BANK-005 | Duplicate transfer submission | Duplicate transaction prevented |
| BANK-006 | Statement date filter | Correct transactions displayed |
| BANK-007 | Session timeout | User must authenticate again |

## Tools
Manual Testing • Test Case Design • Bug Reporting • SQL concepts • Browser DevTools

**Author:** Keerthi Kandula
