
public class OperatorTest2 {

	public static void main(String[] args) {
		// 실제 웹에서 사용하는 기법!
		// 좋아요
		// 브라우저는 누구든 접근이 가능하다(개발자도구)
		// 자바로 만들면 브라우저에 저장이 아니라 내 컴퓨터
		// 메모리에 저장이 되기 때문에 누구든 접근이 불가능하다
		
		
		int 배터리 = 30;
		
		//현재 배터리의 잔량 출력 
		// 배터리 : 30% 
		System.out.println("나뭇잎" + 배터리);
		// 배터리 잔량이 30프로 이하이면 충천하세요!
		//                  초과이면 "" 
		boolean 결과2 =  배터리 > 30;
		System.out.println("결과:" + 결과2);
		
		String 메시지2 = 결과2 ? 
					  "" :
					  "충천하세요!";
		
		System.out.println(메시지2);
		
		
		System.out.println(); //공백
		System.out.println(); //공백
		
		int 좋아요 = 100;
		System.out.println("현재 좋아요: "+ 좋아요);
		
		++좋아요;
		
		System.out.println("좋아요버튼 클릭!");
		System.out.println("현재 좋아요: "+ 좋아요);
		
		// 좋아요가 100개 이상이면 "인기게시글!"
		//              미만이면 "아직 인기 게시글 아님"
		
		// 1. 먼저 결과를 확인 
		// boolean  true 또는 false만 저장하는 타입!
		boolean 결과 =  좋아요 >= 100;
		System.out.println("결과:" + 결과);
		
		String 메시지 = 결과 ? 
					  "인기게시글!" :
					  "아직 인기 게시글아님";
		
		//System.out.println(좋아요 >= 100 ? "인기게시글!" : "아직 인기 게시글 아님");
		
		System.out.println("메시지: " + 메시지);
	}
}
