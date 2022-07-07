--alter user hr identified by hr account unlock;
--�� ���� �߰��ϴ¹�

--drop user you cascade; --you�� schema���� ����

--create user you identified by you
--default tablespace users;

--grant connect, resource to you;--���� �ο�

--grant all on hr.departments to you;--��� ���� �ο�

drop user mybatis cascade; 
--mybatis�� schema�� �����ϱ⶧���� ������ ���󰣴�.

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
alter table mybatis.posts add constraint posts_userid_fk foreign key(user_id) --posts���̺��� user_id�� users table�� user_id�� ������ ����ڴ�.
    references mybatis.users(user_id);
    
insert into mybatis.users values(1, 'john', to_date('2025-05-05','yyyy-mm-dd'));
insert into mybatis.users values(2, 'terry', to_date('2025-05-15','yyyy-mm-dd'));

insert into mybatis.addresses values(1, '����� ������');
insert into mybatis.addresses values(2, '������ �д籸');

insert into mybatis.posts values(101, '���', '�ʿ� ���� �����', 1);
insert into mybatis.posts values(102, '����', '�ʿ� ���� �����', 1);
insert into mybatis.posts values(201, '��ġ', '�װ� �־�� ���� ����', 2);
insert into mybatis.posts values(202, '�����', '���г�������� ���� �����̴�', 2);
insert into mybatis.posts values(203, '���Ҷ�', '�װ� �׸���', 2);

commit;