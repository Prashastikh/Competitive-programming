/* 
Chef has an integer N and he wants to generate a matrix M with N rows (numbered 1 through N) and N columns (numbered 1 through N). He thinks that M would be delicious if:

Each element of this matrix is an integer between 1 and N2 inclusive.
All the elements of the matrix are pairwise distinct.
For each square submatrix containing cells in rows r through r+a and in columns c through c+a (inclusive) for some valid integers r, c and a≥0:
Mr,c+Mr+a,c+a is even
Mr,c+a+Mr+a,c is even
Can you help Chef generate a delicious matrix? It can be proved that a solution always exists. If there are multiple solutions, you may find any one.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.
Output
For each test case, print N lines describing a delicious matrix M. For each valid i, the i-th of these lines should contain N space-separated integers Mi,1,Mi,2,…,Mi,N.

Constraints
1≤T≤10
1≤N≤103
the sum of N over all test cases does not exceed 103

Example Input
1
2
Example Output
1 2
4 3
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
        int a = 0;
        while(test>0)
        {
            int n = scn.nextInt();
             for(int i=0;i<n;i++)
             {
                if(i%2==0)
                {
                    a = i*n+1;
                    for(int j=0;j<n;j++)
                    {
                     System.out.print(a + " ");
                     a++;
                    }
                }
                else
                {
                    a = (i+1)*n;
                    for(int j=0;j<n;j++)
                    {
                     System.out.print(a + " ");
                     a--;
                    }
                }
              System.out.println();
             }
            test--;
        }
        }
        catch(Exception e)
        {
            return;
        }
	}
}
