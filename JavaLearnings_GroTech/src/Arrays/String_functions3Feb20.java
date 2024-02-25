package Arrays;

import java.util.Arrays;

public class String_functions3Feb20 {

	public static void main(String[] args) {	
		//toCharArray() - convert the string into new character array and the 
		//return type is char of array that is char variable[]
		String name = "hanishka";
		char ans[]=name.toCharArray();
		
		Arrays.sort(ans);
		System.out.println(Arrays.toString(ans));

	}

}
