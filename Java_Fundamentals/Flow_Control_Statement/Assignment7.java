public class Assignment7{

     public static void main(String []args){
         
         if(args[0].charAt(0)>64 && args[0].charAt(0)<91){
             System.out.println(args[0].toLowerCase());
         }else if(args[0].charAt(0) > 96 && args[0].charAt(0) < 123){
             System.out.println(args[0].toUpperCase());
         }
     }
}