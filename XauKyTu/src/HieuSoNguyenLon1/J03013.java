package HieuSoNguyenLon1;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);
            BigInteger res = num1.subtract(num2).abs();
            String ans = res.toString();
            int maxLength = Math.max(a.length(), b.length());
            while(ans.length() < maxLength){
                ans = '0' + ans;
            }
            System.out.println(ans);
        }
    }
}
