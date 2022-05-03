public class Assignment2{
    static void powerInt(int num1, int num2){
     System.out.println((int)Math.pow(num2, num1));   
    }
    
    static void doublePower(double num1, int num2){
     System.out.println(Math.pow(num2, num1));
    }

     public static void main(String []args){
         powerInt(5,3);
         doublePower(5.3,3);
     }
}