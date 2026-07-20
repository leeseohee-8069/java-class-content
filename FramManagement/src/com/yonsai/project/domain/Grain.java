package com.yonsai.project.domain;

// 곡물은 농작물이다!
public class Grain extends Crop{

	// 도정상태 
	String millingType;
	
	public Grain(String name, int stock,String millingType) {
		super(name, stock);
		this.millingType = millingType;
	}
	@Override
	public void showCrop() {
		 System.out.println("품목명:" + name);
	     System.out.println("재고수량:" + stock + "개");
	     System.out.println("도정 상태: "+ millingType);
	     System.out.println();
	}	
}
