package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("정수를 입력해주세요 : ");
		int input = sc.nextInt();
		
		String answer;
		
		if(input <= 0) {
			answer = "양수만 입력해주세요.";
		}
		else if(input % 2 == 0) {
			answer = "짝수 입니다.";
		}else {
			answer = "홀수 입니다.";
		}
		
		System.out.println(answer);
	}
	
	public void practice2() {
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		
		
		int sum = kor + eng + math;
		double avg = sum / 3;
		
		

		
		if(kor < 40 || eng < 40 || math < 40) {
			System.out.println("불합격입니다.");
		}else{
			if(avg >= 60) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",
						kor,math,eng,sum,avg);
			}
			else {
				System.out.println("불합격입니다.");
			}
			
		}
	}
	
	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		String month = sc.next();
		String answer = "";
		answer = month;
		
	
		switch(month) {
		case "1", "3", "5", "7", "8", "10", "12" : answer += "월은 31일 까지 있습니다."; break;
		case "2" : answer += "월은 29일 까지 있습니다."; break;
		case "4", "6", "9", "11" : answer += "월은 30일 까지 있습니다."; break;
		default : answer += "월은 잘못 입력된 달 입니다."; break;
		}
		
		System.out.println(answer);
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		
		String answer;
		
		if(bmi < 18.5) {
			answer = "저체중";
		}else if(bmi >= 18.5 && bmi < 23) {
			answer = "정상체중";
		}else if(bmi >= 23 && bmi < 25) {
			answer = "과체중";
		}else if(bmi >=25 && bmi < 30) {
			answer = "비만";
		}else {
			answer = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(answer);
	}
	
	public void practice5() {
		 System.out.printf("중간 고사 점수 : ");
		 int test1 = sc.nextInt();
		 System.out.printf("기말 고사 점수 : ");
		 int test2 = sc.nextInt();
		 System.out.printf("과제 점수 : ");
		 int test3 = sc.nextInt();
		 System.out.printf("출석 횟수 : ");
		 int num = sc.nextInt();
		 
		 //바뀐 점수
		 double t1 = test1 * 0.2;
		 double t2 = test2 * 0.3;
		 double t3 = test3 * 0.3;
		 double t4 = num * 0.2 * 5;
		 double sum = t1 + t2 + t3 + t4;
		 

		 
		 
		 
		 // 70점 이상일 경우
		 if(test1 >= 70 && test2 >= 70) {
			 
			 
			 
			 if(num > 20 * 0.7) {
				 
				 System.out.println("================= 결과 =================");
				 System.out.println("중간 고사 점수(20) : " + t1);
				 System.out.println("기말 고사 점수(30) : " + t2);
				 System.out.println("과제 점수(30) : " + t3);
				 System.out.println("출석 점수(20) : " + t4);
				 System.out.println("총점 : " + sum);
				 
				 
				 System.out.print("PASS");
			 }else {
				 System.out.printf("Fail [출석 횟수 부족 (%d/20)]", num);
			 }
		 }
		 //아닐경우
		 else {
			 
			 System.out.println("================= 결과 =================");
			 System.out.println("중간 고사 점수(20) : " + t1);
			 System.out.println("기말 고사 점수(30) : " + t2);
			 System.out.println("과제 점수(30) : " + t3);
			 System.out.println("출석 점수(20) : " + t4);
			 System.out.println("총점 : " + sum);
			 
			 
			 System.out.print("Fail [점수 미달]");
		 }
		 
	}
	
	
}
