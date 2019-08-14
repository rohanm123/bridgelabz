package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utiliy=new Utility();	
		
		Scanner Sc=new Scanner(System.in);
	int a,b,c,result1;
	System.out.println("enter numbers");
	a=Sc.nextInt();
	b=Sc.nextInt();
	c=Sc.nextInt();
	Utility.intop(a, b, c);

	

	}

}
