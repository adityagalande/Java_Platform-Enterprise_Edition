public class Project1{
    public static String company(int empNum){
        int empNo=empNum;
        String empName="";
        String joinDate="";
        char designationCode=' ';
        String department="";
        long basic=0;
        long HRA=0;
        long IT=0;
        String designation="";
        long DA=0;
        long salary=0;
        
        switch(empNo){
            case 1001:
                {
                empName="Ashish";
                joinDate="01/04/2009";
                designationCode='e';
                department="R&D";
                basic=20000;
                HRA=8000;
                IT=3000;
                }
                break;
            case 1002:
                {
                empName="Sushma";
                joinDate="23/08/2012";
                designationCode='c';
                department="PM";
                basic=30000;
                HRA=12000;
                IT=9000;
                }
                break;
            case 1003:
                {
                empName="Rahul";
                joinDate="12/11/2008";
                designationCode='k';
                department="Account";
                basic=10000;
                HRA=8000;
                IT=1000;
                }
                break;
            case 1004:
                {
                empName="Chahat";
                joinDate="29/01/2013";
                designationCode='r';
                department="Front Desk";
                basic=12000;
                HRA=6000;
                IT=2000;
                }
                break;
            case 1005:
                {
                empName="Ranjan";
                joinDate="16/07/2005";
                designationCode='m';
                department="Engineer";
                basic=50000;
                HRA=20000;
                IT=20000;
                }
                break;
            case 1006:
                {
                empName="Suman";
                joinDate="01/01/2000";
                designationCode='e';
                department="Manufacturing";
                basic=23000;
                HRA=9000;
                IT=4400;
                }
                break;
            case 1007:
                {
                empName="Tanmay";
                joinDate="12/06/2006";
                designationCode='c';
                department="PM";
                basic=29000;
                HRA=12000;
                IT=10000;
                }
                break;
            default:
            return "There is no employee with empid : "+empNo;
        }
        
        if(designationCode=='e'){
            DA=20000;
            salary = (basic+HRA+DA)-IT;
            designation = "Software Engineer";
        }
        if(designationCode=='c'){
            DA=32000;
            salary = (basic+HRA+DA)-IT;
            designation = "Consultant";
        }
        if(designationCode=='k'){
            DA=12000;
            salary = (basic+HRA+DA)-IT;
            designation = "Clerk";
        }
        if(designationCode=='r'){
            DA=15000;
            salary = (basic+HRA+DA)-IT;
            designation = "Receptionist";
        }
        if(designationCode=='m'){
            DA=40000;
            salary = (basic+HRA+DA)-IT;
            designation = "Manager";
        }
        
        return empNo+"   "+empName+"   "+department+"   "+designation+"   "+salary;
    }
    
     public static void main(String []args){
        System.out.println(company(Integer.parseInt(args[0])));
     }
}