package Arrays;

public class String_functions1 {

	public static void main(String[] args) {
		//endsWith()-check whether the string is ending with the required alphabet or not
		String name= "orange";
		boolean answer = name.endsWith("e");
		System.out.println(answer);//true
		
		//replace(char oldChar,char newChar) -> replace the single character
		String ans = name.replace('a','b');
		System.out.println(ans);
		
		//replaceAll(String regex,String replacement)->Replaces each 
		//substring of this string that matches the given regular expression with the given replacement.
		String n1 = "Orange fruit";
		String ans1 = n1.replaceAll("fruit","and banana");
		System.out.println(ans1);
		
		//to remove all the numeric numbers
		String name1 = "World no 1";
		String ans2=name1.replaceAll("[0-9]","");
		System.out.println(ans2);
		
		//to remove all the numeric numbers and replace with the string "India"
		String ans3=name1.replaceAll("[0-9]","India");
		System.out.println(ans3);
		
		//To remove all the alphabets  with the given string or to remove all the smaller alphabets
		System.out.println(name1.replaceAll("[a-z]",""));//W  1
		System.out.println(name1.replaceAll("[a-z]","nothing"));//Wnothingnothingnothingnothing nothingnothing 1
		System.out.println("************");
		System.out.println(name1.replaceAll("[a-zA-Z0-9]",""));//empty String
		//to remove all the upper case alphabets
		System.out.println(name1.replaceAll("[A-Z]",""));
		//to remove all the upper case alphabets and replace with enjoy
		System.out.println(name1.replaceAll("[A-Z]","enjoy"));
		
		//Ass - The given string is Suriya Devi and replace the surname with other
		String n= "Suriya Devi";
		System.out.println(n);
		String answer1 = n.replaceAll("Devi","Narayanan");
		System.out.println(answer1);
		
		//isEmpty() - to chech whether the given string is empty or not.
		System.out.println(name1.isEmpty());
		String s = "";
		boolean answer2 = s.isEmpty();
		System.out.println(answer2);
		
		//equals()-to check the given two strings equal to each other or compares the string to the specified object
		//when the length of the two given strings must be equal and should be in lowercase/uppercase.then only the
		//the two given strings will be equal to each other
		String a= "sudiksha selvaraj";
		String a1 = "sudiksha selvaraj";
		System.out.println(a1);
		System.out.println(a.length());//17
		System.out.println(a1.length());//17
		System.out.println(a.equals(a1));//true

	}

}
 