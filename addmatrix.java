import java.util.Scanner;
class AddMatrix{
public static void main(String args[]){
int i,j,rows,cols;
Scanner n=new Scanner(System.in);
System.out.println("Enter the no of rows: ");
rows=n.nextInt();
System.out.println("Enter the no of cols: ");
cols=n.nextInt();
int A[][]= new int[rows][cols];
int B[][]=new int[rows][cols];
System.out.println("Enter the elements of Matrix A: ");
for(i=0;i<rows;i++){
for(j=0;j<cols;j++){
A[i][j]=n.nextInt();
}
}
System.out.println("Enter the elements of Matrix B: ");
for(i=0;i<rows;i++){
for(j=0;j<cols;j++){
B[i][j]=n.nextInt();
}
} int C[][]=new int[rows][cols];
System.out.println(" The sum of Matrix A and B: ");
for(i=0;i<rows;i++){
for(j=0;j<cols;j++){
C[i][j]=A[i][j]+B[i][j];
System.out.print(C[i][j]+" ");
}

System.out.println();
}
}
}
