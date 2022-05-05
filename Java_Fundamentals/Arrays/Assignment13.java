import java.util.Arrays;
public class Assignment13{

     public static void main(String []args){
        int[][] arr = new int[2][2]; 
        int c=0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=Integer.parseInt(args[c]);
                c++;
            }
        }
        
        for(int[] a : arr){
            for(int num : a){
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
     }
}