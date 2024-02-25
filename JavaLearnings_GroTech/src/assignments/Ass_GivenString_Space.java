package assignments;

public class Ass_GivenString_Space {

	public static void main(String[] args) {
		String name = "selvaraj 123 ";
		char[] c1 =name.toCharArray();
		for(int i=0;i<=name.length()-1;i++) {
			boolean ans=Character.isSpaceChar(c1[i]);
		
		if(ans==true) {
			System.out.println("There is a space in the given string and the index of space is "+i);
		}
		
		}
	}

}
