// Sample Input 1 
// 4
// 1
// 5
// 2
// -3 3
// 3
// 0 0 5
// 4
// 1 2 4 0
// Sample Output 1 
// 0
// 1
// 2
// 2
// Explanation
// Test case 1
// : There is only one term x0 with coefficient 5. Thus, we are given a constant polynomial and the degree is 0.

// Test case 2
// : The polynomial is −3⋅x0+3⋅x1=−3+3⋅x. Thus, the highest power of x with non-zero coefficient is 1.

// Test case 3
// : The polynomial is 0⋅x0+0⋅x1+5⋅x2=0+0+5⋅x2. Thus, the highest power of x with non-zero coefficient is 2.

// Test case 4
// : The polynomial is 1⋅x0+2⋅x1+4⋅x2+0⋅x3=1+2⋅x+4⋅x2. Thus, the highest power of x with non-zero coefficient is 2.


/* package codechef; // don't place package name! */
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class DegreeofPoly
{
    
    static void find(int[] arr,int size){
        int count=0;
	      for (int j=(size-1);j>0 ;j-- ){
		        if(arr[j]!=0){
		            count =j;
		            break;
		        }
		    }
		    System.out.println(count);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(k>0){
		    k--;
		 
		    int size=sc.nextInt();
		    int[] arr=new int[size];
		    for(int j=0;j<size ;j++ )
		    arr[j]=sc.nextInt();
		    find(arr,size);
		  
		}
        sc.close();
		
		
	}
}

