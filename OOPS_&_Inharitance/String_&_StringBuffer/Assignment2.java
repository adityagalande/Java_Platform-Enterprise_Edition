public class Assignment2{
    static boolean isPalindrome(String str, int s, int e){
        while(s<=e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }else{
                return isPalindrome(str, s+1, e-1);
            }
        }
        
        return true;
    }

     public static void main(String []args){
         String str = "ABAABA";
         int s=0, e=str.length()-1;
        System.out.println(isPalindrome(str, s, e));
     }
}