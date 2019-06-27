package com.cg.eis.bean;

import java.util.Date;



public class Excersise2_threadClass implements Runnable{

	public void run() {
		System.out.println("Starting ");
		System.out.println(new Date());
		int i=1;
		while(i<=10)
		{
			try {
				Thread.sleep(10000);
			}
			catch (InterruptedException e) {
				System.out.println(e);			}
		
		System.out.println(new Date());
	}
	}
	
	
}
