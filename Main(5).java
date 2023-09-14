// Joining two strings in java
class Main{
    
    public static void main(String []args)
    {
        //creat first String
        String first="Java";
        System.out.println("Frist String "+first);
        
        //creating second string
        String second="Programming";
        System.out.println("Second string "+second);
        
        //join two string
        String joinString=first.concat(second);
        System.out.println("Joined String "+joinString);
    }
    
}