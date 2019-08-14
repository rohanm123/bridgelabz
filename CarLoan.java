package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("enter loan amount=");
		double p=sc.nextDouble();
		System.out.println("enter time to clear loan in years=");
		double y=sc.nextDouble();
		System.out.println("enter rate of intrest=");
		double r=sc.nextDouble();
		double mp=Utility.carloan(p,y,r);
		System.out.println("monthly payment you would have to make in "+y+" years ="+mp);

		

		

	}

}
