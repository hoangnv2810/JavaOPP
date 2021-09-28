package TinhTong;

import javax.lang.model.element.NestingKind;
import java.math.BigInteger;
import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            BigInteger num = new BigInteger(a);
            BigInteger one = new BigInteger("1");
            BigInteger temp = num.multiply(num.add(one));
            BigInteger two = new BigInteger("2");
            BigInteger res = temp.divide(two);
            System.out.println(res);
        }
    }
}
