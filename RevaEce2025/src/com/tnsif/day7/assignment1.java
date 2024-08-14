package com.tnsif.day7;

public class assignment1 {
	private String name;
	private String rollno;
	private char grade;
	private Float percentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "assignment1 [name=" + name + ", rollno=" + rollno + ",Grade="+grade+", percentage=" + percentage + "]";
	}
	

}
