drop table if exists Buyer;
drop table if exists Goods;
create table Goods (id bigint not null auto_increment, price double precision not null, title varchar(255), primary key (id)) engine=InnoDB;
insert into Goods (price, title) values (10, 'asfd');