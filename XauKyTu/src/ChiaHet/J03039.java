package ChiaHet;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s[] = sc.nextLine().split("\\s+");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            if(String.valueOf(a.mod(b)).compareTo("0") == 0 ||
            String.valueOf(b.mod(a)).compareTo("0") == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
