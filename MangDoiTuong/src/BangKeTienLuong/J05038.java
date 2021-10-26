package BangKeTienLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listNv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            listNv.add(nv);
        }
        long sum = 0;
        for(NhanVien nv: listNv){
            sum += nv.total();
            System.out.println(nv);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
