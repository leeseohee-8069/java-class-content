
// 현 상황은 내가 차를 구매하러 간다!
class 그랜저 {
	String color;
	String carName; // 차 이름
	String carOwner; // 차 소유주!
	int money; // 보유 금액
	String model; // 기본 차의 모델
	String carNumber;
}

// 삼성전자 매장,하이마트,백화점 전자기기
class 갤럭시폴드8 {

	String 제조사; // 삼성
	String 모델;   // 갤럭시폴드8 기본형,울트라
	int 가격;      // 가격
	int 저장용량;   // 저장용량 (GB)
	String 색상;   // 색상
	String 소유자; // 주인
}

class 좌표{
	int x;
	int y;	
}

class 고객{
	String 이름;
	int 나이;
	double 키;
}
public class ClassTest2 {
	public static void main(String[] args) {
		
		
		// 에리나가 갤럭시폴드8 결제를 해서 내눈앞에
		// 갤럭시폴드8있어야된다. 
		갤럭시폴드8 에리나폰 = new 갤럭시폴드8();
		에리나폰.제조사 = "삼성";
		에리나폰.가격 = 200;
		에리나폰.소유자="에리나";
		에리나폰.색상 = "코발트블루";

		갤럭시폴드8 황선관폰 = new 갤럭시폴드8();
		황선관폰.제조사 = "삼성";
		황선관폰.가격 = 200;
		황선관폰.소유자="황선관";
		황선관폰.색상 = "검은색!";
		
		// 에리나가 그랜저를 구매했다.
		// new 해서 실제 물건이 내 눈앞에 있는것!
		// 객체!
		그랜저 에리나차 = new 그랜저();
		에리나차.carName = "그랜저 럭셔리2.4";
		에리나차.carOwner = "에리나";
		에리나차.color = "하얀색";
		에리나차.money = 2000;
		에리나차.model = "럭셔리 모델";
		에리나차.carNumber = "123하4567";

		// 황선관도 실제 그랜저를 산다!
		// 각각 자동차가 있어야된다. 각각 객체가
		// 있어야된다.
		// 그거를 우리가 객체!부른다!
		그랜저 황선관 = new 그랜저();
		황선관.carName = "그랜저 기본2.0";
		황선관.carOwner = "황선관";
		황선관.color = "검은색";
		황선관.money = 5000;
		황선관.model = "기본 모델";
		황선관.carNumber = "123사7896";

	
	}
}
