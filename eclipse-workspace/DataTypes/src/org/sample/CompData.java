package org.sample;
//Overloading
public class CompData extends Employee {
	private void empData (String name,int age) {
		System.out.println("emp name is: "+name+"\n"+"emp age is "+age);
		this.empData(24,"nandhini");
		this.empData('m');
		super.empSalary(30000);
	}
   private void empData(int a,String n) {
	   System.out.println("emp age is: "+a+"\n"+"emp name is "+n);
	}
   private void empData(char b) {
	   System.out.println("emp gender is: "+b);
	}
   public static void main(String[] args) {
	CompData a = new CompData();
	a.empData("Anitha",24);

	}
   
}
