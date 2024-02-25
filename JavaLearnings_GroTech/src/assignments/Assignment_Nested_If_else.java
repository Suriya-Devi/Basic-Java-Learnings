package assignments;

public class Assignment_Nested_If_else {

	public static void main(String[] args) {
		String gender1 = "Male";
		String gender2 = "Female";
		int age = 20;

		if (age > 18) 
		

		{
			if (gender1 == "Female")
			{
				System.out.println("Male-Eligible to vote");
			} 
			else {
				System.out.println("Male -Not Eligible to vote");
			}

		}

		else {
			// {
			
					if (gender2 == "Female") {
					System.out.println("Female- Eligible to vote");
				}

				else {
					System.out.println("Female -Not Eligible to vote");
				}
			}
	}

	}


