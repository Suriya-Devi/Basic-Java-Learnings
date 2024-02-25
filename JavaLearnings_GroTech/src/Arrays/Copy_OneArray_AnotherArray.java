package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_OneArray_AnotherArray {

	public static void main(String[] args) {
		int Array1[]=new int[4];
		Array1[0]= 36;
		Array1[1]= 56;
		Array1[2]= 102;
		Array1[3]= 98;
		
		int Array2[] = new int[Array1.length];
		
		for(int i=0;i<4;i++) {
			Array2[i] = Array1[i];
		}
		Arrays.sort(Array2);
        System.out.println(Arrays.toString(Array2));
        
        System.out.println("--------------------");
        //Using Scanner Class
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n= s1.nextInt();
        int a1[] = new int[n];
        for(int i=0;i<n;i++) {
        System.out.println("Enter the value of an array ");
        a1[i] = s1.nextInt();
        }
        
        int a2[] = new int[a1.length];
        for(int i=0;i<n;i++) {
        	a2[i]= a1[i];
        }
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
        
	}

}
