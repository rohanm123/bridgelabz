package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("enter number=");
		double c=sc.nextInt();
		double sq=Utility.sqrt(c);
		System.out.println("square root of number ="+sq);
		

	}

}
