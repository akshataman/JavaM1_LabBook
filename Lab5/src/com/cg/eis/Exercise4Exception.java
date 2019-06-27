package com.cg.eis;

public  class Exercise4Exception extends Exception
{public Exercise4Exception() {
	// TODO Auto-generated constructor stub
}
	public Exercise4Exception(String message) {
	super(message);
}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "com.cg.Exercise4Exception"+super.getMessage();
	}
	}
