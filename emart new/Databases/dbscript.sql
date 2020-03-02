drop database emartdb;

create database emartdb;

use emartdb;

create table Buyer(
	bid int unsigned,
	bName varchar(20) NOT NULL,
	bPswd varchar(20) NOT NULL,
	bEmail varchar(20) NOT NULL,
	bPhNo varchar(20) NOT NULL,
	constraint Buyer_bid_pk primary key(bid)
);

create table Seller(
	sid int unsigned,
	sName varchar(20) NOT NULL,
	sPswd varchar(20) NOT NULL,
	sEmail varchar(20) NOT NULL,
	sPhNo varchar(20) NOT NULL,
	compName varchar(20) NOT NULL,
	postalAdd varchar(20) NOT NULL,
	website URL NOT NULL,
	disId int unsigned,
	constraint Seller_sid_pk primary key(sid),
	constraint Seller_disId_fk foreign key(disId) references Discount(disId)
);

create table Category(
	catId int unsigned,
	catName varchar(20) NOT NULL,
	GST double NOT NULL,
	constraint Category_catId_pk primary key(catId)
);

create table SubCategory(
	subId int unsigned,
	subName varchar(20) NOT NULL,
	catId int unsigned,
	constraint Sub_subId_pk primary key(subId),
	constraint Sub_catId_fk foreign key(catId) references Category(catId)
);

create table Items(
	itemId int unsigned,
	itemPrice double NOT NULL,
	itemName varchar(20) NOT NULL,
	itemDesc varchar(100) NOT NULL,
	sId int unsigned,
	subId int unsigned,
	stock_update_date LocalDate NOT NULL,
	itemStock int,
	constraint Items_itemId_pk primary key(itemId),
	constraint Items_sId_fk foreign key(sId) references Seller(sId),
	constraint Items_subId_fk foreign key(subId) references SubCategory(subId)
);

create table Orders(
	orderId int unsigned,
	bId int unsigned,
	billId int unsigned,
	orderStatus varchar(20) NOT NULL,
	grossTotal double NOT NULL,
	constraint Orders_orderId_pk primary key(orderId),
	constraint Orders_bId_fk foreign key(bId) references Buyer(bId),
	constraint Orders_billId_fk foreign key(billId) references Bill(billId)
);

create table Bill(
	billId int unsigned,
	disId int unsigned,
	itemId int unsigned,
	itemPrice double NOT NULL,
	billAmount double NOT NULL,
	billStock int NOT NULL,
	GST double NOT NULL,
	constraint Bill_billId_pk primary key(billId),
	constraint Bill_itemId_fk foreign key(itemId) references Items(itemId)
	constraint Bill_disId_fk foreign key(disId) references Discount(disId)
);

create table Discount(
	disId int unsigned,
	discount double NOT NULL,
	startDate LocalDate NOT NULL,
	endDate LocalDate NOT NULL,
);


