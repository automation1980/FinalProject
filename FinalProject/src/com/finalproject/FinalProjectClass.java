package com.finalproject;

import java.util.Scanner;

public class FinalProjectClass 
{
	public static void main(String[] args) throws InterruptedException 
		{
			/*int i = 0;
			
			short myshort = 256;
			long mylong = 2223334;
			double mydouble = 212.767;
			float myFloat = 1223333;
			
			System.out.println("A Hello To Everyone in this Beautiful world --->>>> ");
			Thread.sleep(2000);
			
			Scanner sc = new Scanner (System.in);
			System.out.print(" Please enter the first String of your choice:- ");
			Thread.sleep(2000);
		
			String newstring1 = sc.nextLine();
			System.out.println("The String which you just enter is: - " + newstring1);
			Thread.sleep(2000);
			
			while(i<2)
			{
				System.out.println("Hi All" );
				i = i+1;
			}
			
			for(int j=0;j<=2; j++)
			{
				System.out.println("Hi Everyone");
			}
			
			System.out.print(" Please enter the first number of your choice:- ");
			int num1 = sc.nextInt();
			Thread.sleep(2000);
			
			if(num1 <=10)
			{
				System.out.println(" The number is less than 10 ");
			}
			
			else if(num1 >=10)
			{
				System.out.println(" The number is greater than 10 ");
			}
			
			else
			{
				System.out.println(" The number you entered is invalid ");
			}
			
			int newint = 0;
			do
			{
				System.out.println(" Please enter the number :- ");
				newint = sc.nextInt();
				Thread.sleep(2000);
			
			}
			while(newint  !=5);
			{
				System.out.println(" Correct number");
			}
			
			System.out.print(" Please enter the Second String of your choice:- ");
			
			String newstring2 = sc.nextLine();
		
			
			switch (newstring2)
			{
			case "gaurav":
				System.out.println("You have entered the correct String");
				break;
				
			case "sharma":
				System.out.println(" you have entered the incorrect String");
				break;
				
			default:
				System.out.println(" you have entered the invalid String");
				break;
			}
			*/
			int[] values;
			values = new int[3];
			values[0] = 10;
			values[1] = 20;
			values[2] = 30;
			
			for(int j=0; j<values.length;j++)
			{
				System.out.println(values[j]);
			}
			
			int[] values1 = {1,2,3,4,5,6,7,8,9};
			
			for(int k = 0; k <values1.length;k++)
			{
				System.out.println("The Values of the array are : - " + values1[k]);
			}
			
		}

}

