import java.util.*;
interface Student{
void set_value1(String sname,int s,String regno);
} interface Sports{
void set_value2(float p);
} class Result implements Student, Sports{
public String name,reg_no;
public int total;
public float score_point;
public void set_value1(String sname,int s,String regno){
name=sname;
total=s;
reg_no=regno;
}
public void set_value2(float pt){
score_point=pt;
}
public void display(){
System.out.println("Register number: "+ reg_no);
System.out.println("Name: " + name);
System.out.println("Academic score: " + total);
System.out.println("Score obtained in sports: " + score_point);
}
37
} class Interfaceprgrm{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
int total;float pt;
System.out.print("Enter the register number: ");
String reg_no=sc.nextLine();
System.out.print("Name of the student: ");
String name=sc.nextLine();
System.out.println("Enter the academic and sports details of a student: ");
System.out.print("Enter the total marks obtained(max marks 1200): ");
total=s.nextInt();
System.out.println("Enter the overall score point obtained in sports(max
point 10): ");
pt=s.nextFloat();
Result obj=new Result();
obj.set_value1(name,total,reg_no);
obj.set_value2(pt);
obj.display();
}
}
