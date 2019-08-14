package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utlity=new Utility();
		System.out.println("enter date ,month,year=");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
float day=Utility.dayofweek(d,m,y);
System.out.println("day="+day);


	}

}
