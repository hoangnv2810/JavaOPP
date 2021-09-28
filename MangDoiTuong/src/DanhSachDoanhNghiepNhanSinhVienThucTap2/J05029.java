package DanhSachDoanhNghiepNhanSinhVienThucTap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> listDn = new ArrayList<>();
        while(t-- > 0){
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listDn.add(dn);
        }
        Collections.sort(listDn);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            int st = Integer.parseInt(sc.next());
            int en = Integer.parseInt(sc.next());
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + st + " DEN " + en + " SINH VIEN:");
            for(DoanhNghiep dn:listDn){
                if(dn.search(st, en))
                    System.out.println(dn);
            }
        }

    }
}
