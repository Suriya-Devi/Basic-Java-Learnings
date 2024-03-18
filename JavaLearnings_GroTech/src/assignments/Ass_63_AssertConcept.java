package assignments;

import java.util.Scanner;

public class Ass_63_AssertConcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Rank no");
		int rank_no = sc.nextInt();
		assert rank_no>10 : "Not eligible to apply ";
		
		System.out.println("Valid Candidate");

	}

}
