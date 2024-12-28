package com.example.thymleaf.model;

public class Student {

	private int stuId;
	private String stuName;
	private double stuMarks;
	private String stuGender;
	public Student(int stuId, String stuName, double stuMarks, String stuGender) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
		this.stuGender = stuGender;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getStuMarks() {
		return stuMarks;
	}
	public void setStuMarks(double stuMarks) {
		this.stuMarks = stuMarks;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	
	
}
