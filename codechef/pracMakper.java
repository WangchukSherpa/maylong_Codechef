//Practice makes us perfect
// Constraints
// 1≤P1,P2,P3,P4≤100
// Sample Input 1 
//  12 15 8 10
// Sample Output 1 
//  3
// Explanation
// Chef solved at least 10
//  problems in the first, second and fourth weeks. He failed to solve at least 10
//  problems in the third week. Hence, the number of weeks in which Chef met his target is 3
// .

// Sample Input 2 
//  2 3 1 10
// Sample Output 2 
//  1
// Explanation
// Chef solved at least 10
//  problems in the fourth week. He failed to solve at least 10
// problems in all the other three weeks. Hence, the number of weeks in which Chef met his target is 1
// .

// Sample Input 3 
//  12 100 99 11
// Sample Output 3 
//  4
// Explanation
// Chef solved at least 10
//  problems in all the four weeks. Hence, the number of weeks in which Chef met his target is 4
// .

// Sample Input 4 
//  1 1 1 1
// Sample Output 4 
//  0
// Explanation
// Chef was not able to solve at least 10
//  problems in any of the four weeks. Hence, the number of weeks in which Chef met his target is 0.

/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class pracMakper
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		for (int i=0;i<=3 ;i++ )
		arr[i]=sc.nextInt();
		
		int count=0;
		for (int i=0;i<=3 ;i++ ){
		    if(arr[i]>=10)
		        count++;
		}
		System.out.println(count);
        sc.close();
	}
}

