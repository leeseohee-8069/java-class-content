use yonsai_db;


select * from persons;

#내용만 전부 삭제!
delete from persons;

#테이블 자체 삭제!
drop table persons;

create table persons(
	person_id  int  primary key auto_increment,
    name  	   varchar(50), 
    email      varchar(100) not null unique,  # 중복하면 안되고 값이 비어있으면 안되!
	phone      varchar(100) not null unique,  
    password   varchar(50) not null unique,
    #실무에서 사용하는 내용들!
    # 회원가입하는 현재 날짜와 시간을 자동으로 저장해라!
    create_at  datetime default current_timestamp
    
    # 회원의 정보를 수정한 날짜와 시간을 저장해라!
    # update_at  datetime default current_timestamp
    # 회원정보 수정
    # 게시글 수정
    # 댓글 수정
    # 주문 상태 변경 
    # 중고거래 게시글, 공지사항, 비밀번호 변경관리 !
);

select * from persons;

# persons 테이블 더미데이터 30개 추가!
insert into persons(name, email, phone, password)
values
('김민준', 'minjun01@test.com', '010-1000-0001', 'pw0001'),
('이서연', 'seoyeon02@test.com', '010-1000-0002', 'pw0002'),
('박지훈', 'jihoon03@test.com', '010-1000-0003', 'pw0003'),
('최지우', 'jiwoo04@test.com', '010-1000-0004', 'pw0004'),
('정현우', 'hyunwoo05@test.com', '010-1000-0005', 'pw0005'),
('강수빈', 'subin06@test.com', '010-1000-0006', 'pw0006'),
('조민재', 'minjae07@test.com', '010-1000-0007', 'pw0007'),
('윤하은', 'haeun08@test.com', '010-1000-0008', 'pw0008'),
('장도윤', 'doyoon09@test.com', '010-1000-0009', 'pw0009'),
('임예린', 'yerin10@test.com', '010-1000-0010', 'pw0010'),

('한지호', 'jiho11@test.com', '010-1000-0011', 'pw0011'),
('오서윤', 'seoyoon12@test.com', '010-1000-0012', 'pw0012'),
('서준영', 'junyoung13@test.com', '010-1000-0013', 'pw0013'),
('신채원', 'chaewon14@test.com', '010-1000-0014', 'pw0014'),
('권민석', 'minseok15@test.com', '010-1000-0015', 'pw0015'),
('황유진', 'yujin16@test.com', '010-1000-0016', 'pw0016'),
('안재현', 'jaehyun17@test.com', '010-1000-0017', 'pw0017'),
('송다은', 'daeun18@test.com', '010-1000-0018', 'pw0018'),
('전승현', 'seunghyun19@test.com', '010-1000-0019', 'pw0019'),
('홍나연', 'nayeon20@test.com', '010-1000-0020', 'pw0020'),

('유준호', 'junho21@test.com', '010-1000-0021', 'pw0021'),
('고은지', 'eunji22@test.com', '010-1000-0022', 'pw0022'),
('문태현', 'taehyun23@test.com', '010-1000-0023', 'pw0023'),
('양소희', 'sohee24@test.com', '010-1000-0024', 'pw0024'),
('손우진', 'woojin25@test.com', '010-1000-0025', 'pw0025'),
('배지민', 'jimin26@test.com', '010-1000-0026', 'pw0026'),
('백시우', 'siwoo27@test.com', '010-1000-0027', 'pw0027'),
('허가은', 'gaeun28@test.com', '010-1000-0028', 'pw0028'),
('남성민', 'sungmin29@test.com', '010-1000-0029', 'pw0029'),
('노아린', 'arin30@test.com', '010-1000-0030', 'pw0030');






