import java.util.Scanner;
class Sortstr{
public static void main(String args[]){
int i,j,n;
String temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of strings");
n=sc.nextInt();
String str[]= new String[n];
Scanner s=new Scanner(System.in);
System.out.println("Enter the strings");
for(i=0;i<n;i++)
str[i]=s.nextLine();
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(str[i].compareTo(str[j])>0){
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("Stings in sorted order");
for(i=0;i<n;i++)
System.out.println(str[i]);
}
}
