package com.bridgelabz.utility;

import java.util.Random;

public class BLRandom {
public static Random random;

public static void setseed(long seed)
{
	seed   = seed;
	Random random = new Random(seed);
}
public static long uniform(long n) {
    
    long r = random.nextLong();
    long m = n - 1;

    // power of two
    if ((n & m) == 0L) {
        return r & m;
    }

    // reject over-represented candidates
    long u = r >>> 1;
    while (u + m - (r = u % n) < 0L) {
        u = random.nextLong() >>> 1;
    }
    return r;
}
public static int uniform(int n)
{
	
return random.nextInt(n);
}

public static double uniform(double lo,double hi)
{
	 return lo + uniform(0) * (lo-hi);
}
public static boolean bernoulli(double p) {
    if (!(p >= 0.0 && p <= 1.0))
    	return uniform(0) < p;
	return false;
}
public static boolean bernoulli() {
    return bernoulli(0.5);
}
public static double gaussian() {
    
    double r, x, y;
    do {
        x = uniform(-1.0, 1.0);
        y = uniform(-1.0, 1.0);
        r = x*x + y*y;
    } while (r >= 1 || r == 0);
    return x * Math.sqrt(-2 * Math.log(r) / r);
}
public static double gaussian(double mu, double sigma)
{
    return mu + sigma * gaussian();
}
public static int discrete(double[] probabilities)
{
    double EPSILON = 1.0E-14;
    double sum = 0.0;
    for (int i = 0; i < probabilities.length; i++)
    {
        if (!(probabilities[i] >= 0.0))
        sum += probabilities[i];
    }
    if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)

    
    while (true) {
        double r = uniform(0);
        sum = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            sum = sum + probabilities[i];
            if (sum > r)
            	return i;
        }
    }
  return 0;
}
public static void shuffle(double[] a) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
        int r = i + uniform(n-i);     // between i and n-1
        double temp = a[i];
        a[i] = a[r];
        a[r] = temp;
    }
}

}
