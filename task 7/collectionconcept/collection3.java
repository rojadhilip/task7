package com.collectionconcept;

import java.util.LinkedList;

public class collection3 {
	private static String x;

	public static void main (String[]args) {
		LinkedList ll1=new LinkedList ();
		ll1.add("roja");
		ll1.add(2);
		ll1.add("janvika");
		ll1.add("dhilip");
		ll1.add(28);
		System.out.println(ll1);
  String[] arr=new String[ll1.size()];
  for (int i=0;i<ll1.size();i++)
  arr[i]=(String) ll1.get(i);
  for(String Stringx:arr);
  System.out.print(x +"");
}
}