package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utlity=new Utility();
		System.out.println("enter value of n");
		int n=sc.nextInt();
		Utility.powerof2(n);
	}

}
