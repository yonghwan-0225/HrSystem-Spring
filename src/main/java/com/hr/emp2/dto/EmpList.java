package com.hr.emp2.dto;


public class EmpList {
	private Long id;
	private String position;
	private String name;
	private String number;
	private String email;

	

	@Override
	public String toString() {
		return "EmpList [id=" + id + ", position=" + position + ", name=" + name + ", number=" + number + ", email="
				+ email + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
