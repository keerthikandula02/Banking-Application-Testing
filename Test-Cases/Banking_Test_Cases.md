# Banking Test Cases

| ID | Scenario | Expected Result | Priority |
|---|---|---|---|
| BANK-001 | Valid login | Dashboard opens | Critical |
| BANK-002 | Invalid password | Access denied | High |
| BANK-003 | View balance | Correct available balance shown | High |
| BANK-004 | Transfer valid amount | Transfer succeeds and balances update | Critical |
| BANK-005 | Transfer greater than balance | Transfer rejected | Critical |
| BANK-006 | Missing beneficiary | Required validation shown | High |
| BANK-007 | Duplicate submit | Only one transaction created | Critical |
| BANK-008 | View statement | Correct transaction records displayed | Medium |
| BANK-009 | Logout | Session ends | High |
| BANK-010 | Session timeout | Re-authentication required | High |
