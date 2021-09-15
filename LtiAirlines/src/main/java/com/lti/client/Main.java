package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		
		Flight f=new Flight(1001,"Chennai","Madurai");
		//System.out.println(f.getFlightId()+" "+f.getSource()+" "+f.getDestination());
	
		int num1=10;int num2=20;
		if(add(num1, num2)==30) {
			System.out.println("Test Success");
		}else {
			System.out.println("Test Failed");
		}
	
	}
	public static int add(int n1,int n2) {
		return n1+n2;
		
	}
	public static boolean compare(int num1,int num2) {
		if(num1==num2) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
