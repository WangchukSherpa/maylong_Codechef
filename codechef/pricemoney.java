//Total Prize Money in java
// input:
// 4
// 1000 100
// 1000 1000
// 80 1
// 400 30
// Output 
// 19000
// 100000
// 890
// 6700
// Explanation
// Test Case 1: Top 10 participants receive rupees 1000 and next 90 participants receive rupees 100 each. So, total prize money =10⋅1000+90⋅100=19000.

// Test Case 2: Top 10 participants receive rupees 1000 and next 90 participants receive rupees 1000 each. So, total prize money =10⋅1000+90⋅1000=100000.

// Test Case 3: Top 10 participants receive rupees 80 and next 90 participants receive rupee 1 each. So, total prize money =10⋅80+90⋅1=890.

// Test Case 4: Top 10 participants receive rupees 400 and next 90 participants receive rupees 30 each. So, total prize money =10⋅400+90⋅30=6700.
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    t--;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int res=a*10+90*b;
		    System.out.println(res);
		}
		sc.close();
	}
}
