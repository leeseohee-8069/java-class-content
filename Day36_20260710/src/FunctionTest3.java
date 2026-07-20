
public class FunctionTest3 {
	
	public static void 알람시계(int 시간) {
		
		System.out.println("띠리리리리리");
		System.out.println("현재 "+ 시간 +"입니다. 일어나세요!");
		
	}
	public static void 로봇청소기() {
		// 나 대신 청소를 한다. 버튼만 누르면 된다. 
		System.out.println("바닥 닦기");
		System.out.println("먼저 모으기");
		System.out.println("충천기로 돌아간다");
	}
	
	public static void 자동문() {
		System.out.println("문이 열린다");
		System.out.println("잠시 기다린다");
		System.out.println("문이 닫힌다.");
	}
	public static void 코인노래방(String 돈) {
		System.out.println("노래 번호를 누른다");
		System.out.println("반주가 나오면 기다린다");
		System.out.println("신나게 노래를 한다");
		System.out.println("점수 확인후 나간다");
	}
	
	// 메뉴 출력 
	// 메뉴만 보여주면 된다.(화면에) 고객한테!
	// void 없다!
	public static void 메뉴출력() {
		System.out.println("===== 영화 예매 =====");
        System.out.println("1. 예매");
        System.out.println("2. 조회");
        System.out.println("3. 종료");
	}
	public static void 회원가입완료() {
		System.out.println("회원가입 성공!");
		System.out.println("로그인 해주세요!");
	}
	// 화면에 출력!
//	public static void 배터리충전알림() {
//		if(배터리잔량 > 15이하로 떨어지면) {
//			System.out.println("충천하세요!");
//		}
//	}
	//폭죽 
	//  - 폭죽을 터트리면 하늘에 번쩍 예쁘게 보인다(콘솔 화면출력)
	//  - 나한테 남는건 아무것도 없다!
	
	public static void main(String[] args) {
		// 네가 만든 함수가 끝난 다음에 다른 코드한테
		// 이 값이 필요한가? 
		
		// return 이 필요없는 예제!
		
		// 알람 시계
		// 실행되고 나서 그걸로 끝! 
		// 나중에 그 결과를 어디 저장해서 다시 쓸 일이 없다
		
		// 함수!
		// 여러 실행 문장을 하나로 묶어서 이름을 붙인것!
		// 자주 사용하는 코드를 하나로 묶어 놓은 것!
		// 나 대신 여러 줄의 코드를 실행해주는 것!
		
		// 함수를 만들때 딱! 3가지 
		// 1. 이 함수를 실행한 다음 그 결과를 변수에 담아야하나?
		//    다음 코드가 쓸꺼야?
		//    yes -> return 필요
		//    no -> return 필요 없음
		
		// 2. no 면 그 결과로 판단(if문)해야되나?
		// 3. 결과를 미리 알려주는 타입만 결정!
		
		
		
	}
}
