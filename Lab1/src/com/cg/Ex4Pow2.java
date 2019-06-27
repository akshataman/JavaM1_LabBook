//Checks if the entered number is a power of two or not

package com.cg;

import java.util.*;
class Ex4Pow2
{
	static boolean checkNumber(int n)
	{
		int N=n;
		int s=1;
		n=n/2;
		boolean flag=false; 
		while(n!=0)
		{
			s *=2;
			if(N==s)
			{
				flag=true;
			}
			n--;
		}
		return flag;
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		boolean Sum =checkNumber(num);
		if(num==1) {
			System.out.println("It is a Power of 2.");
		}
		else if(Sum) {
			System.out.println("It is a Power of 2.");
		}else {
			System.out.println("It is Not a Power of 2.");
		}
		sc.close();
	}
}