package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 한줄로 출력하기
		
		// ex)
		// 입력 1 : 안녕?
		// 입력 2 : 반갑습니다
		// 입력 3 : 점심뭐먹을까요?
		// 안녕? 반갑습니다 점심뭐먹을까요?
		
		// sc.next() : 다음 입력된 한 단어를 읽어옴
		
		System.out.print("첫번째 문자열 입력 : ");
		String input1 = sc.next();
		System.out.print("두번째 문자열 입력 : ");
		String input2 = sc.next();
		System.out.print("세번째 문자열 입력 : ");
		String input3 = sc.next();
		
		System.out.printf("%s %s %s\n",input1, input2, input3);
		
	}
}
