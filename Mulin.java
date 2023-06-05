import java.util.*;
class Person
{
public int age;
public String pname,gender,address;
Person(String name,String sex,String add,int age)
{
	pname=name;
	this.age=age;
	gender=sex;
	address=add;
}
}
class Employee extends Person
{
public int empid;
public String cpname,qual;
public float salary;
Employee(int id,String cname,float sal,String quali,String name,String sex,String add,int age)
{
	super(name,sex,add,age);
	empid=id;
	cpname=cname;
	salary=sal;
	qual=quali;
}
}
class Teacher extends Employee
{
public int tchid;
public String dept,sub;
Teacher(int id,String cname,float sal,String quali,String name,String sex,String add,int age,String dep,String subj,int tid)
{
	super(id,cname,sal,quali,name,sex,add,age);
	tchid=tid;
	dept = dep;
	sub = subj;
}
public void display(){
System.out.println();
System.out.println("Person Name  : "+pname);
System.out.println("Person Age  : "+age);
System.out.println("Person Gender  :"+gender);
System.out.println("Person Address  :" +address);
System.out.println("emp_id  :"+empid);
System.out.println("Cname  :"+cpname);
System.out.println("Emp Salary  :"+salary);
System.out.println("emp_Qualificatio  :"+qual);
System.out.println("Teacher id  :"+tchid);
System.out.println("Employee Department  :"+dept);
System.out.println("Teacher subjects taught  :"+sub);
System.out.println("----------------------------------------------");
}
}
class Mulin{
public static void main(String args[]){
int i;
Scanner sc =new Scanner(System.in);
 
System.out.println("enter the no of Persons");
int n=sc.nextInt();

Teacher[] t=new Teacher[n];

for(i=0;i<n;i++)
{
	System.out.println("enter the details of Persons"+(i+1));
	System.out.println("Employee id:");
	int id=sc.nextInt();

	System.out.println("Employee Salary:");
	float sal=sc.nextFloat();
	System.out.println("Teacher id:");
	int tid=sc.nextInt();
	
	System.out.println("Person age:");
	int age=sc.nextInt();

	sc.nextLine();
	System.out.println("Person name:");
	String name=sc.nextLine();

	System.out.println("Person Gender:");
	String sex=sc.nextLine();
	System.out.println("Person Address:");
	String add=sc.nextLine();

	System.out.println("Company name:");
	String cname=sc.nextLine();

	System.out.println("Employee Qualification:");
	String quali=sc.nextLine();

	System.out.println("Teacher Department:");
	String dep=sc.nextLine();
	System.out.println("Subject taught by teacher:");
	String subj=sc.nextLine();
	t[i] = new Teacher(id,cname,sal,quali,name,sex,add,age,dep,subj,tid);
}
for(i=0;i<n;i++)
t[i].display();
}
}
