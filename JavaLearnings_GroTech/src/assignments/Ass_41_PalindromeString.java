package assignments;

public class Ass_41_PalindromeString {

	public static void main(String[] args) {
		String name = "mom";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			char ans=name.charAt(i);
			reverse=reverse+ans;
			
		}
         System.out.println(reverse);
         boolean b=name.equals(reverse);
         System.out.println(b);
         if(b==true){
        	 System.out.println("The given string "+name+" is palindrome");
         }
         else {
        	 System.out.println("Not a palindrome");
         }
	}

}
