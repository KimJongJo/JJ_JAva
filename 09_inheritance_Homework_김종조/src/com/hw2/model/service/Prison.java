package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners;	// 전체 수용자 저장용 배열
	private int prisonerCount;	// 수용자수
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	
	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner) {
			if(prisoners.length > prisonerCount) {
				prisoners[prisonerCount] = (Prisoner)person;
				prisonerCount++;
				System.out.println("수감자가 추가되었습니다. - " + ((Prisoner)person).getInfo());
			}else {
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < prisoners.length; i++) {
			if(prisoners[i].getId() == id) {
				System.out.print("직원이 삭제되었습니다. - ");
				System.out.println(prisoners[i].getInfo());
				
				prisoners[i] = null;
				
				for(int j = i; j < prisoners.length - 1; j++) {
					prisoners[j] = prisoners[j + 1];
				}
				
				
				break;
			}
		}

		System.out.println("해당 ID를 가진 수감자를 찾을수 없습니다.");
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		
		for(Prisoner p : prisoners) {
			if(p == null) break;
			
			System.out.println(p.getInfo());
		}
	}

}
