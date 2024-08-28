package com.tnsif.day13;

public class eceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		System.out.println(a);
		int b=3;
		System.out.println(b);
		try
		{
			int c=3/0;	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			int d=4;
			System.out.println(d);
		}

	}

}
