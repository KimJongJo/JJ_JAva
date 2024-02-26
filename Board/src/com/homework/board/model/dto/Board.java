package com.homework.board.model.dto;

public class Board {
	private String title;	// 제목
	private String content;	// 내용
	private int visite;		// 조회수
	private int up;			// 추천
	private int down;		// 비추천
	
	// 기본생성자
	public Board() {}

	// 매개변수 생성자
	public Board(String title, String content, int visite, int up, int down) {
		super();
		this.title = title;
		this.content = content;
		this.visite = visite;
		this.up = up;
		this.down = down;
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getVisite() {
		return visite;
	}

	public void setVisite(int visite) {
		this.visite = visite;
	}

	public int getUp() {
		return up;
	}

	public void setUp(int up) {
		this.up = up;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}
}
