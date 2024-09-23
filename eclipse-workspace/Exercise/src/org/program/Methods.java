package org.program;

public class Methods {

	public static void main(String[] args) {
		
		String name = "Nandhini Murugan";
		
		//CharAt
		char a = name.charAt(3);
		System.out.println(a);
		
		//IndexOf()
		int b = name.indexOf('i');
		System.out.println(b);
		
		//LastIndexOf()
		int c = name.lastIndexOf('a');
		System.out.println(c);
		
		//Length()
		int d = name.length();
		System.out.println(d);
		
		//contains()
		boolean e = name.contains("nandh");
		System.out.println(e);
		
		//Trim()
//		String f = name.trim();
//		System.out.println(f);
		
		//isEmpty()
		boolean g = name.isEmpty();
		System.out.println(g);
		
		//startWith()
		boolean h = name.startsWith("Nan");
		System.out.println(h);
		
		//endWith()
		boolean i = name.endsWith("ug");
		System.out.println(i);
		
		//toUpperCase()
		String j = name.toUpperCase();
		System.out.println(j);
		
		//toLowerCase()
		String k = name.toLowerCase();
		System.out.println(k);
		
		//equals()
		String l = "Nandhini";
		String m = "nandhini";
		
	    boolean n = l.equals(m);
	    System.out.println(n);
	    
	    //equalsIgnoreCase()
	    boolean o = l.equalsIgnoreCase(m);
	    System.out.println(o);
	    
	    //replace()
	    String p = m.replace("nandhini", "Anitha");
	    System.out.println(p);
	    
	    //replaceAll()
        String q = m.replaceAll(m, l);
        System.out.println(q);
        
        //subString()
        String r = name.substring(4);
        System.out.println(r);
        
        //subString(Start Index,End Index)
        String s = name.substring(5, 14);
        System.out.println(s);
        
        //compareTo()
        int t = l.compareTo(m);
        System.out.println(t);
        
	}
}
