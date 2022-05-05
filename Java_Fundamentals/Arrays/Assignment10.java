import java.util.*;
public class Assignment10{

     public static void main(String []args){
         int[] nums = {1,0,1,0,0,1,1};
         int[] e = new int[nums.length];
         int[] o = new int[nums.length];
         int ee=0,oo=0,index=0;
         for(int i=0; i<nums.length; i++){
             if((nums[i]&1)==0){
                 e[ee]=nums[i];
                 ee++;
             }else{
                 e[ee]=-1;
                 ee++;
             }
         }
         
         for(int i=0; i<nums.length; i++){
             if((nums[i]&1)==1){
                 o[oo]=nums[i];
                 oo++;
             }else{
                 o[oo]=-1;
                 oo++;
             }
         }
         
         for(int even : e){
             if(even >= 0){
                 nums[index]=even;
                 index++;
             }
         }
         
         for(int odd : o){
             if(odd >= 0){
                 nums[index]=odd;
                 index++;
             }
         }
         
         System.out.println(Arrays.toString(nums));
     }
}