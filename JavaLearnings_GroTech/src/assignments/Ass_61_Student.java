package assignments;

class Teacher {
	void java() {
		
	}
}
class Mentor3 extends Teacher{
	void selenium() {
		
	}
}
class Experience_Student extends Mentor3 {
	void apitesting() {
		
	}
}
public class Ass_61_Student extends Experience_Student {
	void sql() {
		
	}

	public static void main(String[] args) {
		Mentor3 m2=	new Experience_Student();
		m2.java();
		m2.selenium();
		Experience_Student e1=new Ass_61_Student();//Once upcasting is done,
		//then only we can do downcasting
		e1.apitesting();
		e1.java();
		e1.selenium();
		
		Ass_61_Student s1=(Ass_61_Student)e1;//downcasting
		s1.sql();
		s1.apitesting();
		s1.java();
		s1.selenium();

	}

}
