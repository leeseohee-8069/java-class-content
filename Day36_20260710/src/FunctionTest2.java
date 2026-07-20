
public class FunctionTest2 {
	
	
	public static String 세탁기(String 빨랫감,String 비누,String 세탁망) {
		System.out.println("물을 받는다");
		System.out.println(빨랫감 + "세탁한다");
		System.out.println("행군다");
		System.out.println("탈수한다.");
		System.out.println("벨을 울린다! 빨래완료!");
		
		return 빨랫감+"꺼내라";
	}
	public static String 건조기(String 빨개가된깨끗한옷들) {
		return "건조된 옷들";
	}
	
	public static void 볶아주는기계(String 재료) {
		System.out.println("오른쪽으로 돌리면 볶아준다");
		System.out.println("10분동 지속해");
		System.out.println("벨을 알려달라!");
	}

	public static void 전자레인지(String 음식,int 시간) {
		System.out.println(시간 +"분 돌린다");
		System.out.println("띵!");
	}
	
	public static void 로봇청소기() {
		// 나 대신 청소를 한다. 버튼만 누르면 된다. 
		System.out.println("바닥 닦기");
		System.out.println("먼저 모으기");
		System.out.println("충천기로 돌아간다");
	}
	
	public static void main(String[] args) {
		// 함수 Function 
		//  = 나 대신 일해주는 상자!기계!
		// 내가 청소를 해야되는데 귀차나요!
		//     빨래도,요리(삼겹살)
		// 함수는 내가 직접 하지 않아도 나 대신 정해진 일을
		// 해주는 직원이나 기계다! 그 직원이 일을 하려면
		// 재료가 준비물이 필요하다 그게 매개변수 , 파라미터!
		//세탁기(); -> 건조대에 넌다!(말린다) -> 옷장
	}
}
