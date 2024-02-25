package javabasics;

public class FinalVariable {
	final static int c=50;//Final variable for Global Variable
	//static int b=40;
	
	static void add() {
		final int a=100;//final variable for local variable
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		add();
		//System.out.println(b);
	//	FinalVariable f1=new FinalVariable();
		System.out.println(c);
		
		
		
		
	

	}

}
