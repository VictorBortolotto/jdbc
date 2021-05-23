create table users(
	
	user_id int auto_increment,
	name varchar(50) not null,
    email varchar(100),
    primary key(user_id)

);

insert into users (name, email) values ('João Paulo', 'joao_paulo@gmail.com');
insert into users (name, email) values ('Karina Alvez Borba', 'kaalvezborba@gmail.com');
insert into users (name, email) values ('Thaise de Paula', 'thaise@gmail.com');
insert into users (name, email) values ('Rennan Oliveira dos Santos', 'rennan_oliveira@gmail.com');
insert into users (name, email) values ('Tyler Hendricson', 'tylerhen@gmail.com');
insert into users (name, email) values ('John Marks', 'johnnmark@gmail.com');
insert into users (name, email) values ('Kathrine Waters', 'kath@gmail.com');
insert into users (name, email) values ('Gabriel Henkins', 'gabhenkins@gmail.com');