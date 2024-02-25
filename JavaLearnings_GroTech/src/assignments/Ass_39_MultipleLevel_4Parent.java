package assignments;
interface Parent4{
	void sub1();
}
interface Parent3{
	void add1();
	
}
interface Parent2{
	void sub();
}
interface Parent1{
	void add();
}
public class Ass_39_MultipleLevel_4Parent implements Parent1,Parent2,Parent3,Parent4 {
	static void method1() {
		System.out.println("Method 1");
	}
	public static void main(String[] args) {
		Ass_39_MultipleLevel_4Parent a=new Ass_39_MultipleLevel_4Parent();
		a.add();
		a.add1();
		a.sub();
		a.sub1();
		method1();
	}
	public void sub1() {
		System.out.println("Real Logic 1");
		
	}
	public void add1() {
		System.out.println("Real Logic 2");
		
	}
	public void sub() {
		System.out.println("Real Logic 3");
		
	}
	public void add() {
		System.out.println("Real Logic 4");
		
	}

}
