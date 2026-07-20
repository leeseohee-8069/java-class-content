
// 한 사람의 정보를 하나로 묶었다
class Person{
	String 손님이름;
	String 손님아이디;
	String 손님비밀번호;
	String 손님전화번호;
	int 손님생일;
}

class 세탁기상자{
	String 빨랫감;
	String 비누;
	String 세탁망;
	int 빨랫감count;
	String 비누종류;
}

class 학생정보{
	
	//이름,나이,핸드폰번호, 주소, 고용노동부id,아이디,비밀번호
	// 이미지
	String 이름;
	int 나이;
	String 핸드폰번호;
	String 주소;
	String 고용노동부id;
	String 아이디;
}

class 쿠키런게임유저정보{
	
	String 쿠키이름;
	int 쿠키레벨;
	int 쿠키목숨;
	String 쿠키특징;	
}


public class ClassTest {

	public static void main(String[] args) {
		// 고객들이 정보를 저장하는 공간 
		// 쇼핑몰 고객 회원가입 1명 
		
		String 손님1이름 = "철수";
		String 손님1아이디 = "qwer";
		String 손님1패스워드 = "qwer11!";
		String 손님1핸드폰번호 = "010-1234-1234";
		int 손님1생일 = 1130;
		
		String 손님2이름 = "서수";
		String 손님2아이디 = "qwer";
		String 손님2패스워드 = "qwer11!";
		String 손님2핸드폰번호 = "010-1234-1234";
		int 손님2생일 = 1030;
		
		String 손님3이름 = "희수";
		String 손님3아이디 = "qwer";
		String 손님3패스워드 = "qwer11!";
		String 손님3핸드폰번호 = "010-1234-1234";
		int 손님3생일 = 1230;
		
		// 100명 손님이 들어오면 위에 처림 직접 변수를 일일이 만드는게
		// 힘들어요!
		
		// 여러명의 값을 한꺼번에 저장할 수있는데 배열이 늘어나고 
		// 복잡해진다. 중간에 데이터가 삭제되거나 잘못 수정되면 영향이
		// 커요!
		String[] 손님들이름 =     {"철수","서수","희수"};
		String[] 손님들아이디 =    {"qwer","asdf","zxcv"};
		String[] 손님들비밀번호 =   {"qwer","asdf","zxcv"};
		String[] 손님들핸드폰번호 = {"010-1234-1234",
		 "010-1234-2510"};
		int[] 손님들생일 =        {1130,1030,1230};
		
		// 위에 배열을 이용해서 저장하는건 좋은데 삭제를 하다가
		// 안 지워지거나 수정을 할 때 다른걸 수정 버그 발생률이 높다!
		// 결국 꼬인다! 
		
		// 해결책 
		//  - 한명의 정보를 묶으면 안될까?
		//  그래서 나오게 된게 클래스! Class
		
	
		//학생들의 정보를 저장하는 배열 
		// 이름,나이,핸드폰번호, 주소, 고용노동부id,아이디,비밀번호
		// 이미지
	
		String[] 학생들이름 = {};
		int[] 학생들나이 = {};
		String[] 학생들핸드폰번호 = {};
		String[] 학생들주소 = {};
		String[] 학생들고용노동부id = {};
		String[] 학생들아이디 = {};
		String[] 학생들비밀번호 = {};
		String[] 학생들이미지 = {};
		
		// 게임 회원가입 
		
	
	
		
	}
}
