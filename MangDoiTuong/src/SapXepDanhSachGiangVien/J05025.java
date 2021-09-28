package SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {
    public static void main(String[] args) {
        ArrayList<GiangVien> listGV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            GiangVien gv = new GiangVien(i, sc.nextLine(), sc.nextLine());
            listGV.add(gv);
        }
        Collections.sort(listGV);
        for(GiangVien gv:listGV){
            System.out.println(gv);
        }
    }
}
