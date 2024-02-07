package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	
	// ctrl + shift + o : 해당 클래스에서 임포트 안된거 전부 임포트
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// People -> 사용자정의 자료형
		
		// stack영역에 p1이 생성되고 (People객체의 주소 참조)
		// heap영역에 People 객체가 생성된다.
		
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// 그래서 클래스를 "사용자 정의 자료형" 이라고도 한다
		
//		p1.name = "홍길동";
//		p1.gender = '남';
//		p1.pNo = "100207-1234567";
//		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 e강의장";
//		p1.phone = "010-1234-1234";
//		p1.age = 14;
//		
//		
//		System.out.println("p1의 name : " + p1.name);
//		System.out.println("p1의 gender : " + p1.gender);
//		System.out.println("p1의 pNo : " + p1.pNo);
//		System.out.println("p1의 address : " + p1.address);
//		System.out.println("p1의 phone : " + p1.phone);
//		System.out.println("p1의 age : " + p1.age);
	
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("100207-1234567");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠청계 3층 e강의장");
		p1.setPhone("010-1234-1234");
		p1.setAge(14);
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 age : " + p1.getAge());
		p1.tax();
		p1.vote();
		
		
		System.out.println("=====================================");
		
		//본인 객체
		
		People JJ = new People();
		
		JJ.setName("김종조");
		JJ.setGender('남');
		JJ.setpNo("000309-1234567");
		JJ.setAddress("서울시 중랑구 봄작시티 50 ...");
		JJ.setPhone("010-5270-8614");
		JJ.setAge(25);
		
		System.out.println("JJ의 name : " + JJ.getName());
		System.out.println("JJ의 gender : " + JJ.getGender());
		System.out.println("JJ의 pNo : " + JJ.getpNo());
		System.out.println("JJ의 address : " + JJ.getAddress());
		System.out.println("JJ의 phone : " + JJ.getPhone());
		System.out.println("JJ의 age : " + JJ.getAge());
		JJ.tax();
		JJ.vote();
		
	}
	
}
