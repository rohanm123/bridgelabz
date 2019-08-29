package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Utility {
	//sum of two integer
	public static int sumintiger(int a,int b)
	{
	
	int result=a+b;
	return result; 
	
	}
	
	//operation on three interger
	public static void intop(int a,int b,int c)
	{
		// TODO Auto-generated method stub
		int result1=a+b*c;
		int result2=a*b+c;
		int result3=c + a / b;
		int result4=a % b + c;
		System.out.println("result1="+result1+"result2="+result2+"result3="+result3+"result4="+result4);
		}

//to find leapyear
	public static void leapyear(int year) 
	{
		// TODO Auto-generated method stub
	if (((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println(+year+ " is leap year");
		}
		else
		{
			System.out.println(+year+ " is not leap year");
		}
	}
	/*
	 * boolean Leap = false;
	 * 
	 * if(year % 4 == 0) { if( year % 100 == 0) { if ( year % 400 == 0) Leap = true;
	 * else Leap = false; } else Leap = true; } else { Leap = false; }
	 * 
	 * if(Leap==true) System.out.println(+year + " is a Leap Year."); else
	 * System.out.println(+year + " is not a Leap Year."); }
	 */


	public void springseason(int m,int d) {
		// TODO Auto-generated method stub
		if ((m>3)&&(m<6))
		{
			System.out.println("it is spring season");
		}
		else if (m==3&&d>=20)
		{
			System.out.println("it is spring season");
		}
		else if(m==6&&d<=20)
		{
			System.out.println("it is spring season");

		}
		else
			
			System.out.println("it is not spring season");

	}


	public static void quadratic(int a, int b,int c) 
	{
		// TODO Auto-generated method stub
		double x1,x2;
		double delta=(b*b)-(4*a*c);
		if (delta>0)
		{
		 x1= ((-b+Math.sqrt(delta))/2*a);
		 x2= ((-b-Math.sqrt(delta))/2*a);
		
		System.out.println("first root x1="+x1);
	
		System.out.println("second root x2="+x2);
		}//System.out.format("root1 = and root2 = "+x1 , +x2);
		else if(delta==0)
	   { x1= x2 = -b / (2 * a);
		System.out.println("first root x1="+x1);
		
		System.out.println("second root x2="+x2);
		}
		else
		{
        double realpart = (-b) / (2 *a);
        double imaginaryPart = Math.sqrt(-delta) / (2 * a);
        System.out.format("root1 = "+realpart+"+"+imaginaryPart+"  root 2="+realpart+"+"+imaginaryPart);
	}
	}

		public static double distance(double x, double y) 
		{
			// TODO Auto-generated method stub
			double distance=Math.sqrt((x*x)+(y*y));
			
			return distance;
}


		public static void sumoftwodice() {
			// TODO Auto-generated method stub
			int dice = 6;
	        int a = 1 + (int) (Math.random() * dice);
	        int b = 1 + (int) (Math.random() * dice);
	        int sum = a + b;
	        System.out.println(sum);
			
		}

		public static void random() {
			// TODO Auto-generated method stub
			//float []a= new float[5];
			float random=1;
			float a= (float) (Math.random() *random);
			float b=(float)(Math.random() * random);
			float c=(float)(Math.random() * random);
			float d=(float)(Math.random() * random);
			float e=(float)(Math.random() * random);
			float avg=(a+b+c+d+e)/5;
			System.out.println("numbers are="+a+","+b+","+c+","+d+","+e);

			System.out.println("minimum numkber"+Math.min(Math.min(Math.min(a,b),Math.min(c,d)),e));
			System.out.println("maximum number"+Math.max(Math.max(Math.max(a,b),Math.max(c,d)),e));


			
			
	        System.out.println("average="+avg);
	        

		}

		public static double windchill(float t, float v) {
			// TODO Auto-generated method stub
			double w=35.75+0.6215+((0.4275*t)-35.75)*Math.pow(v,0.16);
			
			return w;
		}

		public static float dayofweek(int d, int m, int y) {
			// TODO Auto-generated method stub
			int y1=y-(14-m)/12;
			int x=y1+y1/4-y1/100+y1/400;
			int m1=m+12*((14-m)/12)-2;
			int d1=(int) ((d+x+(31*m1)/12)%7);
			return d1;
		}

		public static void temp(int a) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			switch(a) {
			case 1:
				System.out.println("enter temperature in celsius");
				int c=sc.nextInt();
				float f=(float)(c*9/5)+32;
				System.out.println("temperature in Fahrenheit= "+f);
				break ;
			case 2:
				System.out.println("enter temperature in Fahrenheit");
				int fr=sc.nextInt();
				float cr=(float)(fr-32) *5/9 ;
				System.out.println("temperature in celsius= "+cr);
				break;




			}
			
			
		}

		public static void trig(float a) {
			// TODO Auto-generated method stub
float r=(float) Math.toRadians(a);
float sin=(float) Math.sin(r);
float cos=(float) Math.acos(r);
			System.out.println("angle in radians="+r);
			System.out.println("sin of angle "+r+"= "+sin);
			System.out.println("cos of angle "+r+"= "+cos);

			
		}

		public static void flipcoin(int n) {
			// TODO Auto-generated method stub
			 int random=2;
			 float head=0,tail=0;
			 for (int i=1;i<=n;i++)
			 {
			 int a=1+ (int) (Math.random()*random);
			 
			if (a==1)
			{	
				head++;		
				System.out.println("head");
				
			}
			else
			{	
				tail++;
				System.out.println("tail");
				
			}
			
			 }
			//float phead=(head/n)*100;
			//float ptail=(tail/n)*100;
			//System.out.println("head percantage="+phead);
//			System.out.println("tail percantage="+ptail);
	System.out.println("head count"+head);
	System.out.println("tail count"+tail);
	float phead=(head/n)*100;
	float ptail=(tail/n)*100;
	System.out.println("head percantage="+phead);
System.out.println("tail percantage="+ptail);


			 }

		public static void powerof2(int n) {
			// TODO Auto-generated method stub
			for(int i=1;i<=n;i++)
			{
				int r=(int) Math.pow(2,i);
				System.out.println(+r);

			
		}
		

		}

		public static float harmonicnumber(float n) {
			// TODO Auto-generated method stub
			float sum=0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+(1/(float)i);
			}
			
			
			return sum;
		}

		public static double carloan(double p, double y, double r) {
			// TODO Auto-generated method stub
			double n=12*y;
			double R=r/(12*100);
			double mp=(p*R)/(1-Math.pow(1+R,-n));
			return mp;
		}

		public static float sqrt(int c)
		{ 
		//	if (c < 0) return Double.NaN;
        float t = c;
        float epsilon=(float) ((1*2.71828)-15);
       while (Math.abs(t - c/t) >epsilon*t)
       {
        	t = (float) ((c/t + t) / 2.0);
       }
        
        return t;
    }
			// TODO Auto-generated method stub
//			double t=c;
//			double e=2.7182818284;
//			double epsilon=1.0*e-15;
//			while(Math.abs(t-c/t) > epsilon*t)
//			{
//			t=(t+(c/t))/2.0;	
//			}
			//System.out.println("square root of number ="+t);

			
		public static int[] prime(int f, int n) {
			// TODO Auto-generated method stub
			 Utility u=new Utility();
		int[] a=new int[25];int b=0;
			
			for (int i=f;i<=n;i++)

			{
				int count=0;
				for (int j=1;j<=i;j++)
			
			{
				
				if (i%j==0)
				{
					count++;
				}
			}
				
				if(count==2)
					
				{	a[b]=i;
				b++;
				}
				
				
			}
			return a;
		}
			
		

		private void scan(int i) {
				// TODO Auto-generated method stub
			int[][] m=new int[10][25];
			for(int a=0;a<10;a++)
			{
				for (int b=0;b<25;b++)
				{
				m[a][b]=i;
				
			}
		}
		
		}
		public static void binary(int num) {
			// TODO Auto-generated method stub
			int  bin[]=new int[100],i = 0;    
			while(num>0)
			{
				bin[i++] = num%2;
			       num = num/2;
		 		}
			 System.out.print("Binary number is : ");
//		 if (num<=15)
//			 { 
//		for(int j = 7;j >= 0;j--)
//			   {
//			       System.out.print(bin[j]);
//			   }
//			 }
//		 if (num>15)
			 
				 for(int j = 15;j >= 0;j--)
				   {
				       System.out.print(bin[j]);
				   }
		
}

		public static float sin(float x, int n) {
			// TODO Auto-generated method stub
			
			float rad=(float) (x*(3.14/180));
			float t=rad,f=1,k=-1;
			for (int i=3;i<=n;i+=2)
			{
			float p=(float) Math.pow(rad, i);
			f=f*(i-1)*i;
			t=t+(p/f)*(k);
			k=k*-1;
			
			}
	return t;			
			
			
			
		}

		public static float cos(float x, int n) {
			// TODO Auto-generated method stub
			float rad=(float) (x*(3.14/180));
			float t=1,f=1,k=-1;
			for (int i=2;i<=n;i+=2)
			{
			float p=(float) Math.pow(rad, i);
			f=f*(i-1)*i;
			t=t+(p/f)*(k);
			k=k*-1;
			
			}
	return t;			
			

		}

		public static boolean stringanagram(String s1, String s2) {
			// TODO Auto-generated method stub
			//boolean check = false;
			int l1=s1.length();
			int l2=s2.length();
			char[] st1=s1.toCharArray();
			char[] st2=s2.toCharArray();
		Arrays.sort(st1);
		Arrays.sort(st2);

			if (l1!=l2)
			{
				return false;
			}
			
			
				for(int i=0;i<l1;i++)
				{
					if (st1[i]!=st2[i])
					
						return false;
					
			
						
						}
					
				
		return true;
			
			
		
			
			
			
			
		}

		public static boolean strinpalindrome(String s1) {
			// TODO Auto-generated method stub
			String b = "";
			int l=s1.length();
			char[] st1=s1.toCharArray();

			for (int i=l-1;i>=0;i--)
				b=b+s1.charAt(i);
			if (s1.equalsIgnoreCase(b))
				return true;
			else
return false;
			
		}

		 public static void permute(String str, int l, int r) 
		    { 
		        if (l == r) 
		            System.out.println(str); 
		        else
		        { 
		            for (int i = l; i <= r; i++) 
		            { 
		                str = swap(str,l,i); 
		                permute(str, l+1, r); 
		                str = swap(str,l,i); 
		            } 
		        } 
		    } 
		 public static String swap(String a, int i, int j) 
		    { 
		        char temp; 
		        char[] charArray = a.toCharArray(); 
		        temp = charArray[i] ; 
		        charArray[i] = charArray[j]; 
		        charArray[j] = temp; 
		        return String.valueOf(charArray); 
		    }

		public boolean searchword(String s, BufferedReader br) throws IOException {
			// TODO Auto-generated method stub
			String s1;boolean check=false;
			while((s1=br.readLine())!=null)   //Reading Content from the file
		      {
				String[] words=s1.split(" ");  //Split the word using space
		         for (String word : words) 
		           
		          {
		        	  
		                 if (word.equals(s))  
	                	 check=true;
		                 
		          
		          }
		          
		      }
		  return check;
		
}
		public void binarysearchword(String s, BufferedReader br) throws IOException 
		{Utility u=new Utility();
			String s1;boolean check=false;
			while((s1=br.readLine())!=null) 
		{	
			}		
			char[] d=s1.toCharArray();
			int l=d.length;

}

		public boolean regex(String name) {
			// TODO Auto-generated method stub
boolean check=true; 
		if(	name.matches("^[a-zA-Z]*$"))
				{
					 return true;
					}
		else
		{
check= false;
}
return check;		
		}

		public boolean email(String email) {
			// TODO Auto-generated method stub
			boolean check=true;
			if(email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
					{
				return true;
					}
			else 
			{	check= false;
			
		}
return check;
		}

		public int[][] array(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("enter values");
			Scanner sc=new Scanner(System.in);
int i,j;
int[][] mat=new int[10][10];
			for( i=0;i<a;i++);
				{
				for(j=0;j<b;j++)
				{
					mat[i][j]=sc.nextInt();
				}
				}
			return mat;
		}
}

	
			
		

