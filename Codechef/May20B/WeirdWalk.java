/*
Alice and Bob are walking on an infinite straight street. Initially, both are at the position X=0 and they start walking in the direction of increasing X. After N seconds, they stop. Let's denote Alice's speed and Bob's speed during the i-th of these seconds by Ai and Bi respectively.

Sometimes, Alice and Bob walk together, i.e. with the same speed side by side. Let's define the weird distance as the total distance they walk this way. Find this weird distance.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
The third line contains N space-separated integers B1,B2,…,BN.
Output
For each test case, print a single line containing one integer ― the total weird distance. It can be proved that this distance is an integer.

Example Input
3
4
1 3 3 4
1 2 4 4
2
2 3
3 2
2
3 3
3 3
Example Output
5
0
6

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    int test = scn.nextInt();
            while(test>0)
            {
             int t = scn.nextInt();
             int[] arr = new int[t];
             int[] arr1 = new int[t];
             for(int i=0;i<arr.length;i++)
             {
                 arr[i] = scn.nextInt();
             }
             for(int i=0;i<arr1.length;i++)
             {
                 arr1[i] = scn.nextInt();
             }
             
             int sum = 0,sum1 = 0,tik=0;
             for(int i=0;i<arr.length;i++)
             {
                 sum = sum + arr[i];
                 sum1 = sum1 + arr1[i];
                 
                 if((sum == sum1 ) && (arr[i]==arr1[i]))
                 {
                     tik = tik + arr[i];
                 }
             }
                System.out.println(tik);
            test--;
           }
		}
		catch(Exception e)
	    {
	        return;
	    }
	}
}

