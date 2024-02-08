package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Hero;

public class HeroService {
	
	public void newHero() {
	
		Hero JJ = new Hero();
		
		JJ.setNickname("JongJo");
		JJ.setJob("student");
		JJ.setHp(100);
		JJ.setMp(50);
		JJ.setLevel(25);
		JJ.setExp(50);
		
		JJ.attack(150);
		System.out.println("누적 경험치 : " + JJ.getExp() + "현재 레벨" + JJ.getLevel());
		JJ.attack(150);
		System.out.println("누적 경험치 : " + JJ.getExp() + "현재 레벨" + JJ.getLevel());
		JJ.attack(150);
		System.out.println("누적 경험치 : " + JJ.getExp() + "현재 레벨" + JJ.getLevel());
		JJ.attack(150);
		System.out.println("누적 경험치 : " + JJ.getExp() + "현재 레벨" + JJ.getLevel());
		
		JJ.magicJump();
		System.out.println("현재 mp : " + JJ.getMp());
		JJ.magicJump();
		System.out.println("현재 mp : " + JJ.getMp());
		JJ.magicJump();
		System.out.println("현재 mp : " + JJ.getMp());
		JJ.magicJump();
		System.out.println("현재 mp : " + JJ.getMp());
		JJ.magicJump();
		System.out.println("현재 mp : " + JJ.getMp());
		
	
		
		
		Hero father = new Hero();
		
		father.setNickname("father");
		father.setJob("workMan");
		father.setHp(200);
		father.setMp(100);
		father.setLevel(56);
		father.setExp(200);
		
		
		father.attack(150);
		System.out.println("누적 경험치 : " + father.getExp() + "현재 레벨" + father.getLevel());
		father.attack(150);
		System.out.println("누적 경험치 : " + father.getExp() + "현재 레벨" + father.getLevel());
		father.attack(150);
		System.out.println("누적 경험치 : " + father.getExp() + "현재 레벨" + father.getLevel());
		father.attack(150);
		System.out.println("누적 경험치 : " + father.getExp() + "현재 레벨" + father.getLevel());
		
		father.magicJump();
		System.out.println("현재 mp : " + father.getMp());
		father.magicJump();
		System.out.println("현재 mp : " + father.getMp());
		father.magicJump();
		System.out.println("현재 mp : " + father.getMp());
		father.magicJump();
		System.out.println("현재 mp : " + father.getMp());
		father.magicJump();
		System.out.println("현재 mp : " + father.getMp());
		
		
		
	}
	
	
	
	
}
