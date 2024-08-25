package com.collectionconcept;
import java.util.ArrayList;
public class collection {
	private static final String Empty = null;
	private static Object isEmpty;

	public static void main(String[]args) {
 //create a object Arraylist
	ArrayList al1=new ArrayList();
	al1.add("roja");
	al1.add("dhilipkumar");
	al1.add("janvika");
	System.out.println(al1);
	//remove all elements in arraylist
	al1.clear();
	System.out.println(al1);
	System.out.println(al1.isEmpty());
	
}
}