/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//declare the primitive data type with some initial value convert this primitive data type to object using wrapper class
public class WrapperExample2{
    public static void main(String args[]){
        Integer a=new Integer(3);
        int i=a.intValue();
        int j=a;
        System.out.println(a+""+i+""+j);
    }
}
