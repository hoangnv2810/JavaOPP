package BoiSoChungUocSoChung;

import java.math.BigInteger;
import java.util.Scanner;


public class J01011 {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
    public static BigInteger lcm(int a, int b){
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger temp =  num1.multiply(num2);
        long temp1 = gcd(a, b);
        String s3 = String.valueOf(temp1);
        BigInteger num3 = new BigInteger(s3);
        return temp.divide(num3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
