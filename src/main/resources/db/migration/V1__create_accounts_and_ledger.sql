create table customers (id uuid primary key, display_name varchar(160) not null, created_at timestamp with time zone not null);
create table accounts (id uuid primary key, customer_id uuid not null references customers(id), account_number varchar(40) not null unique, currency char(3) not null, status varchar(24) not null, created_at timestamp with time zone not null);
create table ledger_entries (id uuid primary key, account_id uuid not null references accounts(id), reference_id uuid not null, amount numeric(19,2) not null, direction varchar(8) not null, created_at timestamp with time zone not null);
create index ledger_entries_account_idx on ledger_entries(account_id, created_at);
