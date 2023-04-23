import java.util.*;
class Person{
public int age;
public String pname,gender,address;
Person(String name,String sex,String add,int age){
pname=name;
this.age=age;
gender=sex;
address=add;
}
} class Employee extends Person{
public int emp_id;
public String cp_name,qualification;
public float salary;
Employee(int id,String cname,float sal,String qualifctn,String name,String
sex,String add,int age){
super(name,sex,add,age);
emp_id=id;
cp_name=cname;
salary=sal;
qualification=qualifctn;
}
} class Teacher extends Employee{
public int teach_id;
public String dept,subject;
Teacher(int id,String cname,float sal,String quali,String name,String sex,String
add,int age,String dep,String subj,int tid){
super(id,cname,sal,quali,name,sex,add,age);
teach_id=tid;
dept = dep;
subject = subj;
}
public void display(){
System.out.println();
System.out.println("person_name is : "+pname);
System.out.println("person_age is : "+age);
System.out.println("person Gender is :"+gender);
System.out.println("person Address is :" +address);
System.out.println("emp_id is :"+emp_id);
System.out.println("cp_name is :"+cp_name);
System.out.println("emp_salary is :"+Salary);
System.out.println("emp_Qualificatio is :"+qualification);
System.out.println("teacher_id is :"+teach_id);
System.out.println("emp_separtment is :"+dept);
System.out.println("Teacher subjects taught is :"+subject);
}
} class Multilevel{
 public static void main(String args[]){
int i;
Scanner sc =new Scanner(System.in);
Scanner s =new Scanner(System.in);
System.out.println("enter the no of Persons");
int n=sc.nextInt();
Teacher[] obj=new Teacher[n];
for(i=0;i<n;i++){
System.out.println("enter the details of Persons"+(i+1));
System.out.println("Person name:");
String name=s.nextLine();
System.out.println("Person age:");
int age=sc.nextInt();
System.out.println("Person Gender:");
String sex=s.nextLine();
System.out.println("Person Address:");
String add=s.nextLine();
System.out.println("Employee id:");
int id=sc.nextInt();
System.out.println("Company name:");
String cname=s.nextLine();
System.out.println("Employee Salary:");
float sal=sc.nextFloat();
System.out.println("Employee Qualification:");
String quali=s.nextLine();
System.out.println("Teacher id:");
int tid=sc.nextInt();
System.out.println("Teacher Department:");
String dep=s.nextLine();
System.out.println("Subject taught by teacher:");
String subj=s.nextLine();
obj[i] = new Teacher
(id,cname,sal,quali,name,sex,add,age,dep,subj,tid);
}
for(i=0;i<n;i++)
obj[i].display();
}
}
