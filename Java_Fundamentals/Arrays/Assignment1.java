public class Assignment1{

     public static void main(String []args){
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        
        int res=0;
        for(int num : arr){
            res +=num;
        }
        System.out.println("Average of Array : "+res/(arr.length));
     }
}