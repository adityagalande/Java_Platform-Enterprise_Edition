public class Assignment2{

     public static void main(String []args){
         int[] arr = {2,42,1,3,98,54,21,91,122,-9,-56,-130};
         
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         
         for(int num : arr){
             if(min > num){
                 min=num;
             }
             
             if(max < num){
                 max=num;
             }
         }
         System.out.println("Min Value : "+min+"\nMax Value : "+max);
     }
}