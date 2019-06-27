package com.cg.ui;
import com.cg.eis.Exercise4Exception;;
public class Exercise4 {
	static void employeeName(String fname,String lname){
		if (fname.isEmpty()|lname.isEmpty()) {
			try {
				throw new Exercise4Exception("\n Please Enter the Names Correctly.!");
			} catch (Exercise4Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeName("akshat", "aman");
	}

}
