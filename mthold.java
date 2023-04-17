import java.util.*;
class Area
{
void area(int l, int b)
{
int r=l*b;
System.out.println("Area of rectangle: "+r);
}
void area(double r)
{
double a=3.14*r*r;
System.out.println("Area of circle: "+a);
}
void area(int side)
{
int ar=side*side;
System.out.println("Area of square: "+ar);
}
}
class mthold
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the length and breadth of rectangle ");
int l=s.nextInt();
int b=s.nextInt();
System.out.println("Enter the radius of circle ");
double r=s.nextDouble();
System.out.println("Enter the side of square ");
int side=s.nextInt();
Area o = new Area();
o.area(l,b);
o.area(r);
o.area(side);
}
} 

