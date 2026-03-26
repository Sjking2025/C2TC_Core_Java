package com.tnsif.scanner;
import java.util.Scanner;

public class ScannerExample {
	
 public static void main (String [] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Your Name : ");
	 String studentName = sc.nextLine();
	 System.out.println("Enter Your Age : ");
	 int stuAge = sc.nextInt();
	 
	 System.out.println("The Student Name is :"+ studentName +"\n"
	                    +"Age of the Student is :"+ stuAge);
	 
 }
}
