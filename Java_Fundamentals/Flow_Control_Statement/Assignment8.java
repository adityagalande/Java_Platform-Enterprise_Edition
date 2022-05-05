public class Assignment8{

     public static void main(String []args){
         String color = args[0];
         
         switch(color){
             case "R":
                 System.out.println("RED");
                 break;
            
            case "B":
                System.out.println("BLUE");
                break;
                
            case "G":
                 System.out.println("GREEN");
                 break;
            
            case "O":
                System.out.println("ORANGE");
                break;
                
            case "Y":
                 System.out.println("YELLOW");
                 break;
            
            case "W":
                System.out.println("WHITE");
                break;
            
            default:
            System.out.println("Invalid");
            break;
         }
     }
}