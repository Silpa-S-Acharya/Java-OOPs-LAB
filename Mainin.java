import java.util.*;
class Employee{
public int emp_id;
public String emp_name,emp_address;
public float salary;
Employee(int id,String name,float sal,String add){
emp_id=id;
emp_name=name;
salary=sal;
emp_address=add;
}
}
class Teacher extends Employee{
public String dept,subject;
Teacher(int id,String name,float sal,String add,String dep,String subj){
super(id,name,sal,add);
dept = dep;
subject = subj;
}
public void display(){
System.out.println("emp_id is"+emp_id);
System.out.println("emp_name is"+emp_name);
System.out.println("emp_salary is"+Salary);
System.out.println("emp_address is"+emp_address);
System.out.println("emp_separtment is"+dept);
System.out.println("Teacher subjects taught is"+subject);
}
} class SimpleIn{
public static void main(String args[]){
int i;
Scanner sc =new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("enter the no of employee");
int n=sc.nextInt();
Teacher[] obj=new Teacher[n];
for(i=0;i<n;i++){
System.out.println("enter the details of Employee"+(i+1));
System.out.println("Employee id:");
int id=sc.nextInt();
System.out.println("Employee name:");
String name=s.nextLine();
System.out.println("Employee Salary:");
float sal=sc.nextFloat();
System.out.println("Employee Address:");
String add=s.nextLine();
System.out.println("Teacher Department:");
String dept=s.nextLine();
System.out.println("Subject taught by teacher:");
String subj=s.nextLine();
obj[i] = new Teacher(id,name,sal,add,dept,subj);
}
for(i=0;i<n;i++)
obj[i].display();
}
}
