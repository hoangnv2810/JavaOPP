package SoNguyenTo;

import java.util.Scanner;

public class J01004 {
    public static int isPrime(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
//            boolean check[] = new boolean[n+1];
//            Arrays.fill(check, true);
//            for(int i = 2; i*i <= n; i++){
//                if(check[i]){
//                    for(int j = i*i; j <= n; j += i){
//                        check[j] = false;
//                    }
//                }
//            }
//            if(check[n] && n >= 2) System.out.println("YES");
//            else System.out.println("NO");
            if(isPrime(n) == 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
