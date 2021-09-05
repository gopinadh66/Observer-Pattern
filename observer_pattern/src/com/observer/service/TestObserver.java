package com.observer.service;

public class TestObserver {

	public static void main(String[] args) throws InterruptedException {
		 
		 
		//registerd customers list ,you can add more customers for example am taking two customers only
		Customer c1 = new Customer();
		c1.setCustName("Gopinadh sadam");
		Customer c2 = new Customer();
		c2.setCustName("Siva");
		
		System.out.println("Registerd customers list---> "+c1.getCustName()+","+c2.getCustName());
		
		Item phone = new Item();
		phone.setAvailble(false);
		phone.add(c1);
		phone.add(c2);
		
		phone.setItemName("RealMe 7pro");
		phone.updateRegisterdCustomers(phone.isAvailble());
		System.out.println("After 1 mint selected item is available");
		Thread.sleep(60000);
		
		phone.setAvailble(true);
		
		phone.updateRegisterdCustomers(phone.isAvailble());
		
	}

}
