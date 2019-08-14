package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Utility utility=new Utility();
Scanner sc=new Scanner(System.in);
System.out.println("enter co-ordinates x and y=");
double x=sc.nextDouble();
double y=sc.nextDouble();
 //=Utility.distance(x,y);
System.out.println("distance=" +(Utility.distance(x, y)));


	}



	}


