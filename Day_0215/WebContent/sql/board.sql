drop table board;

create table  if not exists board(num int primary key auto_increment, pass varchar(30), name varchar(30), 
email varchar(30), title varchar(50), content varchar(1000), readcount int ,writedate date);

insert into board values(0,"1234","�̱漱","pjjwjwth@naver.com","������������","�����ҷ�?",0,now());

insert into board values(0,"1234","������","ddoddoria@naver.com","�ƴϾ���","�� ����",0,now());

insert into board values(0,"1234","��������","doia@naver.com","����","��Ű ������",0,now());

insert into board values(0,"1234","��������","adsada@naver.com","�ٸ�������","��ũ�?",0,now());

insert into board values(0,"1234","ũ����","zmfkfda@naver.com","���� 5��","�ƴ� 1���ΰ�?",0,now());

select * from board;

