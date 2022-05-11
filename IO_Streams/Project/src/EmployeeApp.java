import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) throws IOException {


        FileOutputStream fileOut = new FileOutputStream("employeeData.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> emp = new ArrayList<>();
		int res=0;
		
		while(res != 3) {
			System.out.println("Main Menu\n1. Add Employee\n2. Display all\n3. Exit");
			res = sc.nextInt();
			sc.nextLine();

			switch(res) {
			case 1:
				Employee employee = new Employee();
				System.out.println("Enter name : ");
				employee.setName(sc.nextLine());
				System.out.println("Enter ID : ");
				employee.setID(sc.nextInt());
				System.out.println("Enter age : ");
				employee.setAge(sc.nextInt());
				System.out.println("Enter salary : ");
				employee.setSalary(sc.nextDouble());
				emp.add(employee);
				
				try {
					out.writeObject(employee);
				}catch(IOException ie) {
					ie.printStackTrace();
				}
				
				break;
			
			case 2:
				
				if(emp.size() == 0) {
					System.out.println("Empty!!!");
					break;
				}
				for(Employee e : emp) {
					System.out.println("\n----------------------------------------------------------");
					System.out.println("Name   : "+e.getName());
					System.out.println("Age    : "+e.getAge());
					System.out.println("ID     : "+e.getID());
					System.out.println("Salary : "+e.getSalary()+" 	$");
				}
				System.out.println("\n----------------------------------------------------------");
				break;
			
			case 3:
				System.out.println("Exiting application");
				break;
			}
		}
		
		sc.close();
		out.close();
        fileOut.close();

	}

}
