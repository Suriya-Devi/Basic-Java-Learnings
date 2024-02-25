package assignments;

import java.util.Arrays;

public class Ass_AnagramStrings {

	public static void main(String[] args) {
		String name1="chin";
		String name2 = "inch";
		if(name1.length()!=name2.length()) {
			System.out.println("The given two Strings are not anagram ");
		}
		
		else {
			char n1[]=name1.toCharArray();
			char n2[] = name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);
			boolean b1=Arrays.equals(n1, n2);
			if(b1==true) {
				System.out.println("The given two Strings are  anagram");
			}
			else {
				System.out.println("The given two Strings are not anagram");
			}
		}

	}

}
