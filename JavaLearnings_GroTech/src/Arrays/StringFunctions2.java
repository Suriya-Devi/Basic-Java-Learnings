package Arrays;

public class StringFunctions2 {

	public static void main(String[] args) {
		String s1 = "Orange";
		//Substring with Single parameter
		String ans=s1.substring(4);//ge
		System.out.println(ans);
		//substring with two parameters - (int beginIndex,int endIndex)-->(start index,end index as n-1)
		String ans1=s1.substring(3, 5);//ng
		System.out.println(ans1);
		
		//contains()-Returns true if and only if this string contains the specified sequence of char values
		String s2 = "Suriya Devi";
		boolean ans2=s2.contains("Devi");
		System.out.println(ans2);//true
		System.out.println(s2.contains("riya"));//true
		
        //matches()-true if, and only if, this string matches the given regular expression
		//with single character search
		boolean ans3 =s2.matches("S..........");//S followed by 10 char as 10.(10 DOTS) //true
		System.out.println(ans3);
		System.out.println("--------------------------------"); 
		System.out.println(s1.matches("......"));//true since this matches exactly with char sequence
		//When we are not sure about the length of the string -//with multi character search
		System.out.println(s2.matches("(.*)i"));//true
		System.out.println(s2.matches("s(.*)"));//false since S is uppercase but we have given in the lower case
		
	}

}
