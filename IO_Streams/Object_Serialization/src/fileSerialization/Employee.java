package fileSerialization;

import java.util.Date;

public class Employee implements java.io.Serializable{
	
	private String name;
	private java.util.Date date;
	private String designation;
	private String department;
	private double salary;
	
	
	public Employee() {
		
	}

	public Employee(String name, Date date, String designation, String department, double salary) {
		this.name = name;
		this.date = date;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", date=" + date + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}	
	
	

}



//java.util.Date date=new java.util.Date();  
//System.out.println(date);  