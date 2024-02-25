package assignments;
//Ass - 31 Single level inheritance
public class Ass31_SinglelevelInheritance extends Single_Parent{
	
	void add() {
		System.out.println("Child class");
		super.add();
	}

public static void main(String[] args) {
   Ass31_SinglelevelInheritance a = new Ass31_SinglelevelInheritance();
		a.add();

	}

}
