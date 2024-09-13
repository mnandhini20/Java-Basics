package org.sample;
//overriding
//c
public class NewTax extends OldTax{
@Override
public void taxlimit(int old) {
	System.out.println("New tax is "+old);
	super.taxlimit(250000);
}
public static void main(String[] args) {
	NewTax a = new NewTax();
	a.taxlimit(500000);
}
}