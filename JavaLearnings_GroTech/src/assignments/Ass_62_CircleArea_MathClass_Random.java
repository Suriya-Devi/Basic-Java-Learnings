package assignments;

public class Ass_62_CircleArea_MathClass_Random {

	public static void main(String[] args) {
		double pi = Math.PI;
		for(int i=1;i<=10;i++) {
			
		double r = Math.random();
		System.out.println("Radius is "+r);
		double Area_of_Circle = pi*r*r;
		System.out.println("Area of circle is "+Area_of_Circle);
		}
	}

}
