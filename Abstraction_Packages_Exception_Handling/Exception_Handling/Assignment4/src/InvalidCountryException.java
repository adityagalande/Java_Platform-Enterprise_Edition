class InvalidCountryException  extends Exception  
{  
    public InvalidCountryException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}