Drop table if exists User;

Create Table User(
	UserID BigInt  not null AUTO_INCREMENT,
	FName varchar(100) not null,
	LName varchar(100) not null,
	phone_number  varchar(100) not null,
	EmailID  varchar(100) not null,
	
	primary key (UserID)
	
);