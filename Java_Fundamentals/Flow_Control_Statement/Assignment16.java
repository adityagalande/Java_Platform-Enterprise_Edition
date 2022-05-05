public class Assignment16{

     public static void main(String []args){
        int num=1234;
        int res=0;
        System.out.println(num);
        while(num > 0){
            res=(res*10)+(num%10);
            num /=10;
        }
        System.out.println(res);
     }
}