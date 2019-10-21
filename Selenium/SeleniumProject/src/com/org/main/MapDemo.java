package com.org.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap();
		map.put(1, "One");
		map.put(3, "One");
		map.put(5, "Five");
		map.put(3, "Three");
		
		String val = map.get(3);
		System.out.println(val);
		
		System.out.println();
		
		Set myKeys = map.keySet();
		Iterator<Integer> itr1= myKeys.iterator();
		while(itr1.hasNext()) {
			int key = itr1.next();
			System.out.println(map.get(key));
		}
		
		

	}

}
