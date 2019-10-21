package com.org.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Loopdemo {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		ls.add(3);
		ls.add(3);
		ls.add(4);
		
		//System.out.println(ls.size());
		
		/*Iterator<Integer> itr= ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		Iterator<Integer> itr1= set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//System.out.println(set.isize());
		
	}
	
	
	
	

}
