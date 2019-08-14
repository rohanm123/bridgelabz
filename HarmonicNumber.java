package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("Enter number");
		float n=sc.nextFloat();
		float Hn=Utility.harmonicnumber(n);
		System.out.println("nth harmonic number="+Hn);

	}

}
