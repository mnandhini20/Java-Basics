package org.maps;

import java.util.*;
import java.util.Map.Entry;

public class MapMethod {
	public static void main(String[] args) {
		
		//HashMap
		Map a = new HashMap();
		a.put("Csk", 9);
		a.put("RCB", 8);
		a.put("BG", 3);
		a.put("RGH", 4);
		a.put("RR", 6);
		a.put("MI", "Null");
		a.put("MN", 8);
		System.out.println(a);
		
		
		//LinkedHashMap
		Map a1 = new LinkedHashMap();
		a1.put("Csk", 9);
		a1.put("RCB", 8);
		a1.put("BG", 3);
		a1.put("RGH", 4);
		a1.put("RR", 6);
		a1.put("MI", "Null");
		a1.put("MN", 8);
		System.out.println(a1);
	       
		// TreeMap
		Map a2 = new TreeMap();
		a2.put("Csk", 9);
		a2.put("RCB", 8);
		a2.put("BG", 3);
		a.put("RGH", 4);
		a2.put("RR", 6);
		a2.put("MI", "Null");
		a2.put("MN", 8);
		System.out.println(a2);
		
		
		//Hashtable
		Map a3 = new Hashtable();
		a3.put("Csk", 9);
		a3.put("RCB", 8);
		a3.put("BG", 3);
		a3.put("RGH", 4);
		a3.put("RR", 6);
		a3.put("MI", "Null");
		a3.put("MN", 8);
		System.out.println(a3);
		
		
		//Size
		int b = a1.size();
		System.out.println(b);
		
		System.out.println("============");
		
		//ContainsKey
	    boolean c = a1.containsKey("Csk");
	    System.out.println(c);
	    
	    System.out.println("============");
	    
	    //ContainsValue
	    boolean d = a1.containsValue(8);
	    System.out.println(d);
	    
	    System.out.println("============");
	    
	    //Remove
	    System.out.println(a1.remove("Csk",9));
	    System.out.println(a1);
	    
	    System.out.println("============");
	    
//	    System.out.println(a1.keySet());
	    
	    //KeySet
	    Set<String> e = a1.keySet();
	    System.out.println(e);
	    
	    System.out.println("============");
	    
	    //Values
	    Collection<Integer> f = a1.values();
	    System.out.println(f);
	    
	    System.out.println("============");
	    
	    //EntrySet
	    Set<Entry<String,Integer>> g = a1.entrySet();
	    for(Entry<String,Integer> h:g) {
	    	System.out.println(h);
	    	
	    	//getKey
	    	 String i = h.getKey();
	    	 System.out.println(i);
	    	 
	    	 //getValue
	    	 Object j = h.getValue();
	    	 System.out.println(j);
	    }    
	}

}
