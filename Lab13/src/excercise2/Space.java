package excercise2;

import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str=s.next();
	getSpace gs=(String str1)->{
		for(int i=0;i<str1.length();i++){
			System.out.print(str.charAt(i)+" ");
		}
	};
	gs.insertSpace(str);
	}

}
