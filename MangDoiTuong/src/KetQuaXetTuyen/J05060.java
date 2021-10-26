package KetQuaXetTuyen;

import java.text.ParseException;
import java.util.Scanner;

public class J05060 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            System.out.println(ts);
        }
    }
}
