class Box{
    private int length;
    private int width;
    private int height;
    Box(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    
    public void getVolumeOfBox(){
        System.out.println(length*width*height);
    }
}

public class Assignment1{
     public static void main(String []args){
         Box b = new Box(2,3,4);
         b.getVolumeOfBox();
     }
}