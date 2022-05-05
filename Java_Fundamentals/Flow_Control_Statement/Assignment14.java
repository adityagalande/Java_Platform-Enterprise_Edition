public class Assignment14{

     public static void main(String []args){
         int num = 1234, temp=0;
         while(num > 0){
             temp += num%10;
             num /=10;
         }
         
         System.out.println(temp);
     }
}