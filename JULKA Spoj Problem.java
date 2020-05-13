import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void compute(BigInteger n, BigInteger k)
    {
        BigInteger x,y;
        x = n.subtract(k);
        x = x.divide(BigInteger.valueOf(2));
        y = x.add(k);
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        BigInteger n,k;
        n = scn.nextBigInteger();
        k = scn.nextBigInteger();
        compute(n,k);
    }
}