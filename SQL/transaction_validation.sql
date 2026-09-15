-- Banking Application Testing: SQL Validation Queries
-- Purpose: validate accounts, transfers, balances and transaction history.

-- 1. Verify customer accounts
SELECT account_id, customer_id, account_type, account_status, balance
FROM accounts
WHERE account_status = 'ACTIVE'
ORDER BY account_id;

-- 2. Verify fund transfer details
SELECT transaction_id, from_account, to_account, amount,
       transaction_status, transaction_date
FROM transactions
WHERE transaction_type = 'TRANSFER'
  AND transaction_id = 9001;

-- 3. Verify transaction history for an account
SELECT transaction_id, transaction_type, amount,
       transaction_status, transaction_date
FROM transactions
WHERE from_account = 'ACC1001'
   OR to_account = 'ACC1001'
ORDER BY transaction_date DESC;

-- 4. Calculate expected balance from completed transactions
SELECT a.account_id,
       a.balance AS current_balance,
       COALESCE(SUM(CASE WHEN t.to_account = a.account_id
                         THEN t.amount ELSE 0 END), 0)
       - COALESCE(SUM(CASE WHEN t.from_account = a.account_id
                           THEN t.amount ELSE 0 END), 0) AS net_transfer_amount
FROM accounts a
LEFT JOIN transactions t
  ON (t.to_account = a.account_id OR t.from_account = a.account_id)
 AND t.transaction_status = 'SUCCESS'
WHERE a.account_id = 'ACC1001'
GROUP BY a.account_id, a.balance;

-- 5. Find failed transactions for defect/regression analysis
SELECT transaction_id, from_account, to_account, amount,
       transaction_status, failure_reason
FROM transactions
WHERE transaction_status = 'FAILED'
ORDER BY transaction_date DESC;
