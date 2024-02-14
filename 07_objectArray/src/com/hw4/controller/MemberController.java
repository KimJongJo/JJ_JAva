package com.hw4.controller;

import java.util.Arrays;
import java.util.Comparator;

import com.hw4.model.vo.Member;

public class MemberController {
	public static int SIZE = 10;
	private int memberCount = 0;
	private Member[] mem = new Member[10];
	
	
	// 현재 회원수를 나타내는 memberCount 변수값을 반환해주는 메소드
	public int getMemberCount() {
		
		return memberCount;
	}
	
	
	// 현재 회원 객체 배열의 주소 값을 반환해주는 메소드
	public Member[] getMem() {
		return mem;
	}
	
	//전달받은 아이디가 mem 배열에 존재하는 경우 해당 아이디의 회원 정보를 반환해주는 메소드
	// 없을경우 null 반환
	public Member checkId(String userId) {
		if(mem[0] == null) {
			return null;
		}
		
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
	
	
	// 전달받은 회원 정보를 mem 배열에 추가해주는 메소드로 회원 등록 시 memberCount 1증가
	public void insertMember(Member m) {
		
		mem[memberCount] = m;
		
		memberCount++;
	}
	
	
	// 매개변수로 전달받은 menu에 따라 1인 경우 전달받은 search 문자열을
	// 아이디로 검색, 2인 경우 이름으로 검색, 3인 경우 이메일로 검색하고
	// 그 결과인 회원 객체 주소 값을 반환
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
	
	
	// 전달받은 menu에 따라 전달받은 회원 m을 setter 메소드를 이용하여 menu가
	// 1인 경우 비밀번호 수정, 2인 경우 이름 수정, 3인 경우 이메일을 수정하는 메소드
	public void updateMember(Member m, int menu, String update) {
		if(menu == 1) {
			m.setUserPwd(update);
			
		}else if(menu == 2) {
			m.setName(update);
			
		}else {
			m.setEmail(update);
		}
		
		System.out.println("회원의 정보가 변경되었습니다.");
	}
	
	
	// 전달받은 아이디를 이용하여 검색 후 존재하는 경우 삭제해주는 메소드로 삭제 후
	// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동시킴 memberCount 1감소
	public void deleteMember(String userId) {
		
		memberCount--;
		
		// 삭제될 아이디가 있는 index
		int index = 0;
		
		for(int i = 0; i < mem.length; i++) {
			if(mem[i].getUserId().equals(userId)) {
				index = i;
				break;
			}
		}
		
		for(int i = index; i < mem.length - 1; i++) {
			if(index == mem.length - 1) {
				mem[index] = null;
				break;
			}
			
			// 뒤에있는 값을 앞으로 얕은복사
			mem[i] = mem[i + 1];	
		}
		// 맨 뒤에있는 값 삭제
		mem[mem.length - 1] = null;
		
		System.out.println("회원의 정보가 삭제되었습니다.");
		
	}
	
	
	// 객체배열을 아이디별 오름차순 정렬한 후 주소값 반환
	public Member[] sortIdAsc() {
		
		Member[] copy = Arrays.copyOf(mem, memberCount);
		
		Arrays.sort(copy, new Comparator<Member>() {
			
			@Override
			public int compare(Member m1, Member m2) {
				return m1.getUserId().compareTo(m2.getUserId());
			}
		});
		
		return copy;
		
	}
	
	
	// 객체배열을 아이디별 내림차순 정렬한 후 주소값 반환
	public Member[] sortIdDesc() {
		
		Member[] copy = Arrays.copyOf(mem, memberCount);
		
		Arrays.sort(copy, new Comparator<Member>() {
			
			@Override
			public int compare(Member m1, Member m2) {
				return m2.getUserId().compareTo(m1.getUserId());
			}
		});
		
		return copy;
		
	}
	
	
	//객체배열을 나이별 오름차순 정렬한 후 주소값 반환
	public Member[] sortAgeAsc() {
		
		Member[] copy = Arrays.copyOf(mem, memberCount);
		
		Arrays.sort(copy, new Comparator<Member>() {
			
			@Override
			public int compare(Member m1, Member m2) {
				return m1.getAge() - m2.getAge();
			}
		});
		
		return copy;
		
	}
		
	
	
	// 객체배열을 나이별 내림차순 정렬한 후 주소값 반환
	public Member[] sortAgeDesc() {
		
		Member[] copy = Arrays.copyOf(mem, memberCount);
		
		Arrays.sort(copy, new Comparator<Member>() {
			
			@Override
			public int compare(Member m1, Member m2) {
				return m2.getAge() - m1.getAge();
			}
		});
		
		return copy;
		
	}
	
	
	// 객체배열을 성별로 내림차순 정렬(남여순)한 후 주소값 반환
	public Member[] sortGenderDesc() {
		
		Member[] copy = Arrays.copyOf(mem, memberCount);
		
		Arrays.sort(copy, new Comparator<Member>() {
			
			@Override
			public int compare(Member m1, Member m2) {
				return m2.getGender() - m1.getGender();
			}
		});
		
		return copy;
		
	}
}
