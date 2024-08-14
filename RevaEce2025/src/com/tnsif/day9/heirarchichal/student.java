package com.tnsif.day9.heirarchichal;

public class student extends person{
	@Override
	public String toString() {
		return "student [SRN=" + SRN + ", branch=" + branch + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	private String SRN;
	private String branch;
	public student() {
		super();
	}
	public student(String sRN, String branch,String name, String address) {
		super(name,address);
		SRN = sRN;
		this.branch = branch;
	}
	public String getSRN() {
		return SRN;
	}
	public void setSRN(String sRN) {
		SRN = sRN;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
