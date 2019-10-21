package com.org.main;

public class ArrayDemo {
	
	public int[] empIds() {
		int[] a  = new int[5];
		a[0] = 4 ;
		a[1] = 7 ;
		a[2] = 3;
		a[3] = 17 ;
		a[4] = 13;
		
		return a;
	}

	public static void main(String[] args) {
		
		ArrayDemo ad = new ArrayDemo();
		int[] myids = ad.empIds();
		
		int len = myids.length;
		//System.out.println(len); // 3
		
		System.out.println(myids[5]);
		
		/*for(int i = 0 ; i <len ; i++) {
			System.out.println(myids[i]);
		}*/
		
		/*for(int j: myids) {
			System.out.println(j);
		}*/

	}

}
