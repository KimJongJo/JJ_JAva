package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	private MemberController mc;
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int inputNum = 0;
		
		do {
			System.out.println("======= 회원 관리 메뉴 =======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			
			inputNum = sc.nextInt();
			
			switch(inputNum){
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
			case 6 : sortMember(); break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");;
			}
			
		}while(inputNum != 0);
		
	}
	
	public void insertMember() {
		
//		if( MemberController.SIZE < mc.getMemberCount() ) {
//			return;
//		}
		
		
		
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		if(mc.checkId(memberId) != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패!");
			return;
		}
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		System.out.print("이름 입력 : ");
		String memberName = sc.next();
		
		System.out.print("나이 입력 : ");
		int memberAge = sc.nextInt();
		
		System.out.print("성별 입력 : ");
		char memberGender = sc.next().charAt(0);
		
		System.out.print("이메일 입력 : ");
		String memberEmail = sc.next();
		
		mc.insertMember(new Member(memberId, memberPw, memberName, memberAge, memberGender, memberEmail)); 
		
		System.out.println("성공적으로 회원 등록이 되었습니다.");
		
		MemberController.SIZE++;
		
	}
	
	
	public void searchMember() {
	
		int menu = 9;
		String search = "";
		
		do {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			if(menu == 9) {
				return;
			}
			
			System.out.print("검색 내용 : ");
			search = sc.next();
			
			mc.searchMember(menu, search);

		}while(menu != 9);
		
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
		
	}
}
