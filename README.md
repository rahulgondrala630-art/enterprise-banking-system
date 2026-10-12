# Ledgerline Banking Core

Ledgerline is a secure-by-design banking domain starter for customers, accounts, transfers, and auditable transaction history. It is intentionally ledger-first: money movement should be explainable, retry-safe, and testable before it is made visually impressive.

## Product direction

The first slice establishes the language and invariants for a trustworthy banking core:

- customers and accounts with explicit ownership
- immutable ledger entries as the source of truth for money movement
- idempotent transfer references for safe retries
- currency-aware value objects and validation boundaries
- auditability and reconciliation as first-class concerns

This is a portfolio foundation, not production financial software. Authentication, authorization, fraud controls, operational resilience, and regulatory requirements still need deeper implementation.

## Architecture

The project is organized around domain rules rather than a dashboard shell:

- **domain** — money, account, transfer, and ledger concepts
- **application** — commands, policies, idempotency, and use cases
- **adapters** — HTTP, persistence, and external service boundaries
- **db** — PostgreSQL migrations and indexes
- **docs** — invariants, decisions, and reconciliation guidance

## Technology

Java 17 · Spring Boot · Spring Web · Spring Data JPA · PostgreSQL · Flyway · Bean Validation · Maven · Docker Compose · GitHub Actions

## Local start

    docker compose up -d
    mvn spring-boot:run

The starter health endpoint is available at GET /api/health.

## Repository map

    src/main/java/com/ledgerline/
    ├── domain/       # Value objects and banking rules
    └── web/          # Small HTTP boundary for verification
    src/main/resources/db/migration/
    └── V1__create_accounts_and_ledger.sql
    docs/
    ├── domain-invariants.md
    └── adr/0001-ledger-first-balance-model.md

## Roadmap

1. Add account opening and customer ownership workflows.
2. Implement transactional transfers with idempotency keys.
3. Add balance projections and reconciliation checks.
4. Introduce authorization context, audit events, and failure-state handling.
5. Add contract tests and operational observability before any production claim.

## Portfolio note

Ledgerline complements my other work by emphasizing financial correctness, invariants, and audit trails rather than a frontend-heavy operations experience.
