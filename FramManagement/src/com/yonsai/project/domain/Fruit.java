package com.yonsai.project.domain;

// 과일 사과,바나나,포도,딸기... 
// 과일의 정보를 하나로 묶었다.
// 과일은 농작물 이다!
public class Fruit extends Crop {
	//과일 당도
	int sweetness;

	// 부모의 모든 내용을 다로드 했기때문에 자식클래스가 
	// 새로운 변수를 만들때 한꺼번에 저장한다.
	public Fruit(String name, int stock,int sweetness) {
		super(name, stock);
		this.sweetness = sweetness;
		
	}
	@Override 
	public void showCrop() {
		 System.out.println("품목명:" + name);
	     System.out.println("재고수량:" + stock + "개");
	     System.out.println("당도 : " + sweetness + "brix");
	     System.out.println();
	}	
}
