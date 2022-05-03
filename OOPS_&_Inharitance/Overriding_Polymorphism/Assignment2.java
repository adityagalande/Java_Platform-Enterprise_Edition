class Shape{
    public void Drawing(){
        System.out.println();
    }
    
    public void Erasing(){
        
    }
}

class Circle extends Shape{
    
    public void Drawing(){
        System.out.println("Drawing Circle");
    }
    
    public void Erasing(){
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    
    public void Drawing(){
        System.out.println("Drawing Triangle");
    }
    
    public void Erasing(){
        System.out.println("Erasing Triangle");
    }
}

class Rectangle extends Shape{
    
    public void Drawing(){
        System.out.println("Drawing Rectangle");
    }
    
    public void Erasing(){
        System.out.println("Erasing Rectangle");
    }
}

public class Assignment2{

     public static void main(String []args){
        Shape circle = new Circle();
        circle.Drawing();
        circle.Erasing();
        
        Shape triangle = new Triangle();
        triangle.Drawing();
        triangle.Erasing();
        
        Shape rectangle = new Rectangle();
        rectangle.Drawing();
        rectangle.Erasing();
        
     }
}