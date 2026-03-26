package com.tnsif.nonaccessmodifiers;

// will not allow you to inherit
final public class FinalExample {
	
	// will not allow you to change the value of the variable
	final int num = 10;
	
	// will not allow you to override 
	final void show(){
		System.out.println("Hi im in final method");
	}

	public static void main(String[] args) {
		
		FinalExample obj = new FinalExample();
		obj.show();

	}

}

