package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 5) break;
		}
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		// 입력받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		String str = "";
		
		while(true) {
		System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
		String input = sc.nextLine();
		if("exit@".equals(input)) break;
		// String 자료형은 비교연산자(==)로 같은 문자열인지 판별할 수 없다.
		// 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용 가능함.
		// -> String은 기본 자료형이 아닌 참조형
		
		// ** 해결방법 : 문자열1.equals(문자열2) 으로 비교가능
		str += input + "\n";
		}
		
		System.out.println("=======================");
		System.out.println(str);
	}
	
	public void ex3() {
		// continue : 다음 반복으로 넘어감
		
		// 1~10 까지 1씩 증가하며 출력
		// 단, 3의 배수 제외
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) continue;
			else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex4() {
		// 1~100 까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을때 반복을 멈춤
		// 1
		// 2
		// 3
		//...
		// 39
		for(int i = 1; i <= 100; i++) {
			if(i == 40)break;
			else if(i % 5 == 0) continue;
			
			else {
				System.out.println(i);
			}
		}
	}
	
	public void RSPGame() {
		
		// 가위바위보 게임을 할건데,
		// 몇 판할지 입력받음
		// 입력받은 판 수 만큼 반복
		// 컴퓨터 : Math.random() : 0~1미만 난수 생성
		// 1~3사이 난수 생성
		// 1이면 가위, 2이면 바위, 3이면 보 지정(switch)
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! / 졌습니다 ㅠㅠ
		// 매판마다 현재 기록 : 2승 1무 0패 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[가위 바위 보 게임~!!]");
		System.out.print("몇 판? : ");
		int set = sc.nextInt();
		sc.nextLine();

		
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		int i = 0;	// 판수
		String com = null;
		// null : 아무것도 참조하고 있지 않음.
		String me = "";
		
		
		
		while(i != set) {
			int ran = (int)(Math.random() * 3 + 1);
			// 0.0 <= x < 1.0
			// 0.0 <= x * 3 < 3.0
			// 1.0 <= x * 3 + 1 < 4.0
			// 1 <= (int)(x * 3 + 1) < 4
			// ==> 1이상 4 미만정수 -> 1 2 3

			
			switch(ran) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			System.out.println();
			System.out.printf("%d번째 게임\n",i + 1);
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			me = sc.nextLine();
			
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.", com);
			
//			if(com.equals(me)) {
//				System.out.println("비겼습니다.");
//				draw++;
//			}
//			else {
//				boolean win1 = me.equals("가위") && com.equals("보");
//				boolean win2 = me.equals("바위") && com.equals("가위");
//				boolean win3 = me.equals("보") && com.equals("바위");
//				
//				
//			}
			
			if("가위".equals(me)) {
				if("가위".equals(com)) {
					System.out.println("비겼습니다.");
					draw++;
				}else if("바위".equals(com)) {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}else {
					System.out.println("플레이어 승!");
					win++;
				}
			}else if("바위".equals(me)) {
				if("가위".equals(com)) {
					System.out.println("플레이어 승!");
					win++;
				}else if("바위".equals(com)) {
					System.out.println("비겼습니다.");
					draw++;
				}else {
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
				}
			}else {
				if("가위".equals(com)) {
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
				}else if("바위".equals(com)) {
					System.out.println("플레이어 승!");
					win++;
				}else {
					System.out.println("비겼습니다.");
					draw++;
				}
			}
			
			
			System.out.printf("현재 기록 : %d승 %d무 %d패",win,draw,lose);
			
			i++;
		}
	}
}
