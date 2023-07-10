import Arithmetic.Calculator;
import java.util.*;
public class Operations
{
	public static void main(String args[])
	{
		float a,b;		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value");
		a = sc.nextFloat();
		
		System.out.print("enter another value");
		b = sc.nextFloat();	
		Calculator cal = new Calculator();
		cal.add(a,b);
		cal.sub(a,b);
		cal.mul(a,b);
		cal.div(a,b);
	}
}
