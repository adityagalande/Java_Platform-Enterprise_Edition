class Animal{
    public void eat(){
        System.out.println("Eating");
    }
    
    public void sleep(){
        System.out.println("Sleeping");
    }
}

class bird extends Animal{
    public void fly(){
        System.out.println("Flying");
    }
}
public class Assignment1{

     public static void main(String []args){
        bird b = new bird();
        b.eat();
        b.sleep();
        b.fly();
     }
}