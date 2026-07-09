
// 네이버 홈페이지에 들어갔다.
// 로그인한 정보를 여러 페이지에서 공유해서 사용해야된다.
// static 키워드를 붙이면 id변수가 여러 함수에서 사용할 수있다!
public class Naver {
	
	static String id = "qwer";
	
	public static void mail() {
		System.out.println("mail 현재 아이디:" + id);
	}
	public static void news() {
		System.out.println("news 현재 아이디:" + id);		
	}
	
	public static void shopping() {
		System.out.println("shopping 현재 아이디:" + id);	
	}
	
	public static void blog() {
		System.out.println("blog 현재 아이디:" + id);	
	}

	public static void main(String[] args) {
		System.out.println("현재 아이디:" + id +"환영합니다.");
		mail();
		news();
		shopping();
		blog();
		
	}

}
