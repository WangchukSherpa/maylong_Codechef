//Score High in java
// Sample Input 1 
// 2
// 5
// 0 0 5 0
// 10
// 7 1 1 1
// Sample Output 1 
// 5
// 7
// Explanation
// Test Case 1
// : Chef knows that all the problems have answer as option C and thus he will mark all the answers as C and get 5 marks.

// Test Case 2
// : It will be optimal for Chef to mark all the options as A which will yield him 7 marks. Thus, irrespective of the answer key, Chef can guarantee 7 marks by marking all answers as option A.
/* package codechef; // don't place package name! */

import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void clostnum(int arr[], int N,int K){
        int res = arr[0];
        for(int i = 1; i < N; i++)
    {
        
        if (Math.abs(K - res) >
            Math.abs(K - arr[i]))
        {
            res = arr[i];
        }
    }
  
    
    System.out.println(res);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		   t--;
		   int val=sc.nextInt();
		   int arr[]=new int[4];
		   
		   for (int i=0;i<4 ;i++ ) arr[i]=sc.nextInt();
		   clostnum(arr,4,val);
		}
        sc.close();
	}
}

