package com.tnsif.collections;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		Queue qu = new LinkedList<>();
		
		//Adding elements 
		qu.add("sachin Tendulkar");
		qu.add("Mahendra Singh Dhoni");
		qu.add("Ravindhar Jadeja");
		qu.add("Suresh Raina");
		qu.add("Ruturaj Gaikwad");
		
		//View Head ELmenet
		System.out.println("Queue 's Head element : "+qu.peek());
		
		//Remove Elements
		System.out.println("REMOVED : "+qu.poll());
		System.out.println("REMOVED : "+qu.remove());
		
		//Display the Queue
		System.out.println("Queue: "+qu);
		
	}

}
