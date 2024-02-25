package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Ass_44_Arrays_int_ValueAtRuntime {

	public static void main(String[] args) {
		int rollno[] = new int[3];
		for(int i=0;i<3;i++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the value");
			rollno[i]=sc.nextInt();
		}
		
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));

	}

}
