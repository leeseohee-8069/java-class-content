import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {

		Scanner 키보드 = new Scanner(System.in);

		// 영화목록들을 찜하는 ArrayList 를 만든다.
		ArrayList<String> 영화찜목록 = new ArrayList<>();

		// 넷플릭스 찜목록
		// 넷플릭스를 한 번 켜면 내가 X버튼이나
		// 종료버튼을 누르지 않는 한 넷플릭스가 계속
		// 실행되야 된다. 반복문
		// while(true) 무조건 반복해라!
		// 고객이 종료를 누르기 전까지는 무한반복해서
		// 넷플릭스를 끄지 말아라!

		while (true) {
			System.out.println("====== 넷플릭스 ======");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 보기");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
				System.out.println("--- 영화 추가 ---");
				System.out.println(" 1. 브로큰 ");
				System.out.println(" 2. 하얼빈 ");
				System.out.println(" 3. 승부 ");
				System.out.println(" 4. 한산 ");
				System.out.println("추가할 영화 번호를 선택:");
				int 영화선택번호 = 키보드.nextInt();

				if (영화선택번호 == 1) {
					영화찜목록.add("브로큰");
				} else if (영화선택번호 == 2) {
					영화찜목록.add("하얼빈");
				} else if (영화선택번호 == 3) {
					영화찜목록.add("승부");
				} else if (영화선택번호 == 4) {
					영화찜목록.add("한산");
				}
				System.out.println(영화찜목록);
			} else if (메뉴선택 == 3) {
				System.out.println("넷플릭스 종료합니다.");
				break;
			}
		}
	}
}

/*
 * 
 * 🎵 실습 문제: 멜론 플레이리스트 만들기 📖 상황 설명 당신은 멜론 플레이리스트 관리 프로그램을 만들고 있습니다. 현재 플레이리스트에는
 * 아래 3곡이 순서대로 들어있습니다.
 * 
 * 1번째: APT. 2번째: Dynamite 3번째: Supernova 이 플레이리스트를 다음 요청사항대로 수정하는 프로그램을 작성하세요.
 * 
 * 
 * ✅ 요청사항 (순서대로 처리) 1. 노래 추가: 처음에 위 3곡을 순서대로 ArrayList에 담는다 2. 두 번째 위치에
 * "Hype Boy" 삽입: 기존 2번째 자리("Dynamite" 앞)에 "Hype Boy"를 끼워 넣는다 결과 예상: [APT., Hype
 * Boy, Dynamite, Supernova]
 * 
 * 3. "Dynamite" 삭제 - 곡 이름으로 찾아서 삭제한다 결과 예상: [APT., Hype Boy, Supernova] 4.
 * "Attention" 추가 - 리스트 맨 뒤에 새 곡을 추가한다 결과 예상: [APT., Hype Boy, Supernova,
 * Attention]
 * 
 * 각 단계가 끝날 때마다 현재 플레이리스트 전체를 출력해서 어떻게 바뀌는지 눈으로 확인하세요.
 */

/**
 * 
 * 실습 1 (기초): 편의점 장바구니 프로그램 상황 설명 편의점 키오스크 프로그램을 만듭니다. 손님이 종료를 누르기 전까지 계속 메뉴가
 * 반복해서 나와야 합니다.
 *  ====== 우리동네 편의점 ====== 
 *  1. 상품 담기 
 *  2. 장바구니 보기 
 *  3. 종료
 * 
 * 1번 선택 시: 
 * 상품 목록(1.삼각김밥 2.컵라면 3.초코우유 4.과자)을 
 * 보여주고 번호 선택 → 장바구니(ArrayList)에 추가 2번
 * 
 * 선택 시: 
 * 현재 장바구니 전전체 출력 3번 선택 시: 
 * "이용해주셔서 감사합니다" 출력 후 프로그램 종료
 * 
 * 💡 힌트 기능사용할 문법무한 반복while(true)키보드 입력
 * 받기Scanner, .nextInt()
 * 메뉴 분기if ~ else if상품
 * 담기장바구니.add("상품명")
 * 프로그램 종료break;
 * 
 * 
실습 2 (중급): 할 일 목록(TODO) 관리 프로그램
상황 설명
할 일을 추가하고, 완료한 일은 삭제할 수 있는 프로그램을 만듭니다.
====== TODO 관리 ======
1. 할 일 추가
2. 할 일 목록 보기
3. 할 일 삭제
4. 종료

1번: 사용자가 직접 문자열을 입력(nextLine())해서 할 일 목록(ArrayList)에 추가
2번: 전체 목록 출력 (목록이 비어있으면 "할 일이 없습니다" 출력)
3번: 삭제할 할 일의 이름을 입력받아서 목록에 있으면 삭제, 없으면 "해당 할 일이 없습니다" 출력
4번: 종료

💡 힌트
기능사용할 문법직접 문자열 입력받기키보드.next() (공백 없는 한 단어)목록이 비어있는지 확인.isEmpty() 또는 .size() == 0이름으로 있는지 확인 후 삭제.contains(값) 으로 먼저 확인 → .remove(값)메뉴가 4개if ~ else if ~ else if ~ else if
 * 
 * 
 * 
 * 
 * 
 */
