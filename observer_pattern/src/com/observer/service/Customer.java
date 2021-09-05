package com.observer.service;

public class Customer implements ItemStatusObserver{
	
	private String custName;
	
	private Subject subject ;
	
 
	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update(String  itemName) {
		System.out.println("Hello "+custName+ ": "+itemName+" available on Amazon"); 
		
	}
	
	

}
