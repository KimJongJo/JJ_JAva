package com.hw4.model.dto;


import java.util.HashSet;
import java.util.Set;

public class Toy {
	
	private String name;	//장난감 이름
	private int userAge;	// 사용연령
	private int price;		// 가격
	private String color;	// 색상
	private int madeDate;	// 제조년월일
	private Set<String> set = new HashSet<String>();	// 사용 재료

	
	public Toy() {

	}

	public Toy(String name, int userAge, int price, String color, int madeDate, Set<String> set) {
		super();
		this.name = name;
		this.userAge = userAge;
		this.price = price;
		this.color = color;
		this.madeDate = madeDate;
		this.set = set;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(int madeDate) {
		this.madeDate = madeDate;
	}


	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + userAge
				 + " / 제조년월일 : " + madeDate + " / 재료 : " + setToString();
	}
	
	public String setToString() {
		StringBuilder sb = new StringBuilder();
		
		for(String item : set) {
			sb.append(item).append(", ");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		
		
		String s = sb.toString();
		return s;
	}




	
	
}
