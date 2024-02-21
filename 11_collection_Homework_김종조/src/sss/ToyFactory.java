package sss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {
	private Map<Integer, String> basic = new HashMap<Integer, String>(); // 재료
//	private Map<String, Toy> map = new HashMap<String, Toy>();	// 장난감 이름으로 분류
	private List<Toy> list = new ArrayList<Toy>(); 
	
	public ToyFactory() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new HashSet<String>();
		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new HashSet<String>();
		
		set1.add("면직물");
		set1.add("고무");
		
		set2.add("면직물");
		set2.add("플라스틱");
		
		set3.add("면직물");
		set3.add("플라스틱");
		
		set4.add("면직물");
		set4.add("플라스틱");
		
		set5.add("면직물");
		set5.add("플라스틱");
		set5.add("고무");
		
		basic.put(1, "면직물");
		basic.put(2, "플라스틱");
		basic.put(3, "유리");
		basic.put(4, "고무");

		
		list.add(new Toy("마미롱레그",8,36000,"분홍색",19950805,set1));
		list.add(new Toy("허기워기",5,12000,"파란색",19940312,set2));
		list.add(new Toy("키시미시",5,15000,"분홍색",19940505,set3));
		list.add(new Toy("캣냅",8,27000,"보라색",19960128,set4));
		list.add(new Toy("파피",12,57000,"빨간색",19931225,set5));
		
	}
	Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {
		
		int inputNum = 0;
		
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			inputNum = sc.nextInt();
			sc.nextLine();
			
			switch(inputNum) {
			case 1 : showAllToys(); break;
			case 2 : makeToy(); break;
			case 3 : removeToy(); break;
			case 4 : sortByMade(); break;
			case 5 : sortByAge(); break;
			case 6 : addIngredient(); break;
			case 7 : removeIngredient(); break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}while(inputNum != 0);
		
	}
	
	/**
	 * 전체 장난감 조회
	 */
	public void showAllToys() {
		int count = 1;
		for(Toy toy : list) {
			System.out.println(count + "." + toy.toString());
			count++;
		}
	}
	
	
	/**
	 * 새로운 장난감 만들기
	 */
	public void makeToy() {
		
		Set<String> set = new HashSet<String>();
		
		
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		System.out.print("사용 가능 연령 : ");
		int userAge = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("색상 : ");
		String color = sc.nextLine();
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		int madeDate = sc.nextInt();
		sc.nextLine();
		
		String input = "q";
		do {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요) : ");
			input = sc.nextLine();
			
			if(!input.equals("q")) {
				set.add(input);
			}
			
		}while(!input.equals("q"));
		
		list.add(new Toy(name,userAge,price,color,madeDate,set));
		System.out.println("새로운 장난감이 추가되었습니다.");
		
		
		
		
	}
	
	/**
	 * 장난감 삭제
	 */
	public void removeToy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String input = sc.nextLine();
		boolean flag = true;
		int count = 0;
		
		for(Toy toy : list) {
			if(toy.getName().equals(input)) {
				list.remove(count);
				System.out.println("장난감이 삭제되었습니다.");
				flag = false;
				return;
			}
			count++;
		}
		
		if(flag) {
			System.out.println("장난감이 존재하지 않습니다.");
		}
		
	}
	
	
	/**
	 * 장난감 제조일 순으로 조회하기
	 */
	public void sortByMade() {
		
		Comparator<Toy> madeComparator = Comparator.comparing(Toy::getMadeDate);
		
		List<Toy> copy = new ArrayList<Toy>(list);
		
		
		
		Collections.sort(copy, madeComparator);
		
		int count = 1;
		
		System.out.println("<제조일 순으로 장난감을 정렬>");
		for(Toy toy : copy) {
			System.out.println(count++ + ". " + toy);
		}
		
	}
	
	/**
	 * 연령별 사용 가능한 장난감 리스트
	 */
	public void sortByAge() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		Comparator<Toy> ageComparator = Comparator.comparing(Toy::getUserAge);
		
		List<Toy> copy = new ArrayList<Toy>(list);
		
		Collections.sort(copy,ageComparator);
		
		int count = 1;
		int age = 0;
		
		for(int i = 0; i < copy.size(); i++) {
			if(copy.get(i).getUserAge() != age) {
				age = copy.get(i).getUserAge();
				System.out.printf("[연령: %d세]\n",age);
				count = 1;
			}
			System.out.println(count + ". " + copy.get(i).toString());
			count++;
		}
		
	}
	
	/**
	 * 재료 추가
	 */
	public void addIngredient() {
		
		System.out.println("=== 현재 등록된 재료 ===");
		for(int i = 0; i < basic.size(); i++) {
			System.out.printf("%d : %s\n",i + 1, basic.get(i + 1));
		}
		
		System.out.println("========================");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("재료명 입력 : ");
		String input = sc.nextLine();
		
		if(basic.containsKey(number)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N) : ");
			String answer = sc.nextLine();
			if("y".equals(answer) || "Y".equals(answer)) {
				basic.put(number, input);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
				return;
			}else {
				System.out.println("취소");
				return;
			}
		}
		
		basic.put(number, input);
		System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		
	}
	
	/**
	 * 재료 삭제
	 */
	public void removeIngredient() {
		
		System.out.println("=== 현재 등록된 재료 ===");
		for(int i = 0; i < basic.size(); i++) {
			System.out.printf("%d : %s\n",i + 1, basic.get(i + 1));
		}
		System.out.println("========================");
		
		System.out.println("삭제할 재료 명 입력 : ");
		String input = sc.nextLine();
		
		if(basic.containsValue(input)) {
			System.out.println("재료 '" + input + "'가 성공적으로 제거되었습니다.");
			basic.values().remove(input);
		}
		else {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
	}
	
	
}
