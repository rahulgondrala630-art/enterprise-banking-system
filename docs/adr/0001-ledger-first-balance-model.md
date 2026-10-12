# ADR 0001: Ledger-first balance model

## Decision
Represent money movements as immutable ledger entries and derive account balances from those entries or a transactionally maintained projection.

## Why
This keeps auditability and reconciliation visible. It also gives retries, disputes, and failure states a durable reference instead of hiding them inside a mutable balance field.

## Consequences
The implementation needs idempotency keys, database transactions, reconciliation checks, and careful query/index design.
