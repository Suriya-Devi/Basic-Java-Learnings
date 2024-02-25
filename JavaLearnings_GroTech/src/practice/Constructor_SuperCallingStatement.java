package practice;
//Ass - 34 Calling the Parent class Constructor using super calling statement

class Parent_Cons {
	Parent_Cons(int a){
		System.out.println("Parent Constructor");
	}
}
public class Constructor_SuperCallingStatement extends Parent_Cons {
	
	Constructor_SuperCallingStatement()
	{   
		super(20);//Parameterized Constructor with explicitly called
		System.out.println("Child Constructor");
		
	}

	public static void main(String[] args) {
		Constructor_SuperCallingStatement c1=new Constructor_SuperCallingStatement();
		

	}

}
