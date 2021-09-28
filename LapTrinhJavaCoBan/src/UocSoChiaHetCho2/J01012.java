package UocSoChiaHetCho2;

import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), i, res = 0;
            for(i = 1; i <= Math.sqrt(n); i++){
                if(n%i == 0) {
                    if(i%2 == 0)res++;
                    if((n/i)%2 == 0) res++;
                }
            }
            i--;
            if(i%2 == 0 && i*i == n) res--;
            System.out.println(res);
        }
    }
}
