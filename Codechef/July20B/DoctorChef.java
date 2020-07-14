import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
        Scanner scn = new Scanner(System.in);
        long test = scn.nextLong();
        while(test>0)
        {
            long n = scn.nextLong();
            long x = scn.nextLong();
            long[] arr = new long[(int)n];
            for(long i=0;i<arr.length;i++)
            {
                arr[(int)i] = scn.nextLong();
            }
            Arrays.sort(arr);
            int fin = 0;
            for (long i = 0; i < n; i++)
            {
                if (x >= arr[(int)i])
                    {
                        fin++;
                        x = Math.max(x, 2 * arr[(int)i]);
                        continue;
                    }
                long to = arr[(int)i];
                while (to > 0)
                    {
                        fin++;
                        to = Math.min(to, 2 * (to - x));
                        x = 2 * x;
                    }
                    x = 2 * arr[(int)i];
            }
        System.out.println(fin);
            test--;
        }
        }
        catch(Exception e)
        {
            return;
        }
	}
}
