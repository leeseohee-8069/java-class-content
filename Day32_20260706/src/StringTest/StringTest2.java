package StringTest;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		String[] badWords = {"바보", "멍청이", "짜증"};
		String comment = "너 진짜 바보 같고 짜증나";
		
		System.out.println("필터링전: "+ comment);
		
		for(String wo : badWords) {
			comment = comment.replace(wo, "***");
		}
		System.out.println("필터링 후: "+comment);
		
		
		String path = "C:/Users/student/Desktop";
		// 리눅스 운영체제에 맞게 파일 경로를 변경 
		// 윈도우 운영체제에 맞게 파일 경로를 변경 
		// "C:\fullstack\dev\images";
		path.replace("/", "\\");
		
		
		// replace("찾을값","바꿀값");
		//  - 특정 문자를 찾아서 다른 문로 전부 바꿔주는 기능
		//  - 욕설(광고,도박,금전) 필터링 - 데이터정제(Data Cleaning)
		String message = "안녕 안녕 안녕";
		
		// hello 로 영어로 변경 하고 싶다.
		String result3 = message.replace("안녕", "hello");
		System.out.println(result3);
		
		String phone = "010-1234-1234";
		// - 를 공백으로 변경하기 
		String phoneResult = phone.replace("-","");
		System.out.println(phoneResult);
		
		
		// split("구분자")
		//  - 문자 여러개를 원하는 기준으로 여러 개로
		//    나눌 수있다.
		
		String userEmail = "student99@yonsai.com";
		
		String[] result2 = userEmail.split("@");
		
		System.out.println(result2[0]);
		System.out.println(result2[1]);
		
		
		
		
		System.out.println();
		System.out.println();
		String fus = "사과,바나나,포도";
		
		String[] result = fus.split(",");
		
		System.out.println(Arrays.toString(result));
		for(String f : result) {
			System.out.println(f);
		}
		
	}
}
/*
replace 실행순서
① 원본 문자열에서 무엇을 다른 것으로 바꾸고 싶은지 파악한다
        ↓
② replace()의 첫 번째 값(찾을 문자/문자열)을 정한다
        ↓
③ replace()의 두 번째 값(바꿀 문자/문자열)을 정한다 (제거하고 싶다면 빈 문자열 "" 사용)
        ↓
④ 문자열.replace("찾을값", "바꿀값") 형태로 호출한다
        ↓
⑤ 결과는 새로운 문자열이므로, 반드시 변수에 다시 저장한다 (원본은 바뀌지 않음)
        ↓
⑥ 필요하면 바뀐 결과를 출력하거나 다른 로직에 이어서 활용한다

*/