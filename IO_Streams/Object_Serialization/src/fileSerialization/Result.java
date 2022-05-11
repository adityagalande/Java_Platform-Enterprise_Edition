package fileSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Result {

	public static void main(String[] args) {
		
		Employee employee = new Employee("ADITYA", new java.util.Date(), "Software Engineer", "SDE", 150000);
		Employee employee1 = new Employee("Harshit", new java.util.Date(), "Data Engineer", "DE", 40000);
		
		try {
	         FileOutputStream fileOut = new FileOutputStream("employeeData.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(employee);
	         out.writeObject(employee1);
	         out.close();
	         fileOut.close();
	         System.out.println(employee.toString());
	         System.out.println("Serialized data is saved in /tmp/employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }

	}

}
