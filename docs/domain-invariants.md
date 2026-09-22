# Banking domain invariants

1. A transfer must be represented by a durable reference that can be retried safely.
2. A ledger entry must name an account, amount, direction, currency, and creation time.
3. Balances cannot be changed by an untracked direct mutation.
4. Cross-currency transfers require an explicit exchange-rate policy.
5. Authorization and audit context must be established before a money-moving command runs.

These are starter constraints for design and tests, not a claim that the system is production-ready.
