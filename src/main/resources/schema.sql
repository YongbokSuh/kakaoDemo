create table management_store_info ( 
   store_code VARCHAR(10) NOT NULL, 
   store_name VARCHAR(10) NOT NULL,
   use_status CHAR(1) NOT NULL
);

create table account_info ( 
   account_number VARCHAR(10) NOT NULL, 
   account_name VARCHAR(10) NOT NULL,
   store_code VARCHAR(10) NOT NULL
);

create table transaction_history (
   transaction_date VARCHAR(10) NOT NULL, 
   account_number VARCHAR(10) NOT NULL, 
   transaction_number VARCHAR(10) NOT NULL, 
   amount_of_money BIGINT NOT NULL, 
   fees BIGINT NOT NULL, 
   status CHAR(1) NOT NULL
);

