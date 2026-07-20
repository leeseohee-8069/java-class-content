import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
//		랜덤값들 이용해서 캐릭터들의 위치나 각각 고객의 고유한 id값들
//	    생성할 때 사용된다. (무작위 수) 만들어주는 도구다!
		// 컴퓨터가 알아서 값을 뽑는다. 
		
//		한번만 생성하면 된다. 
		Random 랜덤도구 = new Random();
		
		//정수 뽑기 
		// -21억 ~ +21억 사이에 숫자 하나를 뽑는다.
//		int 숫자 = 랜덤도구.nextInt();
//		
//		System.out.println("랜덤 값: " +  숫자);
//		
//		// nextInt(개수)
//		// 0부터 개수 -1; 
//		// nextInt(2)
//		// 0 , 1 2개의 숫자중에 랜던값
//		int 숫자2 = 랜덤도구.nextInt(3);		
//		System.out.println("랜덤 값: " +  숫자2);
//		
//		// 1~3 사이에 랜덤값 뽑고 싶다!
//		// nextInt(개수) + 시작수;
//		int 숫자3 = 랜덤도구.nextInt(3) +1;		
//		System.out.println("랜덤 값: " +  숫자3);
//		
//		// 1~45사이에 랜덤값 하나 뽑고싶다
//		int 숫자4 = 랜덤도구.nextInt(45) +1;		
//		System.out.println("랜덤 값: " +  숫자4);
		
		// 1~45사이에 랜덤값 뽑는데 6개! 뽑고싶다.
		
		int count = 1;
		
		while(count <= 6) {
			int 로또 = 랜덤도구.nextInt(45) +1;
			System.out.println(로또);
			
			// 혹시 중복적인 값이 나오면 어떻게 처리
			// 고민!
			
			count +=1;
		}
		
		String[] 운세들 = {
			"오! 오늘 횡재한다!!",
			"로또에 당첨된다!",
			"집에 가다 빗물 맞는다!",
			"앗! 지갑 잃어버린다!",
			"버스를 놓칠 수있다",
			"모든일이 술술 풀린다",
			"오늘 귀인 만난다"			
		};
		// 배열은 항상 공간의 번호!
		// 운세들.length 배열의 사이즈(데이터 개수)
		int 랜덤번호 = 랜덤도구.nextInt(운세들.length);
		
		System.out.println("오늘의 운세는!!!");
		System.out.println(운세들[랜덤번호]);
		
		
		
		
		
		
//		int 로또1 = 랜덤도구.nextInt(45) +1		
//		int 로또2 = 랜덤도구.nextInt(45) +1;		
//		int 로또3 = 랜덤도구.nextInt(45) +1;		
//		int 로또4 = 랜덤도구.nextInt(45) +1;		
//		int 로또5 = 랜덤도구.nextInt(45) +1;		
//		int 로또6 = 랜덤도구.nextInt(45) +1;		
		
		
	}
}
