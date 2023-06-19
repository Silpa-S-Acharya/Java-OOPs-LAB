import java.util.*;
interface interface1
{
	void area();
	void perimeter();
} 
class Circle implements interface1
{
	public float r;
	Circle(float rad)
	{
		r=rad;
	}
	public void area()
	{

		System.out.println("Area of the circle is: " + (3.14*r*r));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of the circle is: " + (2*3.14*r));
	}
} 
class Rectangle implements interface1
{
	public float len,bdth;
	Rectangle(Float l, Float b)
	{
		len=l;
		bdth=b;
	}	
	public void area()
	{
		System.out.println("Area of the rectangle is: " + (len*bdth));
	}	
	public void perimeter()
	{
		System.out.println("Perimeter of the rectangle is: " + (2*(len+bdth)));
	}
} 
class AreaPeri
{
	public static void main(String[]args)
	{
		int ch=1;
		while(ch == 1)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\n 1.Circle 2. Rectangle ");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1: System.out.print("Enter the radius of the circle: ");
					float r=sc.nextFloat();
					Circle c=new Circle(r);
					c.area();
					c.perimeter();
					break;
				case 2: System.out.print("Enter the length of the rectangle:");
					float l=sc.nextFloat();
					System.out.print("Enter the breadth of the rectangle: ");
					float b=sc.nextFloat();
					Rectangle rec=new Rectangle(l,b);
					rec.area();
					rec.perimeter();
					break;

			}
			System.out.print("Want to continue?(1(yes) or 0(no)) ");
			ch=sc.nextInt();
		}
	}
}
