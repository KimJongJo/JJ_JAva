package edu.kh.oop.cls.model.vo;

public class User {
	
	// 속성 ( == 필드 )
	// 아이디, 비밀번호, 이름, 나이, 성별 ( 추상화 진행 )
	// 데이터 직접접근 불가원칙 -> 필드는 기본적으로 모두 private ( 캡슐화 진행 )
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	// 기능 ( == 생성자 + 메서드 )
	
	// 생성자 : new 연산자를 통해서 객체가 생성될 때
	//          생성된 객체의 필드값 초기화 + 기능 수행 역할
	
	// 기본생성자
	public User() {
		// 기능
		System.out.println("기본 생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
	}
	
	
}
