create table client (id serial primary key, name varchar(255), email varchar(255));
insert into client (name, email) values ('John Doe', 'john.doe@nomail.com');
insert into client (name, email) values ('Jane Doe', 'jane.doe@nomail.com');

create table hobby (id serial primary key , name varchar(255));