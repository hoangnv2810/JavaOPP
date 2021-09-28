package Test;

import java.math.BigInteger;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        double tmp = Math.pow(1230000123, 2);
        System.out.println(tmp);
        double tmp2 = Math.pow(1000000000, 2);
        System.out.println(tmp2);
        int res = (int)Math.sqrt(tmp+tmp2);
        System.out.println(res);
//        1585213014
        BigInteger tmp1 = new BigInteger("13");
        tmp1.sqrt();
        System.out.println(tmp1.sqrt());

        int a[] = {3, 2, 4, 6, 5};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 5));
    }
}
