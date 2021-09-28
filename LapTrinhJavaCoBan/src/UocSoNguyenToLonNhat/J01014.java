package UocSoNguyenToLonNhat;

import java.math.BigInteger;
import java.util.Scanner;

public class J01014 {
    public static boolean[] prime = new boolean[Integer.SIZE];
    public static void sieve(){
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger("3");
            System.out.println(a.isProbablePrime(1));

        }
    }
}
