package org.example.b_package.b_factorymethodpattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemCreatorFactory itemCreator1 = new HpCreatorFactory();
		itemCreator1.templateMethod();
		
		
		ItemCreatorFactory itemCreator2 = new MpCreatorFactory();
		itemCreator2.templateMethod();
	}
}
