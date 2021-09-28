package KiemTraSoFibonacci;

import java.math.BigInteger;
import java.util.Scanner;
public class J01007 {
    public static BigInteger sqrt(BigInteger val) {
        BigInteger half = BigInteger.ZERO.setBit(val.bitLength() / 2);
        BigInteger cur = half;

        while (true) {
            BigInteger tmp = half.add(val.divide(half)).shiftRight(1);

            if (tmp.equals(half) || tmp.equals(cur))
                return tmp;

            cur = half;
            half = tmp;
        }
    }
    public static boolean isSquare(String x){
        BigInteger a = new BigInteger(x);
        BigInteger temp = sqrt(a);
        if(temp.multiply(temp).compareTo(a) == 0) return true;
        return false;
    }
    public static boolean isFibo(BigInteger a){
        BigInteger temp = a.multiply(a);
        BigInteger four = BigInteger.valueOf(4);
        BigInteger five = BigInteger.valueOf(5);
        BigInteger res = temp.multiply(five);
        BigInteger check1 = res.add(four);
        BigInteger check2 = res.subtract(four);
        String b = check1.toString();
        String c = check2.toString();
        if(isSquare(b) || isSquare(c)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String n = sc.next();
            BigInteger a = new BigInteger(n);
            if(isFibo(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
