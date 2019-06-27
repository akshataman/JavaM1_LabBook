//Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

package com.cg.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3RevSort {
	public static int[] getSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			String 	strings=Integer.toString(a[i]);
			//System.out.println(a[i]);
			char []rev=strings.toCharArray();
			strings="" ;
			for (int j = rev.length-1; j>=0;j--) {
				strings+=rev[j]+"";
			}
			//System.out.println(strings);
			a[i]=Integer.parseInt(strings);
			//System.out.println(a[i]);
		}	
		Arrays.sort(a);	
		return a;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers to accept as an integer array:");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter "+x+" Numbers:");
		for(int i =0;i<x;i++) {
			a[i]=sc.nextInt();	
		}
		a=Ex3RevSort.getSort(a); //method call
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
