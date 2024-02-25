package Arrays;

public class Arrays_CountofAlpha_Numeric {

	public static void main(String[] args) {
		String name = "hanishka20092022";
		char c1[]= name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		for(int i=0;i<name.length();i++) {
			boolean ans=Character.isAlphabetic(c1[i]);
			//boolean ans1=Character.isDigit(c1[i]);
			
			if(ans==true) {
				count_of_alpha++;
			}
			else {
				count_of_numeric++;
			}
			
		}
		System.out.println("Count of Alphabets in the given string are "+count_of_alpha);
		System.out.println("Count of Numeric in the given string are "+count_of_numeric);

	}

}
