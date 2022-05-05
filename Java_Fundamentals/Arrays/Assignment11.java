public class Assignment11{

     public static void main(String []args){
         int[] nums = {1,1,4,1,7,4,1};
         boolean flag=true;
         for(int i=0; i<nums.length; i++){
             if(nums[i]!=1 && nums[i]!=4){
                 flag=false;
             }
         }
         System.out.print(flag);
     }
}