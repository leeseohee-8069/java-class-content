package com.yonsai.project.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.yonsai.project.domain.Crop;
import com.yonsai.project.domain.Fruit;
import com.yonsai.project.domain.Grain;
import com.yonsai.project.domain.Nut;
import com.yonsai.project.domain.Vegetable;

public class FramService {
	// 실제 농작물들을 저장하는 배열
	// 채소,견과류,과일? 모른다.
	ArrayList<Crop> farmList = new ArrayList<>();
	Scanner 키보드 = new Scanner(System.in);

	// FramService 메인에서 딱 한번 객체를 생성할때
	// 기존에 농작물들을 저장하는 생성자
	public FramService() {
		farmList.add(new Fruit("사과", 50, 15));
		farmList.add(new Fruit("바나나", 30, 18));
		farmList.add(new Vegetable("당근", 100, "유기농"));
		farmList.add(new Vegetable("양파", 80, "일반"));
		farmList.add(new Nut("호두", 40, "미국"));
		farmList.add(new Grain("쌀", 200, "백미"));
		farmList.add(new Grain("보리", 150, "현미"));
	}

	// 요구사항 2. 전체 재고 목록 조회
	// farmList 안에 있는 모든 농산물을 화면에 보여주기!
	public void printFarm() {

		System.out.println(); // 공백

		for (Crop f : farmList) {

			f.showCrop();
		}

		System.out.println(); // 공백
	}

	// 요구사항 3. 새 품목 추가
	// 사용자가 종류를 선택하면 그에 맞는 정보를 입력받아서
	// farmList에 새 농산물을 추가하기!
	public void addNewKind() {

		System.out.println("추가할 품목 종류를 선택하세요");
		System.out.println("1.과일  2.채소  3.견과류 4.곡물");

		int type = 키보드.nextInt();
		키보드.nextLine(); // 엔터없애기

		System.out.print("품목명 입력: ");
		String name = 키보드.nextLine();
		System.out.print("재고수량 입력: ");
		int stock = 키보드.nextInt();
		키보드.nextLine(); // 엔터없애기

		if (type == 1) {

			System.out.print("당도입력(Brix) : ");
			int sweetness = 키보드.nextInt();

			farmList.add(new Fruit(name, stock, sweetness));

		} else if (type == 2) {

			System.out.print("Cultivation Type : ");
			String cultivationType = 키보드.nextLine();

			farmList.add(new Vegetable(name, stock, cultivationType));

		} else if (type == 3) {

			System.out.print("Origin : ");
			String origin = 키보드.nextLine();

			farmList.add(new Nut(name, stock, origin));
		} else if (type == 4) {

			System.out.print("도정상태 : ");
			String millingType = 키보드.nextLine();

			farmList.add(new Grain(name, stock, millingType));
		}

		System.out.println(name + " 추가 완료!");
	}

	// 요구사항 5. 재고 수량으로 검색
	// 사용자가,관리자가! 입력한 수량 이상인 품목만 화면에 출력하기!
	public void searchByStock() {

		// 1. 검색어 입력한다.
		System.out.print("재고 수량 파악할 품목 :");
		String 검색할품목명 = 키보드.nextLine(); // "양파","당근"

		// 2. 농작품을 저장하는 리스트(배열)을 하나씩 꺼내서 확인한다.
		// 자동반복 한다.

		// 만약 없는 데이터는 어떻게 처리?
		// 실무에서는 없다는 기준을 전제로!
		boolean 검색한결과 = false;

		for (Crop 농작물하나 : farmList) {

			String 리스트에서꺼낸이름 = 농작물하나.getName();

			// 실무에서는 상품들의 명 다양하게 이루어져있다!
			// 상품명들에 내가 입력한 값이 포함되어있니?
			// contains 문자 안에 포함되어있니?
			// 있으면 true 반환, false 반환
			if (리스트에서꺼낸이름.contains(검색할품목명)) {
				// 배열에서 꺼내온 농작물과 입력한 검색할품목명 변수랑 비교한다.
				농작물하나.showCrop();
				검색한결과 = true;
			}
		}
		// 찾은 거는 showCrop() 화면에 재고 출력된다.
		// 근데 못 찾은것도 화면에 보여줘야된다.
		if (검색한결과 == false) {
			System.out.println("입력한 품목명은 없습니다.");
		}
	}

	// 품목 삭제
	public void removeCrop() {
		// 1. 삭제할 품목명 입력한다.
		System.out.print("삭제할 품목명 입력:");
		// input창에서 입력한다!
		String 삭제할품목명 = 키보드.nextLine();

		// 2. 검색한다.
		// 삭제할 데이터가 있으면 삭제하고!
		// 없으면 "삭제할 품목명이 없습니다"
		boolean 검색한결과 = false;

		for (Crop 농작물하나 : farmList) {
			String 리스트에서꺼낸이름 = 농작물하나.getName();

			if (리스트에서꺼낸이름.contains(삭제할품목명)) {
				// 삭제할 품목명을 찾았다.
				// 이름만 없애는게 아니라! 전체 내용을 싹다! 없애기!
				farmList.remove(농작물하나);
				System.out.println("농작물을 삭제했습니다!");
				검색한결과 = true;
				
				// 삭제는 조금 추가하는 기능있다.
				break;
			}
		}

		// 근데 못 찾은것도 화면에 보여줘야된다.
		if (검색한결과 == false) {
			System.out.println("입력한 품목명은 없습니다.");
		}
	}

}

/*
 * 
 * [1] Main에서 service.searchByStock() 호출 ↓ [2] "재고 수량 파악할 품목" 이름을
 * 키보드.nextLine()으로 입력받음 ↓ [3] 검색한결과 = false 로 초기화 (아직 못 찾음 표시) ↓ [4] for (Crop
 * 농작물하나 : farmList) 로 리스트 순회 시작 ↓ [5] 농작물하나.getName() 으로 그 농작물의 이름을 꺼내옴 ↓ [6]
 * 리스트에서꺼낸이름.contains(검색할품목명) 으로 포함 여부 확인 ↓ ┌─ true → 농작물하나.showCrop() 호출해서 출력,
 * 검색한결과 = true로 변경 └─ false → 아무것도 안 하고 다음 반복으로 건너뜀 ↓ [7] 리스트 끝까지 [5]~[6] 반복 ↓
 * [8] 반복 종료 후, 검색한결과가 여전히 false라면 "입력한 품목명은 없습니다." 출력 ↓ [9] 메서드 종료
 */
