package assignments;

interface Three{
	void add();
	void subtract();
	
}

abstract class Two implements Three{
	abstract void add1();
	abstract void subtract1();
}

abstract class One extends Two{
	abstract void add2();
	abstract void subtract2();
	
}


public class Ass_DemoInterface extends One{
	 
	void mul() {
		System.out.println("1");
		
	}
	
	 static void div() {
		System.out.println("2");
		
	}
	

	public static void main(String[] args) {
		Ass_DemoInterface a1=new Ass_DemoInterface();
		a1.mul();
		div();
		a1.add();
		a1.subtract();
		a1.add1();
		a1.subtract1();
		a1.add2();
		a1.subtract2();

	}

	@Override
	public void add() {
		System.out.println("Internal logic 1");
		
	}

	@Override
	public void subtract() {
		System.out.println("Internal logic 2");
		
	}

	@Override
	void add2() {
		System.out.println("Internal logic 3");
		
	}

	@Override
	void subtract2() {
		System.out.println("Internal logic 4");
		
	}

	@Override
	void add1() {
		System.out.println("Internal logic 5");
		
	}

	@Override
	void subtract1() {
		System.out.println("Internal logic 6");
		
	}

}
