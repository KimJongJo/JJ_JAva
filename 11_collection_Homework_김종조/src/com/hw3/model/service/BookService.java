package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	Scanner sc = new Scanner(System.in);
	private List<Book> books = new ArrayList<Book>();
	private List<Book> like = new ArrayList<Book>();
	
	public BookService() {
		books.add(new Book(1111, "세이노의 가르침", "세이노",6480,"데이원"));
		books.add(new Book(2222, "문과남자의 과학공부", "유시민",15750,"돌베개"));
		books.add(new Book(3333, "역행자", "자청",17550,"웅진지식하우스"));
		books.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르",15120,"열린책들"));
		books.add(new Book(5555, "도둑맞은 집중력", "요한 하리",16920,"어크로스"));
	}
	
	public BookService(int number, String title, String author, int price, String publisher) {
		books.add(new Book(number, title, author, price, publisher)); 
	}
	
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		try {
			do {
				
				System.out.println("=== 도서 목록 프로그램 ===\n");
				System.out.println("1. 도서 등록\n");
				System.out.println("2. 도서 조회\n");
				System.out.println("3. 도서 수정\n");
				System.out.println("4. 도서 삭제\n");
				System.out.println("5. 즐겨찾기 추가\n");
				System.out.println("6. 즐겨찾기 삭제\n");
				System.out.println("7. 즐겨찾기 조회\n");
				System.out.println("8. 추천도서 뽑기\n");
				System.out.println("0. 프로그램 종료\n");
				System.out.print("메뉴를 입력하세요 : ");
				input = sc.nextInt();
				System.out.println("\n");
				
				
				switch(input) {
				case 1 : addBook(); break;
				case 2 : searchBook(); break;
				case 3 : updateBook(); break;
				case 4 : removeBook(); break;
				case 5 : addLike(); break;
				case 6 : removeLike(); break;
				case 7 : searchLike(); break;
				case 8 : randomBook(); break;
				case 0 : System.out.println("프로그램을 종료합니다..."); break;
				default : System.out.println(" 0 ~ 8 번중에 선택해주세요");
				}
			
				
			}while(input != 0);
		}catch(InputMismatchException e) {
			System.out.println("잘못된 입력입니다...");
			displayMenu();
		}
		
		
		
		
	}
	
	
	/**
	 * 도서 등록
	 */
	public void addBook() throws InputMismatchException{
		System.out.println("====== 도서 등록 ======\n");
		
		System.out.print("도서 번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("\n도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("\n도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("\n도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("\n도서 출판사 : ");
		String publisher = sc.nextLine();
		
		books.add(new Book(number, title, author, price, publisher));
		
		System.out.println("\n등록 완료");
		
		
	}
	
	
	/**
	 * 도서 조회
	 */
	public void searchBook(){
		
		for(Book book : books) {
			System.out.println(book.toString() + "\n");
		}
	}
	
	
	/**
	 * 도서 수정
	 */
	public void updateBook() throws InputMismatchException{
		boolean flag = true;
		int index = 0;
		System.out.println("======= 도서 수정 =======\n");
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int number = sc.nextInt();
		
		for(Book book : books) {
			if(book.getNumber() == number) {
				flag = false;
				break;
			}
			index++;
		}
		
		if(flag) {
			System.out.println("\n" + number + "에 해당하는 도서가 존재하지 않습니다.\n");
		}
		else {
			
			int input = 0;
			
			do {
				System.out.println("\n1. 도서명 : ");
				System.out.println("\n2. 도서 저자 : ");
				System.out.println("\n3. 도서 가격 : ");
				System.out.println("\n4. 도서 출판사 : ");
				System.out.println("\n0. 수정종료 : ");
				
				System.out.println("\n어떤 정보를 수정하시겠습니까?");
				input = sc.nextInt();
				sc.nextLine();
				
				switch(input) {
				case 1 : System.out.println("===== 도서 명 수정 =====\n"); 
					System.out.print("수정할 도서 명을 입력하세요 : ");
					String title = sc.nextLine();
					books.get(index).setTitle(title);
					System.out.println("\n수정 완료\n");
				break;
				case 2 : System.out.println("===== 도서 저자 수정 =====\n");
					System.out.print("수정할 도서 저자를 입력하세요 : ");
					String author = sc.nextLine();
					books.get(index).setAuthor(author);
					System.out.println("\n수정 완료\n");
				break;
				case 3 : System.out.println("===== 도서 가격 수정 =====\n");
					System.out.print("수정할 도서 가격을 입력하세요 : ");
					int price = sc.nextInt();
					sc.nextLine();
					books.get(index).setPrice(price);
					System.out.println("\n수정 완료\n");
				break;
				case 4 : System.out.println("===== 도서 출판사 수정 =====\n");
					System.out.print("수정할 도서 출판사를 입력하세요 : ");
					String publisher = sc.nextLine();
					books.get(index).setPublisher(publisher);
					System.out.println("\n수정 완료\n");
				break;
				case 0 : System.out.println("===== 수정 종료 =====\n"); break;
				default : System.out.println("0 ~ 4 사이의 숫자를 입력해주세요");
				}
			} while(input != 0);
		}
	}
	
	/**
	 * 도서 삭제
	 */
	public void removeBook() throws InputMismatchException{
		System.out.print("삭제할 도서 번호 : ");
		int number = sc.nextInt();
		boolean flag = true;
		
		for(Book book : books) {
			if(book.getNumber() == number) {
				
				flag = false;
				System.out.print("\n정말 삭제하시겠습니까? (Y / N) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					books.remove(book);
					System.out.println("\n삭제 되었습니다.\n");
				}
				return;
			}
		}
		
		if(flag) {
			System.out.println("\n해당 번호에 맞는 도서가 존재하지 않습니다.\n");
		}
	}
	
	/**
	 * 즐겨찾기 추가
	 */
	public void addLike() throws InputMismatchException{
		System.out.print("즐겨찾기에 추가할 도서 번호를 입력해주세요 : ");
		int number = sc.nextInt();
		boolean flag = true;
		
		for(Book book : books) {
			if(number == book.getNumber()) {
				like.add(book);
				flag = false;
				System.out.println("\n즐겨찾기에 추가 되었습니다!!!\n");
				return;
			}
		}
		
		if(flag) {
			System.out.println("해당 번호의 도서가 존재하지 않습니다.");
		}
	}
	
	/**
	 * 즐겨찾기 삭제
	 */
	public void removeLike() throws InputMismatchException{
		System.out.print("삭제할 도서 번호 : ");
		int number = sc.nextInt();
		boolean flag = true;
		
		for(Book book : like) {
			if(book.getNumber() == number) {
				
				flag = false;
				System.out.print("\n정말 삭제하시겠습니까? (Y / N) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					like.remove(book);
					System.out.println("\n삭제 되었습니다.\n");
				}
				else {
					System.out.println("삭제 취소!");
				}
				return;
			}
		}
		
		if(flag) {
			System.out.println("\n해당 번호에 맞는 도서가 존재하지 않습니다.\n");
		}
	}
	
	/**
	 * 즐겨찾기 조회
	 */
	public void searchLike() {
		for(Book book : like) {
			System.out.println(book.toString() + "\n");
			
		}
	}
	
	/**
	 * 추천도서 뽑기
	 */
	public void randomBook() {
		int random = (int)(Math.random() * books.size()); 
		
		System.out.println(books.get(random).toString() + "\n");
	}
	
	
}
