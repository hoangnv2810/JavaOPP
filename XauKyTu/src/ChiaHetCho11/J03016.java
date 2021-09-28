package ChiaHetCho11;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("11");
            if(a.mod(b).toString().equals("0")){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
