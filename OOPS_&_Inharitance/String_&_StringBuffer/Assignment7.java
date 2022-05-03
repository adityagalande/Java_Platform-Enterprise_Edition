public class Assignment7{

     public static void main(String []args){
        String str1 = "xhix";
        
        if(str1.charAt(0) == 'x'){
            str1 = str1.substring(1);
        }
        if(str1.charAt(str1.length()-1) == 'x'){
                str1=str1.substring(0,str1.length()-1);
        }
        System.out.println(str1);
     }
}