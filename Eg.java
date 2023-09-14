/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class complex
{
  int real;
  int imag;
    complex (int real, int imag)
  {
    this.real = real;
    this.img = imag;
    
  }
    public static complex add (complex x, complex y){
    
      return new complex (x.real + y.real, x.imag + y.imag);
}
        public static complex add (complex x, complex y)
    
      return new complex (x.real + y.real, x.imag + y.imag);

    
  }
}
class Eg
{
  public static void main (String[]args)
  {
    complex x = new complex (3, 4);
    complex y = new complex (2, 3);
    complex z = new complex (x, y);
      system.out.println (z.real + z.imag + "i");
  }

}
