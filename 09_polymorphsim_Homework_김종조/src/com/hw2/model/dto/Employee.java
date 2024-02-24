package com.hw2.model.dto;

public class Employee extends Person{
	private String position;	// 직책
	
	public Employee(String id, String name, String position) {
		super(id,name);
		this.position = position;
		
	}

	@Override
	public String getInfo() {
		String s = String.format("ID : %s , 이름 : %s , 직책 : %s",this.id,this.name,position);
		return s;
	}

}
