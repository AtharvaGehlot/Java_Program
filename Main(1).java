// the emain using string
import java.util.*; 
public class Main{
     
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Scanner sc1=new Scanner(System.in);
        System.out.println("Enter name");

        String name=sc.nextLine();
        System.out.println("Enter year of enroll");
        int i=sc.nextInt();
        String year=String.valueOf(i);
        
        System.out.println("Enter enroll");
        String enroll=sc1.nextLine();
        String newenroll=enroll.substring(8,12);
        
        String s=name.concat(year);
        String S=s.concat(newenroll);
        
        // String S=(name.concat(year)).concat(newenroll);
        System.out.println("The emain is "+S);
    }
    
}