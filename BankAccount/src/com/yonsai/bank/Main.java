package com.yonsai.bank;

import com.yonsai.bank.account.신한은행;
import com.yonsai.bank.customer.고객;

public class Main {

	public static void main(String[] args) {
		// Main자바파일이 account도 관리하고 
		// customer도 관리한다. 
		// Main 여러개를 만들면 시작점이 여러다!
		// 실무에서는 Main파일을 하나만 만들고 다른 자바파일들
		// main에서 불러서 사용한다. 
		// public으로 만든 파일들을 객체 생성해서 사용한다.
		
		신한은행 연수지점 = new 신한은행();
		
		// 연수지점에 고객이 들어간다. 느낌!
		고객 첫번째고객 = new 고객();
		
		// 하나의 클래스에서 하나의 시작점(출발점) 진입점  나머지 파일들을
		// 메인에서 생성해서 다른 폴더 안에 클래스와 연결해서 사용한다.
		// 실무에서 말하는 은행계좌관리 , 고객정보관리 각각 클래스는 자기역할
		// 만 책임진다. 관심사의 분리 
		// 각각 역할을 나눠어서 관리하자!
		//  - 자신의 역할만 담당하므로 수정하고 추가하고 삭제 하기가 쉽다
		
		
		
		
	}
}
