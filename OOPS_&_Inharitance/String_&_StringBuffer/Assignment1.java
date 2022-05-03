public class Assignment1{
    static String concatString(String str1, String str2){
        String res = "";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            res = str1.concat(str2.substring(1));
        }else{
            res=str1.concat(str2);
        }
        
        return res;
    }

     public static void main(String []args){
         String str1="Mark", str2="Kate";
        System.out.println(concatString(str1, str2));
     }
}