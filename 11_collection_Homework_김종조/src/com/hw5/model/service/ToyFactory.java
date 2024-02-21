package com.hw5.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.hw5.model.dto.Toy;

public class ToyFactory {
	
	Map<Integer, String> basic = new HashMap<Integer, String>();
	Map<String, Toy> toys = new HashMap<String, Toy>();
	List<Map<String,Toy>> list = new ArrayList<Map<String,Toy>>();
	Set<String> item = new HashSet<String>();
	
	Map<String,Integer> testMap = new HashMap<String, Integer>();
	Set<String> testSet = new HashSet<String>();
	List<String> testList = new ArrayList<String>();
	
	
	public ToyFactory() {
//		basic.put(1, "면직물");
//		basic.put(2, "플라스틱");
//		basic.put(3, "유리");
//		basic.put(4, "고무");
//		
//		Set<String> item1 = new HashSet<String>();
//		Set<String> item2 = new HashSet<String>();
//		Set<String> item3 = new HashSet<String>();
//		Set<String> item4 = new HashSet<String>();
//		Set<String> item5 = new HashSet<String>();
//		
//		item1.add("면직물");
//		item1.add("고무");
//		
//		item2.add("면직물");
//		item2.add("플라스틱");
//		
//		item3.add("면직물");
//		item3.add("플라스틱");
//
//		item4.add("면직물");
//		item4.add("플라스틱");
//		
//		item5.add("면직물");
//		item5.add("플라스틱");
//		item5.add("고무");
//		
//		
//		toys.put("마미롱레그", new Toy(8, 36000, "분홍색", 19950805, item1));
//		toys.put("허기워기", new Toy(5, 12000, "파란색", 19940312, item2));
//		toys.put("키시미시", new Toy(5, 12000, "파란색", 19940312, item3));
//		toys.put("캣냅", new Toy(5, 12000, "파란색", 19940312, item4));
//		toys.put("파피", new Toy(5, 12000, "파란색", 19940312, item5));
		
		testMap.put("마미롱레그", 1);
		testMap.put("허기워기", 2);
		testMap.put("키시미시", 3);
		testMap.put("캣냅", 4);
		testMap.put("파피",5);
		
		testSet.add("마미롱레그");
		testSet.add("허기워기");
		testSet.add("키시미시");
		testSet.add("캣냅");
		testSet.add("파피");
		
		testList.add("마미롱레그");
		testList.add("허기워기");
		testList.add("키시미시");
		testList.add("캣냅");
		testList.add("파피");
		
		
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	public void test() {
		System.out.println("Map Test");
		for(String str : testMap.keySet()) {
			System.out.println(str);
		}
		
		System.out.println("-----------------");
		System.out.println("Set Test");
		for(String str : testSet) {
			System.out.println(str);
		}
		
		System.out.println("-----------------");
		System.out.println("List Test");
		for(String str : testList) {
			System.out.println(str);
		}
		
	}
	
	public void display() {
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
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			inputNum = sc.nextInt();
			sc.nextLine();
			
			switch(inputNum) {
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
			
		}while(inputNum != 0);
		
		
	}
}
