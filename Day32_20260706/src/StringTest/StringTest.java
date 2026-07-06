package StringTest;

public class StringTest {

	public static void main(String[] args) {
		// String 타입
		// -  문자 여러개로 이어진 타입이다(문자열)
		
		String name = "홍길동";
		String message = "안녕하세요";
		
		// 길이 확인 length()
		System.out.println(message.length());
		
		// 문자를 자르는 것
		// 문자도 여러개를 저장할때는 배열처럼 한 칸에 하나씩 
		// 저장한다. 
		String prog = "HTML CSS JAVASCRIPT JAVA REACT";
		
		// 실무에서 개인정보를 보여줄 때 많이 사용한다. 
		// 1. HTML CSS만 출력하고 싶다.
		// substring(시작번호, 끝번호)
		//  끝번호는 데이터를 포함 X 자기 전까지만!
		//  그 다음 번호까지 짤라야된다.
		String text = prog.substring(0, 8);
		System.out.println(text);
		
		// 2. URL 뒤에 주소 확인
		String url = "https://naver.com/blog";
		// 뒤에 들어오는 url을 확인해서 /blog 확인해서 
		// 필요한 정보들을 각각 가져갈 수있도록 처리할 때 
		// substring(시작번호);
		// 시작번호 부터 끝까지 알아서 다 짜른다.
		String text2 = url.substring(17);
		System.out.println(text2);
		
		// 3. 파일 확장자 
		// .jpg .png .gif 
		String fileName = "photo.jpg";
		
		String text3 = fileName.substring(5);
		System.out.println(text3);
		
		// 4. 이메일에서 아이디만 뽑기 
		String email = "eryna@gmail.com";
		
		// 5. 문자 여러개 안에서 특정 문자를 찾는 기능!
		// indexOf(문자)
		// - 문자가 몇 번째 위치에 있는지 찾는 기능!
		// - 공간의 번호를 반환한다.
		int 공간번호 = email.indexOf("@");
		System.out.println(공간번호);
		String text4 = email.substring(0, 공간번호);
		System.out.println(text4);
		
		// 자바스크립트
		// 문자끼리 비교를 할 때는 "ABC" == "ABC" 됨
		// 자바는 안된다!
		// 문자끼리 비교할 때는 비교하는 기능!
		// 문자변수.equals("비교할문자");
		//  결과를 true , false 
		//  문자를 비교했을 때 같으면 true, 틀리면 false
		String name2 = "에리나";
		String name3 = "에리나";
		
		boolean result = name2.equals(name3);
		System.out.println(result);
		
		// 실무에서 사용하는 비교 
		// 1. 아이디 중복확인 
		String id = "qwer";
		String 회원가입시id = "qwer";
		
		if(회원가입시id.equals(id)) {
			System.out.println("아이디가 있습니다.");
		}else {
			System.out.println("아이디 또는 비밀번호 확인");
		}
//		-----------------------------------------------
//		1. 이메일 도메인 검증
//		 String userEmail = "student99@naver.com";
//		 @ 뒤의 도메인 부분만 추출해서, "naver.com"인지 아닌지
//		   확인해 "가입 가능" 또는 "네이버 이메일만 가입 가능"을
//		   출력하시오.
//
//		- 힌트: @의 위치를 자동으로 찾으려면 어떤 함수를 써야 할까요? 그 위치를 이용해 뒷부분만 잘라내려면? 
//		       잘라낸 문자열이 특정 값과 같은지 확인하려면 ==가 아니라 어떤 메서드를 써야 할까요?
		String userEmail = "student99@yonsai.com";
		
		int 골뱅이위치 = userEmail.indexOf("@");
		String text6 = userEmail.substring(골뱅이위치 +1);
		
		System.out.println(text6);
		
		if(text6.equals("naver.com")) {
			System.out.println("가입 가능한 이메일입니다.");
		}else {
			System.out.println("네이버 이메일만 가입 가능합니다.");
		}
		
		
//		2. 게시글 링크 주소에서 게시글 번호 추출해서 검증하기
//		String postUrl = "board.com/view?id=1024";
//		= 기호를 기준으로 그 뒤에 오는 게시글 번호("1024") 부분만 추출한 뒤, 추출한 값이 "1024"와 일치하면 "해당 게시글입니다", 아니면 "게시글을 찾을 수 없습니다"를 출력하시오.
//		힌트:
//		= 기호가 문자열의 몇 번째 위치에 있는지 자동으로 찾으려면 어떤 함수를 써야 할까요?
//		  (숫자를 직접 세면 안 되는 이유도 함께 생각해보세요 — URL마다 길이가 다를 수 있으니까요)
//		찾은 위치를 기준으로 그 뒤부터 문자열 끝까지 잘라내려면 substring()을 몇 개의 값으로 호출해야 할까요?
//		 (시작번호만 넣을지, 시작+끝번호를 둘 다 넣을지 떠올려보세요)
//		=이 하나만 잘리게 하려면, 찾은 위치에 그대로 잘라야 할지 +1을 해야 할지 확인해보세요. (= 자체가 결과에 포함되면 안 되니까요)
//		추출한 문자열이 "1024"와 같은지 확인할 때, ==를 쓰면 안 되는 이유를 떠올리며 어떤 메서드를 써야 할지 정하세요.		
		String postUrl = "board.com/view?id=1024";
		
		// 기준 문자 찾고 -> 그 뒤를 잘라내고 -> 값을 비교!
		int 위치 = postUrl.indexOf("=");
		String text7 = postUrl.substring(위치 +1);
		
		System.out.println(text7);
		
		if(text7.equals("1024")) {
			System.out.println("해당 게시글입니다.");
		}else {
			System.out.println("게시글을 찾을 수 없습니다");
		}
		
		// 코드 리팩토링(Refactoring)
		//  - 이미 잘 동작하는 코드를 더 깔끔하고,재사용 하기 쉽고
		//    실수하기 어렵게 다듬는 방법
		//  - 코드를 잘 다듬어서 더 좋게 하는 방법!
		//  - 버그를 고치는 것도 아닌 새 기능을 추가하는 것도
		//    아니다. 코드를 깔끔하게 변경하는것!
		// function 재사용 리액트에서 반복되는 HTML 태그들을
		// 새로운 태그로 묶어서 재사용!
	}
}
