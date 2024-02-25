package Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String name = "radar";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			char ans= name.charAt(i);
			//System.out.println(ans);
			reverse=reverse+ans;
		}
            System.out.println(reverse);
            boolean a=name.equals(reverse);
            System.out.println(a);
            if(a==true) {
            	System.out.println("Palindrome");
            }
            else {
            	System.out.println("Not a palindrome");
            }
	}

}
