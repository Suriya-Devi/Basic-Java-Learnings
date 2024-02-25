package assignments;
//ASS-35 - Method overriding 

class Meth_Overriding_Parent{
	void div() {
		System.out.println("Parent class");
	}
}
public class Ass_35_Method_Overriding extends Meth_Overriding_Parent {
	void div() {
		super.div();
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Ass_35_Method_Overriding a1=new Ass_35_Method_Overriding();
		a1.div();

	}

}
