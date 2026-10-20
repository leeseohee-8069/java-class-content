// service폴더 안은 사용자를 위해 어떤 기능을 제공하는 업무
// 실제 고객 대신 일을 해주는 기능들을 모아놓은 폴더명
// service한다 (비즈니스 로직 처리담당)
package com.yonsai.project.service;

import java.util.HashMap;

public class MapTest {

	// service폴더가 나온 이유?
	// - 각자 나눠서 자기 일만 하자!
	// - 코드를 이용해서 처리하는 기능(계산,판단,저장)
	//   생각하고 처리한다!

	// 사용자 대신에 일을 해주는 기능 service라는 이름이 붙었다.
	// Login.java 화면? 아니면 아이디와 비밀번호? 맞는지 틀린지판단?
	// 단순파일명만 쓰면 구분이 안된다. 
	// LoginService 암묵적으로 붙인다. 
	
	// 자바스크립트에서 객체(Object 타입)인 
	// let obj = {key:value}
	// 자바에서도 똑같이 Map
	
	public void mapEx() {
		System.out.println("map대해서 알아보기!");
		
		// 자바에서 가장 많이 쓰고 있는 key,value저장방법
		// key의 타입 , value 저장할 타입을 미리
		// 지정을해야된다. 
		// Hash - 매우 빠르게 찾는 방법
		// HashMap = 데이터를 key를 이용해서 빠르게 찾는공간
		HashMap<String,Integer> 예제1 = new HashMap<>();
		
		// 저장
		//  사물함 번호 
		//  저장한 순서랑 출력되는 순서가 다르다!
		//  랜덤으로 저장된다. (순서가 없는 타입)
	
		// 배열은 저장하는 공간의 번호 숫자!(순서대로)
		// map 내가 맘대로 공간의 이름을 이용해서 저장
		//  순서대로 필요없다!
		// map 자기만의 방식으로 key 를 보고 저장해서
		// 자기만의 방식으로 빠르게 찾는다.
		예제1.put("영희", 101);
		예제1.put("철수", 103);
		예제1.put("민수", 102);
		
		System.out.println(예제1);
		
		//이름표(Key)으로 아주 빠르게 값을 찾고 저장하는 상자
		// 순서가 없다!
		HashMap<String,String> 예제2 = new HashMap<>();
		
		예제2.put("moiveNm", "소나기");
		예제2.put("typeNm","장편");
		
		System.out.println(예제2);
		
		// 편의점 상품 
		// 이름,가격
		HashMap<String,Integer> 상품목록 = new HashMap<>();
		
		상품목록.put("콜라", 2000);
		상품목록.put("라면", 1200);
		상품목록.put("삼각김밥", 1500);
		
		System.out.println(상품목록);
		
		// 로그인 
		HashMap<String,String> 로그인정보 = new HashMap<>();
		
		로그인정보.put("admin", "admin1234!");
		로그인정보.put("kim", "kim1234!");
		로그인정보.put("seo", "seo1234!");
		로그인정보.put("hong", "hong1234!");
		
		// 비밀번호는 입력받으면 암호화(BCrypt)
		
		System.out.println(로그인정보);
		
		// 가져올때 ,얻다,받다 get(가져와)
		HashMap<String,String> 냉장고 = new HashMap<>();
		
		// 냉장고에 음식을 넣다! put
		냉장고.put("멸치볶음", "엄마가 만든 멸치볶음");
		냉장고.put("손질한야채", "손질한 감자, 양파");
		냉장고.put("다진마늘", "손질한 다진 마늘들");
		
		// 냉장고에서 음식 꺼내기 
		// 다진마늘 꺼내와! 
		System.out.println(냉장고.get("다진마늘"));
		
		// 멸치볶음 꺼내와!
		System.out.println(냉장고.get("멸치볶음"));
	
		// 사이즈
		System.out.println(냉장고.size());
		
		// 버그 유발을 최소로 낮추기 위해서 사용하는 
		// 함수! 
		// 혹시 해당 key가 있는지 먼저 확인
		//  냉장고에 콜라 key가 있니?
		//  있으면 true, 없으면 false
		boolean 키결과 = 냉장고.containsKey("콜라");
		System.out.println(키결과);
		
		// 삭제
		냉장고.remove("멸치볶음");
		System.out.println(냉장고);
		
		// 실무에서는 조금 쓰는게 더 있다.
		//  getOrDefault(key,기본값설정)
		//  putIfAbsent() 중복 방지하며 초기값 설정
		
		
	}
	// 아이디 중복확인
	public void 아이디중복확인() {
		
		HashMap<String, String> 가입된회원 = new HashMap<>();
		가입된회원.put("hong123", "홍길동");
		가입된회원.put("kim456", "김철수");
		가입된회원.put("lee789", "이영희");
		
		// 1. 이미 가입된 아이디 확인
		//    프론트에서 아이디를 입력받았다! 전제!
		
		String 아이디1 = "hong1234";
		
		if(가입된회원.containsKey(아이디1)) {
			System.out.println("이미 가입된 아이디 입니다.");
		}else {
			System.out.println("가입 가능한 아이디 입니다.");
		}		
	}
	
	// 상품 조회하는 예제
	//  - 상품의 할인율 저장해서 실제 가격에서 할인하는 금액을
	//    화면에 보여줘야될 때가 있다.
	
	public void 상품할인률확인() {
		HashMap<String, Object> 상품응답 = new HashMap<>();
		상품응답.put("productId", 1001);
		상품응답.put("productName", "무선 이어폰");
		상품응답.put("price", 89000);
		
		// 할인률이라는 키가 있니?
		boolean 결과 = 상품응답.containsKey("discountRate");
		
		if(결과) {
			System.out.println("할인율은 10%입니다.");
		}else {
			System.out.println("할인을 하지 않는 상품입니다!");
		}
	}
	
	// 회원정보 조회하여 프론트에 응답한다 라고 가정!
	public void 회원정보조회() {
		// 회원정보 
		//  userId , name,age,email
		
		HashMap<String, String> 회원응답 = new HashMap<>();

		회원응답.put("userId", "hong123");
		회원응답.put("name", "홍길동");
		회원응답.put("age", "28");
		회원응답.put("email", "hong@test.com");
		
		
		
		// 1. "phone"이라는 key가 있는지 확인
		//  만약 전화번호가 있다면 전화번호의 값을 출력하고
		//  010-1234-1234
		//  없다면 "전화번호가 등록되어있지 않습니다"
		
		// key가 있다면 value을 phone변수에 저장한다.
		String phone = 회원응답
							.getOrDefault("phone", 
										  "전화번호가 등록되지 않았다.");
		System.out.println(phone);
		// 2. 회원의 정보가 총 몇개 저장되어있는지 출력
		//  회원정보 개수: 4
		
		System.out.println("회원 정보 개수: "+ 회원응답.size());
		
		// 3. email의 값을 출력
		//   email: hong@test.com
		System.out.println(회원응답.get("email"));
		
		// 4. 이름을 삭제 후 전체 출력!
		회원응답.remove("name");
		System.out.println(회원응답);
		
	}
}

/*
 // service폴더 안은 사용자를 위해 어떤 기능을 제공하는 업무
// 실제 고객 대신 일을 해주는 기능들을 모아놓은 폴더명
// service한다 (비즈니스 로직 처리담당)
package com.yonsai.project.service;

import java.util.HashMap;

public class MapTest {

	// service폴더가 나온 이유?
	// - 각자 나눠서 자기 일만 하자!
	// - 코드를 이용해서 처리하는 기능(계산,판단,저장)
	//   생각하고 처리한다!

	// 사용자 대신에 일을 해주는 기능 service라는 이름이 붙었다.
	// Login.java 화면? 아니면 아이디와 비밀번호? 맞는지 틀린지판단?
	// 단순파일명만 쓰면 구분이 안된다. 
	// LoginService 암묵적으로 붙인다. 
	
	// 자바스크립트에서 객체(Object 타입)인 
	// let obj = {key:value}
	// 자바에서도 똑같이 Map
	
	public void mapEx() {
		System.out.println("map대해서 알아보기!");
		
		// 자바에서 가장 많이 쓰고 있는 key,value저장방법
		// key의 타입 , value 저장할 타입을 미리
		// 지정을해야된다. 
		// Hash - 매우 빠르게 찾는 방법
		// HashMap = 데이터를 key를 이용해서 빠르게 찾는공간
		HashMap<String,Integer> 예제1 = new HashMap<>();
		
		// 저장
		//  사물함 번호 
		//  저장한 순서랑 출력되는 순서가 다르다!
		//  랜덤으로 저장된다. (순서가 없는 타입)
	
		// 배열은 저장하는 공간의 번호 숫자!(순서대로)
		// map 내가 맘대로 공간의 이름을 이용해서 저장
		//  순서대로 필요없다!
		// map 자기만의 방식으로 key 를 보고 저장해서
		// 자기만의 방식으로 빠르게 찾는다.
		예제1.put("영희", 101);
		예제1.put("철수", 103);
		예제1.put("민수", 102);
		
		System.out.println(예제1);
		
		//이름표(Key)으로 아주 빠르게 값을 찾고 저장하는 상자
		// 순서가 없다!
		HashMap<String,String> 예제2 = new HashMap<>();
		
		예제2.put("moiveNm", "소나기");
		예제2.put("typeNm","장편");
		
		System.out.println(예제2);
		
		// 편의점 상품 
		// 이름,가격
		HashMap<String,Integer> 상품목록 = new HashMap<>();
		
		상품목록.put("콜라", 2000);
		상품목록.put("라면", 1200);
		상품목록.put("삼각김밥", 1500);
		
		System.out.println(상품목록);
		
		// 로그인 
		HashMap<String,String> 로그인정보 = new HashMap<>();
		
		로그인정보.put("admin", "admin1234!");
		로그인정보.put("kim", "kim1234!");
		로그인정보.put("seo", "seo1234!");
		로그인정보.put("hong", "hong1234!");
		
		// 비밀번호는 입력받으면 암호화(BCrypt)
		
		System.out.println(로그인정보);
		
		// 가져올때 ,얻다,받다 get(가져와)
		HashMap<String,String> 냉장고 = new HashMap<>();
		
		// 냉장고에 음식을 넣다! put
		냉장고.put("멸치볶음", "엄마가 만든 멸치볶음");
		냉장고.put("손질한야채", "손질한 감자, 양파");
		냉장고.put("다진마늘", "손질한 다진 마늘들");
		
		// 냉장고에서 음식 꺼내기 
		// 다진마늘 꺼내와! 
		System.out.println(냉장고.get("다진마늘"));
		
		// 멸치볶음 꺼내와!
		System.out.println(냉장고.get("멸치볶음"));
	
		// 사이즈
		System.out.println(냉장고.size());
		
		// 버그 유발을 최소로 낮추기 위해서 사용하는 
		// 함수! 
		// 혹시 해당 key가 있는지 먼저 확인
		//  냉장고에 콜라 key가 있니?
		//  있으면 true, 없으면 false
		boolean 키결과 = 냉장고.containsKey("콜라");
		System.out.println(키결과);
		
		// 삭제
		냉장고.remove("멸치볶음");
		System.out.println(냉장고);
		
		// 실무에서는 조금 쓰는게 더 있다.
		//  getOrDefault(key,기본값설정)
		//  putIfAbsent() 중복 방지하며 초기값 설정
		
		
	}
	// 아이디 중복확인
	public void 아이디중복확인() {
		
		HashMap<String, String> 가입된회원 = new HashMap<>();
		가입된회원.put("hong123", "홍길동");
		가입된회원.put("kim456", "김철수");
		가입된회원.put("lee789", "이영희");
		
		// 1. 이미 가입된 아이디 확인
		//    프론트에서 아이디를 입력받았다! 전제!
		
		String 아이디1 = "hong1234";
		
		if(가입된회원.containsKey(아이디1)) {
			System.out.println("이미 가입된 아이디 입니다.");
		}else {
			System.out.println("가입 가능한 아이디 입니다.");
		}		
	}
	
	// 상품 조회하는 예제
	//  - 상품의 할인율 저장해서 실제 가격에서 할인하는 금액을
	//    화면에 보여줘야될 때가 있다.
	
	public void 상품할인률확인() {
		HashMap<String, Object> 상품응답 = new HashMap<>();
		상품응답.put("productId", 1001);
		상품응답.put("productName", "무선 이어폰");
		상품응답.put("price", 89000);
		
		// 할인률이라는 키가 있니?
		boolean 결과 = 상품응답.containsKey("discountRate");
		
		if(결과) {
			System.out.println("할인율은 10%입니다.");
		}else {
			System.out.println("할인을 하지 않는 상품입니다!");
		}
	}
	
	// 회원정보 조회하여 프론트에 응답한다 라고 가정!
	public void 회원정보조회() {
		// 회원정보 
		//  userId , name,age,email
		
		HashMap<String, String> 회원응답 = new HashMap<>();

		회원응답.put("userId", "hong123");
		회원응답.put("name", "홍길동");
		회원응답.put("age", "28");
		회원응답.put("email", "hong@test.com");
		
		// 1. "phone"이라는 key가 있는지 확인
		//  만약 전화번호가 있다면 전화번호의 값을 출력하고
		//  010-1234-1234
		//  없다면 "전화번호가 등록되어있지 않습니다"
		
		boolean phone있니 = 회원응답.containsKey("phone");
		
		if(phone있니) {
			System.out.println("010-1234-1234");
		}else {
			System.out.println("전화번호가 등록되어있지 않습니다");
		}
		
		// 2. 회원의 정보가 총 몇개 저장되어있는지 출력
		//  회원정보 개수: 4
		
		System.out.println("회원 정보 개수: "+ 회원응답.size());
		
		// 3. email의 값을 출력
		//   email: hong@test.com
		System.out.println(회원응답.get("email"));
		
		// 4. 이름을 삭제 후 전체 출력!
		회원응답.remove("name");
		System.out.println(회원응답);
		
	}
	
	
	
	
	
}

 */




