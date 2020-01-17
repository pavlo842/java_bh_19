use bhj19;

drop table employees; -- удаление таблицы
drop table specialties; -- удаление таблицы
truncate employees; -- очистка таблицы

create table specialties ( -- команда создания таблицы
	id int primary key auto_increment,
    specialty varchar(64) not null
);

insert into specialties (specialty) values
	('Dev'),
	('HR'),
    ('Huas');

create table employees ( -- команда создания таблицы
	id int primary key auto_increment,
    name varchar(64) not null unique,
    start_date date default '2020-01-01' not null,
    salary int not null check(salary > 0),
    specialtyId int,
    foreign key (specialtyId) references specialties (id)
);

insert into employees (name, salary, specialtyId) values
	('Pallo', 3500, 3),
	('Olga', 1900, 1),
    ('Karl', 2400, 2);

insert into employees values
	(null, 'Tallo', '2019-02-16', 2005, null),
	(null, 'Sallo', '2020-01-14', 5050, null),
	(null, 'Hallo', '2019-02-16', 2005, null),
	(null, 'Mallo', '2020-01-14', 5050, null);

select * from employees;
select * from specialties;

select * from specialties sp, employees e where sp.id = e.specialtyId;
select e.name, j.specialty from employees e
	left join specialties j on j.id = e.specialtyId;