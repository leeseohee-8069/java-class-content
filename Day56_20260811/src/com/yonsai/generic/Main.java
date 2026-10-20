package com.yonsai.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

// 쇼핑몰 
// 회원 저장 기능,상품 저장 기능,주문 저장 기능
// 제네릭을 직접 만들어서 사용할 수있다.
// 코드를 작성할 때 타입이 중요하게 작용!
// <>

public class Main {
	
	public static void main(String[] args) {
		
		// ArrayList  여러개 데이터를 저장할 수있다.
		//            중복되는 데이터도 저장이 가능하다. 순서대로!
		// 문자 여러개를 저장한다.
		// 다른 타입을 절 때!!!! 못들어온다.
		ArrayList<String> test = new ArrayList<>();
		
		test.add("에리나");
		test.add("에리나");
		test.add("이서희");
		
		System.out.println(test);
				
		// Set      여러개 데이터는 저장할 수있다.
		//          중복허용을 안한다. 
		// 문자 여러개를 저장한다.
		// 중복되는 문자는 저장하지 않는다.
		// 순서가 없다!
		HashSet<String> test2 = new HashSet<>();
		
		test2.add("에리나");
		test2.add("에리나");
		test2.add("이서희");
		
		System.out.println(test2);
		// 실무에서 사용하는 방법 
		// 오늘 내 쇼핑몰에 어떤 유저들이 들어왔는지확인
		// user01 -> 10번
		// 로또!  - Set은 수학에서 집합과 같다! 
		// 순서가 보장되지 않는다!
		
		// Map      여러개 데이터를 저장할 수있다.
		//          key 와 value을 이용해서 저장 , 순서는 X
		
		// 카카오톡 프로필,연락처 즉!
		// 이름표(key)만으로 값을 찾는다. 
		
		// 문자 타입과 문자타입으로만 데이터 저장 가능하다!
		HashMap<String, String> 카카오프로필들 = new HashMap<>();
		
		카카오프로필들.put("user01","오늘도 좋은 하루!");
		카카오프로필들.put("user02","회의중입니다!!");
		카카오프로필들.put("user03","여행중~! 7~10");
		카카오프로필들.put("user03","여행중~! 7~10");
		// 전체 출력
		System.out.println(카카오프로필들);
		
		//  실무는 위에 여러개를 섞어서 사용한다.!
		//  유동적으로 늘었다 줄었다 배열들의 종류가 많다!
		//	List<Map<K, V>>
		//  API응답에서 굉장히 자주 사용되는 문법이다!
		
		// 제네릭 단점!
		//  - 기본 타입들은 쓸 수없다! int double char boolean
		//  - int --> Integer
		
		ArrayList<Integer> 숫자들 = new ArrayList<>();
		
		숫자들.add(10);
		숫자들.add(20);
		숫자들.add(30);
		숫자들.add(4);
		
		System.out.println(숫자들);
	}
}




