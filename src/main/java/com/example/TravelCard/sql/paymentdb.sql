-- 1 March 2019 By Rohit Saraf
create table country (id int(11) PRIMARY KEY AUTO_INCREMENT, code varchar(10), name varchar(50), calling_code varchar(20), reverse_calling_code varchar(20), flag_url varchar(20), operation_enabled tinyint(1) not null default 0);

create table user_address_detail(id BIGINT(19) PRIMARY KEY AUTO_INCREMENT, line1 varchar(200), line2 varchar(200), state varchar(40), country_id int(11), pinode varchar(30), FOREIGN KEY (country_id) REFERENCES country(id));

	create table traveller (id BIGINT(19) PRIMARY KEY AUTO_INCREMENT, firstName varchar(30), lastName varchar(30), name varchar(30), cretaed datetime, updated datetime, enable tinyint(1), `status` varchar(20));

		create table payment_card_info(id BIGINT(19) PRIMARY KEY AUTO_INCREMENT, cardNumber varchar(20), displayName varchar(25), validThorugh varchar(12), card_issued_by varchar(30), card_issuing_bank varchar(30), enable tinyint(1), created datetime, updated datetime);

			