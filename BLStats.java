package com.bridgelabz.utility;

import java.util.Arrays;

public class BLStats {
public static double max(double[] a) 
{
	int n;
	Arrays.sort(a);
	n=a.length;
	return a[n-1];
}
public static double min(double[] a) 
{
	int n;
	Arrays.sort(a);
	n=a.length;
	return a[0];

}
public static double mean(double[] a) {
	int sum=0;
	double avg;
	int n=a.length;
	for(int i=0;i<n-1;i++)
	{
	sum=(int) (sum+a[i]);
}
	avg=sum/(n);
	return avg;

}
}
