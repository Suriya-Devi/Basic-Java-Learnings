package assignments;

public class Ass_22_Area_and_Circumference {
	final static double pi = 3.14;

	static void areaCircle(int r) {
		//int r = 10;
		double Area_of_Circle = pi * r * r;
		System.out.println("Area of the circle is " + Area_of_Circle);
	}

	static void circumCircle(int r) {
		//int r = 15;
		double Circumference_of_Circle = 2 * pi * r;
		System.out.println("Circumference of the circle is " + Circumference_of_Circle);
	}

	static void areaTriangle(double base,double height) {
		//double base = 5.5, height = 3.0;
		double Area = (base * height) / 2;
		System.out.println("Area of a triangle is " + Area);
	}

	void perimeterofTriangle(double a,double b,double c) {
		//double a = 2.5, b = 1.7, c = 2.8;
		double Perimeter = a + b + c;
		System.out.println("Perimeter of the triangle is " + Perimeter);
	}

	void area_Rectangle(double length,double breadth) {
		//double length = 4.5, breadth = 2.5;
		double Area = length * breadth;
		System.out.println("Area of the Rectangle is " + Area);
	}

	void perimeterofRectangle() {
		double l = 3.5, b = 6.9;
		double Perimeter = 2 * (l + b);
		System.out.println("Perimeter of the Rectangle is " + Perimeter);
	}

	static void area_Square(double a) {
		double Area = a * a;
		System.out.println("Area of the Square is " + Area);

	}

	static void perimeterofSquare(double a) {
		double Perimeter = 4 * a;
		System.out.println("Perimeter of the Square is " + Perimeter);
	}

	void areaofTrapezium() {
		double a = 6.7, b = 0.8, h = 9.4;
		double Area = (a + b) / 2 * h;
		System.out.println("Area of Trapezium is " + Area);
	}

	void perimeterofTrapezium() {
		double a = 2.5, b = 3.2, c = 4.3, d = 7.6;
		double Perimeter = a + b + c + d;
		System.out.println("Perimeter of the Trapezium is " + Perimeter);

	}

	public static void main(String[] args) {
		areaCircle(4);
		circumCircle(6);
		areaTriangle(5.5,3);
		Ass_22_Area_and_Circumference a1 = new Ass_22_Area_and_Circumference();
		a1.perimeterofTriangle(4,6.5,2.7);
		a1.area_Rectangle(2,5.5);
		a1.perimeterofRectangle();
		area_Square(5);
		perimeterofSquare(6.5);
		a1.areaofTrapezium();
		a1.perimeterofTrapezium();

	}

}
