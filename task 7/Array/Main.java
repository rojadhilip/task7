package com.Array;

public class Main {

	public static void main(String[] args) {
		// ArrayIndexoutofBound
		int[]Array=new int[7];
		try {
			Array[8]=67;
			System.out.println(Array[8]);
		
		}catch(Exception e) {
			System.out.println("Array is crossing maxmime limit for size");
			
	}
		System.out.println("rest code-1");
		System.out.println("rest code-2");
		System.out.println("rest code-3");

	}

}
