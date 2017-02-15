drop table board;

create table  if not exists board(num int primary key auto_increment, pass varchar(30), name varchar(30), 
email varchar(30), title varchar(50), content varchar(1000), readcount int ,writedate date);

insert into board values(0,"1234","이길선","pjjwjwth@naver.com","워프레에에임","같이할래?",0,now());

insert into board values(0,"1234","전현준","ddoddoria@naver.com","아니안해","응 안해",0,now());

insert into board values(0,"1234","응응잉잉","doia@naver.com","난해","오키 들어오셈",0,now());

insert into board values(0,"1234","샤랄랄라","adsada@naver.com","다른거하자","워크어떰?",0,now());

insert into board values(0,"1234","크라라락","zmfkfda@naver.com","내가 5등","아니 1등인가?",0,now());

select * from board;

