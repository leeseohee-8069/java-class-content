package arrayTest;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열을 쓰는 이유?
		//  - 여러개의 값을 한꺼번에 저장하려고!
		String[] 상품들 = {"나이키운동화","티셔츠","청바지","일자바지"};
		
		System.out.println(상품들[0]);
		System.out.println(상품들[1]);
		System.out.println(상품들[2]);
		System.out.println(상품들[3]);
	
		// 배열을 손가락으로 짚어가며 읽는다!
		// 마켓컬리에서 전체 상품을 화면에 보일 때 반복! 
		// 배열에서 하나씩 꺼내서 화면에 보이기 
		int 손가락 = 0;
		System.out.println(상품들[손가락]);
		
		//손가락 = 1;
		++손가락;
		System.out.println(상품들[손가락]);
		//손가락 = 2;
		++손가락;
		System.out.println(상품들[손가락]);
		//손가락 = 3;
		++손가락;
		System.out.println(상품들[손가락]);
		
//		--------------------------------------
		System.out.println();
		System.out.println();
		
		int[] 숫자들 = {10,20,30,40,50,60};
		
		// 반복문 쓰지 말고! 
		// 숫자들 배열에 40이 있니?
		if(숫자들[0] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		if(숫자들[1] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		if(숫자들[2] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		
		if(숫자들[3] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		
		System.out.println();
		System.out.println();
//		---------------------------------------
		double[] heights = {
			    165.3,172.8,
			    180.5,158.7,
			    169.4,175.2,
			    182.1,160.9,
			    167.6,171.0
			};
		// 키가 180이상 인 사람은 출력하고 미만인 사람은
		// 무시하고 다음으로 넘어가기!
		// 180넘음!
		
		if (heights[0] >= 180) {
		    System.out.println(heights[0]);
		}
		if (heights[1] >= 180) {
		    System.out.println(heights[1]);
		}
		if (heights[2] >= 180) {
		    System.out.println(heights[2]);
		}
		if (heights[3] >= 180) {
		    System.out.println(heights[2]);
		}
		if (heights[4] >= 180) {
		    System.out.println(heights[2]);
		}
		if (heights[5] >= 180) {
		    System.out.println(heights[2]);
		}
		// heights[6] heights 배열에서 6번 공간에
		// 값을 가져와서 180보다 크거나 같니?
		if (heights[6] >= 180) {
		    System.out.println(heights[6]);
		}
		if (heights[7] >= 180) {
		    System.out.println(heights[7]);
		}
		// 배열이 몇번째까지더라?
		// if문이 너무 길어져요!
		// 숫자는 기억을 하려면 변수를 쓰면 된다.
		int i = 0;
		if (heights[i] >= 180) {
		    System.out.println(heights[i]);
		}
		// 배열명[변수] --> []안에 변수를 쓰면 값이 바뀐다.
		// 배열명[0] --> 무조건 0번 칸 고정됨!
		i = 1;
		if (heights[i] >= 180) {
		    System.out.println(heights[i]);
		}
		i = 2;
		if (heights[i] >= 180) {
		    System.out.println(heights[i]);
		}
		i = 3;
		if (heights[i] >= 180) {
		    System.out.println(heights[i]);
		}
		// 반복문을 이용해서 값을 하나씩 증가시킨다면
		// 자동화
		// 배열의 전체 값을 자동으로 반복하면서 값 확인
		// 할 수있다.
		
		// 건강검진센터에서 40명 
		// 그 사람들 중에 혈압이 높은 사람을 찾아라!
		// 혈압이 높으면 추가검사를 해야된다. 알림!
		// 학생의 이름 검색!
		// 쇼핑몰 상품 검색
		// 혈압이 140이상인 사람 검색!
		// 게시판 제목 검색 
		// 검색 - 데이터가 너무 많으면 힘들다
		
		
		int[] 혈압 = {
			    120, 145, 118, 135, 155,
			    128, 140, 135, 110, 150,
			    125, 138, 142, 119, 160,
			    130, 122, 147, 136, 124,
			    152, 117, 133, 141, 129,
			    146, 134, 121, 158, 127,
			    139, 144, 123, 131, 148,
			    126, 137, 151, 116, 143
			};
		int 번호 = 0;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
			
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림😔 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림😔 추가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림😔가검사하세요!");
			System.out.println("현재 혈압: "+혈압[번호]);
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		++번호;
		if(혈압[번호] >= 140) {
			System.out.println("알림! 추가검사하세요!");
		}
		// 그래서 반복문이 나오게 됬다!
		
	}
}
