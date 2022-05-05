public class Assignment17{

     public static void main(String []args){
        int num=1100011;
        int res=0,temp=num;
        
        while(temp>0){
            res=(res*10)+(temp%10);
            temp/=10;
        }
        
        if(res==num){
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }
     }
}