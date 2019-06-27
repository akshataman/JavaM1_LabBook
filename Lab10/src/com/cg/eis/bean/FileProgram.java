package com.cg.eis.bean;
import java.io.IOException;

import com.cg.eis.bean.CopyDataThread;;

public class FileProgram {

	public static void main(String[] args)throws InterruptedException {
		
		CopyDataThread m=new CopyDataThread();
try
{
	m.test("source.txt","target.txt");
	m.copycontents();
	
}
catch (Exception e) {
	System.out.println("caught in main"+e.getMessage());
	}

}}
