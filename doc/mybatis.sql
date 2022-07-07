--alter user hr identified by hr account unlock;
--새 유저 추가하는법

--drop user you cascade; --you의 schema까지 삭제

--create user you identified by you
--default tablespace users;

--grant connect, resource to you;--권한 부여

--grant all on hr.departments to you;--모든 권한 부여

drop user mybatis cascade; 
--mybatis의 schema를 삭제하기때문에 모든것이 날라간다.

create user mybatis identified by mybatis default tablespace users;
grant connect, resource to mybatis;
/*
create table mybatis.users(
user_id number(2) constraint users_userid_pk primary key,
user_name varchar2(12),
reg_date date
);

create table mybatis.addresses(
user_id number(2) constraint addr_userid_PK primary key
                    constraint addr_userid_fk references mybatis.users(user_id),
address varchar2(30)
);

create table mybatis.posts (
post_id number(3) constraint posts_postid_pk primary key,
post_title varchar2(60),
post_content varchar2(120),
user_id number(2) constraint posts_userid_fk references mybatis.users(user_id)
);*/
------
create table mybatis.users(
    user_id number(2),
    user_name varchar2(12),
    reg_date date
);

create table mybatis.addresses(
    user_id number(2),
    adress varchar2(30)
);

create table mybatis.posts(
    post_id number(3),
    post_title varchar2(60),
    post_content varchar2(120),
    user_id number(2)
);

alter table mybatis.users add constraint users_userid_pk primary key(user_id);
alter table mybatis.addresses add constraint addresses_userid_pk primary key(user_id);
alter table mybatis.posts add constraint posts_postid_pk primary key(post_id);

alter table mybatis.addresses add constraint adresses_userid_fk foreign key(user_id)
    references mybatis.users(user_id);
alter table mybatis.posts add constraint posts_userid_fk foreign key(user_id) --posts테이블의 user_id를 users table의 user_id를 참조해 만들겠다.
    references mybatis.users(user_id);
    
insert into mybatis.users values(1, 'john', to_date('2025-05-05','yyyy-mm-dd'));
insert into mybatis.users values(2, 'terry', to_date('2025-05-15','yyyy-mm-dd'));

insert into mybatis.addresses values(1, '서울시 마포구');
insert into mybatis.addresses values(2, '성남시 분당구');

insert into mybatis.posts values(101, '사랑', '너와 나의 연결고리', 1);
insert into mybatis.posts values(102, '정의', '너와 나의 연대고리', 1);
insert into mybatis.posts values(201, '김치', '네가 있어야 밥을 먹지', 2);
insert into mybatis.posts values(202, '비빔밥', '동학농민항쟁이 만든 음식이다', 2);
insert into mybatis.posts values(203, '찹쌀떡', '네가 그리워', 2);

commit;