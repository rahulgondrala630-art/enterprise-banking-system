# Enterprise Banking System

A portfolio-grade banking domain foundation, being rebuilt as a secure, testable service rather than a superficial CRUD demo.

## Intended capabilities

- Customer and account lifecycle workflows
- Transaction validation and an auditable history
- Clear service boundaries for balances, transfers, and notifications
- Authentication and role-aware access as the security milestone

## Planned technology

Java · Spring Boot · REST APIs · PostgreSQL · JPA · Docker · GitHub Actions

## Quality bar

Financial workflows require explicit invariants, idempotency, validation, auditability, and careful handling of failure states. These concerns are documented before implementation so the project can grow without hiding risky assumptions.

## Roadmap

1. Define domain invariants and API contracts.
2. Add account and transaction persistence with migrations.
3. Add service, integration, and contract tests.
4. Add authentication, authorization, and observability.
5. Publish a safe seeded demo environment.

No credentials, payment data, or production integrations belong in this repository.
