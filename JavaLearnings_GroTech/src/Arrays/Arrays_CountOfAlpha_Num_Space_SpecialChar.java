package Arrays;

public class Arrays_CountOfAlpha_Num_Space_SpecialChar {

	public static void main(String[] args) {
		String name = "@! hanishka 2009 2022 $%*(";
		char c1[]= name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
		for(int i=0;i<name.length();i++) {
			boolean ans=Character.isAlphabetic(c1[i]);
			boolean ans1=Character.isDigit(c1[i]);
			boolean ans2=Character.isSpaceChar(c1[i]);
			
			if(ans==true) {
				count_of_alpha++;
			}
			if(ans1==true) {
				count_of_numeric++;
			}
			if(ans2==true) {
				count_of_space++;
			}
				
			
		}
		System.out.println("Count of Alphabets in the given string are "+count_of_alpha);
		System.out.println("Count of Numeric in the given string are "+count_of_numeric);
		System.out.println("Count of space in the given string are "+count_of_space);
		int count_of_specialchar=name.length()-(count_of_alpha+count_of_numeric+count_of_space);
		System.out.println("Count of Special characters in the given string are "+count_of_specialchar);


	}

}
