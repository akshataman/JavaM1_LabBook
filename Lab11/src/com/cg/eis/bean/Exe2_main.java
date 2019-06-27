package com.cg.eis.bean;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Exe2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excersise2_threadClass m = new Excersise2_threadClass();
		Executor execute=Executors.newSingleThreadExecutor();
		execute.execute(m);

	}

}
