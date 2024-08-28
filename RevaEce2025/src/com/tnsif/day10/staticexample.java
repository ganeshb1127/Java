
package com.tnsif.day10;

public class staticexample {
	private String name;
	private String adddress;
	static private String dept;
	public staticexample() {
		super();
	}
	public staticexample(String name, String adddress) {
		super();
		this.name = name;
		this.adddress = adddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdddress() {
		return adddress;
	}
	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	public static String getDept() {
		return dept;
	}
	public static void setDept(String dept) {
		staticexample.dept = dept;
	}
	@Override
	public String toString() {
		return "staticexample [name=" + name + ", adddress=" + adddress + "]";
	}
	

}
