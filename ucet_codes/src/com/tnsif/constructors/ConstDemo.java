package com.tnsif.constructors;

public class ConstDemo {
		//data members or var
			int age;
			String name;

		//constructor
		ConstDemo(int age , String name){
			this.age = age;
			this.name = name;
			System.out.println("Constructor Called!:  Age: " 
			+ this.age + " Name: " + this.name);
		}

		//Method
		void student1(int age, String name){
			this.age = age;
			this.name = name;
		}

}


