import java.util.Arrays;
public class Assignment9{

     public static void main(String []args){
         int[] nums = {12,10,17,10,8,53,10,84,23};
         
         for(int i=0; i<nums.length; i++){
             if(nums[i]==10){
                 System.out.print(0+" ");
             }else{
                 System.out.print(nums[i]+" ");
             }
         }
     }
}