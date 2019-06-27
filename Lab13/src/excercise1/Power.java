package excercise1;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a=s.nextInt();
		System.out.println("Enter Second Number: ");
		int b=s.nextInt();
		getPower gp=(int x,int y)->{System.out.println(+a+" to the power "+b+" is: "+Math.pow(x,y));};
		gp.power(a,b);
	}
}
