package Arrays;

public class String_functions {
      
	public static void main(String[] args) {
		String name = "Suriya Devi";
		//1.length()-count of the string
		int len=name.length();
		System.out.println("length of the given string is "+len);
		//2.toUpperCase() and toLowerCase()
		String c1=name.toUpperCase();
		System.out.println(c1);
		String c2=name.toLowerCase();
		System.out.println(c2);
		//3.charAt(index)-It is the position of character
		char c3=name.charAt(0);
		System.out.println(c3);
		//4.trim()-It will delete all the spaces from the beginning and at the end
		String name1="  Suriya Devi   ";
		System.out.println(name1);
		String c4=name1.trim();
		System.out.println("Trimmed value is "+c4);
		//5.concat()-Concatenation that is combining
		String name2="Suriya";
		String surname="Devi";
		//String fullname = name2.concat(surname);without space
		String fullname = name2.concat(" ").concat(surname);//with space
		System.out.println(fullname);

	}

}
