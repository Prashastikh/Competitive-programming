import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void playwithnumber()
    {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger("5");

        //Arithmetic Operations
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));

        // bit Count - Total Set Bits
        System.out.println(b1.bitCount());
        // Total number of bits
        System.out.println(b1.bitLength());

        //Converting Int to BigInteger
        int c = scn.nextInt();
        int d = scn.nextInt();
        System.out.println(c+d);
        //Conversions
        BigInteger b3 = BigInteger.valueOf(c);
        BigInteger b4 = BigInteger.valueOf(d);
        //print GCD
        System.out.println(b3.gcd(b4));

        // base conversion. Interprets number in given way
        BigInteger b5 = new BigInteger("1001",2)
        System.out.println(b5);

        //Power
        //Parameter inside pow should be an integer . Answer would be biginteger only
        System.out.println(b3.pow(20));

    }
    public static BigInteger fact(int n)
    {
        BigInteger b = new BigInteger("1");
        for(int i=2;i<=n;i++)
        {
            b = b.multiply(BigInteger.valueOf(i));
        }
        return b;
    }
    public static void main(String args[]) {
        playwithnumber();
         System.out.println(fact(100));
    }
}
