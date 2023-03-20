import java.util.Scanner;
class Product 
{String pcode, pname; 
int price;Product(String pcode_get, String pname_get, int price_get) 
{
	pcode = pcode_get; pname = pname_get; this.price = price_get;}
void compare(Product b,Product c)
{
if(price<=b.price && price<=c.price)

	System.out.println("Lowest price of product is "+pcode);
if(b.price<=c.price && b.price<=price)

	System.out.println("Lowest price of product is "+b.pcode);
if(c.price<=price && c.price<=price)

	System.out.println("Lowest price of product is "+c.pcode);

}

}
class Productdet
{
	public static void main(String args[])
{
	Product p_1=new Product("A123","Radio",887);
	Product p_2=new Product("B123","Cooler",587);
	Product p_3=new Product("C123","TV",1000);
	p_1.compare(p_2,p_3);
}
}
