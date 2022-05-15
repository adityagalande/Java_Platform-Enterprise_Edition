class employee1 implements Cloneable {
    int EMP_ID;
    String EMP_Name;
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class Assignment4 {
    public static void main(String args[])
        throws CloneNotSupportedException
    {
        employee1 e1 = new employee1();
        e1.EMP_ID = 10;
        e1.EMP_Name = "Joseph";
 
        employee1 e2 = (employee1)e1.clone();
        
        e2.EMP_ID = 100;
        
        System.out.println(e1.EMP_ID + " " + e1.EMP_Name);
        System.out.println(e2.EMP_ID + " " + e2.EMP_Name);
    }
}