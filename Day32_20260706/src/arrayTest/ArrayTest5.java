package arrayTest;

public class ArrayTest5 {

	public static void main(String[] args) {
		
		// 기존 for문이 조금 어려워서 쉽게 변경된 for~each
		// 자바스크립트 for of랑 똑같다
		int[] prices = {
		            35000,
		            120000,
		            18000,
		            95000,
		            150000
		        };

		// 합계 누적(금액)
		int 누적금액 = 0;
		
		// 자동으로 값을 하나씩 꺼내서 pr변수에 저장한다.
		for(int pr : prices) {
			누적금액 = 누적금액 + pr;
			// 10만원 이상만 출력하기 
			if(pr >= 100000) {
				System.out.println("현재금액:"+pr);
			}
		}		
		System.out.println("누적 금액은:"+ 누적금액);
				
		
		System.out.println();
		System.out.println();
		
		String[] fruits = {
	            "사과",
	            "바나나",
	            "포도",
	            "딸기",
	            "수박"
	        };
		
		for(String f : fruits) {
			System.out.println(f);
		}
	    
	    
	    System.out.println();
	    System.out.println();
	
		
		int[] nums = {10,20,30,40,50};
		
		// for in,for of 
		//  배열의 모든 값을 처음부터 끝까지 사용할 때 가장 간단한
		//  반복문
		//  for~each 
		//   자동으로 배열에서 0번부터 꺼내서 반복한다.
		for(int num  : nums) {
			System.out.println(num);
		}		
	}
}
