import java.util.Arrays;
public class Assignment12{

     public static void main(String []args){
         int[] arr1 = {3,2,6};
         int[] arr2 = {6,9,1};
         int[] res = new int[2];
         res[0] = arr1[arr1.length/2];
         res[1] = arr2[arr2.length/2];
         System.out.println(Arrays.toString(res));
     }
}