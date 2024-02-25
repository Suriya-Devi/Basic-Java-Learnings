package practice;
class Parent {
      void add() {
		System.out.println("Parent Class");
	}
}
public class Keyword_super extends Parent {
	
	    void add() {
		super.add();//super keyword is used in java in case in method overriding to call the parent class implementation
		//together with the child class implementation
		//2.It can used in first line/any line inside the non-static method
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Keyword_super k1=new Keyword_super();
		k1.add();

	}

}
