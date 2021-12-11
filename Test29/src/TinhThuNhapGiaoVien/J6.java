package TinhThuNhapGiaoVien;

import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        System.out.println(gv);
    }
}
