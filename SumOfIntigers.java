package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class SumOfIntigers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Utility utiliy=new Utility();	
		
Scanner Sc=new Scanner(System.in);
int a,b,result = 0;
System.out.println("enter numbers");
a=Sc.nextInt();
b=Sc.nextInt();
result=Utility.sumintiger(a, b);

System.out.println("sum="+result);



	}

}
