import java.util.Arrays;
public class Assignment5{

     public static void main(String []args){
         int[] nums = {4,92,5,57,39,61,3,12,53};
         
         Arrays.sort(nums);
         System.out.println("Smallest : "+nums[0]+", "+nums[1]);
         System.out.println("Largest : "+nums[nums.length-2]+", "+nums[nums.length-1]);
     }
}