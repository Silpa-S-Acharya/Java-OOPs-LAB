import java.util.Scanner;
class Mtrixsearch{
public static void main(String args[]){
int i,size,f=0;
Scanner n=new Scanner(System.in);
System.out.println("Enter the size of array");
size=n.nextInt();
int arr[]= new int[size];
System.out.println("Enter the elements of array");
for(i=0;i<size;i++)
arr[i]=n.nextInt();
System.out.println("Enter the element to be searched");
int a=n.nextInt();
for(i=0;i<size;i++){
if(arr[i]==a){
f=1;
break;
}
} if(f==1)
System.out.println(a+" is found at position "+(i+1));
else
System.out.println("not found");
}
}
