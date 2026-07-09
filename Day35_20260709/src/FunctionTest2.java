
public class FunctionTest2 {
	
	// 긴 코드들이 중복되서 나오기 때문에 
	// 하나 단어로 바꿔서 계속 사용하려고!
	// 여러개의 실행문들을 묶어서 계속 재사용하려고!
	// 리액트 (나는 태그들도 묶을 건데?)
	
	public static void 빨래하기() {
		System.out.println("물받기");
		System.out.println("자동 세제 넣기");
		System.out.println("빨래하기");
		System.out.println("행구기");
		System.out.println("탈수!");
	}
	// 햄버거 만들기 레시피 함수 
	public static void 햄버거만들기레시프() {
		System.out.println("빵꺼내기");
		System.out.println("패티굽기");
		System.out.println("야채넣기");
		System.out.println("소스 넣기");
		System.out.println("포장하기");
	}
	// 결제하기 
	public static void 결재하기() {
		System.out.println("상품확인");
		System.out.println("금액계산");
		System.out.println("간편결제? 카드앱결제니? 무통장? 계좌이체");
		if(어떤 걸로 결제할꺼니?) {}
		
		if(결제 됬니?) {배송준비}else {결제다시해주세요}
		
		System.out.println("주문 저장 -DB");
		System.out.println("화면에 영수증 출력 - 리액트");
	}
	public static void 잠금해제() {
		System.out.println("지문을 입력");
		System.out.println("기존 지문하고 비교");
		if(지문이 똑같니?) { 메인화면} else {다시지문입력}
		System.out.println("화면 밝게 켜주기");
		System.out.println("홈화면보여주기");
	}
	
	// 등급을 출력하는 기능안에 판단이 들어갔다
	public static void 등급(int 점수,String 과목명) {
		if (점수 >= 90 && 점수 <= 100) {
            System.out.println(과목명 +": A등급");
        } else if (점수 >= 80) {
            System.out.println(과목명 +": B등급");
        } else if (점수 >= 70) {
            System.out.println(과목명 +": C등급");
        }else if (점수 >= 60) {
            System.out.println(과목명 +": D등급");
            
        } else if (점수 >= 50) {
            System.out.println(과목명 +": E등급");
            
        }else {
            System.out.println(과목명 +": F등급");
        }
	}
	public static void 위로가기버튼() {
		System.out.println("문이 열린다");
		System.out.println("원하는 층 버튼을 확인한다");
		System.out.println("한 층씩 올라간다");
		while(true) {
			if(원하는층에 도착햇니?) { 내린다.break} 
			else {
				또한층올라간다!
			}
		}
	}
	// JDK다운 받은 이유가 개발을 빠르게 하기 위해서
	// 미리 만들어놓은 판단,if ,반복 (while), function 
	// 만들어서 써! (커스텀)
	public static void 계산하기() {
		System.out.println("상품 스캔");
		System.out.println("가격 계산");
		System.out.println("영수증 출력");
		System.out.println("봉투에 담는다");
	}
	public static void 공격하기() {
		System.out.println("지옥에서 온 낫! 휘두른다");
		System.out.println("데미지를 입는다.");
		System.out.println("나는 점수를 얻는다!");
	}
	public static void 아메리카노레시피(String 추가) {
		System.out.println("원두를 내린다 2샷" + 추가);
		System.out.println("뜨거운 물을 컵에 담는다");
		System.out.println("샷과 물을 섞는다");
		System.out.println("고객한 준다!");
	}
		
	public static void 허니자몽블랙티레시피() {
		System.out.println("뜨거운 물을 컵에 담는다");
		System.out.println("티백과 물을 섞는다");
		System.out.println("고객한 준다!");
	}

	public static void main(String[] args) {
		
		// 병원에서 건강검진
		// BMI 지수 100번 판단!
		// 비만,과체중 , 정상 , 저체중
		String 이름 = "철수";
		double bmi = 22.5;
		
		String 이름2 = "영희";
		double bmi2 = 18.3;
		
		String 이름3 = "민수";
		double bmi3 = 25;
		
		// 30이상 비만
		// 25이상 ~ 30미만 과체중
		// 18.5이상 ~ 25미만 정상
		// 18.5미만 저체중 
		
		// 1. 함수 쓰지마시고! if문 
		
		// 2. 함수로 변경해서 장점 파악!
		
		// if  function 
		// if 판단(한번)  신호등 빨간불이면 멈춘다!
		//               아닌데 지나간다!
		// while 계속 판단
		// function (묶음,기능)
		//  리모콘 버튼 
		
		// 조건 if문 
		int 나이 = 20;
		if(나이 >= 20) {
			System.out.println("술 구매가능!");
		}else {
			System.out.println("술 구매 불가능!");
		}
		
		// hp 목숨 0이면 끝!
		int 목숨 = 0;
		if(목숨 < 0) {
			System.out.println("게임오버!");
		}else {
			System.out.println("계속 싸우자!");
		}
		
		String 주문메뉴 = "아메리카노";
		if(주문메뉴.equals("아메리카노")) {
			System.out.println("커피 만들어!");
		}else {
			System.out.println("메뉴 다시 확인!");
		}
		
		
		System.out.println();
		System.out.println();
		// 국어,영어,수학 각각 점수 100,80 90
		int 국어 = 100 , 영어 = 80 , 수학 = 90;
		
		// 각각의 등급 90점 이상 A 
		//          80점 이상 B
		//          70점 이상 C 
		//          60점 이상 D
		//나머지는 모두 F
		
		// 국어 등급 A 등급
		// 영어 등급 B 등급
		// 수학 등급 A 등급 
		// 국어 등급
        등급(국어,"국어");

        // 영어 등급
        등급(영어,"영어");

        // 수학 등급
        등급(수학,"수학");
        
        // 사회 등급 
        등급(100 ,"사회");
        
        // 과학 등급 
        등급(50, "과학");
		
		
	}
}
