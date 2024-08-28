package com.tnsif.day15;

public class pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n;j++) {
				if(i+j>=n)
				   System.out.print(i+" ");
				   //System.out.print(" ");
				else
					 System.out.print(" ");
				    //System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
