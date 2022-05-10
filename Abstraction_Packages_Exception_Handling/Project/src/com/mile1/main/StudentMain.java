package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.sevice.StudentReport;
import com.mile1.sevice.StudentService;

public class StudentMain {
	
	public static Student data[] = new Student[4];

	public StudentMain() {

		for(int i=0; i<data.length; i++) {
			data[i]=new Student();
		}
		
		data[0]= new Student("Nitin", new int[] {85,65,79});
		data[1]= new Student("Nitin", new int[] {85,65,79});
		data[2]= new Student("Nitin", new int[] {85,65,79});
		data[3]= new Student("Nitin", new int[] {85,65,79});
		
//		data[0]= null;
//		data[1]= null;
//		data[2]= null;
//		data[3]= null;
		
//		data[0]= new Student(null, new int[] {54,98,42});
//		data[1]= new Student(null, new int[] {54,98,42});
//		data[2]= new Student(null, new int[] {54,98,42});
//		data[3]= new Student(null, new int[] {54,98,42});
		
//		data[0]= new Student("Manoj", null);
//		data[1]= new Student("Manoj", null);
//		data[2]= new Student("Manoj", null);
//		data[3]= new Student("Manoj", null);
		
//		data[0]= new Student("Nitin", new int[] {85,65,79});
//		data[1]= new Student(null, new int[] {54,98,42});
//		data[2]= null;
//		data[3]= new Student("Manoj", null);
	}

	public static void main(String[] args) {

		StudentMain sm = new StudentMain();
		StudentReport sr = new StudentReport();
		StudentService sv = new StudentService();
		 
		//For Validate Method in StudentReport class.
		for(Student s: sm.data) {
			try {
				System.out.println(sr.Validate(s));
				if(sr.Validate(s) == "Valid") {
					//If Student Object is valid then call findGrade() method to find grade from mark[] array.
					System.out.println(sr.findGrades(s));
				}
			}catch (NullNameException nn) {
				System.out.println(nn);
			}catch (NullMarksArrayException nm) {
				System.out.println(nm);
			}catch (NullStudentObjectException no) {
				System.out.println(no);
			}
		}


		
		System.out.println(sv.findNumberOfNullMarksArray(data));
		
		System.out.println(sv.findNumberOfNullName(data));
		
		System.out.println(sv.findNumberOfNullObjects(data));
		
		

	}

}