public class Assignment8{

     public static void main(String []args){
        String str = "ab*cd", res="";
        int i=0;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i) == '*'){
                break;
            }
        }
        res = res.concat(str.substring(0,i)).concat(str.substring(i+1));
        System.out.println(res);
     }
}