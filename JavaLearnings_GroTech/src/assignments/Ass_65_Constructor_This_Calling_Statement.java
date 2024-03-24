package assignments;

public class Ass_65_Constructor_This_Calling_Statement {
	Ass_65_Constructor_This_Calling_Statement (){
		this(10);
		System.out.println("Constructor 1");
	}
	
    Ass_65_Constructor_This_Calling_Statement (int a){
    	this(20,34.4);
    	System.out.println("Constructor 2");
	}
    
    Ass_65_Constructor_This_Calling_Statement (int a,double b){
    	System.out.println("Constructor 3");
		
	}
	

	public static void main(String[] args) {
		new Ass_65_Constructor_This_Calling_Statement();
		

	}

}
