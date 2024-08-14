package com.tnsif.day9.heirarchichal;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		person p;
		p=new student("R21EN147","ECE","Ganesh","Bengaluru");
		if(p instanceof student)
			System.out.println(p);
		p=new employee("soft","23000","Ganesh","Bengaluru");
		if(p instanceof employee)
			System.out.println(p);

	}

}
