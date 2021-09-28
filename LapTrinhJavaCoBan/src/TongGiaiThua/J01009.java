package TongGiaiThua;

import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[] = new long[n+1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1]*i;
        }
        long res = 0;
        for(int i = 1; i <= n; i++){
            res += dp[i];
        }
        System.out.println(res);
    }
}
