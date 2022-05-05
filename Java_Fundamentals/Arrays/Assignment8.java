public class Assignment8{

     public static void main(String []args){
         int[] arr = {7,1,6,3,2};
         int res=0, res2=0;
         boolean flag = true;
         for(int i=0; i<arr.length; i++){
             if(arr[i]==6 || flag==false){
                 res2 +=arr[i];
                 flag=false;
                 if(arr[i] == 7){
                     flag=true;
                     res2=0;
                 }
             }else{
                 res +=arr[i];
             }
         }
         System.out.println(res+res2);
     }
}