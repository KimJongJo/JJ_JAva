package com.hw1.model.dto;

public class TextBook extends Book{

	private String subject;	// 과목
	
	public TextBook() {}
	
	public TextBook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("[전문 서적] 제목 : " + super.getTitle() + " / 저자 : " + super.getAuthor() + " / 과목 : " + subject);
	}

}
