import java.util.Scanner;

//Abstract class 
abstract class Shape {
    double x, y;

    //non - abstract member function 
    void getData(double a, double b) {
        x = a;
        y = b;
    }
    void getData(double a) {
        x = a;
    }
    //abstract member function
    abstract void area();
}

class Square extends Shape {
    void area() {
        System.out.println("Area : "+x * x);
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area : "+Math.PI * x * x);
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area : "+(x * y) / 2);
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area : "+x * y);
    }
}

public class Shapes {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        boolean cnt = true;
        while (cnt) {
            System.out.print("1. Rectangle \n2. Triangle \n3. Circle \n4. Square \n0. Exit \nEnter your choice : ");
            int p;
            p = sc.nextInt();
            double x, y;
            switch (p) {
                case 1:
                    Rectangle r = new Rectangle();
                    System.out.print("Enter length : ");
                    x = sc.nextDouble();
                    System.out.print("Enter breadth : ");
                    y = sc.nextDouble();
                    r.getData(x, y);
                    r.area();
                    break;
                case 2:
                    Triangle t = new Triangle();
                    System.out.print("Enter height : ");
                    x = sc.nextDouble();
                    System.out.print("Enter base : ");
                    y = sc.nextDouble();
                    t.getData(x, y);
                    t.area();
                    break;
                case 3:
                    Circle c = new Circle();
                    System.out.print("Enter radius : ");
                    x = sc.nextDouble();
                    c.getData(x);
                    c.area();
                    break;
                case 4:
                    Square s = new Square();
                    System.out.print("Enter side : ");
                    y = sc.nextDouble();
                    s.getData(y);
                    s.area();
                    break;
                case 0:
                    cnt = false;
                    break;
            }
        }
        sc.close();
    }
}

//OUTPUT

//1. Rectangle 
//2. Triangle 
//3. Circle 
//4. Square 
//0. Exit 
//Enter your choice : 1
//Enter length : 5
//Enter breadth : 8
//Area : 40.0
//1. Rectangle 
//2. Triangle 
//3. Circle 
//4. Square 
//0. Exit 
//Enter your choice : 2
//Enter height : 10
//Enter base : 20
//Area : 100.0
//1. Rectangle 
//2. Triangle 
//3. Circle 
//4. Square 
//0. Exit 
//Enter your choice : 3
//Enter radius : 14
//Area : 615.7521601035994
//1. Rectangle 
//2. Triangle 
//3. Circle 
//4. Square 
//0. Exit 
//Enter your choice : 4
//Enter side : 7
//Area : 49.0
//1. Rectangle 
//2. Triangle 
//3. Circle 
//4. Square 
//0. Exit 
//Enter your choice : 0
