import java.util.Scanner;
public class MarkArray{
public static void main(String[] args){
int n;
float percentage,total = 0;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of subject:");
n = s.nextInt();
int marks[] = new int[n];
System.out.println("Enter marks out of 100:");
for(int i = 0; i < n; i++){
marks[i] = s.nextInt();
total += marks[i];
}
int p=n*100;
percentage=(total/p)*100;
System.out.println("Sum:"+total);
System.out.println("Percentage:"+percentage);
}
}
