package SapXepBangTinhCong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listNv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            listNv.add(nv);
        }
        Collections.sort(listNv);
        for(NhanVien nv: listNv){
            System.out.println(nv);
        }
    }
}
