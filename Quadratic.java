package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
Utility utility=new Utility();
System.out.println("enter your coordinate a=");
int a=Sc.nextInt();
System.out.println("enter your coordinate b=");
int b=Sc.nextInt();
System.out.println("enter your coordinate c=");
int c=Sc.nextInt();
Utility.quadratic(a,b,c);

	}

}
