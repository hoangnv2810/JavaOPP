package XepHang;

import LietKeNhapVienTheoNhom.NhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XepHang> listXh = new ArrayList<>();
        while(n-- > 0){
            XepHang xp = new XepHang(sc.nextInt(), sc.nextInt());
            listXh.add(xp);
        }
        Collections.sort(listXh);
//        for(NhanVien i)
    }
}
