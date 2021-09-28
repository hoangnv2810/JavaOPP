package TongPhanSo;

import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(a.sumPs(b));
    }
}
