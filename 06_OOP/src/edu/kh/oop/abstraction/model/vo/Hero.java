package edu.kh.oop.abstraction.model.vo;

public class Hero {
	
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	
	public void attack(int exp) {
		
		System.out.println(nickname + "은/는 공격을 했다!");
		this.exp += exp;
		if(this.exp > 500) {
			this.level++;
			this.exp -= 500;
		}
	}
	
	public void magicJump() {
		
		this.mp -= 10;
		
		if(this.mp <= 0) {
			System.out.println("더 이상 매직 점프할 수 없어요!");
		}
		
		else {
			System.out.println(nickname + "의 점프!");
		}
		
		
		
		
		
	}
	
	
	
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}
