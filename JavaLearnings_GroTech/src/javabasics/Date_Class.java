package javabasics;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println("D is "+d);
		//ahead of exactly 1 day
		Date d1 = new Date(d.getTime() + (1000*60*60*24*1));//1000 in msec,60 in mins,60 in hrs,24hrs/day ,1day
		System.out.println("d1 is "+d1);
		//Ahead of 4days
		Date d2 = new Date(d.getTime() + (1000*60*60*24*4));
		System.out.println("d2 is "+d2);
		
		
        boolean ans = d1.equals(d);
        System.out.println(ans);
        
        
       //month  //date //year
        //First we need to convert the date class into String function
        String s1=d1.toString();
        String month = s1.substring(4, 7);
        System.out.println(month);
        String date = s1.substring(8, 10);
        System.out.println(date);
        System.out.println(s1.length());
        String year = s1.substring(24, 28);
        System.out.println(year);
        
        //date format ->  DD MMM YYYY
        String date_fmt=date.concat(month).concat(year);
        System.out.println(date_fmt);
        System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
        System.out.println(date.concat("-").concat(month).concat("-").concat(year));
        System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}

}
