package com.tnsif.constructors;

public class ConstMain {

	public static void main(String[] args) {

		ConstDemo obj = new ConstDemo(21, "Abhi"); // Constructors
		
		
		//Method
		obj.student1(11, "John");
		System.out.println("From Method: " +obj.age + " " + obj.name);

	}

}
