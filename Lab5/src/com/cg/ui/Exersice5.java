package com.cg.ui;

public class Exersice5 {
public static void age(int age){
	if (age<=15) {
		try {
			throw new AgeException("\n"+age+" Your Age is Below 15.");
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	age(14);
}
}
