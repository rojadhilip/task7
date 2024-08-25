 package com.InvalidAgeExpection;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	InvalidAgeException (String message){
		super(message);
	}
}
public class Main {
	
	public static void main(String[]args) {
		int age;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter age.");
			Scanner in=new Scanner(System.in);
			age=in.nextInt();
			if(age<18)
			throw new InvalidAgeException("YOU ARE NOT ELIGGIBLE TO GO COLLEGE");
		else
				System.out.println("YOU ARE  ELIGGIBLE TO COLLEGE");
		}
		catch(InvalidAgeException e) {
			System.out.println("Caught an exception");
			System.out.println(e.getMessage());
		
	}
}

}
