import java.util.Scanner;

class Calc {

    //sum 
    public Complex sum(Complex c1, Complex c2) {
        Complex ans = new Complex(0, 0);
        ans.real = c1.real + c2.real;
        ans.img = c1.img + c2.img;
        System.out.print("Sum: ");
        return ans;
    }

    //difference
    public Complex diff(Complex c1, Complex c2) {
        Complex ans = new Complex(0, 0);
        ans.real = c1.real - c2.real;
        ans.img = c1.img - c2.img;
        System.out.print("Difference: ");
        return ans;
    }
    
    //product 
    public Complex multiply(Complex c1, Complex c2) {
        Complex ans = new Complex(0, 0);
        ans.real = c1.real * c2.real - c1.img * c2.img;
        ans.img = c1.real * c2.img + c1.img * c2.real;
        System.out.print("Multiplication: ");
        return ans;
    }
    
    //modulus
    public double modulus(Complex c) {
        return Math.sqrt(c.real * c.real + c.img * c.img);
    }
    
    //division
    public Complex division(Complex c1, Complex c2) {
        Complex ans = new Complex(0, 0);

        double k = Math.round(modulus(c2) * modulus(c2));
        ans.real = (c1.real * c2.real + c1.img * c2.img) / k;
        ans.img = (c1.real * c2.img - c1.img * c2.real) / k;
        if (k == 0) {
            System.out.println("Error cannot divide by Zero");
        } else System.out.print("Division : ");

        return ans;
    }
    
    //display
    public void display(Complex c) {
        if (Double.isNaN(c.real) || Double.isNaN(c.img)) {
            return;
        }
        if (c.img >= 0) System.out.println(c.real + " + " + c.img + "i\n");
        else System.out.println(c.real + "" + c.img + "i\n");
    }
}

public class Complex {
    double real = 0, img = 0;
    
    Complex(double r, double i) {
        real = r;
        img = i;
    }

    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);

        //	Complex c1 = new Complex(5,3);
        //	Complex c2 = new Complex(3,4);
        int c;
        Complex c1 = new Complex(0, 0), c2 = new Complex(0, 0);
        Calc result = new Calc();
        
        System.out.println("1 - Input");
        System.out.println("2 - Sum");
        System.out.println("3 - Difference");
        System.out.println("4 - Product");
        System.out.println("5 - Division");
        
        do {

            
            System.out.print("\nEnter your choice : ");

            int x = s.nextInt();
            switch (x) {
                case 1:
                    {	
                    	System.out.print("Enter real part  : ");
                        double a1 = s.nextDouble();
                        System.out.print("Enter imaginary part : ");
                        double b1 = s.nextDouble();
                        System.out.print("Enter real part  : ");
                        double a2 = s.nextDouble();
                        System.out.print("Enter imaginary part : ");
                        double b2 = s.nextDouble();

                        c1 = new Complex(a1, b1);
                        c2 = new Complex(a2, b2);
                        break;
                    }
                case 2:
                    {
                        Complex sum = result.sum(c1, c2);
                        result.display(sum);
                        break;
                    }
                case 3:
                    {
                        result.display(result.diff(c1, c2));
                        break;
                    }
                case 4:
                    {
                        result.display(result.multiply(c1, c2));
                        break;
                    }
                case 5:
                    {
                        result.display(result.division(c1, c2));
                        break;
                    }
                default:
                    {
                        System.out.println("Invalid Choice !");
                        break;
                    }

            }
            System.out.print("Press 1 to continue : ");
            c = s.nextInt();
        } while (c == 1);
        s.close();
    }
}

//OUTPUT 

//1 - Input
//2 - Sum
//3 - Difference
//4 - Product
//5 - Division
//
//Enter your choice : 1
//Enter real part  : 8
//Enter imaginary part : 6
//Enter real part  : 2
//Enter imaginary part : 9
//Press 1 to continue : 1
//
//Enter your choice : 2
//Sum: 10.0 + 15.0i
//
//Press 1 to continue : 1
//
//Enter your choice : 3
//Difference: 6.0-3.0i
//
//Press 1 to continue : 1
//
//Enter your choice : 4
//Multiplication: -38.0 + 84.0i
//
//Press 1 to continue : 1
//
//Enter your choice : 5
//Division : 0.8235294117647058 + 0.7058823529411765i
//
//Press 1 to continue : -1
