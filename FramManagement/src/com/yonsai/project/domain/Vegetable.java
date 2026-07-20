package com.yonsai.project.domain;

// 채소도 농작물이다!
public class Vegetable  extends Crop {
	
	// 야채들은 재배 방식
	//  농작물의 유기농/일반인지가 중요예요!
	String cultivationType;
	
	public Vegetable(String name, int stock,String cultivationType) {
		super(name, stock);
		this.cultivationType = cultivationType;	
	}
	@Override
	public void showCrop() {
		 System.out.println("품목명:" + name);
	     System.out.println("재고수량:" + stock + "개");
	     System.out.println("재배 방식: " + cultivationType);
	     System.out.println();
	}
}
