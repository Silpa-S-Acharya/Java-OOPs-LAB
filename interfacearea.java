import java.util.*;
interface interface1{
void area();
void perimeter();
} class Circle implements interface1{
public float radius;
Circle(float rad){
radius=rad;
}
public void area(){
39
System.out.println("Area of the circle is: " + (3.14*radius*radius));
}
public void perimeter(){
System.out.println("Perimeter of the circle is: " + (2*3.14*radius));
}
} class Rectangle implements interface1{
public float len,bdth;
Rectangle(Float l, Float b){
len=l;
bdth=b;
}
public void area(){
System.out.println("Area of the rectangle is: " + (len*bdth));
}
public void perimeter(){
System.out.println("Perimeter of the circle is: " + (2*(len+bdth)));
}
} class Area_perimeter{
public static void main(String[]args){
int ch=1;
while(ch == 1){
Scanner sc=new Scanner(System.in);
System.out.println("Choose either 1 or 2 to find the area and
perimeter of,");
System.out.println("\n 1.circle 2. Rectangle ");
System.out.print("Enter your choice: ");
int choice=sc.nextInt();
switch(choice){
case 1: System.out.print("Enter the radius of the circle: ");
float r=sc.nextFloat();
Circle obj1=new Circle(r);
obj1.area();
obj1.perimeter();
break;
case 2: System.out.print("Enter the length of the rectangle:
");
float l=sc.nextFloat();
System.out.print("Enter the breadth of the
rectangle: ");
float b=sc.nextFloat();
Rectangle obj2=new Rectangle(l,b);
obj2.area();
obj2.perimeter();
break;
40
}
System.out.print("Want to continue?(1(yes) or 0(no)) ");
ch=sc.nextInt();
}
}
}
