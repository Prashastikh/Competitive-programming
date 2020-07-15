/* 
Chef has N items in his shop (numbered 1 through N); for each valid i, the price of the i-th item is Pi. Since Chef has very loyal customers, all N items are guaranteed to be sold regardless of their price.
However, the government introduced a price ceiling K, which means that for each item i such that Pi>K, its price should be reduced from Pi to K.
Chef's revenue is the sum of prices of all the items he sells. Find the amount of revenue which Chef loses because of this price ceiling.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains N space-separated integers P1,P2,…,PN

Output
For each test case, print a single line containing one integer ― the amount of lost revenue.


Constraints
1≤T≤100
1≤N≤10,000
1≤Pi≤1,000 for each valid i
1≤K≤1,000

Example Input
3
5 4
10 2 3 4 5
7 15
1 2 3 4 5 6 7
5 5
10 9 8 7 6

Example Output
7
0
15
 */

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
        int test = scn.nextInt();
        while(test>0)
        {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = scn.nextInt();
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>k)
                {
                    sum = sum + (arr[i]-k);
                }
            }
            System.out.println(sum);
            test--;
        }
        }catch(Exception e){
			return;
		}
	}
}
