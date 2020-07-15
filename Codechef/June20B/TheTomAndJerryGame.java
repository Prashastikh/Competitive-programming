/* 
As usual, Tom and Jerry are fighting. Tom has strength TS and Jerry has strength JS. You are given TS and your task is to find the number of possible values of JS such that Jerry wins the following game.

The game consists of one or more turns. In each turn:

If both TS and JS are even, their values get divided by 2 and the game proceeds with the next turn.
If both TS and JS are odd, a tie is declared and the game ends.
If TS is even and JS is odd, Tom wins the game.
If TS is odd and JS is even, Jerry wins the game.
Find the number of possible initial values of JS such that 1≤JS≤TS, there is no tie and Jerry wins the game.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer TS.
Output
For each test case, print a single line containing one integer ― the number of values of JS such that Jerry wins the game.

Constraints
1≤T≤105
1≤TS≤1018

Example Input
2
1
11

Example Output
0
5

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
            long TS = scn.nextLong();
            int JS = 0;
            while(TS%2==0)
                {
                TS = TS/2;
                }
            TS = TS/2;
            System.out.println(TS);
            test--;
        }
        }
        catch(Exception e)
        {
            return;
        }
	}
}
