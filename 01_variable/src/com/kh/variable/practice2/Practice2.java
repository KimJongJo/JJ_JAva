package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {
	
	public void changeU() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력해주세요 : ");
		char input1 = sc.next().charAt(0);
		
		int ch = (int)input1;
		
		System.out.printf("%c의 유니코드는 %d 입니다.\n",input1, ch);
		
	}
}
