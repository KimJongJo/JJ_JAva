package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("인원수를 입력해주세요 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수를 입력해주세요 : ");
		int candies = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " +  candies/people);
		System.out.println("남는 사탕 개수 : " +  candies%people);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int cls = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.println("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",
				grade, cls, number, name, gender, score);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 : ");
		int korea = sc.nextInt();
		
		System.out.print("영어 점수를 입력해주세요 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수를 입력해주세요 : ");
		int math = sc.nextInt();
		
		int sum = korea + english + math;
		double avg = sum / 3;
		
		System.out.printf("합계 : %d\n평균 : %.1f\n",sum, avg);
		
		
		boolean result = (korea >= 40 && english >= 40 && math >= 40 && avg >=60);
		System.out.println(result ? "합격" : "불합격");
	}
}
