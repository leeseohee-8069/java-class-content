import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// 배열의 단점 
		//  - 처음 한번 만들면 추가도 안되고 삭제도 안된다.
		// ArrayList 
		//  - 실제로는 데이터가 몇개가 들어올 지 모른다.
		//  - 자동으로 늘었다가 줄었다가 할 수있는 타입 
		//    어떤 타입을 저장할지 <타입> 기호안에 작성한다 
		// 실무에서 ArrayList 진짜 많이 씀
		// 1. add()
		ArrayList<String> 이름리스트 = new ArrayList<>();
		
		// 2. size()
		int size = 이름리스트.size();
		System.out.println(size);
		
		// 3. 추가 
		이름리스트.add("에리나");
		
		System.out.println(이름리스트);
		System.out.println(이름리스트.size());
		
		이름리스트.add("민수");
		이름리스트.add("철수");
		이름리스트.add("영수");
		이름리스트.add("지민");
		System.out.println(이름리스트);
		
		// 알렉스
		// 끼워넣을 때는 공간의 번호 
		// add(공간번호,값)
		이름리스트.add(1,"알렉스");
		System.out.println(이름리스트);
		
		// 4. 하나의 값만 가져오기 
		//    get(공간번호)
		// 유동적으로 늘어나고 삭제되는 ArrayList
		// 는 값을 꺼내는 방식이 [공간번호] X
		// get() 꺼낼 수밖에 없다!
		// 각각의 공간에 접근 할 때는 get밖에 없다
		String 이름 = 이름리스트.get(0);
		System.out.println(이름);
		
		// 5. 민수를 삭제 
		//  remove(값)
		//   첫번째 값이 들어오면 ArrayList에서 값을 찾아서 지운다.
		//   두번째 숫자가 들어오면 공간번호를 찾아서 지운다.
		//  자체적으로 생각해서 삭제한다.
		이름리스트.remove("민수");
		System.out.println(이름리스트);
		
		이름리스트.remove(0);
		System.out.println(이름리스트);
		
		// 배열을 자동으로 삭제도 하고 추가도하고
		// 끼워넣기도 모든게 자동이다!
		// ArrayList!
		
		
	}
}
