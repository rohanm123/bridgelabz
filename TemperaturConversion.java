package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utlity=new Utility();
		int a;
		System.out.println("enter 1 for Celsius to Fahrenheit ");
		System.out.println("enter 2 for Fahrenheit to Celsius ");
		a=sc.nextInt();
		Utility.temp(a);




	}

}
