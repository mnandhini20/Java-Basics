package org.control;

public class Age {
	private void Ctrl(int age) {
		if(age>=18) {
			System.out.println("Ok");
		}
		else {
			System.out.println("Not ok");
		}
	}
	public static void main(String[] args) {
		Age age = new Age();
		age.Ctrl(28);
	}

}
