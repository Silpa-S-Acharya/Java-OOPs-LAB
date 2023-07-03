import java.util.*;
import java.text.SimpleDateFormat;
interface bill
{
	void method();
}
class Product implements bill
{
	String p_name;
	int p_id,p_qty,order_no;
	float p_price,total_price;
	Product()
	{
	}
	Product(String name,int id,int qty,float price,float total)
	{
		p_name=name;
		p_id=id;
		p_qty=qty;
		p_price=price;
		total_price=total;
	}
	void display()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		String str = formatter.format(date);
		Random rand = new Random();
		int upperbound = 25;
		int int_random = rand.nextInt(upperbound);
		System.out.println("\n");
		System.out.println("Order no:"+ int_random);
		System.out.println("Date: " + str);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("\nProduct Id\tName\t Quantity\tUnit price\tTotal");
	}
	public void method()
	{
		System.out.println(p_id+"\t\t" +p_name+"\t\t" +p_qty+"\t" +p_price+"\t\t" +total_price);
	}
}
class Bill
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		float net_amt=0,total;
		System.out.print("Enter the total number of items: ");
		int n=sc.nextInt();
		Product [] obj=new Product[n];
		for(int i=0;i<n;i++)
{
		System.out.println("Enter product" + " " +(i+1) + " " + "details:");
		System.out.print("Name: ");
		String name = s.nextLine();
		System.out.print("ID: ");
		int id= sc.nextInt();
		System.out.print("Quantity: ");
		int qty = sc.nextInt();
		System.out.print("Price (per item): ");
		float price = sc.nextFloat();
		total = price * qty;
		net_amt+=total;
		obj[i]=new Product(name,id,qty,price,total);
		}
		Product prdct=new Product();
		prdct.display();
		for(int i=0;i<n;i++)
		obj[i].method();
		System.out.println("---------------------------------------------------------------------------------");
		String temp="Net Amount";
		System.out.println("\t\t\t\t\t\t"+temp+" "+net_amt);
		System.out.println();
	}
}
