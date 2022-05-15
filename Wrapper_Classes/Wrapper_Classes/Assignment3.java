import java.util.Scanner;
public class Assignment3{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        String binary = Integer.toBinaryString(num);
        
        String withLeadingZeros = String.format("%8s", binary).replace(' ', '0');
        System.out.println(withLeadingZeros);
     }
}