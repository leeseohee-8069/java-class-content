package com.yonsei.project.domain;

// project.domain 폴더 안에 있는 타입
// 데이저 저장(변수)


// 데이터들이 책장에 정리되어있으면 내 책이 혹은 내가 원하는 
// 책이 어디있는지 알아야된다.
// 서비스(도우미) 이거 어딨어요? -> 검색 ->2층 F열 2번에 있습니다.


// 요리책 한권의 정보를 한꺼번에 묶었다.
// 요리책도 책이다!
// boolean coupon 체크박스로 고객한테 책을 등록하는 직원한테
// 입력 받아서 가져온다. 
public class CookBook extends Book{
	
	boolean coupon;   // 요리쿠폰 유무!
	
	public CookBook(String title, String author
								, String publisher
								, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
				
	}
	// 부모가 다운로드 해준 showBook() 나랑 다르다!
	// 그러기 떄문에 부모의내용을 수정하겠다 덮어쓰겠따!
	// 내껄로!
	@Override
	public void showBook() {
		System.out.println("책이름:"+ title);
		System.out.println("저자:" + author);
		System.out.println("출판사:" + publisher);
		System.out.println(coupon ? "쿠폰있음": "쿠폰없음");
		System.out.println();
	}	
}
