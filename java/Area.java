import java.util.Scanner;
interface Shape
{
    
    int calarea();
}
class Circle implements Shape
{
    Scanner s=new Scanner(System.in);
      
       int  radius=s.nextInt();
    int area;
   
   public  int calarea()
    {
        area=1;
        area=22/7*radius*radius;
        return area;
    }
}
class Rec implements Shape
{
    Scanner s=new Scanner(System.in);
    int length=s.nextInt();
     int breadth=s.nextInt();
    int area;
    
   public  int calarea()
    {
        area=1;
       area=length*breadth;
        return area;
    }
}
class Demo
{
    public static void main(String[] args) {
        System.out.println("enter the radius");
        Circle c=new Circle();
        System.out.println(c.calarea());
        System.out.println("enter the length and breadth");
        Rec r=new Rec();
        System.out.println(r.calarea());
    }
}