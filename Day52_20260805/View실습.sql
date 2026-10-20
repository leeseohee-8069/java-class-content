#파일명 :View실습
use kh_db;

# 인사팀 화면에서 사원 이름과 소속 부서명을 매번 같이 보여줘야된다.
# 재직 확인 전화!
create view emplyee_dept_view as 
select
    e.emp_id,
    e.emp_name,
    d.dept_title
from employee e
join department d on e.dept_code = d.dept_id;

# 조회를 할 때는 그냥 select 전부 조회하면 된다.
select
	*
from 
	emplyee_dept_view;
    
# 급여관리 화면에서 사원명,직급명,급여를 같이 봐야된다.
# 테이블: employee , job 

create view employee_salary_view as
select
    e.emp_id,
    e.emp_name,
    j.job_name,
    e.salary
from employee e
join job j on e.job_code = j.job_code;


select * from employee_salary_view;

# 인사팀 사원 명단을 타 부서에 공유해야하는 상황!
# 급여랑 ,주민번호랑 , 핸드폰번호는 절때 공유가 되면 안된다.
# 민감한 개인 정보기 때문에 타부서에 주면 안된다!
# view 테이블 생성

# 각각의 테이블에 접근할 수있는 권한들!
# 계정을 나누지 않고 그냥 root로만 쓰면  DB전체에 모든 내용이 다 
# 유출될 수있다. 
# - 누가 언제 무슨 작업을 했는지 추적 불가!

# root -select
# root - drop 

#그럼 각각의 계정들을 만들어서 권한을 주자!
# 너는 create 할수없어!
# 너는 select 할 수있어!
# 너는 drop , delete !
# 프리랜서 3개월 root 절떄 안된다! 

