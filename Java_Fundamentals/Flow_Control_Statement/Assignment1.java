public class Assignment1{
    public static boolean lastDigit(int a, int b){
        return (a%10) == (b%10) ? true : false;
    }
     public static void main(String []args){
        System.out.println(lastDigit(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
     }
}