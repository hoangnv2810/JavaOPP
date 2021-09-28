package BoiChungNhoNhatCuaNSoNguyenDuongDauTien;

import java.util.Scanner;

public class J02008 {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b){
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long temp = 1L;
            for(int i = 1; i <= n; i++){
                temp = lcm(temp, i);
            }
            System.out.println(temp);
        }
    }
}
