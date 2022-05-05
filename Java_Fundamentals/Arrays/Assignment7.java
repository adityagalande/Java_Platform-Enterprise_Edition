import java.util.Arrays;
public class Assignment7{

     public static void main(String []args){
         int[] nums = {12,34,12,45,67,89,67};
         Arrays.sort(nums);
         
         for(int i=0; i<nums.length; i++){
             while((i<nums.length-1) && nums[i] == nums[i+1]){
                 i++;
             }
             
             System.out.println(nums[i]);
         }
     }
}