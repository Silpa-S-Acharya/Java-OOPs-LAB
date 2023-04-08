import java.util.Scanner;
public class Complex {
    
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the complex 1 ");
        double a1 = s.nextDouble();
        double b1 = s.nextDouble();
        System.out.println("Enter the complex 2 ");
        double a2 = s.nextDouble();
        double b2 = s.nextDouble();
        Complex n1 = new Complex(a1, b1),
                n2 = new Complex(a2, b2),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}
