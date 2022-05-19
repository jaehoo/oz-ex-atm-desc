CREATE SCHEMA IF NOT EXISTS DEMO;
USE DEMO;

create sequence SQ_CUSTOMER;
create sequence SQ_ACCOUNT;

create table ACCOUNT (
      id_account number(10,0) not null,
      balance double precision,
      id_customer number(10,0) not null,
      primary key (id_account)
  ) ;;

  create table CUSTOMER (
      id_customer number(10,0) not null,
      name varchar2(255),
      primary key (id_customer)
  );;

  alter table ACCOUNT
      add constraint FK_ACC_CUS
      foreign key (id_customer)
      references CUSTOMER;


INSERT INTO CUSTOMER(id_customer,name) VALUES(1,'Jaehoo');
INSERT INTO CUSTOMER(id_customer,name) VALUES(2,'John Doe');
