package edu.kh.oop.basic;

public class AccountRun {
	public static void main(String[] args) {
		
		Account JJ = new Account();
		
		JJ.setName("김종조");
		JJ.setAccountNumber("0000-00-0000");
		JJ.setBalance(50000);
		JJ.setPassword(1234);
		
		JJ.deposit(2000);
		
		System.out.println("==============");
		
		// 비밀번호가 다를때
		JJ.withdraw(123, 5000);
		
		
		System.out.println("==============");
		
		// 잔액보다 금액이 클때
		JJ.withdraw(1234, 100000);
		
		System.out.println("==============");
		
		// 정상 작동
		JJ.withdraw(1234, 5000);
		
	}
}
