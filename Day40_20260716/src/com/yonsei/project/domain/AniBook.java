package com.yonsei.project.domain;

// 만화책 한 권의 정보를 한꺼번에 묶었다!
// 만화책은 책이다!
public class AniBook extends Book {
	// AniBook에 추가한 변수!
	int accessAge;

	// Book이라는 부모클래스가 매개변수를 받는 생성자를 만들었다.
	// 그러니 자식 너도 만들어라! 그래서 나한테 전달해라!
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		// 새로운 추가한 변수
		this.accessAge = accessAge;

	}
	// 부모한테 다운로드 받아서 가져왔는데 이 내용 수정할꺼야
	// 왜? 나한테는 연령도 출력!
	// 메서드 오버라이딩! - 덮어쓰기!
	@Override
	public void showBook() {
		System.out.println("책이름:"+ title);
		System.out.println("저자:" + author);
		System.out.println("출판사:" + publisher);
		System.out.println("연령가:" + accessAge);
		System.out.println();
	}
	
}
