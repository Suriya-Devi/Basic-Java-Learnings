package assignments;

public class Ass_74_MainMethod_Overloading {
	
	public void main() {
		System.out.println("Method 1");
	}
	
	public void main(String a) {
		System.out.println("Method 2");
		
	
	}

	public static void main(String[] args) {
		Ass_74_MainMethod_Overloading a1 = new Ass_74_MainMethod_Overloading();
		a1.main();
		a1.main("Hani");
		

	}

}
