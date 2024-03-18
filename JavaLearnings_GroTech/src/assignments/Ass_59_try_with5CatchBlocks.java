package assignments;

import java.util.InputMismatchException;

public class Ass_59_try_with5CatchBlocks {

	public static void main(String[] args) {
		try {
			int a= 1/0;
		}
		
		catch(InputMismatchException e) {
			System.out.println("Handled the exception 1" +e.getMessage());
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Handled the exception 2" +e.getMessage());
			
		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		catch(ClassCastException e) {
			System.out.println(e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("finished the execution");
		}
	}

}
