package org.example.b_package.b_templatemethodpattern;

public abstract class ItemCreator {
	
	public void templateMethod() {
		process();
		
		requestItemInfo();
		
		createItemLog();
	}
	
	private void process() {
		System.out.println("templatemethod process...");
	}
	
	abstract public void requestItemInfo();
	
	abstract protected void createItemLog();
}
