package com.hw1.model.dto;

public class Poetry extends Book{

	private int numberOfPoems;	// 시 수
	
	public Poetry() {}
	
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("[시집] 제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor() + " / 시 수 : " + numberOfPoems);
	}

}
