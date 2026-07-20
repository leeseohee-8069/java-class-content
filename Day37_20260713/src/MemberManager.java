import java.util.ArrayList;
import java.util.Scanner;

class 회원 {
	String 이름;
	String 아이디;
	String 비밀번호;

	// 회원가입하기 버튼 누르는 순간 모든 정보를 한번에 저장한다.
	public 회원(String 이름, String 아이디, String 비밀번호) {

		this.이름 = 이름;
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
	}
}

public class MemberManager {

	public static void main(String[] args) {
		// 실무에서 네이밍(작명) 대상 + Manager
		// MemberSystem

		// 메뉴
		// 1. 회원가입
		// 2. 로그인
		// 3. 회원 검색
		// 0. 종료!

		// 1. 필요한 도구 가져오기!
		Scanner 키보드 = new Scanner(System.in);

		// 여러명의 회원을 가입시켜야되기 때문에 여러명을 저장하는 배열
		ArrayList<회원> 회원목록 = new ArrayList<>();

		while (true) {
			System.out.println("\n===== 메뉴 =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 검색");
			System.out.println("0. 종료");
			System.out.print("선택: ");

			// 2. 키보드로 메뉴 입력
			int 선택 = 키보드.nextInt();

			// 버그 발생 가능한 부분
			// 숫자를 입력하고 문자를 입력하면 건너뛰기가 된다.
			키보드.nextLine(); // 엔터 지우기!

			// 3. 메뉴 선택
			if (선택 == 1) {
				System.out.print("이름: ");
				String 이름 = 키보드.nextLine();
				System.out.print("아이디: ");
				String 아이디 = 키보드.nextLine();
				System.out.print("비밀번호: ");
				String 비밀번호 = 키보드.nextLine();

				// 회원목록에 저장
				회원 새로운회원 = new 회원(이름, 아이디, 비밀번호);
				회원목록.add(새로운회원);

				System.out.println(이름 + "님 회원가입 축하합니다!");

			} else if (선택 == 2) {
				// 로그인을 하려면? 실행 순서
				// 1. 로그인할 아이디 비번 입력받기
				System.out.print("아이디: ");
			    String 입력아이디 = 키보드.nextLine();
			    System.out.print("비밀번호: ");
			    String 입력비밀번호 = 키보드.nextLine();
			    
				// 2. 회원목록을 돌면서 아이디와 비밀번호가 일치하는 회원 찾기
			    // ArrayList도 0번 부터 번호가 부여된다. 그래서 찾아올때
			    int 번호 = 0;
			    
			    while(번호 < 회원목록.size()) {
			    	
			    	// -1. 회원 한명 꺼내오기 
			    	회원 하나의대상 = 회원목록.get(번호); 
			    	
			    	// -2. 비교 equlas()
			    	if(하나의대상.아이디.equals(입력아이디) && 
			    	   하나의대상.비밀번호.equals(입력비밀번호)) {
			    	   System.out.println(하나의대상.이름 +
			    			   				"님, 로그인 성공!");
			    	   break; 
			    	}else {
			    		System.out.println("아이디 비번 확인하세요!");
			    	}
			    	// 회원목록의 번호를 다음 칸으로 이동!
			    	번호 += 1;
			    }
				
				// 3. 찾으면 선택!  로그인 환영합니다 ***님
				//               아이디 또는 비밀번호를 확인하세요!
				
			} else if (선택 == 3) {
				//  1. 검색할 이름 입력
				
				//  2. 회원목록을 돌면서 이름을 비교한다.
				
				//  3. 이름이 있으면 해당 아이디를 출력 
				//           없으면 해당 이름의 회원은 없습니다!
				
			} else if (선택 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; //반복 멈춤!
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		} // 무한반복의 끝!

	}
}

/*
 * 1) 프로그램 시작 → ArrayList<회원> 회원목록 준비
   ↓
2) while(true)로 메뉴 반복 출력
   ↓
3) 사용자가 번호 입력 (nextInt) → 개행 제거 (nextLine)
   ↓
4) 선택값에 따라 분기
   ├─ 1: 회원가입() → 입력값으로 new 회원(...) 생성 → 회원목록.add()
   ├─ 2: 로그인() → 회원목록 반복 순회 → 아이디/비밀번호 일치 확인 → return
   ├─ 3: 회원검색() → 회원목록 반복 순회 → 이름 일치하는 것 전부 출력
   └─ 0: break → 프로그램 종료
   ↓
5) 종료 아니면 2번으로 돌아가서 메뉴 다시 출력 (반복)
 * 
 * 
 * 
 */
