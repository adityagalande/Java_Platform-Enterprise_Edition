class Person{
    private String name;
    
    Person(String name){
        this.name = name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    void getName(){
        System.out.println(this.name);
    }
}

class Employee extends Person{
    private double annual_salary;
    private String joining_date;
    private String insurance_number;
    
    Employee(String name, double annual_salary, String joining_date, String insurance_number){
        super(name);
        this.annual_salary = annual_salary;
        this.joining_date = joining_date;
        this.insurance_number = insurance_number;
    }
    
    void setAnnual_salary(double annual_salary){
        this.annual_salary = annual_salary;
    }
    
    void getAnnual_salary(){
        System.out.println(this.annual_salary);
    }
    
    void setJoining_date(String joining_date){
        this.joining_date = joining_date;
    }
    
    void getJoining_date(){
        System.out.println(this.joining_date);
    }
    
    void setInsurance_number(String insurance_number){
        this.insurance_number = insurance_number;
    }
    
    void getInsurance_number(){
        System.out.println(this.insurance_number);
    }
}

public class Assignment2{

     public static void main(String []args){
        Employee emp = new Employee("John Jecob", 120000, "12-Jan-2022", "12000304689");
        emp.getName();
        emp.getAnnual_salary();
        emp.getJoining_date();
        emp.getInsurance_number();
     }
}