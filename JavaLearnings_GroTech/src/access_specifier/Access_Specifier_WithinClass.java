package access_specifier;

public class Access_Specifier_WithinClass {
	//What happens within the class when we try to access the different specifier?
	//No matter which specifier,everything can be accessed within the class
	
	 public static void add() {
	    	
	    }
	    
	   private  static void sub() {
	    	
	    }
	    
	    protected void mul() {
	    	
	    }
	    
	    void div() {
	    	
	    }

	public static void main(String[] args) {
		add();
		sub();
		
		Access_Specifier_WithinClass a1=new Access_Specifier_WithinClass();
		a1.mul();
		a1.div();

	}

}
