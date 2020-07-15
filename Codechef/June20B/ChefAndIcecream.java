/* 
Chef owns an icecream shop in Chefland named scoORZ. There are only three types of coins in Chefland: Rs. 5, Rs. 10 and Rs. 15. An icecream costs Rs. 5.
There are N people (numbered 1 through N) standing in a queue to buy icecream from scoORZ. Each person wants to buy exactly one icecream. For each valid i, the i-th person has one coin with value ai. It is only possible for someone to buy an icecream when Chef can give them back their change exactly ― for example, if someone pays with a Rs. 10 coin, Chef needs to have a Rs. 5 coin that he gives to this person as change.
Initially, Chef has no money. He wants to know if he can sell icecream to everyone in the queue, in the given order. Since he is busy eating his own icecream, can you tell him if he can serve all these people?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers a1,a2,…,aN.

Output
For each test case, print a single line containing the string "YES" if all people can be served or "NO" otherwise (without quotes).

Constraints
1≤T≤100
1≤N≤103
ai∈{5,10,15} for each valid i

Example Input
3
2
5 10
2
10 5
2
5 15

Example Output
YES
NO
NO

 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	try
        {
            
            int test = scn.nextInt();
            while(test>0)
            {
                int currcoin = 0,f=0;
                int coin0 = 0,coin5 = 0,coin10 = 0;
                int n = scn.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = scn.nextInt();
                }
                for(int i=0;i<arr.length;i++)
                {
                    currcoin = arr[i];
                    if(f == 0)
                    {
                        if(currcoin == 5)
                        {
                            coin5 ++;
                        }
                        else if(currcoin == 10)
                        {
                            if(coin5 != 0)
                            {
                                coin5--;
                                coin10++;
                            }else
                            {
                                f++;
                            }
                        }
                        else if(currcoin == 15) 
                        { 
                            if(coin10 != 0) 
                            { 
                                coin10--; 
                            }else if(coin5 >=2) 
                            { 
                                coin5 = coin5 -2; 
                            }else
                            { 
                                f++; 
                            } 
                        }
                    }
                }
                if(f == 0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
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
