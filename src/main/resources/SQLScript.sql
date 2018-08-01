create table FOODS
(
	id int auto_increment
		primary key,
	name varchar(250) null,
	price decimal(6,2) null,
	oldPrice decimal(6,2) null,
	description varchar(2000) null,
	sellCount int null,
	rating int null,
	info varchar(2000) null,
	icon varchar(500) null,
	image varchar(500) null,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null,
	goodsId int not null,
	constraint FOODS_name_uindex
		unique (name)
)
;

create table GOODS
(
	id int auto_increment
		primary key,
	name varchar(500) not null,
	type int null,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null,
	sellerId int null
)
;

create table RATINGS
(
	id int auto_increment
		primary key,
	username varchar(250) null,
	rateTime datetime null,
	rateType int null,
	text varchar(2000) null,
	avatar varchar(500) null,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null,
	categoryId int null,
	categoryType int default '0' null
)
;

create table SELLER
(
	id int auto_increment
		primary key,
	name varchar(500) not null,
	description varchar(2000) null,
	deliveryTime double null,
	score decimal(3,2) null,
	serviceScore decimal(3,2) null,
	foodScore decimal(3,2) null,
	rankRate double null,
	minPrice double null,
	deliveryPrice double null,
	ratingCount int null,
	sellCount int null,
	bulletin varchar(4000) null,
	icon varchar(500) null,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null,
	averagePrice double null
)
;

create table `order`
(
	orderId varchar(36) not null
		primary key,
	userId int null,
	sellerName varchar(250) null,
	icon varchar(255) null,
	status int default '0' null,
	createDate datetime default CURRENT_TIMESTAMP null,
	updateDate datetime default CURRENT_TIMESTAMP null
)
;

create table order_goods
(
	orderId varchar(50) default '' null,
	goodName varchar(255) null,
	goodCount int null,
	price double null,
	createDate datetime default CURRENT_TIMESTAMP null,
	updateDate datetime default CURRENT_TIMESTAMP null
)
;

create table seller_infos
(
	id int auto_increment
		primary key,
	sellerId int null,
	info varchar(500) null,
	updateTime datetime default CURRENT_TIMESTAMP null,
	createTime datetime default CURRENT_TIMESTAMP null
)
;

create table seller_pics
(
	sellerId int null,
	image varchar(500) null,
	id int auto_increment
		primary key,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null
)
;

create index seller_pics_sellerId_index
	on seller_pics (sellerId)
;

create table seller_support
(
	sellerId int not null,
	supportType int default '0' not null,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null
)
;

create table supports
(
	description varchar(500) null,
	type int not null
		primary key,
	createTime datetime default CURRENT_TIMESTAMP null,
	updateTime datetime default CURRENT_TIMESTAMP null,
	constraint seller_supports_type_uindex
		unique (type)
)
;

create table user
(
	userId int auto_increment
		primary key,
	userName varchar(255) null,
	password varchar(255) null,
	phoneNum varchar(50) null,
	nickName varchar(100) null,
	createDate datetime default CURRENT_TIMESTAMP null,
	updateDate datetime default CURRENT_TIMESTAMP null
)
;

