public class Assignment2{
    public static String evenOdd(int a){
        return (a&1) == (1) ? "odd" : "even";
    }
     public static void main(String []args){
        System.out.println(evenOdd(Integer.parseInt(args[0])));
     }
}