create table users(
   id varchar2(50 char) primary key,
   username varchar2(50 char),
   password varchar2(50 char),
   roles_id varchar2(50 char)
);
create table roles(
   id varchar2(50 char) primary key,
   name varchar2(50 char)
);
create table permision(
   id varchar2(50 char) primary key,
   name varchar2(50 char),
   parent_id varchar2(50 char)
);
create table roles_permision(
   id varchar2(50 char) primary key,
   roles_id varchar2(50 char),
   permision_id varchar2(50 char)
);
insert into roles values('r01','主管');
insert into roles values('r02','普通员工');
insert into users values('u001','admin','123456','r01');
insert into users values('u002','test','123456','r02');
insert into permision values('p001','查询','root');
insert into permision values('p002','增加','root');
insert into permision values('p003','删除','root');
insert into permision values('p004','更新','root');
insert into roles_permision values('1','r01','p001');
insert into roles_permision values('2','r01','p002');
insert into roles_permision values('3','r01','p003');
insert into roles_permision values('4','r01','p004');
insert into roles_permision values('5','r02','p001');
commit;
