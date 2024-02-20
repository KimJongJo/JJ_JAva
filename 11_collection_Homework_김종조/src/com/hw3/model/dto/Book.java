package com.hw3.model.dto;

public class Book {
	
	private int number;	// 도서 번호
	private String title;	//도서 제목
	private String author;	//저자
	private int price;	//가격
	private String publisher;	// 출판사
	
	public Book() {}
	
	public Book(int number, String title, String author, int price, String publisher) {
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	@Override
	public String toString() {
		return number + "번 도서 : [도서 제목 : " + title + " / 도서 저자 : " + author + " 도서 가격 : " + price+"원 / 출판사 : "
				+ publisher + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
