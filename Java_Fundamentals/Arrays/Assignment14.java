import java.util.Arrays;
public class Assignment14{

     public static void main(String []args){
         int[][] arr = new int[3][3];
         int c=0;
         
         for(int i=0; i<arr.length; i++){
             for(int j=0; j<arr[i].length; j++){
                 arr[i][j]=Integer.parseInt(args[c]);
                 c++;
             }
         }
         c=0;
         for(int[] a : arr){
             for(int num : a){
                 if(num > c){
                     c=num;
                 }
             }
         }
         System.out.println(c);
         System.out.println(Arrays.deepToString(arr));
     }
}