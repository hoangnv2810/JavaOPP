package UocChungLonNhatCuaHaiSoNguyenLon;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static long UocSoNguyenToLonNhat(long n){
        long res = 0;
        while(n%2 == 0){
            res = 2;
            n /= 2;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            while(n%i == 0){
                res = i;
                n /= i;
            }
        }
        if(n != 1) res = n;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(UocSoNguyenToLonNhat(n));
        }
    }
}
