package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("enter range of numbers");
		System.out.println("enter first number");
		int f=sc.nextInt();
		System.out.println("enter last number");
		int l=sc.nextInt();
		Utility.prime(f,l);


		
	}

}
