package com.yonsai.project.domain;

// 클라이언트가 모든 상품에 공통으로 필요한 정보!
public class Crop {
	String name;   //품목명
	int stock;     //재고 수량 
	
	// 새로운 농작물을 등록할 때 필요하다
	// 프론트에서 입력받아서 자바에서 메모리 확보해서 저장해야되니
	// 생성자가 필요하다 
	public Crop(String name, int stock) {
		
		this.name = name;
		this.stock = stock;
	}
	// 다른 폴더에서 name 값을 이용해서 비교할 수있기 때문에
	public String getName() {
		return name;
	}
	
	
	// 농작물 잘 저장됬는지 화면에 보여야된다.
	// 직원들이 재고가 있는지 없는지 파악 
	// 화면에 보여준다. 
	public void showCrop() {
		 System.out.println("품목명:" + name);
	     System.out.println("재고수량:" + stock + "개");
	     System.out.println();
	}	
}
