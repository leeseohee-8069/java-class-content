
class 카카오계좌 {

// 계좌를 만들면 기본적으로 잔액은 0원
	private int 잔액;

// 입금 
	void set입금(int 이체할금액) {
		this.잔액 += 이체할금액;
		System.out.println("현재 잔액:" + this.잔액);
	}

// 출금 
// 숨겨진 변수에서 안전하게 값을 꺼내겠다.
// 내보내기 
	int get출금(int 출금금액) {
		잔액 -= 출금금액;
		return 출금금액;
	}
}

public class PrivateSetterTest {

	public static void main(String[] args) {
// 카카오계좌에 월급받은 금액 이체!

		카카오계좌 서희 = new 카카오계좌();

// 서희가 카카오계좌한테 돈 줄테니 입금해줘!
// 숨겨진 변수에 외부에서 넘어오는 값을 안전하게
// 변경할 수있게 도와주는 방법 
// setter 
		서희.set입금(10000);
		서희.set입금(100000);
		서희.set입금(1000000);

// 나 옷 사야되.. 그래서 결제 금액 200000원
// 그래서 나 출금할래!

//서희가 카카오계좌한테 부탁! 20만원 출금해줄래?
		int 지갑 = 서희.get출금(200000);
		System.out.println("내 지갑: " + 지갑);

	}
}

/*
 * 
 * 스프링에서 보안을 책임지는 시큐리티! class 카카오계좌{
 * 
 * // 계좌를 만들면 기본적으로 잔액은 0원 private int 잔액; private int 비밀번호;
 * 
 * // 입금 void set입금(int 이체할금액) { this.잔액 += 이체할금액; System.out.println("현재 잔액:" +
 * this.잔액); } // 출금 // 숨겨진 변수에서 안전하게 값을 꺼내겠다. // 내보내기 int get출금(int 출금금액 ,int
 * 비밀번호){
 * 
 * boolean 비밀번호결과 = 비밀번호확인(비밀번호);
 * 
 * if(비밀번호결과 == true) { if(this.잔액 < 0) { return 0; }else { return 잔액 -= 출금금액; }
 * }else { // 비밀번호가 안 맞으면 -1 값을 돌려주면 // 값이 없다라는 뜻이나 실무에서는 에러코드들 // 원래 돌려준다. 값이
 * 없다 찾을 수없다라는 // 뜻으로 return -1; } }
 * 
 * // 비밀번호를 확인하는 setter만든다. boolean 비밀번호확인(int 입력한비밀번호) { boolean 결과;
 * 
 * if(this.비밀번호 == 입력한비밀번호) { 결과 = true; }else { 결과 = false; } return 결과; }
 * 
 * }
 * 
 * public class PrivateSetterTest {
 * 
 * public static void main(String[] args) { // 카카오계좌에 월급받은 금액 이체!
 * 
 * 카카오계좌 서희 = new 카카오계좌();
 * 
 * // 서희가 카카오계좌한테 돈 줄테니 입금해줘! // 숨겨진 변수에 외부에서 넘어오는 값을 안전하게 // 변경할 수있게 도와주는 방법 //
 * setter 서희.set입금(10000); 서희.set입금(100000); 서희.set입금(1000000);
 * 
 * // 나 옷 사야되.. 그래서 결제 금액 200000원 // 그래서 나 출금할래!
 * 
 * //서희가 카카오계좌한테 부탁! 20만원 출금해줄래? int 지갑 = 서희.get출금(200000);
 * System.out.println("내 지갑: " + 지갑);
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
