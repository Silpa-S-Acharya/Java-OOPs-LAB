import java.util.Scanner;
public class Stdmarks
{	public static void main(String args[])
	{
	float per, total=0,t;
	int n,i,max;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of subjects ");
	n=s.nextInt();
	int mark[]=new int[n];
	System.out.println("Enter the maximum marks of each subject ");
	max=s.nextInt();
	System.out.println("Enter the mark ");
	for(i=0;i<n;i++)
	{	
		System.out.println("Enter the mark "+(i+1));		
		mark[i]=s.nextInt();
		if(mark[i]>max)
		{
		System.out.println("Enter the mark less than or equal to : "+max);
		i--;
		}
		
	}
	for(i=0;i<n;i++)
	{	
		
		total=total+mark[i];
		
	}
	t=n*max;
	per=(total/t)*100;
	System.out.println("Total :" +total);
	System.out.println("Percentage :"+per+"%");
	}
}





















