package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {

		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", "+ j + ")";
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2(){
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",num++);
			}
			System.out.println();
		}
	}
	
	public void practice3(){
		int[][]	arr = new int[4][4];
		
		int num = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",num--);
			}
			System.out.println();
		}
	}
	
	public void practice4(){
		int[][] arr = new int[4][4];
		int allSum = 0;
		int count = 1;
		
		System.out.println("임의의 정수 값을 9개 입력하세요");
		
		// 9개의 임이의 정수 입력
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				System.out.print("정수 " + count++ + " : ");
				arr[i][j] = sc.nextInt();
				allSum += arr[i][j];
			}
		}
		
		// 행 값들의 합
		for(int i = 0; i < 3; i++) {
			int sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += arr[i][j];
			}
			arr[i][3] = sum;
		}
		
		
		// 열 값들의 합
		for(int j = 0; j < 3; j++) {
			int sum = 0;
			for(int i = 0; i < 3; i++) {
				sum += arr[i][j];
			}
			arr[3][j] = sum;
		}
		
		arr[3][3] = allSum;
	
	
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5(){
		
		int row;
		int col;
		
		// 크기 입력
		while(true) {
			
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			if((row > 1  && row < 10) || (col > 1  && col < 10)) {
				break;
			}else {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			}
		}
		
		char[][] arr = new char[row][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)((int)(Math.random() * 26 + 65));
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice6(){
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		char[][] arr = new char[row][];
		char ch = 'a';
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			arr[i] = new char[col];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7(){
		
		String[] ban = {"강건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] class1 = new String[3][2];
		String[][] class2 = new String[3][2];
		
		int count = 0;
		
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < class1.length; i++) {
			for(int j = 0; j < class1[i].length; j++) {
				class1[i][j] = ban[count++];
				System.out.print(class1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < class2.length; i++) {
			for(int j = 0; j < class2[i].length; j++) {
				class2[i][j] = ban[count++];
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice8(){
		
		String[] ban = {"강건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] class1 = new String[3][2];
		String[][] class2 = new String[3][2];
		
		int count = 0;
		
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < class1.length; i++) {
			for(int j = 0; j < class1[i].length; j++) {
				class1[i][j] = ban[count++];
				System.out.print(class1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < class2.length; i++) {
			for(int j = 0; j < class2[i].length; j++) {
				class2[i][j] = ban[count++];
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		boolean flag = true;
		
		// 1분단에 있으면 flag는 false;
		// 2분단에 있으면 flag는 true;
		for(int i = 0; i < 6; i++) {
			if(name.equals(ban[i])) {
				flag = false;
			}
		}
		
		int dan = 0;
		int line = 0;
		String di = "";
		
		
		if(!flag) {
			dan = 1;
			for(int i = 0; i < class1.length; i++) {
				for(int j = 0; j < class1[i].length; j++) {
					if(name.equals(class1[i][j])) {
						line = i + 1;
						if(j == 0) {
							di = "왼쪽";
						}else {
							di = "오른쪽";
						}
					}
				}
			}
		}
		if(flag) {
			dan = 2;
			for(int i = 0; i < class2.length; i++) {
				for(int j = 0; j < class2[i].length; j++) {
					if(name.equals(class2[i][j])) {
						line = i + 1;
						if(j == 0) {
							di = "왼쪽";
						}else {
							di = "오른쪽";
						}
					}
				}
			}
		}
		
		System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.", name,dan,line,di);
		
	}

	public void practice9(){
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i = 1; i < 6; i++) {
			arr[0][i] = i - 1 + "";
		}
		
		for(int i = 1; i < 6; i++) {
			arr[i][0] = i - 1 + "";
		}
		
		arr[row + 1][col + 1] = "X";
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice10(){
		
		
		
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i = 1; i < 6; i++) {
			arr[0][i] = i - 1 + "";
		}
		
		for(int i = 1; i < 6; i++) {
			arr[i][0] = i - 1 + "";
		}
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		
		while(true) {
		
			
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();
			

			
			arr[row + 1][col + 1] = "X";
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			
			System.out.print("행 인덱스 입력 >> ");
			int input = sc.nextInt();
			row = input;
			
			if(input == 99) {
				System.out.println();
				System.out.println("프로그램 종료");
				
				break;
			}
				
		}
		
		
		
		
		
		
		
	}
}
	


