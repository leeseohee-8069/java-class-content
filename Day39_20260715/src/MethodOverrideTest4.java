import java.util.ArrayList;

class 포켓몬 {
	String 이름;

	void 공격하기() {
		System.out.println("공격하기");
	}
}

class 피카츄 extends 포켓몬 {

	// 재조정
	void 공격하기() {
		System.out.println("백만볼트 공격하기");
	}
}

class 파이리 extends 포켓몬 {

	void 공격하기() {
		System.out.println("불대포 공격하기");
	}
}

class 꼬부기 extends 포켓몬 {
	void 공격하기() {
		System.out.println("물대포 공격하기");
	}
}

// 포켓몬 게임을 하는데 유저
// 한명의 유저가 여러명의 포켓몬들을 가질 수있다.
// 100개

// 유저도 100명 유저마다 각각의 포켓몬들을 어떤걸 선택할지 모른다.
class 유저{
	
	// 포켓몬을 저장하는 가방!
	// 클래스들의 공통되는 부모타입의 클래스로!
	// 포켓몬 타입을 상속받은 모든 포켓몬들이 가방에 들어올수있다.
	ArrayList<포켓몬> 가방 = new ArrayList<>();
}

// 정산시스템만들때 많이 사용하는 기법!
class 결제{
	int 잔액;
	
	void 결제하기(int 금액) {
		System.out.println("결제진행");
	}
}
// 카카오페이 결제는 결제다!
class 카카오페이결제 extends 결제{
	void 결제하기(int 금액) {
		System.out.println("카카오결제");
	}
}
class 네이버페이 extends 결제{
	void 결제하기(int 금액) {
		System.out.println("네이버페이");
	}
}
class  카드결제 extends 결제{
	void 결제하기(int 금액) {
		System.out.println("일반카드결제");
	}
}
// 결제도 다양하기 때문에 어떤 고객이 어떤 결제를 할 지 모른다.
// 아래 처럼 변수를 일일하나씩 다 만든다?
// 그래서 공통되는 결제 타입이 있으니깐 그 타입대로!
// 저장하겠다.
//ArrayList<카드결제> 카드결제내역;
//ArrayList<네이버페이> 네이버페이결제내역;
//ArrayList<카카오페이결제> 카카오페이결제내역;
//

// 내가 결제한 내역을 저장해야된다. 
// 어떤 결제든 내 결제 내역에 저장된다. 근데 어떤결제할껀데?
// 알아야 변수를 만들어서 저장을 하죠!

// 동물병원
class 동물{
	String 이름;
	
	// 변수만 있으면 동물이 가만히 있는다.
	// 나비야! 일로와!
	void 이동() {}
}

class 강아지 extends 동물 {
	
}
class 고양이 extends 동물{ 
	
}
class 토끼 extends 동물{
	
}

// 동물병원이 하나 생긴다.
// 현재 동물병원은 강아지만 진료할 수있다!
// 여러명의 동물을 진료할 수있어야된다. 근데 어떤 동물이 
// 올지 예상이 안된다 
class 동물병원{
	
	// 진료를 받으러오는 동물들의 대기표
	// 토끼도 대기표등록 가능, 강아지와도 대기표등록 가능!
	ArrayList<동물> 대기표;
	
}


public class MethodOverrideTest4 {

	public static void main(String[] args) {
			
		// 공통되는 타입으로 받으면 모든 결제 정보를 다
		// 저장할 수있다. 
		ArrayList<결제> 결제내역 = new ArrayList<>();
		
		
		// 실제 유저
		유저 첫번째 = new 유저();
		
		첫번째.가방.add(new 꼬부기());
		첫번째.가방.add(new 파이리());
		첫번째.가방.add(new 피카츄());
		
		첫번째.가방.get(0).공격하기();
		첫번째.가방.get(1).공격하기();
		첫번째.가방.get(2).공격하기();
		
		
		
		// 랜덤으로 포켓몬을 뽑는다.
		// 피카츄가 나올지? 파이리가 나올지? 꼬부기나올지?
		// 모른다.?
		// 그래서 각각의 자식 타입으로 만들면 배열의 수가 
		// 포켓몬의 종류대로 늘어나서 불필요한 변수들이 생긴다.
		
		
		
	}
}
