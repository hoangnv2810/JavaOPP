package TinhLuyThua;

import java.util.Scanner;

public class J01021 {
    public static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 20;
        while (t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            long res = 1;
            while (b != 0){
                if(b%2 == 1){
                    res = (res*a)%mod;
                }
                a = (a*a)%mod;
                b/=2;
            }
            System.out.println(res);
        }
    }
}