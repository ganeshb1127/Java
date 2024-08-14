package com.tnsif.day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String srn;
		long num;
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter these details");
		System.out.println("Name:");
		name=sc.next();
		System.out.println("srn:");
		srn=sc.next();
		System.out.println("Number:");
		num=sc.nextLong();
		System.out.println("age:");
		age=sc.nextInt();
		System.out.println("Student details:"+"\n"+"name:"+name+"\n"+"srn:"+srn+"\n"+"Number:"+num+"\n"+"Age:"+age);
		

	}

}
