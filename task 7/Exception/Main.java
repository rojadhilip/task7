package com.Exception;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  System.out.println(" conncection is established..");
		Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter a number-1");
			int num1=sc.nextInt();
			System.out.println("Enter a number-2");
			int num2=sc.nextInt();
			//division
			int res=num1/num2;//9/0;
			System.out.println(res);
		
			
			//terminate the connection
			System.out.println("connection  is terminated");
	
	
			
		}
	}


