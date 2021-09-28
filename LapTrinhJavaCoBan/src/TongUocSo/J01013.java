package TongUocSo;

import java.util.Scanner;
// gf
public class J01013 {
    static long res = 0;
    static final int n = 2000000;
    static int leastPrime[] = new int[n+1];
    public static void sieve() {
        for(int i = 1; i <= n; i++) leastPrime[i] = i;
        for(int i = 2; i*i <= n; i++){
            if(leastPrime[i] == i){
                for(int j = i*i; j <= n; j += i){
                    if(leastPrime[j] == j) leastPrime[j] = i;
                }
            }
        }
    }
    public static long solution(int a){
        long sum = 0;
        while(a != 1){
            sum += leastPrime[a];
            a = a/leastPrime[a];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sieve();
        while(t-- > 0){
            int x = sc.nextInt();
            res += solution(x);
        }
        System.out.println(res);
    }
}
