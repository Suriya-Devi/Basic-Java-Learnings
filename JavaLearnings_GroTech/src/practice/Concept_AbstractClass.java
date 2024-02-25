package practice;

//Ass-37 Abstract class,Abstract method,Concrete class and Concrete methods
abstract class Parent2{
	abstract void add();//abstract method
	abstract void add1();
	
}
//concrete class
public class Concept_AbstractClass extends Parent2 {
	//concrete method
	void add() {
		System.out.println("The Real logic is present here");
		
	}

    //concrete method
	public static void main(String[] args) {
		Concept_AbstractClass c=new Concept_AbstractClass();
		c.add();
		c.add1();
	
	}

	void add1() {
		System.out.println("Internal logic");
		
	}

	
	
}
