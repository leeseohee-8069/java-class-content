import java.util.Scanner;

public class MemberSystem {

	public static void main(String[] args) {

		// 프로그램이 실행되면 엑스버튼을 누를때까지는 계속
		// 프로그램이 실행되야된다. 그래서 반복문을 이용해서
		// 프로그램이 실행중!

		// 현재까지 우리가 만든 프로그램은 한번 실행하고 끝난다.
		// 사용자가 계속 이용하고 싶어도 매번 다시 프로그램을 실행!
		// 무한반복
		// - 사용자가 프로그램 종료! 누르기 전까지는
		// 계속 프로그램이 실행중이여야된다.

		Scanner input = new Scanner(System.in);
		// 사용자한테 입력받기 위해서 만듬 (키보드)

		// 가입된 아이디를 작성한다.
		String[] memberIds = { "kim123", "park456", "lee789" };

		for (;;) {
			// 무한 반복을 하면 스스로 절 대 못 멈춤!
			// 사용자가 선택해서 종료할 수있도록 만들어줘야된다.
			System.out.println();
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.print("번호를 입력하세요: ");
			int 선택한메뉴번호 = input.nextInt();

			// 1번을 누르면 회원가입 메뉴입니다. 출력
			// 2번을 누르면 로그인 메뉴입니다. 출력
			// 3번을 누르면 종료입니다 Bye~ 출력!
			
			// 숫자를 입력하고 문자를 그 다음에 입력하면 건너뛰기 되버린다.
			// 그래서 숫자는 선택한메뉴번호 변수가 저장하고 나머지는 
			// 지운다. 
			input.nextLine();
			if (선택한메뉴번호 == 1) {

				System.out.println("회원가입 메뉴입니다.");

			} else if (선택한메뉴번호 == 2) {

				System.out.println("로그인 메뉴입니다.");
				System.out.println("아이디 입력하세요");
				
				String 로그인할아이디 = input.nextLine();
				
				// 로그인할아이디를 입력받았으면  memberIds
				// 를 검색해서 아이디가 있으면 로그인 성공!
				//                  없으면 로그인 실패!
				// 힌트 문자를 비교할때 사용하는 기능!
				
				// 1. memberIds 배열에서 하나씩 꺼내서 확인
//				if(로그인할아이디.equals(memberIds[0])) {
//					System.out.println("로그인 성공");
//				}
//				if(로그인할아이디.equals(memberIds[1])) {
//					System.out.println("로그인 성공");
//				}
//				if(로그인할아이디.equals(memberIds[2])) {
//					System.out.println("로그인 성공");
//				}else {
//					System.out.println("로그인 실패!");
//				}
				// 2. 맞으면 로그인 성공 출력
				//    틀리면 로그인 실패! 
				
				for(String 잠깐저장  :memberIds) {
					if(잠깐저장.equals(로그인할아이디)) {
						System.out.println("로그인 성공");
						break; //로그인 성공했으니 
							//더이상 아이디를 비교할 필요가 없다!
					}
				}
				

			} else if (선택한메뉴번호 == 3) {

				System.out.println("프로그램을 종료합니다. Bye~");
				break; // 반복문 종료

			} else {

				System.out.println("잘못된 번호입니다.");

			}

		}
		
		// 전체적인 그림을 그릴려고한다. 
		// AI - 파이썬을 가지고 머신러닝 딥러닝해서 예측하는 프로그램!
		//    코인 예측기, 내 정보가지고 사고 팔고! 
		//  수 많은 데이터를 가져와서 배열, 리스트로 저장을 하고 반복해서
		//  하나씩 처리하고 걸러내는 작업!
		
		// 배열, 반복문!
		
		
		
	}
}
