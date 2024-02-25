package access_specifier;

public class Teacher {
	//What happens within the package when to try to access the different access specifier?
	//Within the package,we will not be able to access the someone's private method

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.LearnAPI();
		s1.LearnMT();
		s1.learnAT();
		

	}

	

}
