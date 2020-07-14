/*
Having already mastered cooking, Chef has now decided to learn how to play the guitar. Often while trying to play a song, Chef has to skip several strings to reach the string he has to pluck. Eg. he may have to pluck the 1st string and then the 6th string. This is easy in guitars with only 6 strings; However, Chef is playing a guitar with 106 strings. In order to simplify his task, Chef wants you to write a program that will tell him the total number of strings he has to skip while playing his favourite song.
This is how guitar strings are numbered (In ascending order from right to left). Eg. to switch from string 1 to 6, Chef would have to skip 4 strings (2,3,4,5).

Input:
First line will contain T, number of testcases. Then the testcases follow.
The first line of each test case contains N, the number of times Chef has to pluck a string
The second line of each test case contains N space separated integers - S1, S2, …, SN, where Si is the number of the ith string Chef has to pluck.

Output:
For each testcase, output the total number of strings Chef has to skip over while playing his favourite song.

Constraints
1≤T≤10
2≤N≤105
1≤Si≤106
For each valid i,  Si≠Si+1

Sample Input:
2
6
1 6 11 6 10 11
4
1 3 5 7

Sample Output:
15
3
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        try{
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        while(test>0)
        {
            int n = scn.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = scn.nextLong();
            }
            for(int i=0;i<arr.length-1;i++)
            {
                sum += (Math.abs(arr[i+1]-arr[i]) - 1);
            }
            System.out.println(sum);
            test--;
        }
        }
        catch(Exception e)
        {
            return;
        }
	}
}
