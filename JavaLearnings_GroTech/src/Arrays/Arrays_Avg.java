package Arrays;

public class Arrays_Avg {

	public static void main(String[] args) {
		int sum=0;
		int a[] = new int[5];
		a[0] = 45;
		a[1] = 54;
		a[2] = 34;
		a[3] = 78;
		a[4] = 23;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
        System.out.println("Sum of the numbers "+sum);
        double avg=sum/a.length;
        System.out.println("Average is "+avg);
	}

}
