package DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        ArrayList<GiangVien> listGV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            GiangVien gv = new GiangVien(i, sc.nextLine(), sc.nextLine());
            listGV.add(gv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String subject = sc.nextLine();
            String tmp = GiangVien.hanlde(subject);
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for (GiangVien gv : listGV) {
                if(tmp.compareTo(GiangVien.hanlde(gv.getSubject())) == 0){
                    System.out.println(gv);
                }
            }
        }
    }
}
