package assignments;
//Assigenment 28- for loop 1 to 10  and its average
public class Ass_28_AverageUsingFor_1to10 {
	static int sum=0;//GV

	public static void main(String[] args) {
		
		for(int i=1;i<11;i++) {
			System.out.println(i);
			 sum=sum+i;
		}
		
		System.out.println("Sum of the numbers is "+sum);
		double average = sum/10;
		System.out.println("Average of the numbers from 1 to 10 is "+average );

	}

}
