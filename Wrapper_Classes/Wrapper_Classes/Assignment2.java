public class Assignment2{

     public static void main(String []args){
        int num = 20;
         
        String hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value is : " + hexa);
        String octal = Integer.toOctalString(num);
        System.out.println("Octal Value is : " + octal);
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);
     }
}