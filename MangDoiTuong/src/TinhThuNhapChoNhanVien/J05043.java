package TinhThuNhapChoNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class J05043 {
    public static void main(String[] args) {
        ArrayList<NhanVien> listNv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listNv.add(nv);
        }
        for(NhanVien nv:listNv){
            System.out.println(nv);
        }
    }
}
