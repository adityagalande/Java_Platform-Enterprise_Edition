public class Assignment5{

     public static void main(String []args){
         String s = args[0];
        if(s.charAt(0)>47 && s.charAt(0)<59){
            System.out.println("Digit");
        }else if(s.charAt(0)>64 && s.charAt(0)<91 || s.charAt(0)>96 && s.charAt(0)<123){
            System.out.println("Alphabet");
        }else{
            System.out.println("Special Character");
        }
     }
}