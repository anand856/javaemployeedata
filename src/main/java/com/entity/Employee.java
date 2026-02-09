package com.entity;

public class Employee {
	private int id;
	private String name;
	private String mobile;
	private String dob;
	private String address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name,String mobile, String dob, String address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
		this.address = address;
	}

	public Employee(int id, String name, String mobile, String dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", dob=" + dob + ", address=" + address + "]";
	}

	
	
	
}
