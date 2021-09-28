package TinhSoFibonacci;

import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long[] dp = new long[n+1];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            System.out.println(dp[n]);
            t--;
        }
    }
}
