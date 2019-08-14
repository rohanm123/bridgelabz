package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Utility utility=new Utility();
Scanner sc=new Scanner(System.in);
System.out.println("enter month ");
int m=sc.nextInt();
System.out.println("enter date ");

int d=sc.nextInt();
utility.springseason(m,d);

	}

}
