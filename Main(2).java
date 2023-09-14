// Using string convert a text into lower or uppwr case;

import java.util.*;
class Main{
    
    public static void main(String[] args)
    {
        String s1="Hacker AG";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice=0/1");
        
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 0:
                System.out.println(s1.toLowerCase());
                break;
                
            case 1:
                System.out.println(s1.toUpperCase());
                break;
            
        }
    }
    
}