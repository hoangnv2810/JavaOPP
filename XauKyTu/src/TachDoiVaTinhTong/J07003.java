package TachDoiVaTinhTong;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    private static void solve(String num){
        if(num.length() == 1){
            return;
        }
        BigInteger a = new BigInteger(num.substring(0, num.length()/2));
        BigInteger b = new BigInteger(num.substring(num.length()/2));
        System.out.println(a.add(b));
        solve(String.valueOf(a.add(b)));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String num = sc.nextLine();
        solve(num);
    }
}
