package api;

import java.math.BigInteger;

/*
 * Algorithm for gcd and lcm found:
 * 
 *  http://stackoverflow.com/questions/4201860/how-to-find-gcf-lcm-on-a-set-of-numbers
 *  http://stackoverflow.com/questions/4009198/java-get-greatest-common-divisor/4009247#4009247
 */
public class NumberUtils {
    public static int gcd(int x, int y)
    {
    	BigInteger bix = BigInteger.valueOf(x);
    	BigInteger biy = BigInteger.valueOf(y);
    	BigInteger bigcd = bix.gcd(biy);
    	return bigcd.intValue();
    }
 
    public static int lcm(int x, int y)
    {
    	return x * (y / gcd(x, y));
    }
}
