drop table if exists Buyer;
drop table if exists Goods;
create table Buyer (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB;
create table Goods (id bigint not null auto_increment, price double precision not null, title varchar(255), primary key (id)) engine=InnoDB;
insert into Goods (price, title) values (10, 'asfd1');
insert into Goods (price, title) values (10, 'asfd2');