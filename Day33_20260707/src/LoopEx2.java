
public class LoopEx2 {

	public static void main(String[] args) throws InterruptedException {

		// 1번 학생 부터 20번 학생 호출 
		// 3명씩 건너뛰며 번호를 부른다. 
		// 1 4 7 10 ....
		
		int 번호 = 1;
		
		// 번호의 값이 20과 다르면 계속 반복한다
		// 같지 않다  20이라는 값과 딱! 맞지 않으면
		// 나머지는 다 참으로 알아듣는다. 그래서
		// 무한반복이 생긴다. 
		// 조건을 건너뛸 경우 무한반복! !=
		while(번호 <= 20) {
			System.out.println(번호 + " 학생");
			번호 += 3;
		}
		
		// 엘리베이터 층 출력!
		// 현재 층은 1층  고객이 15층 까지 
		// 1 2 3 4 5 6 7 8 9 ... 15 !
		int 현재층 = 1;
		int 고객이원하는층 = 15;
		
		while(현재층 <= 고객이원하는층) {
			System.out.println(현재층);
			현재층 += 1;
		}
		
		
		// 2단 구구단
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// 2 * 4 = 8
		// 2 * 5 = 10
//		.....
//		2 * 9 = 18

		int count2 = 1;

		while (count2 <= 9) {
			System.out.println("2 * " + count2 
							   + "= " + (2 * count2));
			count2 +=1;
		}

		// 로켓 발사!
		// 카운드 다운
		// 5 4 3 2 1 발사성공!
		int count = 5;

		while (count > 0) {
			System.out.println(count);
			count = count - 1; // count -= 1; count--
		}

		System.out.println("발사성공!");
	}
}
