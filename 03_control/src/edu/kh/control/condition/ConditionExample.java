package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {	//	기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if문
		// 조건식이 true 일때만 내부 코드 수행
		
		/*
		 * [작성법]
		 * if(조건식)	{
		 * 		조건식이 true 일 때 수행할 코드
		 * }
		 * */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		}
		
		
	}
	
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true 면 if문,
		// false면 else 구문이 수행됨
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false 일 때 수행될 코드
		 * }
		 * */
		
		
		// 홀짝 검사
		// 입력받은 정수값이 홀수면 "홀수입니다." 출력
		// 0이면 "0입니다." 출력
		// 짝수면 "짝수입니다." 출력
		
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int input = sc.nextInt();
		
		
		if(input != 0) {
			if(input % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수 입니다.");
			}
		}else {
			System.out.println("0입니다.");
		}
		
	}
	
	
	public void ex3() {
		// 양수, 음수, 0 판별
		// if(조건식) - else if(조건식) - else
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다.");
		}else if(input < 0) {	// 바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
		}else {
			System.out.println("0입니다.");
		}
	}
	
	
	public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절을 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12도 이하 "한파 주의보"
		// 여름일때 온도가 35도 이상 " 폭염 경보", 33도 이상 "폭염주의보"
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없습니다." 출력
		// 1, 2, 12 겨울
		// 3 ~ 5 봄
		// 6 ~ 8 여름
		// 9 ~ 11 가을
		
		
		System.out.print("지금은 몇 월 입니까? : ");
		int input = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		
		
		
		if(input == 1 || input == 2 || input == 12) {
			season = "겨울";
			
			System.out.print("온도는 몇 도 입니까 ? : ");
			int temperature = sc.nextInt();
			
			if(temperature <= -15) {
				season += " 한파 경보";
				
			}else if(temperature <= -12){
				season += " 한파 주의보";
			}
		}
		else if(input >= 3 && input <= 5) {
			season = "봄";
			
		}
		else if(input >= 6 && input <= 8) {
			season = "여름";
			
			System.out.print("온도는 몇 도 입니까 ? : ");
			int temperature = sc.nextInt();
			
			if(temperature >= 35) {
				season += " 폭염 경보";
				
			}else if(temperature >= 33) {
				season += " 폭염 주의보";
				
			}
		}else if(input >= 9 && input <= 11) {
			season = "가을";
			
		}else {
			season = "해당하는 계절이 없습니다.";
		}
		
		
		System.out.println(season);
	}
	
	public void ex5() {
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		String answer;
		
		if(age <= 13) {
			answer = "어린이 입니다.";
		}else if(age > 19) {
			answer = "성인 입니다.";
		}else {
			answer = "청소년 입니다.";
		}
		
		System.out.println(answer);
	}
	
	public void ex6() {
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		String sc;
		
		if(score >= 90) {
			sc = "A";
		}
		else if(score >= 80) {
			sc = "B";
		}
		else if(score >= 70) {
			sc = "C";
		}
		else if(score >= 60) {
			sc = "D";
		}
		else if(score < 60) {
			sc = "E";
		}
		else if(score < 0 || score < 100) {
			sc = "잘못 입력하셨습니다.";
		}
		else {
			sc = "F";
		}
		
		System.out.println(sc);
	}
	
	public void ex7() {
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		String answer;
		
		if(age > 100 || age < 0) {
			answer = "잘못 입력 하셨습니다.";
		}
		
		else if(age >= 12) {
			System.out.print("키를 입력해주세요 : ");
			double height = sc.nextDouble();
			
			if(height >= 140.0) {
				answer = "탑승 가능";
			}else {
				answer = "적정 키가 아닙니다.";
			}
			
		}else {
			answer = "적정 연령이 아닙니다.";
		}
		
		System.out.println(answer);
		
		
	}
	
	public void ex8() {
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age > 100 || age < 0) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			return;
		}
		
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		if(height < 0 || height > 250) {
			System.out.println("키를 잘못 입력 하셨습니다.");
			return;
		}
		
		String answer;
		
		if(age >= 12 && height < 140) {
			answer = "나이는 적절하나, 키가 적절치 않음";
		}else if(age < 12 && height  >= 140) {
			answer = "키는 적절하나, 나이는 적절치 않음";
		}else if(age < 12 && height < 140) {
			answer = "나이와 키 모두 적절치 않음";
		}else {
			answer = "탑승 가능";
		}
		
		System.out.println(answer);
		
	}
	
}
