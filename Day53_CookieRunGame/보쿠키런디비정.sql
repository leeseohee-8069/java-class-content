create database cookierungame;
use cookierungame;

create table users(
	user_id   	  int  primary key auto_increment,
	kingdomName   varchar(50) not null unique,
    user_level    int  default 1,
    gam_count     int  default 0,
    coin          int  default 0,
    main_character  varchar(50)  default "용감한쿠키"
);

desc users;

select * from users;

