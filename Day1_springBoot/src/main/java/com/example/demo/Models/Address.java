package com.example.demo.Models;




public class Address {
	
	private String Name;
	private int DoorNo;
	private String StreetName;
	private int Pincode;
	private String Area;
	private String District;
	private String State;
	private String Country;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(int doorNo) {
		DoorNo = doorNo;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Address(String name, int doorNo, String streetName, int pincode, String area, String district, String state,
			String country) {
		super();
		Name = name;
		DoorNo = doorNo;
		StreetName = streetName;
		Pincode = pincode;
		Area = area;
		District = district;
		State = state;
		Country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
