package inheritance;
//Method overriding Concept - Developing a method in the parent cals with same name & signature as in the 
//child class but with the different implementation
//Same method name,same return type,same para that is signature
class College_Class{
	void bookstowrite() {
		System.out.println("Writing to study");
	}
	
}
public class School_Class extends College_Class
{
	void bookstowrite() {
		System.out.println("Writing to top the class");
		super.bookstowrite();//super keyword is used in java in case of method overriding to call the parent class
		//implementation together with the child class implementation.
		//2.Super keyword is used in case of non-static methods/context.
		//3.It can be the first line or any line inside the non-static method
	}

	public static void main(String[] args) {
		School_Class s1=new School_Class();
		s1.bookstowrite();//child class will execute and parent class will get overridden
		
       
	}

}
