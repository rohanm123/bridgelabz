package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utlity=new Utility();
		System.out.println("enter the number of times coin is fliped ");
		int n=sc.nextInt();
		Utility.flipcoin(n);

	}

}
