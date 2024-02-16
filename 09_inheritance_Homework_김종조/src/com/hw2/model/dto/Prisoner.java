package com.hw2.model.dto;

public class Prisoner extends Person{

	private String crime; // 죄목
	
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		String s = String.format("ID : %s , 이름 : %s , 죄목 : %s",this.id,this.name,crime);
		return s;
	}
	
	
	

}
