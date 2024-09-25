package org.collects;
import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(10);
		a.add(true);
		a.add('n');
		a.add(null);
		a.add("arun");
		a.add(25.35);
		a.add(10);
		
		System.out.println(a);
		System.out.println("==============");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	} 
}
