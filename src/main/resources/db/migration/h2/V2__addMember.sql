drop table if exists member;

create table member(
                       id bigint primary key ,
                       name varchar(255),
                       age int,
                       address varchar(500)
)