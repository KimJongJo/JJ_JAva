package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice3 {
	
	public void score() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 : ");
		double num1 = sc.nextDouble();
		System.out.print("영어 점수를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		System.out.print("수학 점수를 입력해주세요 : ");
		double num3 = sc.nextDouble();
		
		int sum = (int)(num1 + num2 + num3);
		int avg = (int)(sum/3);
		
		System.out.printf("총점 : %d\n평균 : %d", sum, avg);
		
		
	}
	
	public void ex3() {
		// sc.next() 와 se.nextLine()의 차이
		
		// next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분인자로 생각하여 각각저장
		// nextLine() : 문자열에 띄어쓰기 가능, 줄구분까지 저장
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 1 : ");
		String input1 = sc.nextLine();
		
		System.out.print("문자열 입력 2 : ");
		String input2 = sc.next();
		
		System.out.println(input1);
		System.out.println(input2);
		
		
	}

	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input1 = sc.nextInt();
		System.out.println(input1);
		
		sc.nextLine();// 입력버퍼에 남은 개행문자 제거
		
		
		System.out.print("문자열을 입력하세요 : ");
		String input2 = sc.nextLine();
		System.out.println(input2);
		

	}
	
	
}
