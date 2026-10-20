package com.yonsai.generic;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// 회원 정보를 저장하는 클래스(한명)
class Member{
	String name;
	int age;
}
// 상품 하나의 정보를 저장하는 클래스!
class Product{
	String name;
	int price;
}

public class GenericTest {
	
	
	public void 제네릭문법() {
		//회원 여러명을 저장할거야!
		// Member 클래스 타입만 회원들 배열에 저장할 수있다.
		ArrayList<Member> 회원들 = new ArrayList<>();
	
		// 상품들을 저장해야되는데 Member?
		// Product 클래스만 들어와야되!
		// 타입도 미리 검사해서 안정성 올리지
		// 꺼내올때도 타입 알아서 변경해주지
		// 너무 좋은 제네릭!
		ArrayList<Product> 상품들 = new ArrayList<>();
		
		상품들.add(new Product());
		
		for(Product 한개: 상품들) {
			System.out.println(한개);
		}
	}
	
	
	
	public void 제네릭을사용하는이유() {
		
		// 인터페이스 규칙을 일일하나씩 만들면 힘들다.
		// 그래서 자바가 미리 만들어놓은 규칙!
		// 컬렉션
		
		// 여러 데이터를 저장하는 자바의 규칙
		// 어떤 데이터든 다 저장해줄께! 
		// 모든 데이터를 담을 수있는 Object 클래스!
		// 배열과 비슷하지만 배열은 공간 추가,삭제가 안됬다
		// ArrayList 공간을 추가,삭제 가능하다!
		
		
		ArrayList 이름들 = new ArrayList();
		
		이름들.add("김나나");
		이름들.add("하하");
		이름들.add(100);
		이름들.add(true);
		
		System.out.println(이름들);
		
		// 첫번째 문제점 
		// 이름들만 들어와야되는데 모든 데이터 다 들어온다.
		// 버그 발생
		
		// 두번째 문제점
		// 데이터들을 꺼낼때 꺼내고 싶은 타입을 
		// 변수명 앞에 지정 (꺼내고싶은타입)
		String 첫번째이름 = (String)이름들.get(0);
		
		// 세번째문제점 
		//  데이터를 꺼내오다가 잘못된 타입으로 변환해서 출력!
		//  일일이 꺼내는 타입을 지정을 하다보면 버그!
		//  100 -> "100"
		//String 세번째이름 = (String)이름들.get(2);
		
		// 그래서! 위에 문제점들을 해결하기 위해서 
		// 제네릭이 나왔다.
		//  - 잘못된 타입이 들어오는 것을 막는다!
		
		
		// <타입> 이름들2변수는 무조건 문자만 저장 가능해!
		//   잘못된 타입을 막는 효과!
		ArrayList<String> 이름들2 = new ArrayList();
		
		이름들2.add("김나나");
		이름들2.add("하하");
//		이름들2.add(100);  에러발생
//		이름들2.add(true); 에러발생
		
		// 컴파일 전에 문제가 생기는 곳을 확인 할 수도있다.
		// 형태를 자동으로 변경해서 내가 따로 형변환을 할 필요 없다!
		
		// 사용할 데이터 타입을 미리 정해서 , 안전하게 저장하고
		// 꺼내자! - 제네릭!<>
		
		String 두번째이름 = 이름들2.get(1);
		System.out.println(두번째이름);
		
	}
}
