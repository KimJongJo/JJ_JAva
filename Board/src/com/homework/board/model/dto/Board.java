package com.homework.board.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Board implements Serializable{
	private String title;	// 제목
	private String wirter;	// 작성자
	private String content;	// 내용
	private int visite;		// 조회수
	private int up;			// 추천
	private int down;		// 비추천
	private LocalDateTime regDate; // 등록 일
	private static final long serialVersionUID = -8576247315535285275L;
	
	// 기본생성자
	public Board() {}
	// 매개변수 생성자
	public Board(String title, String wirter, String content, int visite, int up, int down, LocalDateTime regDate) {
		super();
		this.title = title;
		this.wirter = wirter;
		this.content = content;
		this.visite = visite;
		this.up = up;
		this.down = down;
		this.regDate = regDate;
	}

	
	
	public String getWirter() {
		return wirter;
	}
	public void setWirter(String wirter) {
		this.wirter = wirter;
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
	
	
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", visite=" + visite + ", up=" + up + ", down=" + down
				+ "]";
	}
	
	
}
