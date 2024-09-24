package org.control;


public class ControlTask {
	
	private void even(int num) {
		if(num%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	
	public static void main(String[] args) {
		ControlTask a = new ControlTask();
		a.even(8);
	}

}
