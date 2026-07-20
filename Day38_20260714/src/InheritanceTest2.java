
class 동물{
	String 이름;
	int 나이;
	String 품종;
}
//강아지는 동물이다!
class 강아지 extends 동물{
	
	// 예방접종 여부!
	String 예방접종날짜;
}
class 도마뱀 extends 동물{
	
	double 온도;
	double 습도;
	
}
class 고양이 extends 동물{
	//스크래쳐사용여부
	boolean 스크래쳐사용여부;
}
class 토끼 extends 동물{
	int 당근섭취량;
}

/*
 * 동물병원 
 *   강아지
 *   고양이
 *   도마뱀
 *   토끼
 * 
 *   공통적으로 이름,나이,품종 기본 클래스!
 *   각각의 동물들한테 물려줘서 각각의  객체를 만들었을때 이름,나이,품종
 *   사용할수있는 변수를 출력!
 * 
 *   강아지 → 이름: 초코, 나이: 3살, 품종: 말티즈
	 고양이 → 이름: 나비, 나이: 2살, 품종: 페르시안
     도마뱀 → 이름: 레오, 나이: 1살, 품종: 레오파드게코
     토끼 → 이름: 토순이, 나이: 2살, 품종: 앙고라
     
     상속을 받으면 그 객체들의 특징을 추가할 수 있다.
     클래스 다이어그램 
      - 프로그램에서 사용하는 클래스가 엄청 많아요
         어떤 클래스가 있고, 각각 클래스에 어떤 변수가 들어있는지
         그림으로 표현한 것!
 */

class 부모님{
	String 재산 = "10억";
	String 집 = "60평";
}

class 자식 extends 부모님{
	// 물려받은 재산은 집과 돈 
	// 슈퍼카 한대구매
	String 슈퍼카 = "람보르기니";
}


public class InheritanceTest2 {

	public static void main(String[] args) {
	
	}
}

// 안무팀 직원들의 정보를 저장하는 타입 
// 안무팀은 아이돌이다? 아니다!

/*   
 * 
 *    //  아이돌의 정보를 저장하는 프로그램 
class 아이돌{
	// 아이돌들의 공통되는 정보를 하나로 묶는다
	String 이름;
	String 포지션;
	String 팀이름;
}

// 소녀시대는 아이돌이다!
class 소녀시대 extends 아이돌{
	
}
// 슈퍼주니어도 아이돌이다!
class 슈퍼주니어 extends 아이돌{
	
}
//NCT도 아이돌이다!
class NCT extends 아이돌{
	
}
public class InheritanceTest2 {

	public static void main(String[] args) {
	
	}
}

 
 new 소녀시대();
 new 슈퍼주니어();

// 소녀시대의 정보를 저장하기때문에 하나 묶는다.
class 소녀시대{
	String 이름;
	String 포지션;
	String 팀이름;
}
// 슈퍼주니어의 정보를 저장하기 위한 타입 필요하다
class 슈퍼주니어{
	String 이름;
	String 포지션;
	String 팀이름;
}

// 세븐틴 13명 정보를 저장하는 타입 
class 세븐틴{
	String 이름;
	String 포지션;
	String 팀이름;
}

// NCT 그룹 26명 정보를 저장하는 타입
class NCT{
	String 이름;
	String 포지션;
	String 팀이름;
}
*/