# 파일: mysql사용자계정생성하기

# 1. 계정 생성 
#  최고 관리자인 root만 가능하다! 리눅스에서 똑같다!(Admin)
#  아이디: student
#  비밀번호: 1234

# create user 키워드 사용자 계정만드는 예약어!
#   내 컴퓨터 안에 있는 mysql에 접속할 수있는 계정이다~!
# 이 사용자가 어디서 접속해 오는것을 허용! (외부에서 외부 인터넷을 통해서 디비에
#                              접속한다)

# 특정 IP에서만 접속하게 만들겠다 
# 'student@192.168.0.100'
# 모든 ip다 접속할 수있게 만들면 안되요?
# 'student@%'  -> 여러 위치에서 접속 가능! 

# @ : 아이디와 접속위치를 구분하는 구분자로쓰인다.
# identified 비밀번호 이것으로 설정해! 의미!

#             아이디  접속할 수있는 위치(호스트)
#               ↓      ↓
create user 'student'@'localhost'
identified by '1234';

# 특정 ip에서만 접속할 수있도록 사용자 계정을 만들겠다.
create user 'eryna'@'192.168.82.100'
identified by 'eryna11!';


# 사용자 계정 목록 
select 
	user,host
from 
	mysql.user;

# -------------------------------------------------
# mysql 사용자를 만들고 권한을 주지 않으면 아무것도 못한다.
# 접속만 한다.

# 사용자 권한 부여해야된다!
# grant 권한 on 데이터베이스.테이블 to '아이디'@'접속위치';  

# 조회만 가능
#  연세디비에 모든 테이블에서 조회만 가능하다!
grant select 
on yonsai_db.*
to 'student'@'localhost';

# 추가적으로 insert, update 권을 주고싶다.
grant select,insert,update 
on yonsai_db.*
to 'student'@'localhost';

# root처럼 모든 데이터베이스에서 조회는 가능하게 권한을 주고싶다.
# 데이터베이스 모든 저장소와 그 안에 있는 모든 테이블에 접근 하겠다!
grant select 
on *.*
to 'student'@'localhost';

# 권한 확인 
# 'GRANT USAGE ON *.* TO `student`@`localhost`'
#   - 계정은 있지만 DB를 작업할 권한 따로 없다!

show grants for 'student'@'localhost';

# it에서 사용자 권한을 주거나 설치를 하거나 할 때는 
# 무조건 재실행!(reload)
# 명령프롬프트 열어놓고 프로그램 설치를 하면 경로가 안 잡힌다!
# 무조건 명령프롬프트는 끄고 설치를 해야된다
# 항상 컴퓨터를 껐다가 켠다.

# 실습 
#  본인이름으로 만드신 계정
# 권한 select , update 권한 주기 shop_db.*
# eryna 계정으로 접속후 확인  캡처보내기

# -1) users테이블 전체 조회
# -2) products 테이블 전체 조회
# -3) products 테이블에 insert into  명령어가 거부되는지 확인!
# -4) products 테이블 안에 내용만 전체 삭제 확인

# 계정 삭제
drop user 'student'@'localhost';
drop user 'eryna'@'192.168.82.100';

# 삭제를 할 때는 무조건 아이디와 접속하는위치 꼭 같이 적어야된다
# 서로 다른 계정으로 취급!

