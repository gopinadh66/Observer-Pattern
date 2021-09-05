package com.observer.service;

public interface Subject {

	public void add(ItemStatusObserver observer);

	public void remove(ItemStatusObserver observer);

	public void notifyAllObservers();

}
