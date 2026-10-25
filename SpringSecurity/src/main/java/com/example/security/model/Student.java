package com.example.security.model;

public class Student {
	
	private int  roleNum;
	private String name;
	private String technology;
	public int getRoleNum() {
		return roleNum;
	}
	public void setRoleNum(int roleNum) {
		this.roleNum = roleNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Student(int roleNum, String name, String technology) {
		super();
		this.roleNum = roleNum;
		this.name = name;
		this.technology = technology;
	}
	
	

}
