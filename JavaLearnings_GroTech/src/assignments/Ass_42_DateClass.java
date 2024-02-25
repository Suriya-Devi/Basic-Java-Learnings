package assignments;

import java.util.Date;

public class Ass_42_DateClass {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime());
		System.out.println(d1);
		
		Date d2 = new Date(d.getTime() + (1000*60*60*24*10));
		System.out.println("10days ahead will be "+d2);
		
		Date d3 = new Date(d.getTime() - (1000*60*60*24*10));
		System.out.println("10days behind will be "+d3);
	}

}
