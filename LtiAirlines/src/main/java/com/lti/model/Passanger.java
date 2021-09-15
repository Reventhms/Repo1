package com.lti.model;

public class Passanger {
	int passengerId;
	String name;
	
	public Passanger(int passengerId, String name) {
		super();
		this.passengerId = passengerId;
		this.name = name;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
