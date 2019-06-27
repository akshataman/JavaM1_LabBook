//Calculate the sum of first n natural numbers which are divisible by 3 or 5.


package com.cg;

import java.util.Scanner;

class Ex1Sum
{
	static int calculateSum(int num)
	{
		int Sum=0;
		if(num>0)
		{
			for(int i = 1;  num>0 ;i++) {
				if(i%3==0 || i%5==0) {
					Sum+=i;
					--num;	
				}
			}
		}
		return Sum;
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("Enter a Natural Number:");
			int num=sc.nextInt(); //input number for calculation of natural number sum
			if(num==0) {
				System.out.println("Please enter a Natural Number only.!");
				continue;
			}
			else {
				int Sum =calculateSum(num); //function return
				System.out.println("Sum of first "+num+" Natural Numbers which are divisible by 3 & 5 is: "+Sum);
				sc.close();
				break;
			}
		}
	}
}