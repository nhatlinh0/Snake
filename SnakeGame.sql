create database SnakeGame
go
use SnakeGame
go

create table PlayerAccounts
(PlayerID int primary key,
Username varchar(30),
Password varchar(20),
)

create table GameMode 
(ModeID int primary key,
ModeName varchar(30),
)

create table GameHistory 
(GameID int primary key,
PlayerID int references PlayerAccounts(PlayerID),
Score int,
ModeID int references GameMode(ModeID),
)

create table Rewards(
RewardID int primary key,
PlayerID int references PlayerAccounts(PlayerID),
RewardDescription nvarchar(50)
)

insert into PlayerAccounts values(1,'linh','123')
insert into PlayerAccounts values(2,'quang','123')
select * from PlayerAccounts

insert into GameMode values(1,'Default')
select * from GameMode

insert into GameHistory values(1,1,100,1)
insert into GameHistory values(2,2,120,1)
select * from GameHistory

insert into Rewards values(1,1,'Skin Hoa Linh')
insert into Rewards values(2,1, N'Skin Cao Bồi')
select * from Rewards
