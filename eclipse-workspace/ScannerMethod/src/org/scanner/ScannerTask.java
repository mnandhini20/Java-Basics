package org.scanner;
import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		
		Scanner task = new Scanner(System.in);
		
		//nextLine()
		String b = task.nextLine();
		System.out.println(b);
				
		//next()
		String a = task.next();
		System.out.println(a);
		
		//nextInt()
		int c = task.nextInt();
		System.out.println(c);
		
		//nextByte()
		 byte d = task.nextByte();
		 System.out.println(d);
		 
		//nextShort()
		 short e = task.nextShort();
		 System.out.println(e);
		 
		 //nextFloat()
		 float f = task.nextFloat();
		 System.out.println(f);
		 
		 //nextLong()
		 long g = task.nextLong();
		 System.out.println(g);
		 
		 //nextDouble()
		 double i = task.nextDouble();
		 System.out.println(i);
		 
		//nextBoolean()
		 boolean h = task.nextBoolean();
		 System.out.println(h);
	}

	
}
