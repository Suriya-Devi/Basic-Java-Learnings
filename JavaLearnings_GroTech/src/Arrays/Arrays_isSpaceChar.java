package Arrays;

import java.util.Arrays;

public class Arrays_isSpaceChar {

	public static void main(String[] args) {
		String name = "suriya devi";
		char[] c1 = name.toCharArray();
		//System.out.println(Arrays.toString(c1));
		for (int i = 0; i < name.length(); i++) {

			boolean ans = Character.isSpaceChar(c1[i]);
			if (ans == true) {
				System.out.println("There is a space in the given string and The index of space is "+i);

			}
		}

	}

}
