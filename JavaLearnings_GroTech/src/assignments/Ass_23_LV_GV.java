package assignments;

//Assignment 23 -Declaration & initialisation of LV & GV
public class Ass_23_LV_GV {
	static int age;//GV
	char gender='F';//GV
	
	static void add() {
		 age=29;//GV is used as the LV in this method
	double n1=89.98,n2=34;//LV
	System.out.println(n1+n2);
		
		
	}

	public static void main(String[] args) {
		add();
		System.out.println(age);
		Ass_23_LV_GV a= new Ass_23_LV_GV();
		System.out.println(a.gender);

	}

}
