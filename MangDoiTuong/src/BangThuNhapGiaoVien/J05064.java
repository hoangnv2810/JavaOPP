package BangThuNhapGiaoVien;

import java.util.ArrayList;
import java.util.Scanner;

public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int cntHT = 0, cntHP = 0;
        while (t-- > 0){
            GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(gv.getId().startsWith("HT") && cntHT < 1){
                cntHT++;
                System.out.println(gv);
            } else if(gv.getId().startsWith("HP") && cntHP < 2){
                cntHP++;
                System.out.println(gv);
            } else if(!gv.getId().startsWith("HP") && !gv.getId().startsWith("HT")){
                System.out.println(gv);
            }
        }
    }
}
