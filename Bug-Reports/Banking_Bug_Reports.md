# Banking Bug Reports

## BUG-BANK-001 — Balance not refreshed after transfer
**Severity:** Critical | **Priority:** Critical

Expected available balance to reflect a successful transfer immediately. Sample defect: dashboard value remains stale until refresh.

## BUG-BANK-002 — Duplicate transfer on repeated submit
**Severity:** Critical | **Priority:** High

Expected idempotent handling or disabled submit after the first request. Sample defect: repeated submission can create duplicate transaction records.
