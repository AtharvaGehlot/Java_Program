/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// #1. To print the intger given by the intger.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the integer:  ");
        int n= r.nextInt();
        System.out.println("No. is  "+n);
    }
}   */

//#2.To check whether the no. is even or odd.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the integer:  ");
        int n=r.nextInt();
        if(n%2==0)
            System.out.println("The number "+n+" is even.");
        else
            System.out.println("The number "+n+" is odd.");
    }
}
*/
//#3.Write a program to check the given character is vowel or consonant.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter any Character:  ");
        char c= r.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
           System.out.println("The entered character is vowel.");
         else
          System.out.println("The entered character is consonant.");
          
    }
}
*/
//#4.Write a program to sum all the no. from 1 to given integer no. n.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the integer:  ");
        int n=r.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of the number is "+sum);
    }
}  */
    
//#5.WAP to print from capital A to capital using for loop.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        for(char i='A';i<='Z';i++){
            System.out.print(i+"    ");
        }
    }
    
}
*/

//#7 WAP to print the GDC of two numbers.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        int gdc=0
        int n1=30;
        int n2=45;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(i%n1==0 && i%n2==0);
                gdc =i;
        } 
        System.out.println(gcd);
    }
}   */

//#8 WAP to print the table of the number.
/*
import java.util.*;
public class Trial{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the integer:  ");
        int n=r.nextInt();
        int t=1;
        int f=1;
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
*/