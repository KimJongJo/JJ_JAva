package edu.kh.oop.basic;

public class Account {
	
	private String name;				//이름
	private String accountNumber;		//계좌번호
	private int balance;				//잔액
	private int password;				//비밀번호
	
	
	// 전달받은 금액을 잔액에 누적한 후, 현재 잔액을 콘솔에 출력
	public void deposit(int amount) {
		
		balance += amount;
		System.out.println(balance);
	}
	
	// 비밀번호와 출금할 금액을 전달받아와, 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	// 1) 비밀번호와 일치하지 않으면 "비밀번호 불일치" 출력
	// 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	public void withdraw(int password, int amount) {
		
		if(this.password != password) {
			System.out.println("비밀번호 불일치");
			return;
		}
		
		if(balance < amount) {
			System.out.println("잔액 부족");
			return;
		}
		
		
		
		balance -= amount;
		System.out.println(name + "님의 잔액은 " + balance + "원 입니다.");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
}
