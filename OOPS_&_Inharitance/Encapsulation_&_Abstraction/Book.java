class Author{
    private String name;
    private String email;
    private char gender;
    
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    void setName(String name){
        this.name=name;
    }
    
    void setEmail(String email){
        this.email=email;
    }
    
    void setGender(char gender){
        this.gender=gender;
    }
    
    String getName(){
        return this.name;
    }
    
    String getEmail(){
        return this.email;
    }
    
    char getGender(){
        return this.gender;
    }
}

class Book{
    private String bookName;
    private double price;
    private int quantity;
    private Author auth;

    Book(String bookName, double price, int quantity, Author auth){
        this.bookName = bookName;
        this.price = price;
        this.quantity = quantity;
        this.auth = auth;
    }
    
    void setBookName(String bookName){
        this.bookName=bookName;
    }
    
    void setPrice(double price){
        this.price=price;
    }
    
    void setQuantity(int quantity){
        this.quantity=quantity;
    }
    
    String getBookName(){
        return this.bookName;
    }
    
    double getPrice(){
        return this.price;
    }
    
    int getQuantity(){
        return this.quantity;
    }
    
    String getAuthorOfBook(){
        return this.auth.getName();
    }
    
    String getAuthorEmail(){
        return this.auth.getEmail();
    }
    
    char getAuthorGender(){
        return this.auth.getGender();
    }
    
    void get(){
        System.out.println("Book name : "+getBookName()+"\nBook Author : "+getAuthorOfBook()+"\nAuthor eMail : "+getAuthorEmail()+"\nAuthor Gender : "+getAuthorGender()+"\nBook Price : "+getPrice()+"$\nQuantity : "+getQuantity());
    }
    
     public static void main(String []args){
         Author auth = new Author("Yudi Jagani", "simon.shim@sjsu.edu",'M');
         Book bk = new Book("Life of Pie", 1200.30, 2, auth);
         auth.setName("Simon Shim");
         bk.setBookName("Enterprise Distributed Systems");
         bk.setPrice(350.76);
         bk.setQuantity(7);
         bk.get();
     }
    
}