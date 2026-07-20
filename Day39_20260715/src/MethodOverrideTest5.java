
// 클래스들의 공통되는 변수들과 함수들을 묶는다.
class 부모{
	int 나이;
	
	// 자고,먹고,즐긴다(여행)
	void 먹는다() {
		System.out.println("먹는다.");
	}
}

class 자식 extends 부모{
	// 실제 코드는 아무것도 없어보이지만
	// 자바가 실행을 하면 부모님의 변수 및 함수를 
	// 그대로 복사해온다. new 자식()
//	int 나이;
//	
//	// 자고,먹고,즐긴다(여행)
	void 먹는다() {
		System.out.println("자식이 먹는다.");
	}
	
}

// 프렌차이즈 식당
class 프랜차이즈본사{
	void 매장운영방법() {
		System.out.println("본사 오전9시부터 오후9시까지 메뉴얼대로 운영합니다.");
	}
}

// 서울지점은 본사 운영방식을 그대로 사용한다.
class 서울강남점 extends 프랜차이즈본사{
	// 본사 메뉴얼 그대로 사용할꺼면 오버라이딩 안해도된다.
}

// 제주공함점 운영방식이 24시간 운영한다.
class 제주공함점 extends 프랜차이즈본사{
	// 본사 메뉴얼 그대로 사용할꺼면 오버라이딩 안해도된다.
	@Override
	void 매장운영방법() {
		System.out.println("공항특성상 24시간 메뉴얼대로 운영합니다.");
	}	
}

class 앱설정{
	// 알림 소리
	
	void 알림소리() {
		System.out.println("기본 알림음을 재생한다.");
	}	
}

class 카카오톡 extends 앱설정{
	// 기본 알림음 그대로 쓸 꺼면 오버라이딩 안해도 됨
}

class 게임앱 extends 앱설정{
	void 알림소리() {
		System.out.println("승리 팡파레 재생한다.");
	}
}

class 회사규정{
	void 출근시간() {
		System.out.println("기본적으로 오전 9시 출근");
	}
}
class 영업팀 extends 회사규정{
	// 회사 규정대로 오전 9시까지 출근! 오버라이딩 안해도됨
}

class 개발팀 extends 회사규정{
	void 출근시간() {
		System.out.println("팀 재량으로 7시반~10시반 사이출근");
	}
}

public class MethodOverrideTest5 {

	public static void main(String[] args) {
		// Override 
		//  - 덮어쓰다
		
		// 굳이 변경할 이유가 없다!
		자식 첫번째 = new 자식();
		첫번째.먹는다();
		
		// 부모님이 물려준 내용을 그대로 사용하면 된다.
		// 니가 자식에 맞게 변경을 할꺼면 변경하고
		// 안할꺼면 말아라!
		
		// 오버라이딩 필수사항은 아니다!
		
	}
}
