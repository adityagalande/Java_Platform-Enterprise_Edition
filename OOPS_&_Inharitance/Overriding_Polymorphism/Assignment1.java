class Fruit{
    String name;
    String taste;
    int size;
    
    Fruit(String name, String taste, int size){
        this.name= name;
        this.taste=taste;
        this.size=size;
    }
    
    public void eat(){
        System.out.println("Name : "+name+"\tTaste : "+taste);
    }
}

class Apple extends Fruit{
    private String nameApple;
    private String tasteApple;
    private int sizeApple;
    
    Apple(String name, String taste, int size, String nameApple, String tasteApple, int sizeApple){
        super(name, taste, size);
        this.nameApple= nameApple;
        this.tasteApple=tasteApple;
        this.sizeApple=sizeApple;
    }
    
    public void eat(){
        super.eat();
        System.out.println("Name : "+nameApple+"\tTaste : "+tasteApple);
    }
}

class Orange extends Apple{
    private String nameOrange;
    private String tasteOrange;
    private int sizeOrange;
    
    Orange(String name, String taste, int size, String nameApple, String tasteApple, int sizeApple, String nameOrange, String tasteOrange, int sizeOrange){
        super(name, taste, size, nameApple, tasteApple, sizeApple);
        this.nameOrange= nameOrange;
        this.tasteOrange=tasteOrange;
        this.sizeOrange=sizeOrange;
    }
    
    public void eat(){
        super.eat();
        System.out.println("Name : "+nameOrange+"\tTaste : "+tasteOrange);
    }
}

public class Assignment1{

     public static void main(String []args){
         Orange orange = new Orange("Kiwi", "Savour", 12, "Apple", "Sweet", 21, "Oragne", "Tangy", 25);
         orange.eat();
     }
}