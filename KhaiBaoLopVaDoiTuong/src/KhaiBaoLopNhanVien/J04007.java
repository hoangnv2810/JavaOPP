package KhaiBaoLopNhanVien;

import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String taxCode = sc.nextLine();
        String signDate = sc.nextLine();
        NhanVien nv = new NhanVien(name, gender, dob, address, taxCode, signDate);
        System.out.println(nv);

    }
}
