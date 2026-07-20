import java.util.ArrayList;

public class FunctionTest4 {
		
	public static int 출금(int 잔액, int 출금금액) {
		잔액 = 잔액 - 출금금액;
		
		// 위에서 계산한 내용을 돌려준다.
		return 잔액;
	}
	
	public static void 입금() {
		
	}
	public static void 계좌이체() {
		// 상대방은 금액이 플러스!
		// 나는 잔액에 마이너스!
	}
	
	// 목적지 함수 
	public static int 목적지선택(String 목적지) {
		if(목적지.equals("수원")) {
			return 10000;
		}else if(목적지.equals("대구")) {
			return 20000;
		}else if(목적지.equals("부산")) {
			return 30000;
		}else if(목적지.equals("광주")) {
			return 35000;
		}
		else {
			System.out.println("목적지가 없습니다.");
			return 0;
		}		
	}
	// vip 할인율!
	//   50% -> 0.5
	// gold 할인율!
	//   20% -> 0.2
	
	// 일반고객
	//   0%  -> 0.0
	
	// 성인인지 판단하는 함수 
	// 영화관에서 19세 이상 무서운 영화나 잔인한 영화
	// 성인만! 
	// 영화관에 오는 고객들 하루 1000명 
	
	public static String 성인인가(int 나이) {
		if(나이 >= 19) {
			return "관람가능";
		} else {
			return "관람불가능";
		}
	}

	public static void main(String[] args) {
		
		String 서희의결과 = 성인인가(19);
		System.out.println(서희의결과);
		
		String 철수의결과 = 성인인가(35);
		System.out.println(철수의결과);
		
		String 나현의결과 = 성인인가(14);
		System.out.println(나현의결과);
		// 서희 
		int 서희의운임비 = 목적지선택("수원");
		System.out.println("서희의 운임비:" + 서희의운임비);
		
		// 민수는 대구를 내려간다 운임비는?
		int 민수의운임비 = 목적지선택("대구");
		System.out.println("민수의 운임비:" + 민수의운임비);
		
		// if문도 줄고 
		// 각각 사람마다 다른 내용을 저장할 수있다.
		// return 돌려주는 값의 타입에 따라서 
		//        작성한다.
		
		// 정수 -> int
		// 실수 -> double
		// 문자여러개 -> String 
		
		
		// static의 한계!
		//  은행 계좌 출금!
		// 서희의 계좌에서 출금도 하고 입금도 하고 계좌이체도 보낼것!
		// 철수도 입금을 하고 , 출금, 계좌이체도 하고싶다.
		// 사람이 많아지면 함수안에 코드들이 길어져요! static변수도 많아져요!
		// 동명이인 처리?
//		입금(500000);
//		출금(20000);
		
		// 함수를 실행하고 나서 각각 값들을 돌려받자!
		// 서희가 출금을 하면 서희의 잔액 !
		// 철수가 출금을 하면 철수의 잔액!
		// return 
		//  함수는 같은데  각각 사람마다 적용되게 만들자!
		
		int 서희잔액 = 출금(100000, 20000);
		System.out.println("서희의 잔액:"+ 서희잔액);
		
		int 민수잔액 = 출금(10000, 5000);
		System.out.println("민수의 잔액:"+ 민수잔액);
		
		int 알렉스잔액 = 출금(1000000, 500000);
		System.out.println("알렉스의 잔액:"+ 알렉스잔액);
		
		// ATM
		// 1. 카드를 넣는다.
		// 2. 비밀번호를 입력한다.
		// 3.  판단 맞으면 출금액 입력
		//         틀리면 비밀번호를 다시 입력하세요!
		// 4. 출금액 사람한테 돌려준다!
		
	}
}

/*
// ArrayList로 여러명을 저장하는 배열 만들면 되자나요!
	//  단점 각각의 사람들이 이름이 어떤 공간에 저장되었는지 내가 
	//  알고 있어야된다. 
	//  String 문자만 저장을 하니깐 계좌번호를 저장하는 배열을 또 만들어야된다.
	static ArrayList<String> 사람들계좌이름 = new ArrayList<>();
	static ArrayList<String> 사람들계좌 = new ArrayList<>();
	static ArrayList<String> 사람들비밀번호 = new ArrayList<>();
	static ArrayList<String> 사람들핸드폰번호 = new ArrayList<>();
		
	
	static int 서희잔액 = 100000; 
	static int 철수잔액 = 0;
	
	
	public static void 출금(int 인출금액,String 계좌주인) {
		if(계좌주인.equals("서희")) {
			서희잔액 -= 인출금액;			
		}else if(계좌주인.equals("철수")) {
			철수잔액 -= 인출금액;
		}
		사람이 증가할수록 if문 계속 늘어난다.
		ArrayList 관리가 복잡하다!
	}
	
	public static void 입금(int 입금금액,String 계좌주인) {
		서희잔액 += 입금금액;
	}
	public static void 계좌이체(int 계좌이체금액,String 상대방계좌번호,String 계좌주인) {
		// 상대방은 금액이 플러스!
		// 나는 잔액에 마이너스!
	}

public static 음료  커피만들기(String 메뉴) {
		System.out.println("원두 2샷");
		System.out.println("물받기");
		System.out.println("섞는다");
		return 메뉴;	
	}
	public static 찌개 식당이모님(String 메뉴) {
		System.out.println("김치를 자르고");
		System.out.println("김치를 볶고");
		System.out.println("물넣고");
		System.out.println("10분간 끓인다.");
		return 메뉴;
		
	}

*/