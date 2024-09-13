package org.emp;

public class Employee {
	private void empId() {
		System.out.println("E21IT035");
	}
	private void empName() {
		System.out.println("Nandhini");	
	}
	private void empDOB() {
		System.out.println("20.06.2003");	
	}
	private void empPhone() {
		System.out.println("9475578687");
	}
	private void empEmail() {
		System.out.println("mnandhinimurugan20@gmail.com");
	}
	private void empAddress() {
		System.out.println("375/Pillaiyar kovil street,Thiruvannamalai");
	}
	public static void main(String[]args) {
	Employee a = new Employee();	
	a.empId();
	a.empName();
	a.empDOB();
	a.empPhone();
	a.empEmail();
	a.empAddress();
	
	}


}
