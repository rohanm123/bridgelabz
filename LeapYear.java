package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		Scanner Sc=new Scanner(System.in);
		int year;
		System.out.println("enter year");
		year=Sc.nextInt();
		Utility.leapyear(year);
		

	}

}
