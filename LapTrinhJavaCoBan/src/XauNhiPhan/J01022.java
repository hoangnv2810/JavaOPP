package XauNhiPhan;

import java.util.Scanner;

public class J01022 {
    public static int XauNhiPhan(long [] dp, int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= dp[n-2]) return XauNhiPhan(dp, n-2, k);
        else return XauNhiPhan(dp, n-1, k-dp[n-2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] dp = new long[93];
            dp[1] = 1;
            dp[2] = 1;
            for(int i = 3; i <= 92; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            System.out.println(XauNhiPhan(dp, n, k));

        }
    }
}
