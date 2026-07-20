package com.yonsei.project.domain;

// 책 한권에 대한 정보를 한꺼번에 묶었다.

public class Book {
	String title;      //도서명
	String author;     //저자명
	String publisher;  //출판사명
	
	public Book(String title, String author, String publisher) {
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	// 책의 정보를 출력하는 함수
	public void showBook() {
		System.out.println("책이름:"+ title);
		System.out.println("저자:" + author);
		System.out.println("출판사:" + publisher);
		System.out.println();
	}
	// 나..책의 이름좀 가져갈께...나한테 보내줄래?
	public String getTitle() {
		return title;
	}

}

/*
1) Book에 showBook() 하나 만듦 (책이름/저자/출판사)
        ↓
2) AniBook, CookBook은 Book을 상속받았지만, 각자 "추가로 보여줄 정보"가 있음
   (AniBook: 연령가 / CookBook: 쿠폰유무)
        ↓
3) 그래서 각자 showBook()을 오버라이딩
        ↓
4) 부모 공통 부분은 재사용 + 자기만의 내용만 추가
        ↓
5) selectAll()에서는 b.showBook() 딱 한 줄만 호출
   → 실제 객체가 뭐냐에 따라 자동으로 다른 결과 출력 (다형성 + 오버라이딩)
*/







