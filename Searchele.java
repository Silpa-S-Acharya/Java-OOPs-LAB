import java.util.Scanner;
class Searchele
{
public static void main(String args[])
{
	int i,n,f=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	n=sc.nextInt();
	int arr[]= new int[n];	
	System.out.println("Enter the elements of array");
	for(i=0;i<n;i++)
	arr[i]=sc.nextInt();
	System.out.println("Enter the element to be searched");
	int a=sc.nextInt();
	for(i=0;i<n;i++)
	{
		if(arr[i]==a)
		{
		f=1;
		break;
		}
	}
	if(f==1)
	System.out.println(a+" is found at position "+(i+1));
	else
	System.out.println("not found");
}
}
