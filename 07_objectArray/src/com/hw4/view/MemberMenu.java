package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	
	// 반복문을 이용하여 메인메뉴를 반복적으로 실행(각 메뉴 별 서브메뉴 호출)
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
	
	// 메인메뉴에서 1번 선택시 실행되는 메소드이며 등록할 회원에 대한 정보를 입력 받고
	// 동일한 아이디가 없는 경우 MemberController의 inserMember 메소드 실행
	public void insertMember() {
		
		if( MemberController.SIZE < mc.getMemberCount() ) {
			return;
		}

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
	
	
	// 메인 메뉴에서 2번 선택시 실행되는 서브메뉴 -> 반복실행
	// 각 서브메뉴에 해당하는 검색 내용을 입력 받고 MemberController의 searchMember 메소드 실행
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
			
			Member m = (mc.searchMember(menu, search));
			
			if(m != null) {
				System.out.printf(m.information());
			}
			else {
				System.out.println("검색된 결과가 없습니다.");
			}
			

		}while(menu != 9);
		
	}
	
	
	// 메인 메뉴에서 3번 선택시 실행되는 서브메뉴 -> 반복실행
	// 각 서브메뉴에 해당하는 수정할 내용을 입력받고 MemberController의 updateMember 메소드 실행
	public void updateMember() {
		int menu = 9;
		String search = "";
		
		do {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			if(menu == 9) {
				return;
			}
			
			System.out.print("변경할 회원 아이디 : ");
			search = sc.next();
			
			Member m = (mc.checkId(search));
			
			if(m != null) {
				System.out.printf(m.information());
				
				System.out.print("변경할 내용 : ");
				String update = sc.next();
				
				mc.updateMember(m, menu, update);
			}
			else {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			}
			

		}while(menu != 9);
		
		
	}
	
	
	// 메인 메뉴에서 4번 선택시 실행되는 메소드이며 삭제할 회원 아이디를 입력받고 MemberController의
	// deleteMember 메서드 실행
	public void deleteMember() {
		
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.next();
		
		Member m = mc.checkId(userId);
		
		if(m != null) {
			System.out.println(m.information());
			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			char answer = sc.next().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
				mc.deleteMember(userId);
			}
			
			
		}else {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}
		
	}
	
	
	// 메인 메뉴에서 5번 선택시 실행되는 메소드이며 MemberController의
	// getMem 메소드 실행의 결과 값을 반복문을 통해 출력
	public void printAllMember() {
		
		Member[] mem = mc.getMem();
		
		System.out.println("====== 전체 회원 정보 ======");
		
		for(int i = 0; i < mem.length; i++) {
			if(mem[i] == null) {
				return;
			}
			System.out.println(mem[i].information());
		}
		
	}
	
	
	// 메인 메뉴에서 6번 선택시 실행되는 서브메뉴 -> 반복실행
	// 각 서브메뉴에 해당하는 MemberController의 정렬 메소드들을
	// 실행함으로써 그 결과 값으로 반복문을 통해 출력
	public void sortMember() {
		
		Member[] sortMem = null;
		
		int menu = 9;
		
		do {
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬하기");
			System.out.println("2. 아이디 내림차순 정렬하기");
			System.out.println("3. 나이 오름차순 정렬하기");
			System.out.println("4. 나이 내림차순 정렬하기");
			System.out.println("5. 성별 내림차순 정렬하기(남여순)");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			if(menu == 9) {
				return;
			}
			
			switch(menu){
			case 1 : sortMem = mc.sortIdAsc(); break;
			case 2 : sortMem = mc.sortIdDesc(); break;
			case 3 : sortMem = mc.sortAgeAsc(); break;
			case 4 : sortMem = mc.sortAgeDesc(); break;
			case 5 : sortMem = mc.sortGenderDesc(); break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");;
			}
			
			for(int i = 0; i < sortMem.length; i++) {
				if(sortMem[i] == null) {
					return;
				}
				System.out.println(sortMem[i].information());
			}
			

		}while(menu != 9);
		
	}
}
