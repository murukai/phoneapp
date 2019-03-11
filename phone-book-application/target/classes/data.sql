-- Phone book management

delete from  entries;
delete from  phonebooks;

INSERT INTO phonebooks (created, description, name) 
VALUES 
('2019-02-15', 'Social Records', 'Social'),
('2019-02-15', 'Work Records', 'Work'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook'),
('2019-02-15', 'Facebook Records', 'Facebook');

-- Phone book entry management

INSERT INTO entries (created, phone_number, book_id, name) 
VALUES 
('2019-02-15', '0773635332', 1, 'Tatenda Gumbo-Mberi'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0736073821', 1, 'Delphine Chananda'),
('2019-02-15', '0775375644', 2, 'Portia Tsokota'),
('2019-02-15', '0748841383', 3,'Murukai Gumbo-Mberi');

-- USER MANAGEMENT

delete from  user_role;
delete from  roles;
delete from  users;
INSERT INTO roles (id, role) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');
INSERT INTO users (id, username, password, name, surname, gender, date_of_birth, active) VALUES
(1, 'admin@gmail.com', '$2a$10$hKDVYxLefVHV/vtuPhWD3OigtRyOykRLDdUAp80Z1crSoS1lFqaFS',
'Murukai', 'Mberi', 'male','1984-11-08', 1),
(2, 'siva@gmail.com', '$2a$10$UFEPYW7Rx1qZqdHajzOnB.VBR3rvm7OI7uSix4RadfQiNhkZOi2fi',
'Portia', 'Tsokota', 'female','1990-06-26', 1),
(3, 'user@gmail.com', '$2a$10$ByIUiNaRfBKSV6urZoBBxe4UbJ/sS6u1ZaPORHF9AtNWAuVPVz1by',
'DemoUser', 'DemoUser','female', '2019-02-19', 1);
insert into user_role(user_id, role_id) values
(1,1),
(1,2),
(3,2);