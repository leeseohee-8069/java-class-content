import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {

		Scanner 키보드 = new Scanner(System.in);

		// 영화목록들을 찜하는 ArrayList 를 만든다.
		ArrayList<String> 영화찜목록 = new ArrayList<>();

		while (true) {
			System.out.println("====== 넷플릭스 ======");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 보기");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
				System.out.println("--- 영화 추가 ---");

				// 응용 !
				// 내가 원하는데로 선택한 다음에 더이상 선택할께 없으면
				// 뒤로가기 기능!

				while (true) {
					System.out.println(" 1. 브로큰 ");
					System.out.println(" 2. 하얼빈 ");
					System.out.println(" 3. 승부 ");
					System.out.println(" 4. 한산 ");
					System.out.println(" 0번을 누르면 종료!");
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
					} else if (영화선택번호 == 0) {
						System.out.println("1메뉴 종료!메인메뉴로 돌아갑니다.");
						break;
					}
				}
				// 1번을 선택했을 때 무한반복의 끝!
			} else if (메뉴선택 == 2) {
				System.out.println("찜목록 보기");
				System.out.println(영화찜목록);

			}

			else if (메뉴선택 == 3) {
				System.out.println("넷플릭스 종료합니다.");
				break;
			}
		}

	}

}

/*
1. Scanner 생성 + ArrayList(영화찜목록) 생성
        ↓
2. 바깥 while(true) 시작 → 메인 메뉴 출력
   (1.영화추가  2.영화보기  3.종료)
        ↓
3. 메뉴선택 번호 입력받기 (nextInt)
        ↓
4. 메뉴선택 값에 따라 분기 (if ~ else if ~ else if)
        ↓
   ┌─────────────┬─────────────────┬─────────────┐
   │ 메뉴선택==1   │  메뉴선택==2      │ 메뉴선택==3   │
   ↓             ↓                 ↓
5-A. 영화추가      5-B. 찜목록 출력     5-C. 종료 메시지
   서브메뉴 진입      (println)          출력 + break
   (안쪽 while)                          ↓
   ↓                                바깥 while 탈출
6-A. 영화선택번호                      → 프로그램 완전 종료
   입력받기
   ↓
7-A. 영화선택번호에 따라 분기
   (1~4: add로 영화 추가
    0: break로 안쪽 while 탈출)
   ↓
8-A. 0이 아니면 → 6-A로 돌아가서 반복
     0이면 → 안쪽 while 탈출
   ↓
9-A. "메인메뉴로 돌아갑니다" 출력
   ↓
10. 바깥 while 맨 위로 돌아가서 다시 2번부터 반복
    (메뉴선택==3이 나올 때까지 무한 반복) 
 * 
 */




