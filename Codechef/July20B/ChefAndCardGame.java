/*
Chef is playing a card game with his friend Morty Smith.
The rules of the game are as follows:
There are two piles of cards, pile A and pile B, each with N cards in it. Pile A belongs to Chef and pile B belongs to Morty.
Each card has one positive integer on it
The ‘power’ of a card is defined as the sum of digits of the integer on that card
The game consists of N rounds
In each round, both players simultaneously draw one card each from the top of their piles and the player who draws the card with higher power wins this round and gets a point. If the powers of both players' cards are equal then they get 1 point each.
The winner of the game is the player who has more points at the end of N rounds. If both players have equal number of points then the game ends in a draw.
The game is now over and Chef has told Morty to find the winner. Unfortunately, this task is too complex for him. Help Morty find the winner.

Input:
First line will contain T, number of testcases.
The first line of each test case will contain N, the number of rounds played.
The ith of the next N lines of each test case will contain Ai and Bi, the number on the card drawn by Chef and Morty respectively in round i.

Output:
0 if Chef wins,
1 if Morty wins,
2 if it is a draw,
followed by the number of points the winner had.
(If it is a draw then output either player’s points).

Sample Input:
2
3
10 4
8 12
7 6
2
5 10
3 4

Sample Output:
0 2
2 1

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static long po(long no)
    {
        int a = 0;
        while(no!=0)
        {
        int dig=(int) no%10;
        a=a+dig;
        no=no/10;
        }
    return a;
    }
    public static void main (String[] args) throws java.lang.Exception {
        try{
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        while(test>0)
        {
            int n = scn.nextInt();
            long[] arr1 = new long[n];
            long[] arr2 = new long[n];
            int fin = 0,chef = 0,morty = 0;
            for(int i=0;i<n;i++)
            {
                arr1[i]=scn.nextInt();
                arr2[i]=scn.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                fin = (int)(po(arr1[i]) - po(arr2[i]));
                if(fin>0)
                {
                    chef++;
                }
                else if(fin<0)
                {
                    morty++;
                }
                else
                {
                    chef++;
                    morty++;
                }
            }
            if(chef>morty)
            {
                System.out.println("0" + " " + chef);
            }
            else if(morty>chef)
            {
                System.out.println("1" + " " + morty);
            }
            else
            {
                System.out.println("2" + " " + chef);
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
