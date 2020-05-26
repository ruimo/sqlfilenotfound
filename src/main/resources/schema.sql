create sequence if not exists customer_customer_id_seq;

create table if not exists customer (
 customer_id bigint not null default nextval('customer_customer_id_seq')
);
