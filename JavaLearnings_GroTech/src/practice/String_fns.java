package practice;

public class String_fns {

	public static void main(String[] args) {
		//endsWith()-Tests if this string ends with the specified suffix.
		String s1 = "banana";
		boolean ans=s1.endsWith("n");//false
		System.out.println(ans);
		
		//toUpperCase-
		System.out.println(s1.toUpperCase());
		
		//toLowerCase-
		System.out.println(s1.toLowerCase());
		
		//charAt(int index) - Returns the char value at the specified index.
       char ans1=s1.charAt(3);
       System.out.println(ans1);
       
       //trim()-It removes all the spaces from the beginning and at the end
       String s2 = "   Exam2 now ";
       System.out.println(s2.trim());
       
       //replace - 
       System.out.println(s2.replace('2', 's'));
       
       //replaceall-
       System.out.println(s2.replaceAll("[0-9a-z]", "new"));
       System.out.println(s2.replaceAll("[A-Z]", " "));
       
       //isEmpty()-Returns true if, and only if, length() is 0.
       System.out.println(s1.isEmpty());//false
       
       //equals()-
       String s3="banana";
       System.out.println(s1.equals(s3));
	}

}
