public class Assignment6{

     public static void main(String []args){
        String str1 = "hi";
        String str2 = "hello";
        
        if(str1.length() > str2.length()){
            System.out.println(str2.concat(str1).concat(str2));
        }
        if(str1.length() < str2.length()){
            System.out.println(str1.concat(str2).concat(str1));
        }
     }
}