import java.util.*;
class Sort{
public static void main(String args[]){
String temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
temp=sc.nextLine();
char str_arr[]=temp.toCharArray();
Arrays.sort(str_arr);
String sorted="";
sorted=sorted.valueOf(str_arr);
System.out.println("Sorted string is \n" +sorted);
}
}
