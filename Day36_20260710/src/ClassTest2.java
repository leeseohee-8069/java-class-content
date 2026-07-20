import java.awt.Image;
import java.sql.Date;

class 내가원하는타입{
	int a;
	double b;
	String c;
	char d;
}

// 상품의 정보를 하나로 묶었다.
//  다른 타입들끼리 변수를 묶었다.
class 상품{
	
	String 이름;
	int 가격;
	int 재고;	
}

class 게임캐릭터{
	String 이름;
	int 체력;
	int 공격력;	
}
class 주민등록증{
	String 이름;
	String 주민번호;
	Date 발급일자;
	Image 이미지;
	String 발급기관;
}

// 게시판에 들어가는 한 개의 정보를 묶는다.
// 각각 다른 타입의 변수들을 묶는 기능! class 
// 값들의 묶음인데 그 묶음의 대표이름이 필요하다!  게시판정보
// 이름이 들어간다. 
class 게시판정보{
	String 제목;
	String 내용;
	int 조회수;
	String 글쓴이;
}

public class ClassTest2 {

	public static void main(String[] args) {
		// 여러개의 데이터를 저장할 때 사용
		// 배열 
		// 배열의 단점은 같은 타입만 저장 가능하다. 
		int[] 배열1 = {10,20,30};
		double[] 배열2 = {1.1,2.2,3.3};
		
		String[] 상품명 = {"사과", "바나나", "포도"};
		int[] 가격 =      {1000, 2000, 3000};
		int[] 재고 =      {10, 5, 20};
		
		// 게임 캐릭터 
		String[] 이름 = {"전사", "궁수", "마법사"};
		int[] 체력 = {500, 300, 200};
		int[] 공격력 = {80, 60, 100};
		
		// 나는 각각 다른타입들도 여러개 저장하고 싶다.
		// 클래스는 다르다!
		
		// 주민등록증 발급하는 프로그램을 만든다.
	
	}
}
