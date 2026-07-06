package arrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		// 실제 웹 개발할 때 쇼핑몰 상품 목록 페이지 
		// 데이터들만 따로 저장하는 공간 (DB)
		String[] products = {"티셔츠","청바지",
							 "운동화","안경","나이키"};
		
		System.out.println(products[0]);
		System.out.println(products[1]);
		System.out.println(products[2]);
		
		// 반복문을 이용해서 줄이기! 상품 100개 있으면 syso 100번
		// 사용한다. 코드 줄도 늘어나고 중복되는 코드들이 많이
		// 생긴다. 
		// products.length 
		// 배열의 개수가 늘었다가 줄었다가 할 수있다. 
		// 배열의 길이를 자동으로 가져올 수있도록! 
		
		
		for(int i = 0; i < products.length; ++i) {
			System.out.println(products[i]);
		}
		
		String[] titles = {
			    "공지사항입니다",
			    "질문있어요",
			    "환영합니다",
			    "오늘 수업 재미있어요",
			    "점심 뭐 먹을까요?",
			    "숙제 제출했습니다",
			    "회원가입이 안돼요",
			    "감사합니다",
			    "이벤트 참여하세요",
			    "게시판 첫 글입니다"
			};
		
		// 게시판의 타이틀을 출력하기 
		for(int start = 0; start < titles.length; ++start) {
			System.out.println(titles[start]);
		}
		// 장바구니에서 결제하기로 넘어갈 때 내가 구매한 물건들의 
		// 합계를 계산하는 것!
		int[] prices = {
			    15000,
			    32000,
			    8000,
			    45000,
			    12000,
			    28000,
			    9900,
			    55000,
			    18000,
			    25000
			};
		
		// 위에 총 합계를 누적 구하기!
		int totalPrice = 0;
		
		// 배열의 시작값은 0
		// 조건 : 얼마나 반복할껀데? 배열의 길이만큼만 반복 한다.
		// 다음 이동: 1씩 증가
		for(int start2 = 0; start2 < prices.length; ++start2) {
			totalPrice = prices[start2] + totalPrice;
		}
		// 총 합계는 ** 원
		System.out.println("총 합계는 "+ totalPrice +"원");
		
		// 학생들의 시험 점수
		int[] scores = {
		    90,80,100,
		    70,95,85,
		    60,75,88,
		    92
		};
		
		// 1.총점(반복문 이용해서) 
		int totalScore = 0;
		// 시작은 배열의 0번째 공간부터 값을 꺼내온다.
		for(int s = 0; s < scores.length; ++s) {
			totalScore = totalScore + scores[s];
		}
		System.out.println("총점: " + totalScore);
		
		// 2.최고 점수
		//  기준값을 어떻게 잡을지 버그를 좌우한다.
//		int maxScore = 0;
		
//		현재 최고 점수다!
		int maxScore = scores[0];
		
		for(int s2 = 0; s2 < scores.length; ++s2) {
			
			if(scores[s2] > maxScore) {
				maxScore = scores[s2];
			}
		}
		System.out.println("최고 점수:"+ maxScore);
		
		// 최저 점수를 출력하는 반복문을 만드시오!
		
	}
}
/*
실행순서 
① 저장할 데이터의 개수와 타입을 파악한다
        ↓
② 배열을 선언하고 값을 초기화한다 (타입[] 변수명 = {값1, 값2, ...})
        ↓
③ 배열의 길이(length)를 확인한다
        ↓
④ 반복문(for)의 시작값·조건·증감을 설정한다
        ↓
⑤ 반복문 안에서 배열[공간번호]로 값을 하나씩 꺼내 사용한다
        ↓
⑥ 필요하면 조건문(if)을 결합해서 원하는 값만 걸러낸다

-----------------------------------------------
① 원본 데이터를 배열에 저장한다 (scores)
        ↓
② 계산 결과를 담을 변수(그릇)를 반복문 밖에서 미리 선언한다
   - 합계용 변수는 0으로 시작 (아직 더한 게 없으니까)
        ↓
③ 반복문으로 배열의 처음부터 끝까지 한 칸씩 방문한다
        ↓
④ 매 칸을 방문할 때마다 처리한다
   - 합계 변수에 현재 값을 더한다
        ↓
⑤ 반복문이 끝나면
        ↓
⑥ 결과(총점)를 출력한다



*/