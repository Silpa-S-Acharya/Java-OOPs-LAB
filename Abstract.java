import java.util.*;
abstract class Shape{
abstract void calculate_area();
} class Rectangle extends Shape{
float len,bdth;
Rectangle(float l,float b){
len=l;bdth=b;
}
void calculate_area(){
System.out.println("Area of rectangle is " + " " + (len*bdth));
}
} class Circle extends Shape{
float radius;
Circle(float r){
radius=r;
}
void calculate_area(){
System.out.println("Area of circle is " + " " + (3.14*radius*radius));
}
} class Square extends Shape{
47
float side;
Square(float a){
side=a;
}
void calculate_area(){
System.out.println("Area of square is " + " " + (side*side));
}
} class Abstract{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length of the rectangle: ");
float l=sc.nextFloat();
System.out.print("Enter the breadth of the rectangle: ");
float b=sc.nextFloat();
Shape obj1=new Rectangle(l,b);
obj1.calculate_area(); System.out.print("Enter the radius of the circle: ");
float r=sc.nextFloat();
Shape obj2=new Circle(r);
obj2.calculate_area();
System.out.print("Enter the side length of the square: ");
float a=sc.nextFloat();
Shape obj3=new Square(a);
obj3.calculate_area();
}
}
