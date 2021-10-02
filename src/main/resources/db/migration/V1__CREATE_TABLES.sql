create table hibernate_sequence (
    next_val bigint
) engine=MyISAM;

insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );

CREATE TABLE user (
    id BIGINT NOT NULL AUTO_INCREMENT,
    password varchar(64) not null,
    username varchar(64) not null unique,
    PRIMARY KEY (id)
) engine=MyISAM;

CREATE TABLE todo (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title varchar(64) not null,
    completed BOOLEAN NOT NULL,
    PRIMARY KEY (id)
) engine=MyISAM;

CREATE TABLE address (
    id BIGINT NOT NULL AUTO_INCREMENT,
    city varchar(64) not null,
    street varchar(255) not null,
    building varchar(255) not null,
    PRIMARY KEY (id)
) engine=MyISAM;

CREATE TABLE company (
    id BIGINT NOT NULL AUTO_INCREMENT,
    fullname varchar(255) not null,
    inn varchar(255) not null,
    ogrn varchar(255) not null,
    PRIMARY KEY (id)
) engine=MyISAM;

INSERT INTO address VALUES ( 1 ,'Томск','Новосибирская',37 );
INSERT INTO address VALUES ( 2 ,'Томск','Кирова',51 );
INSERT INTO address VALUES ( 3 ,'Новосибирск','Ленина',20 );
INSERT INTO address VALUES ( 4 ,'Новосибирск','Красный',2 );
INSERT INTO address VALUES ( 5 ,'Новосибирск','Дуси Ковальчук',2 );
INSERT INTO address VALUES ( 6 ,'Екатеринбург','Октябрьская',1 );
INSERT INTO address VALUES ( 7 ,'Екатеринбург','Октябрьская',10 );
INSERT INTO address VALUES ( 8 ,'Екатеринбург','Октябрьская',12 );
INSERT INTO address VALUES ( 9 ,'Екатеринбург','Ленина',23 );
INSERT INTO address VALUES ( 10 ,'Екатеринбург','Ленина',25 );

