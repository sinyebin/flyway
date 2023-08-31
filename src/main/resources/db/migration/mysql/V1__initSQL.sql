drop table if exists member;

create table member(
                       id bigint not null PRIMARY KEY ,
                       name varchar(255),
                       age int
)