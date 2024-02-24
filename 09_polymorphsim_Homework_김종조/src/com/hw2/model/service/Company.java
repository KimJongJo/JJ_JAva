package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	private Employee[] employees;	// 전체 직원 저장용 배열
	private int employeeCount;	// 직원수
	
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		if(person instanceof Employee) {
			if(employees.length > employeeCount) {
				employees[employeeCount] = (Employee)person;
				employeeCount++;
				System.out.println("직원이 추가되었습니다. - " + ((Employee)person).getInfo());
			}else {
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
	}

	@Override
	public void removePerson(String id) {
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				System.out.print("직원이 삭제되었습니다. - ");
				System.out.println(employees[i].getInfo());
				
				employees[i] = null;
				
				for(int j = i; j < employees.length - 1; j++) {
					employees[j] = employees[j + 1];
				}
				
				
				break;
			}
		}
		System.out.println("해당 ID를 가진 직원을 찾을수 없습니다.");
	}


	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		
		for(Employee e : employees) {
			if(e == null) break;
			System.out.println(e.getInfo());
		}
		
	}

}
