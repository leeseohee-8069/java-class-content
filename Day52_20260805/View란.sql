#파일명: View란
# 디비선택
use shop_db;

# view 
#  - 자주 사용하는 select 결과를 이름 붙여서 저장해 놓은 가상 테이블!

# 주문내역 조회 화면
#  - 회원명,결제금액 같이 보여주는 기본목록 
# 한명이면 코드를 써도 괜찮다!
#  여러명이 각각 자신의 주문내역 조회한다. 
#  join을 계속 해야된다.(코드도 길어지고 중복되고 불편하다)
# create view 가상테이블이름
# as 실행하는 sql을 작성한다. 
# 한번만 만들면 된다. 

create view order_payment_view
as
select
    o.id as order_id,
    u.nickname,
    p.amount
from orders o
join users u on o.user_id = u.id
join payments p on o.id = p.order_id;

#-----------------------------------------------
# 조회 
# 쇼핑몰 콜센터 직원!
#  - 전산 - 전화번호, 전화번호를 이용해서 고객을 판단 
#          주문내역 항상 화면에 같이 보여야된다. 
select 
	*
from 
	order_payment_view;
    
# 매출/ 회원 대시보드 
#  - 회원별 총 결제금액 같이 화면에 띄워야된다.
#    쿠폰 10% 할인 가능하다!
create view user_total_paid_view 
as
select
    u.id as user_id,
    u.nickname,
    sum(p.amount) as total_paid
from users u
join orders o on u.id = o.user_id
join payments p on o.id = p.order_id
group by u.id;

# 매번 테이블을 합치면 합쳐지는 시간이 있다.
# 합칠때 조건도 계산을 한다. (컴퓨터는) 그러기 때문에 성능저하의 요인이 된다.
# 자주 반복적으로 사용해야되는 가상테이블만든다.
select *
from user_total_paid_view ;

#---------------------------------------------------------------
# view를 만드는 이유 중 하나가 바로 보안 이슈!
use yonsai_db;

select * from persons;

# 마켓팅 팀이 전달용!
# 비밀번호나 연봉! 월급! 주민번호! 
# 직원들이 전부 조회를 해서 보면 민감한 정보들이 유출된다.
# 그래서 view를 만든다. 
#  이 데이터가 필요한 화면(기능)단위로 미리 조회(select)를 해서
#  쿼리를 만들둔다. 실무에서는 화면/기능 단위로 하나하나에 view를 
#  만들어서 준다. 

create view users_public_view as
select
	person_id,
    name
from 
	persons;
    
select *
from     
   users_public_view; 
   
/*
관리자 주문관리 
 - 테이블 : 주문자,주문상품,결제금액,배송상태
SNS 피드 목록
 - 테이블 : 작성자 , 게시글,좋아요수,댓글수
 
병원진료내역
 - 테이블 : 환자,담당의사,진료일,진료내용

*/
    



