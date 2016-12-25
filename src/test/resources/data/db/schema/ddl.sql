DROP TABLE if EXISTS item;
create table if not exists item (
   id          int          not null auto_increment,
   name        varchar(255) default null,
   price       int          default null,
   create_at   datetime(6)  default null,
   update_at   datetime(6)  default null,
   primary key (id)
);

DROP TABLE if EXISTS table1;
create table if not exists table1 (
   id          int          not null auto_increment,
   name        varchar(100) default null,
   create_date datetime(6)  default null,
   update_date datetime(6)  default null,
   primary key (id)
);

DROP TABLE if EXISTS table2;
create table if not exists table2 (
   id 	       int          not null auto_increment,
   name        varchar(100) default null,
   create_date datetime(6)  default null,
   update_date datetime(6)  default null,
   primary key (id)
);