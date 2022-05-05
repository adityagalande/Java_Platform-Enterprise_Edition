public class Assignment4{

     public static void main(String []args){
        char a=args[0].charAt(0), b=args[1].charAt(0);
         if(a > b){
             System.out.println((char)b+""+(char)a);
         }else{
             System.out.println((char)a+""+(char)b);
         }
     }
}