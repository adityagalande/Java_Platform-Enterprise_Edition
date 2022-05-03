public class Assignment9{

     public static void main(String []args){
         String s1="Hello",s2="World",res="";
         int i=0,j=0;
         boolean b=false;
         
         while(i<s1.length() || j<s2.length()){
             if(b==false && i<s1.length()){
                 res +=s1.charAt(i);
                 i++;
             }
             b=!b;
             if(b==true && j<s2.length()){
                 res +=s2.charAt(j);
                 j++;
             }
             b=!b;
         }
         System.out.println(res);
     }
}