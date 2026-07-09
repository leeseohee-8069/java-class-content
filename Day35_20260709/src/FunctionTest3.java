import java.util.Scanner;

public class FunctionTest3 {
	
	// FunctionTest3 자바파일이 실행하면 키보드 생성하고 총금액변수도
	// 생성해라! 그래서 목적지선택함수랑,열차선택함수랑,좌석선택함수
	// 가 공유해서 쓸수있도록 해라!
	
	// 여러 함수에서 입력을 받아야 하므로 같이 키보드를 사용해야된다.
	static Scanner 키보드 = new Scanner(System.in);
	
	// 기차표 예약하는 프로그램 만들기 
	// 모든 함수가 같이 사용할 변수
	// main 함수 밖에 만든다. 
	static int 총금액 = 0;
	
	// static == 강사
	// 함수는 여러분! 학생분들()
	
	// 은호() {키보드작성중..}
	// 경우()
	// 진오()
	// 유경()
	// 상규()
	// 현호()
	
	
	//목적지를 선택하는 함수 
	public static void 목적지선택() {
		System.out.println("목적지 선택");
        System.out.println("1. 춘천 5000원");
        System.out.println("2. 부산 30000원");
        System.out.println("3. 대구 20000원");
        System.out.println("4. 수원 10000원");
        System.out.print("번호 입력: ");
        int 목적지 = 키보드.nextInt();
		
        // 1. 목적지 입력 받기 
        if (목적지 == 1) {
            총금액 += 5000;
        } else if (목적지 == 2) {
            총금액 += 30000;
        } else if (목적지 == 3) {
            총금액 += 20000;
        } else if (목적지 == 4) {
            총금액 += 10000;
        }
	}
	
	public static void 열차선택() {
		System.out.println("열차 종류 선택");
        System.out.println("1. KTX 10000원");
        System.out.println("2. 새마을호 5000원");
        System.out.println("3. 무궁화호 3000원");
        System.out.print("번호 입력: ");
        int 열차 = 키보드.nextInt();

        if (열차 == 1) {
            총금액 += 10000;
        } else if (열차 == 2) {
            총금액 += 5000;
        } else if (열차 == 3) {
            총금액 += 3000;
        }
	}
	public static void 좌석선택() {
		System.out.println("입석/좌석 선택");
        System.out.println("1. 입석 0원");
        System.out.println("2. 좌석 2000원");
        System.out.print("번호 입력: ");
        int 좌석 = 키보드.nextInt();

        if (좌석 == 1) {
            총금액 += 0;
        } else if (좌석 == 2) {
            총금액 += 2000;
        }
	}
	
	public static void main(String[] args) {
		
		목적지선택();
		
		// 2. 열차 선택하기 
		열차선택();
		
		// 3. 좌석 입석 선택하기 
        좌석선택();
        
		// 4. 최종 금액 출력하기 
        System.out.println("최종 결제 금액: " + 총금액 + "원");
	}
}

/*
// 편의점 계산 프로그램
		// 상품 메뉴 보이기
		// 상품 가격 구하기
		// 상품 이름 구하기
		// 영수증 출력

		Scanner 키보드 = new Scanner(System.in);

		while (true) {
			메뉴보이기();

			int 번호 = 키보드.nextInt();
			상품구매(번호);

			if (번호 == 4) {
				System.out.println("계산완료!");
				break;
			}
		}

	// 메뉴보여주는 함수
	public static void 메뉴보이기() {
		System.out.println("===== 편의점 =====");
		System.out.println("1. 삼각김밥 - 1500원");
		System.out.println("2. 컵라면 - 2000원");
		System.out.println("3. 콜라 - 1800원");
		System.out.println("4. 계산하기");
		System.out.print("번호 선택: ");
	}

	public static void 상품구매(int 번호) {
		if (번호 == 1) {
			System.out.println("삼각김밥 구매 완료!");
		} else if (번호 == 2) {
			System.out.println("컵라면 구매 완료!");
		} else if (번호 == 3) {
			System.out.println("콜라 구매 완료!");
		} else {
			System.out.println("없는 상품입니다.");
		}
	}
*/