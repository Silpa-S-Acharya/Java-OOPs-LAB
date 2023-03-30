import java.util.Scanner;
class Test
{
public static void main(String args[])
{
	CPU o1 = new CPU();
	o1.display1();

	CPU.RAM o3 = new CPU.RAM();
	o3.set();
	o3.display();
}
}
class CPU
{	int price;
	Scanner kb = new Scanner(System.in);
	void display1()
	{	
		Processor o2 =new Processor();
		o2.read();
		o2.display2();
	}
	class Processor
	{	int ncores;
		String manft;
	
		void read()
		{System.out.println("Enter the price of CPU ");
		price = kb.nextInt();
		System.out.println("Enter the no: of cores ");
		ncores = kb.nextInt();
		System.out.println("Enter the name of CPU manufacturer ");
		manft = kb.next();
		}
		void display2()	
		{
			System.out.println("Manufacturer: " +manft);
			System.out.println("Number of cores: " +ncores);
			System.out.println("Price: " +price);
		}
	}
	public static class RAM
	{
		Scanner kb = new Scanner(System.in);
		String manf;
		int mm;
		void set()
		{
		System.out.println("Enter the memory size ");
		mm = kb.nextInt();
		System.out.println("Enter the name of manufacturer ");
		manf = kb.next();
		}
		void display()
		{	System.out.println("Memory Size " +mm+"GB");
			System.out.println("Memory manufacturer " +manf);
		}
	}
}



