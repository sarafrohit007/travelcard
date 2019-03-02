-- 1 March 2019 By Rohit Saraf
create table country (id int(11) PRIMARY KEY AUTO_INCREMENT, code varchar(10), name varchar(50), calling_code varchar(20), reverse_calling_code varchar(20), flag_url varchar(20), operation_enabled tinyint(1) not null default 0);

	