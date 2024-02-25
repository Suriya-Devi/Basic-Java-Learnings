package assignments;
//Assignement 30 -Area and Circumference using Scanner class
import java.util.Scanner;

public class Ass30_ShapesUsingScanner {
	final static double pi=3.14;
	static int r;
	static double base,height,a,b,c,d;
	static double length,breadth;
	 
	//static double h;
	
	static void areaCircle() {
		
		double Area_of_Circle = pi * r * r;
		System.out.println("Area of the circle is " + Area_of_Circle);
	}
	
	static void circumCircle() {
		
		double Circumference_of_Circle = 2 * pi * r;
		System.out.println("Circumference of the circle is " + Circumference_of_Circle);
	}
	
	static void areaTriangle() {
		
		double Area = (base * height) / 2;
		System.out.println("Area of a triangle is " +Area);
	}

	void perimeterofTriangle() {
		double Perimeter = a + b + c;
		System.out.println("Perimeter of the triangle is " + Perimeter);
	}
	
	void areaRectangle() {
		double Area=length * breadth;
		System.out.println("Arae of Rectangle is "+Area);
		
	}
	
	void periOfRectangle() {
		double  Perimeter=2 *(length + breadth);
		System.out.println("Perimeter of Rectangle is "+Perimeter);
	}
	
	static void area_Square() {
		double Area = a * a;
		System.out.println("Area of the Square is " + Area);

	}

	static void perimeterofSquare() {
		double Perimeter = 4 * a;
		System.out.println("Perimeter of the Square is " + Perimeter);
	}

	void areaofTrapezium() {
		//double a = 6.7, b = 0.8, h = 9.4;
		double Area = ((a + b) / 2) * height;
		System.out.println("Area of Trapezium is " + Area);
	}

	void perimeterofTrapezium() {
		
		double Perimeter = a + b + c + d;
		System.out.println("Perimeter of the Trapezium is " + Perimeter);

	}
	

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		/*System.out.println("Enter the value of r");
		r=s1.nextInt();
		areaCircle();
		circumCircle();
		
		System.out.println("Enter the value of base");
		 base = s1.nextDouble();
		System.out.println("Enter the value of height");
		 height = s1.nextDouble();
		areaTriangle();*/
		
		a=s1.nextDouble();
		b=s1.nextDouble();
		//c=s1.nextDouble();
		
		Ass30_ShapesUsingScanner a1=new Ass30_ShapesUsingScanner();
		/*a1.perimeterofTriangle();
		System.out.println("Enter the value of length");
		length = s1.nextDouble();
		System.out.println("Enter the value of breadth");
		breadth = s1.nextDouble();
		area_Square();
		perimeterofSquare();*/
		System.out.println("Enter the value of height");
		 height = s1.nextDouble();
		a1.areaofTrapezium();
		//a1.perimeterofTrapezium();
		
		
		
				
		

	}

}
