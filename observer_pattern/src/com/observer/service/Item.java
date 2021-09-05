package com.observer.service;

import java.util.ArrayList;
import java.util.List;

public class Item implements Subject{

	
	private String itemName;
	
	private List<ItemStatusObserver> customers = new ArrayList<ItemStatusObserver>();
	
	private boolean availble = true;
	
	@Override
	public void add(ItemStatusObserver observer) {
		customers.add(observer);
		
	}

	@Override
	public void remove(ItemStatusObserver observer) {
		customers.remove(observer);
		
	}

	@Override
	public void notifyAllObservers() {
		 System.out.println("Amazon will notify all registered customers when item is available ");
		 for(ItemStatusObserver customer:customers){
			 customer.update(itemName);
		 }
		
	}
 
	public boolean isAvailble() {
		return availble;
	}

	public void setAvailble(boolean availble) {
		this.availble = availble;
	}

	public List<ItemStatusObserver> getCustomers() {
		return customers;
	}

	public void setCustomers(List<ItemStatusObserver> customers) {
		this.customers = customers;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void updateRegisterdCustomers(boolean isAvailble) {
		 
		if(isAvailble){
			notifyAllObservers();
			
		}else{
			System.out.println("Iteam not available");
		}
		
		
	}

	
	
}
