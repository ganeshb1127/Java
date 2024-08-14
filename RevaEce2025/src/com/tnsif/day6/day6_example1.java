package com.tnsif.day6;

public class day6_example1 {
	int a=10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;
	
	void difaultdisp()
	{
		System.out.println("default method");
		System.out.println("the value is "+a);
	}
	public int publicdisp()
	{
		System.out.println("public method");
		return b;
	}
	public
	
	
	int privdisp(){
		System.out.println("private method");
		this.c=c;
		return c;
	}
	protected int protdisp() {
		System.out.println("protected method");
		return d;
	}

	

}
