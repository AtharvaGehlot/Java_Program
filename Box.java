//Name :-Aditya Sharma
//Roll No.-12
//Class:-CSIT-1
//Prog19
import java.util.*;
public class Box{
    private length;
    private breadth;
    private height;
    void setDimension(int l,int b,int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    void getDimension(){
        System.out.println("The length of box is "+length);
        System.out.println("The bredth of box is "+bredth);
        System.out.println("The height of box is "+height);
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int Length=nextInt();
       int Breadth=nextInt();
       int Height=nextInt();
       Box.setDimension(Length,Bredth,Height);
       Box.getDimensions();
    }
}
    

