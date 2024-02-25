package inheritance;
// Ass-33 Heirarchical level inheritance
public class child1 extends Parent{
	void add() {
		System.out.println("Sudiksha");
	}
	

	public static void main(String[] args) {
		child1 c=new child1();
		c.method1(0);
		c.method2(56, 3);
		c.add();

	}

}
