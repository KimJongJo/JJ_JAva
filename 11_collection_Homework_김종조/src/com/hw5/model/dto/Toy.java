package com.hw5.model.dto;

import java.util.Set;

public class Toy {
	
	private int userAge;	// 사용 연령
	private int price;	//가격
	private String color;	//색상
	private int madeDate;	// 제조년월일
	private Set<String> item;	//사용재료
	
	public Toy() {}

	public Toy(int userAge, int price, String color, int madeDate, Set<String> item) {
		super();
		this.userAge = userAge;
		this.price = price;
		this.color = color;
		this.madeDate = madeDate;
		this.item = item;
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

	public Set<String> getItem() {
		return item;
	}

	public void setItem(Set<String> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Toy [userAge=" + userAge + ", price=" + price + ", color=" + color + ", madeDate=" + madeDate
				+ ", item=" + item + "]";
	}
	
	
	
	
	
	
}
