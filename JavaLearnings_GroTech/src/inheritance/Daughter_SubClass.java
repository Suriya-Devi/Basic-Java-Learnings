package inheritance;

//Assgnment 32 - Multi level inheritance

public class Daughter_SubClass extends Father_SuperClass {
	
	void add() {
		System.out.println("addition");
	}

public static void main(String[] args) {
Daughter_SubClass d1=new Daughter_SubClass();
		d1.add();
		d1.sub();
		mul();
		
		

	}

}
