package assignments;

public class String_findNumeric_Alphabet {

	public static void main(String[] args) {
		String name="suriya123";
		char n[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			boolean ans=Character.isAlphabetic(n[i]);
			
		
       if(ans==true) {
    	   System.out.println("Index position "+i+ " is Alphabet");
       }
       else {
       System.out.println("Index position "+i+ " is Numeric");
		}
		}
		System.out.println("**************");
		
		/*String n1="sudi1";
		char c1[] = n1.toCharArray();
		for(int j=0;j<n1.length();j++) {
			boolean b=Character.isDigit(c1[j]);
			if(b==false) {
				 System.out.println("Index position "+j+ " is Alphabet");
		       }
		       else {
		       System.out.println("Index position "+j+ " is Numeric");
				}
			}*/
		}
	}

