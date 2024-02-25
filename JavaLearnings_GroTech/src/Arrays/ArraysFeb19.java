package Arrays;

import java.util.Arrays;

public class ArraysFeb19 {

	public static void main(String[] args) {
		int age[] = new int[3];
		age[0]=45;
		age[1]=105;
		age[1]=67;//updating the value of the index in array
		age[2]=78;
		Arrays.sort(age);//to sort the array in ascending order
		for(int i=0;i<=2;i++) {
			System.out.println(age[i]);
		}
		
	}

}
