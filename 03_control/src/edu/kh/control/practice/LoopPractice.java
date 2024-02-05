package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice2(){
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else{
			for(int i = input; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3(){
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i == 8) {
				System.out.print(i + " = ");
				break;
			}
			System.out.print(i + " + ");
		}
		System.out.print(sum);
		
	}
	
	public void practice4(){
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		if(input1 == 0 || input2 == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
		else {
			if(input1 > input2) {
				for(int i = input2; i <= input1; i++) {
					System.out.print(i + " ");
				}
			}else {
				for(int i = input1; i <= input2; i++) {
					System.out.print(i + " ");
				}
			}	
		}
		
	}
	
	public void practice5(){
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",input, i, input*i);
		}
	}
	
	public void practice6(){
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input < 2 || input > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		else {
			for(int i = input; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n\n",i);
			}
		}
	}
	
	public void practice7(){
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8(){
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9(){
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int space = input - 1;
		int star = 1;
		
		for(int i = 0; i < input; i++) {
			for(int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
		
	}
	
	
	public void practice10(){
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int star = 0;
		
		for(int i = 0; i < input * 2 - 1; i++) {
			if(i < input) {
				star++;
				
				for(int j = 0; j < star; j++) {
					System.out.print("*");
				}
				
			}else {
				star--;
				for(int j = star; j > 0; j--) {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
	}
	
	
	public void practice11() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int space = input - 1;
		int star = 1;
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star += 2;
			System.out.println();
		}
		
	}
	
	public void practice12() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int space = input - 2;
		
		for(int i = 0; i < input; i++) {
			if(i == 0 || i == input - 1) {
				for(int j = 0; j < input; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				System.out.print("*");
				for(int j = 0; j < space; j++) {
					System.out.print(" ");
				}
				System.out.print("*\n");
			}
		}
	}
	
	public void practice13() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
			
		}
		System.out.println();
		System.out.print("count : " + count);
	}
	
}
