package UocChungLonNhatCuaHaiSoNguyenLon;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);
            BigInteger res = num1.gcd(num2);
            System.out.println(res);
        }
    }
}
