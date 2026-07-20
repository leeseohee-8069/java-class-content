
class 신한은행앱{
	
	int 잔액; //내 돈을 저장 100만원 10만원 
	
	// 이체기능
	//  기계와 기계끼리 통신을 해서 출금을 하거나 이체를하거나
	//  해야되서 그래서 결과 있는지 없는지 기계들끼리 
	//  확인 해야되서 타입이 결정된다.
	void 이체하기(){
		System.out.println("로그인하세요");
		System.out.println("상대방 계좌 입력");
		System.out.println("이체할금액 입력");
		System.out.println("전송!");
		System.out.println("이체가 완료되었습니다!");
		// 화면에 결과만 보인다!
		//  return 타입을 생략해도 된다. 그래서 없다
		// 뜻으로  void 
	}
}

// 국민은행앱 틀을 만들어서 플레이스토어 올렸다!
// 다운로드! new 
// 고객은 설치 버튼만 ! 누른다
// 그러면 다운로드 되는 행동! - 함수
// 내 로그인 정보를 저장 - 변수 
// 클래스안에 변수만 들어가는게 아니라 기능들도 같이 들어간다.
class 국민은행앱{
	
	int 잔액; //내 돈을 저장 100만원 10만원 
	
	// 이체기능
	void 이체하기(){
		System.out.println("로그인하세요");
		System.out.println("상대방 계좌 입력");
		System.out.println("이체할금액 입력");
		System.out.println("전송!");
		System.out.println("이체가 완료되었습니다!");
		// 화면에 결과만 보인다!
		//  return 타입을 생략해도 된다. 그래서 없다
		// 뜻으로  void 
	}
	
	// 앱으로 출금을 하는 기능!
	// 우리도 카드 없이 출금할 수있도록 해줄께
	//  gitflow  main 서비스를 실행중! 
	//           dev / feature - 스마트출금 브랜치 생성
	int 스마트출금(String 비밀번호){
		System.out.println("비밀번호가 맞으면 출금액입력");
		System.out.println("내 계좌 잔액이랑 비교한다");
		System.out.println("잔액이 출금액보다 많으면 출금");
		return 200000;
	}	
}

public class MethodOverrideTest2 {

	public static void main(String[] args) {
		국민은행앱 에리나폰 = new 국민은행앱();
		// 이체하기 버튼을 눌렀다! 그럼 그안에 행동들이 시작된다.
		에리나폰.이체하기();
		
		국민은행앱 알렉스폰 = new 국민은행앱();
		알렉스폰.이체하기();
	}
}





