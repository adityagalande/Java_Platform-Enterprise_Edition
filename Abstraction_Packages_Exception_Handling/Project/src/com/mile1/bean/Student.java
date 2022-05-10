package com.mile1.bean;

public class Student {
	String name;
	int mark[];
	String grade;
	
	public Student() {
		
	}
	
	public Student(String name, int[] mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public Student(String name, int[] mark, String grade) {
		this.name = name;
		this.mark = mark;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
