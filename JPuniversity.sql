create table university.login(username varchar(100), password varchar(100));

insert into university.login(username,password) values('admin','1234');
select*from university.login;

create table university.student(rollno varchar(50) primary key, name varchar(100), surname varchar(100),dob varchar(50),
address varchar(100), phone varchar(20), email varchar(100), lblug varchar(50),
course varchar(100),branch varchar(100) );

select*from university.student;

create table university.staff(empid varchar(50) primary key, name varchar(100), surname varchar(100), dob varchar(50), address varchar(100),
phone varchar(20), email varchar(100),qualification varchar(100),quali_per varchar(100), experience varchar(100),
post varchar(50),dept varchar(50));

select*from university.staff;

create table university.fee (c_id int primary key not null, course_Name varchar(100), sem1 int(100), sem2 int(100), sem3 int(100),
sem4 int(100),sem5 int(100),sem6 int(100),sem7 int(100),sem8 int(100));

insert into university.fee values(1,'Btech',50000, 45000,45000,40000,40000,40000,40000,40000);
insert into university.fee values(2,'Mtech',80000,80000,60000,60000,0,0,0,0);
insert into university.fee values(3,'BCA',35000,35000,35000,35000,35000,35000,0,0);
insert into university.fee values(4,'MCA',70000,70000,60000,60000,0,0,0,0);
insert into university.fee values(5,'BE',55000,55000,50000,50000,50000,50000,50000,50000);
insert into university.fee values(6,'ME',70000,70000,65000,65000,0,0,0,0);
insert into university.fee values(7,'BBA',25000,25000,25000,25000,25000,25000,0,0);
insert into university.fee values(8,'MBA',90000,90000,80000,75000,0,0,0,0);
insert into university.fee values(9,'BA',20000,20000,20000,20000,20000,20000,0,0);
insert into university.fee values(10,'MA',30000,30000,25000,25000,0,0,0,0);
insert into university.fee values(11,'Ph.D',50000,50000,45000,45000,40000,40000,0,0);
insert into university.fee values(12,'Bcom',20000,20000,20000,20000,20000,20000,0,0);

SELECT  (sem1 + sem2+sem3+sem4+sem5+sem6+sem7+sem8) AS Sum
FROM university.fee where c_id=1;

update university.fee set TotalFees=280000 where c_id=2;
update university.fee set TotalFees=210000 where c_id=3;
update university.fee set TotalFees=260000 where c_id=4;
update university.fee set TotalFees=410000 where c_id=5;
update university.fee set TotalFees=270000 where c_id=6;
update university.fee set TotalFees=150000 where c_id=7;
update university.fee set TotalFees=335000 where c_id=8;
update university.fee set TotalFees=120000 where c_id=9;
update university.fee set TotalFees=110000 where c_id=10;
update university.fee set TotalFees=270000 where c_id=11;
update university.fee set TotalFees=120000 where c_id=12;

select* from university.fee;

create table university.stdregistration(regid varchar(50) primary key, name varchar(100), email varchar(100),
password varchar(50), phone varchar(50), city varchar(50), state varchar(100) );

select * from university.stdregistration;

create table university.applicationform(applyid varchar(50) primary key, name varchar(100), surname varchar(100),
dob varchar(50), address varchar(50), phone varchar(50),email varchar(100),
  applied varchar(50), course varchar(100), exam varchar(100), examstatus varchar(100) );

select* from university.applicationform;

-- create table university.collegefees(rollno varchar (50) primary key, name varchar (100),surname varchar(100), course varchar(100),
-- branch varchar(100), semester varchar(100), amount varchar(100) );
-- select*from university.collegefees;

create table university.collegefees(payId int primary key, rollno varchar (50),
course varchar(100),branch varchar(100), semester varchar(100), amount varchar(100),
foreign key(rollno) references university.student(rollno) );

select * from university.collegefees;






