import java.util.*;

//Abstract class 
abstract class Shape{
	double x,y;
	
	//non - abstract member function 
	void getData(double a,double b) {
		x = a;
		y = b;
	}
	void getData(double a) {
		x = a;
	}
	//abstract member function
	abstract void area();
}

class Square extends Shape{
	void area(){
		System.out.println(x*x);
	}
}
 class Circle extends Shape{
 	void area(){
	System.out.println(Math.PI*x*x);
    }
}

class Triangle extends Shape{
	void area(){
		System.out.println((x*y)/2);
	}
}

class Rectangle extends Shape{
	void area(){
		System.out.println(x*y);
	}
}

public class Shapes{
	public static void main(String []a) {
		Scanner sc = new Scanner(System.in);
		
		boolean cnt = true;
		while(cnt) {
			System.out.print("1. Rectangle \n2. Triangle \n3. Circle \n4. Square \n0. Exit \nEnter your choice : ");
			int p;
			p = sc.nextInt();
			double x,y;
            switch(p) {
            	case 1:
            		Rectangle r = new Rectangle();
            		System.out.print("Enter length : ");
            		x=sc.nextDouble();
            		System.out.print("Enter breadth : ");
            		y=sc.nextDouble();
            		r.getData(x,y);
            		r.area();
            		break;
            	case 2:
            		Triangle t = new Triangle();
            		System.out.print("Enter height : ");
            		x=sc.nextDouble();
            		System.out.print("Enter base : ");
            		y=sc.nextDouble();
            		t.getData(x,y);
            		t.area();
            		break;
            	case 3:
            		Circle c = new Circle();
            		System.out.print("Enter radius : ");
            		x=sc.nextDouble();
            		c.getData(x);
            		c.area();
            		break;
            	case 4:
            		Square s = new Square();
            		System.out.print("Enter side : ");
            		y=sc.nextDouble();
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
