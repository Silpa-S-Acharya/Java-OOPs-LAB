package Arithmetic;
interface operations
{
 void add(float a, float b);
 void sub(float a, float b);
 void mul(float a, float b);
 void div(float a, float b);
}
public class Calculator implements operations
{
//public float a,b,c,d,m,s;
public float c,d,m,s;

public void add(float a, float b)
{
	c=a+b;
	System.out.println("Sum is "+c);
}
public void sub(float a, float b)
{
	s=a-b;
	System.out.println("Difference is "+s);
}
public void mul(float a, float b)
{
	m=a*b;
	System.out.println("Product is "+m);
}
public void div(float a, float b)
{
	d=a/b;
	System.out.println("Quotient is "+d);
}

public static void main(String args[])
{
}
}
