package TongSoNguyenLon2;

import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        System.out.println(num1.add(num2));
    }
}
