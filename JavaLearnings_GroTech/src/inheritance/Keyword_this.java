package inheritance;

public class Keyword_this {
	 int age;//Default value of global variable int data type is 0
	 String name;//null 
	 double salary;//0.0
	 
	 void add(int age,String name,double salary) {
		 this.age=age;
		 this.name=name;
		 this.salary=salary;
		 /*System.out.println(age);
		 System.out.println(name);
		 System.out.println(salary);
		 */
	 }
	 

	public static void main(String[] args) {
		Keyword_this k1=new Keyword_this();
		k1.add(4, "Suriya", 5.60);
		System.out.println(k1.age);
		System.out.println(k1.name);
		System.out.println(k1.salary);

	}

}
