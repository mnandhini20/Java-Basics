package org.base;
//C
public class Student extends Staff {
	private void sId() {
		System.out.println("Student Id E21IT035");
	}
    private void sName() {
    	System.out.println("Student Name Nandhini");
	}
    private void sDept() {
    	System.out.println("Student Department Information Technology");
	}
    public static void main(String[] args) {
		Student a = new Student();
		a.sId();
		a.sName();
		a.sDept();
		a.clgId();
		a.clgName();
		a.staffId();
		a.staffDept();
		
		
		
		
//		College b = new College();
//		b.clgId();
//		b.clgName();
	}
}
