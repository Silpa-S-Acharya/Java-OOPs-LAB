import java.util.*;
class Employee
{
public int empid;
public String ename, addr;
public float sal;
	Employee(int id, String name, String eaddr,float saly)
	{empid=id;
	ename=name;
	addr=eaddr;
	sal=saly;
	
	}
}
class Teacher extends Employee
{
public String subj,dept;
	Teacher(int id, String name, String eaddr,float saly,String dep,String sub)
	{super(id,name,eaddr,saly);
	subj=sub;
	dept=dep;

	}
	public void display()
	{
	System.out.println("Employee id : "+empid);
	System.out.println("Employee name : "+ename);
	System.out.println("emp_salary : "+addr);
	System.out.println("emp_address : "+sal);
	System.out.println("Department : "+dept);
	System.out.println("subjects taught by teacher: "+subj);
	System.out.println("----------------------------------------------");
	}


}
class Simplein
{
public static void main(String args[]){
int i;
Scanner sc =new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of employee");
int n=sc.nextInt();
Teacher[] obj=new Teacher[n];
for(i=0;i<n;i++)
	{
	System.out.println("enter the details of Employee "+(i+1));
	System.out.println("Employee id:");
	int empid=sc.nextInt();
	System.out.println("Employee name:");
	String name=s.nextLine();
	System.out.println("Employee Address:");
	String addr=s.nextLine();
	System.out.println("Employee Salary:");
	float sal=sc.nextFloat();
	System.out.println("Teacher Department:");
	String dept=s.nextLine();
	System.out.println("Subject taught by teacher:");
	String subj=s.nextLine();
	obj[i] = new Teacher(empid,name,addr,sal,dept,subj);
	}
for(i=0;i<n;i++)

obj[i].display();
}
}
