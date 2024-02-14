package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {
	public static int SIZE = 10;
	private int memberCount = 0;
	private Member[] mem = new Member[10];
	
	
	public int getMemberCount() {
		
		return memberCount;
	}
	
//	public Member[] getMem() {
//		
//	}
	
	//전달받은 아이디가 mem 배열에 존재하는지 확인
	public Member checkId(String userId) {
		
		for(int i = 0; i < mem.length; i++) {
			if(mem[i] == null) {
				return null;
			}
			if(userId.equals(mem[i].getUserId())) {
				return mem[i];
			}
		}
		
		return null;
	}
	
	public void insertMember(Member m) {
		
		mem[memberCount] = m;
		
		memberCount++;
	}
	
	public Member searchMember(int menu, String search) {
		
		if(menu == 1) {
			for(int i = 0; i < mem.length; i++) {
				if(mem[i] == null) {
					return null;
				}
				if(search.equals(mem[i].getUserId())) {
					return mem[i];
				}
			}
			
			return null;	
		}else if(menu == 2) {
			for(int i = 0; i < mem.length; i++) {
				if(mem[i] == null) {
					return null;
				}
				if(search.equals(mem[i].getName())) {
					return mem[i];
				}
			}
			
			return null;
		}else {
			for(int i = 0; i < mem.length; i++) {
				if(mem[i] == null) {
					return null;
				}
				if(search.equals(mem[i].getEmail())) {
					return mem[i];
				}
			}
			
			return null;
		}

		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
	}
	
	public void deleteMember(String userId) {
		
	}
	
//	public Member[] sortIdAsc() {
//		
//	}
//	
//	public Member[] sortIdDesc() {
//		
//	}
//	
//	public Member[] sortAgeAsc() {
//		
//	}
//	
//	public Member[] sortAgeDesc() {
//		
//	}
//	
//	public Member[] sortGenderDesc() {
//		
//	}
}
