
create database kakaotalk;
use kakaotalk;

create table profile_list(
	
	user_id  int  auto_increment  primary key,
	name  varchar(50),
	profile_image  varchar(300),
    status_msg   varchar(100),
    phone    varchar(50)  unique not null,
    email   varchar(100) unique not null
);

# 전체 조회!
select * from profile_list;

# 데이터 추가!
INSERT INTO profile_list
(name, profile_image, status_msg, phone, email)
VALUES
('이서희', 'profile1.jpg', '우리딸 그림♡♡♡', '010-1111-1111', 'seohee@test.com'),
('김철수', 'profile2.jpg', '점심 먹는 중', '010-2222-2222', 'kim@test.com'),
('박영희', 'profile3.jpg', '여행 중 ✈', '010-3333-3333', 'park@test.com'),
('홍길동', 'profile4.jpg', '공부 중 📚', '010-4444-4444', 'hong@test.com'),
('최민수', 'profile5.jpg', '오늘도 화이팅!', '010-5555-5555', 'choi@test.com');

#채팅 기록을 저장하는 표를 만들겠다!

create table chat_message(
	chat_id  int  auto_increment primary key,
    
    # 누구랑 대화했는지 알아야된다
    # 기존 대화를 가져올 때 (보낸사람이름)
    senderName varchar(50) not null,
    message varchar(500) not null,
    sentAt  datetime  default current_timestamp
);

# 어떤 채팅방에서 대화를 한건지?
# 실무에서는 여러개의 채팅방을 가지고 있다. 
-- create table chat_room(
-- 	room_id  int auto_increment primary key,
--     room_name varchar(50) 
-- );

-- create table chat_message(
-- 	chat_id  int  auto_increment primary key,
--     
--     #방의 정보를 저장해야된다. 
--     room_id int,  # 외래키로 연결(테이블연결)
--     # 채팅방에 들어온 유저들의 정보
--     user_id int , # 외래키로 연결(테이블연결)
--     
--     sender_id int not null,
--     # 누구랑 대화했는지 알아야된다
--     # 기존 대화를 가져올 때 (보낸사람이름)
--     #senderName varchar(50) not null, 
--     message varchar(500) not null,
--     sentAt  datetime  default current_timestamp
-- );


# 실제 카카오톡은 하나의 테이블에 다 저장하지 않는다
# 테이블 쪼개서 연결하는 방식!
# 여러 서버 샤딩(분산저장)
# 실시간이 중요하기 때문에 Mysql 외에 레디스(캐시)
# 오래된 대화는 별도 저장소(콜드 스토리지)로 옮기는 작업!
# Kafka(메시지큐) - 대용량 


select * from chat_message;

INSERT INTO chat_message(senderName, message) VALUES
('남편', '일 끝났어?'),
('이서희', '아직 강의 중이야!'),
('남편', '몇 시쯤 끝나?'),
('이서희', '6시쯤 끝날 것 같아.'),
('남편', '저녁 뭐 먹을까?'),
('이서희', '삼겹살 어때?'),
('남편', '좋지!'),
('이서희', '그럼 내가 가는 길에 장 볼게.'),

('어머님', '오늘 집에 올 거니?'),
('이서희', '네! 저녁 먹으러 갈게요.'),
('어머님', '조심해서 와~'),
('이서희', '네 어머님^^'),

('아버님', '차는 잘 타고 다니니?'),
('이서희', '네! 문제없이 잘 타고 있어요.'),
('아버님', '안전운전해라.'),
('이서희', '네~ 감사합니다.'),

('남편', '커피 마셨어?'),
('이서희', '아직 못 마셨어.'),
('남편', '내가 사갈게.'),
('이서희', '오~ 감사합니다 ☕'),

('어머님', '손주 사진 보내줘.'),
('이서희', '조금 있다가 보내드릴게요.'),
('어머님', '천천히 보내렴.'),
('이서희', '네 😊'),

('남편', '오늘 회의 길었어?'),
('이서희', '엄청 길었어.'),
('남편', '고생 많았네.'),
('이서희', '고마워~'),

('아버님', '주말에 시간 있니?'),
('이서희', '네! 토요일 괜찮아요.'),
('아버님', '그럼 같이 점심 먹자.'),
('이서희', '좋아요!'),

('남편', '마트 들를까?'),
('이서희', '우유랑 계란 사 와줘.'),
('남편', '알겠어.'),
('이서희', '감사합니다 😊'),

('어머님', '비 온다 우산 챙겨라.'),
('이서희', '네! 챙겼어요.'),

('남편', '집 도착했어.'),
('이서희', '나도 곧 도착해.'),

('아버님', '감기 조심해라.'),
('이서희', '네! 따뜻하게 입을게요.'),

('남편', '영화 볼래?'),
('이서희', '좋아!'),

('어머님', '맛있는 거 먹었니?'),
('이서희', '네! 맛있게 먹었어요.'),

('남편', '내일 일찍 출근해?'),
('이서희', '응, 8시까지 가야 해.'),

('아버님', '운전할 때 졸리면 쉬어라.'),
('이서희', '네! 안전운전할게요.');

select * from chat_message;

# 남편과의 대화만 조회!

select * from chat_message
where senderName = '남편';


