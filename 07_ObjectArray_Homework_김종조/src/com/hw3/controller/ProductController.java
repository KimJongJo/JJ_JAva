package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro;	// null
	public static int count = 0;	// 현재 추가된 객체 수
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10];
	}
	
	
	
	
	
	public void mainMenu() {
		// 메뉴 출력 --> do~while 문으로 반복 실행 처리함
		int inputNum = 0;
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 삭제");
			System.out.println("4. 제품 수정");
			System.out.println("5. 제품 검색");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			inputNum = sc.nextInt();
			sc.nextLine();
			
			switch(inputNum) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 3 : productDelete(); break;
			case 4 : productUpdate(); break;
			case 5 : searchProduct(); break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}while(inputNum != 0);
	}
	
	// 도서 등록
	public void productInput() {
		// 키보드로 도서 정보를 입력 받아 객체 생성
		// -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
		// 현재 카운트 인덱스에 생성한 주소 저장
		
		System.out.print("등록할 제품 번호 : ");
		int pld = sc.nextInt();
		
		System.out.print("등록할 제품명 : ");
		String name = sc.next();
		
		System.out.print("등록할 제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("등록할 제품 세금 : ");
		double tax = sc.nextDouble();
		
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				pro[i] = new Product(pld, name, price, tax);
				count++;
				return;
			}
		}
		
		
		System.out.println("제품 용량이 가득 찼습니다.");
		
		
		
	}
	
	// 등록된 전체 도서 출력
	public void productPrint() {
		System.out.println("\n==================== 등록된 도서 정보 ====================\n");
		// 현재까지 기록된 도서 정보 모두 출력
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				continue;
			}
			System.out.printf("%d - %s  %d원\n\n", pro[i].getPld(), pro[i].getpName(),
					(int)(pro[i].getPrice() + pro[i].getPrice() * pro[i].getTax()));
		}
	}
	// 추가적으로 제품 삭제, 수정, 검색 등등의 메소드 응용 추가	
	
	// 도서 삭제
	public void productDelete() {
		System.out.print("삭제할 도서 명 : ");
		String name = sc.next();
		
		for(int i = 0 ; i < pro.length; i++) {
			if(pro[i] == null) {
				continue;
			}
			if(pro[i].getpName().equals(name)) {
				pro[i] = null;
				count--;
				break;
			}
		}
		
		System.out.println("삭제되었습니다.");
		
	}
	
	// 도서 수정
	public void productUpdate() {
		System.out.println("수정하고 싶은 도서명 : ");
		String name = sc.next();
		
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				continue;
			}
			if(pro[i].getpName().equals(name)) {
				System.out.print("제품 번호 : ");
				int pld = sc.nextInt();
				System.out.print("제품 명 : ");
				String pname = sc.next();
				System.out.print("제품 가격 : ");
				int price = sc.nextInt();
				System.out.print("제품 세금 : ");
				double tax = sc.nextDouble();
				
				pro[i].setPld(pld);
				pro[i].setpName(pname);
				pro[i].setPrice(price);
				pro[i].setTax(tax);
				
				System.out.println("수정되었습니다.");
				break;
			}
		}
		System.out.println("존재하지 않는 도서명입니다.");
	}
	
	// 도서 검색
	public void searchProduct() {
		System.out.println("검색하시고 싶은 도서명 입력 : ");
		String input = sc.next();
		
		System.out.println("검색한 도서 목록");

		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				continue;
			}
			if(input.equals(pro[i].getpName())) {
				System.out.printf("%d - %s  %d원\n\n", pro[i].getPld(), pro[i].getpName(),
						(int)(pro[i].getPrice() + pro[i].getPrice() * pro[i].getTax()));
			}
		}

	}
	

}
