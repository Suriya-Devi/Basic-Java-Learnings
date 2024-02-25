package assignments;

import java.util.Arrays;

public class Ass43_double_Arrays {

	public static void main(String[] args) {
		double salary[] = new double[5];
		salary[0] = 50000;
		salary[1] = 70000;
		salary[2] = 80000;
		salary[3] = 40000;
		salary[4] = 100000;
		Arrays.sort(salary);
		
		String SalaryList = Arrays.toString(salary);
		System.out.println(SalaryList);
		
		boolean attendance[] = new boolean[3];
		attendance[0] = true;
		attendance[1] = false;
		//by default the boolean value of 2nd index is false
		//We cannot sort the values of boolean data type
		System.out.println(Arrays.toString(attendance));
		
 
	}

}
