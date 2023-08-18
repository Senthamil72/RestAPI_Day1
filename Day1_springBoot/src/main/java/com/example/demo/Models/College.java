package com.example.demo.Models;

public class College {

	private String CollegeName;
	private String Department;
	private int section;
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public College(String collegeName, String department, int section) {
		super();
		CollegeName = collegeName;
		Department = department;
		this.section = section;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
