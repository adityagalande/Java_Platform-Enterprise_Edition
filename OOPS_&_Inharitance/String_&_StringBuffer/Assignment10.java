public class Assignment10{

     public static void main(String []args){
         String s="wipro";
         int n=3,len=s.length()-n;
         for(int i=1;i<=n;i++){
             System.out.print(s.substring(len));
         }
     }
}