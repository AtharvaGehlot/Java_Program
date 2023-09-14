/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Name
{
    String name;
    String surname;
    
    Name(String name,String surname)
    {
        this.name=name;
        this.surname=surname;
    }
    
    public static Name add(Name n1,Name n2)
    {
        return new Name(n1.name+" "+n2.surname,n1.name+" "+n2.surname);
    }
}
    
    class eg1
    {
        public static void main(String[] args)
        {
            Name n1=new Name("Aishwarya","Rai");
            Name n2=new Name("Abhishek","Bachan");
            Name n3=Name.add(n1,n2);
            
            System.out.println(n3.name+" "+n3.surname);
        }
    }
