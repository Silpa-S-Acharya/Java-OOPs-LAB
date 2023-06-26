import java.util.*;
class Dimen
{
	public float a,b;
	Dimen()
	{

	}
	Dimen(float side)
	{
		a=side;

	}
	Dimen(float len,float bdth)
	{
		a=len;
		b=bdth;

	}
	void area()
	{
		System.out.println("Area of different shapes ");
	}
}
class Square extends Dimen
{

	Square(float a)
	{
		super(a);
	}
	void area()
	{
		System.out.println("Area of square: "+a*a);
	}
}
class Rectangle extends Dimen
{
	Rectangle(float a,float b)
	{
		super(a,b);
		
	
	}
	void area()
	{
		System.out.println("Area of rectangle: "+a*b);
	}
}
class Circle extends Dimen
{

	Circle(float a)
	{
		super(a);
		
	}
	void area()
	{
		System.out.println("Area of circle: "+3.14*a*a);
	}
}
class Overriding
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		Dimen d=new Dimen();
		d.area();
		System.out.println("Enter the side of square ");
		float a=sc.nextFloat();
		Square sq=new Square(a);
		sq.area();

		System.out.println("Enter the length of rectangle ");
		float l=sc.nextFloat();
		System.out.println("Enter the breadth of rectangle ");
		float b=sc.nextFloat();
		Rectangle rec=new Rectangle(l,b);
		rec.area();

		System.out.println("Enter the radius of circle ");
		float r=sc.nextFloat();
		Circle c=new Circle(r);
		c.area();

		
	}
}
