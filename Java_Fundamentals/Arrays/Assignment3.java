public class Assignment3{

     public static void main(String []args){
         int[] arr = {21,32,41,7,32,98,65,2,1};
         int target=98;
         int res=-1;
         
         for(int i=0; i<arr.length; i++){
             if(arr[i] == target){
                 res=i;
             }
         }
         System.out.println(res);
     }
}