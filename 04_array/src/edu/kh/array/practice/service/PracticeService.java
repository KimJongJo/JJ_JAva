package edu.kh.array.practice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if(i % 2 == 0) {
				sum += arr[i];
			}
			System.out.print(i+1 + " ");
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2(){
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			if(i % 2 == 1) {
				sum += arr[i];
			}
			System.out.print(9 - i + " ");
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3(){
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4(){
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.print("인덱스 : " + i);
				flag = true;
			}
		}
		if(!flag){
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5(){
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		String ch = sc.next();
		int count = 0;
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, ch);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch.charAt(0)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print(ch  + " 개수 : " + count);
		
	}
	
	public void practice6(){
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;
		String str = "";
		
		for(int i = 0; i < input; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			str += arr[i] + " ";
		}
		System.out.println(str);
		System.out.println("총합 : " + sum);
	}
	
	public void practice7(){
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(i > 7) {
				answer += "*";
			}else {
				answer += str.charAt(i);
			}
		}
		
		System.out.println(answer);
	}
	
	public void practice8(){
		int input;
		
		while(true) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			if((input % 2 == 0 || input < 0) || input < 3) {
				System.out.println("다시 입력하세요.");
			}
			else {
				break;
			}
		}
		
		int num = 0;
		boolean flag = false;
		
		int[] arr = new int[input];
		for(int i = 0; i < arr.length; i++) {
			if(!flag) {
				num++;
				System.out.print(num + " ");
				if(i == (arr.length - 1) / 2) {
					flag = true;
				}

			}else {
				num--;
				System.out.print(num + " ");
			}
		}
	}
		
	public void practice9(){
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10(){
		int[] arr = new int[10];
		int max = 0;
		int min = 100;
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11(){
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12(){
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13(){
		
		System.out.print("문자열 : ");
		String str = sc.next();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			boolean flag = false;
			char ch = str.charAt(i);
			
			for(int j = 0; j < i; j++) {
				if(ch == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				count++;
			}
			
		}
		
		System.out.print("문자열에 있는 문자 : ");
		
		char[] chArr = new char[count];
		int index = 0;
		
		for(int i = 0; i < str.length(); i++) {
			boolean flag = false;
			char ch = str.charAt(i);
			
			for(int j = 0; j < i; j++) {
				if(ch == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				chArr[index] = ch;
				if(i != str.length() - 1) {
					System.out.print(chArr[index] + ", ");
				}else {
					System.out.println(chArr[index]);
				}
				index++;
			}
		}
		
		System.out.print("문자 개수 : " + count);

	}
	
	public void practice14(){
		
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrSize = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[arrSize];
		
		int save = 0;
		int point = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(++save + "번째 문자열 : ");
			arr[i] = sc.nextLine();
			
			
		}
		
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String answer = sc.next();

			
			if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
				
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int plus = sc.nextInt();
				sc.nextLine();
				
				arrSize += plus;
				point = arrSize - plus;
				
				arr = Arrays.copyOf(arr, arrSize);

				
				for(int i = point; i < arrSize; i++) {
					System.out.print(++save + "번째 문자열 : ");
					arr[i] = sc.nextLine();
				}
				
				continue;
			}
			
			
			System.out.println(Arrays.toString(arr));
			break;
		}
		
		

	}

	
}
