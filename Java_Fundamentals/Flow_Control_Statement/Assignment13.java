public class Assignment13{

     public static void main(String []args){
         int num=4;
            int flag=0;
            for(int j=2; j<num; j++){
                if(num%j == 0){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
     }
}