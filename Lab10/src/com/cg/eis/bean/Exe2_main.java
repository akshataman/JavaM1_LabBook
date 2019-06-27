package com.cg.eis.bean;

public class Exe2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excersise2_threadClass m = new Excersise2_threadClass();
		Thread th=new Thread(m);
		th.start();
	}

}
