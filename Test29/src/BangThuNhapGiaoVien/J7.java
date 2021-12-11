package BangThuNhapGiaoVien;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J7 {
    static Map<String, Integer> mp = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> listGv = new ArrayList<>();
        while (t-- > 0) {
            GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            listGv.add(gv);
        }
        int cntHT = 0, cntHP = 0;
        for(GiaoVien gv: listGv){
            String tmp = gv.getMa().substring(0,2);
            if(tmp.compareTo("HT") == 0 && cntHT == 0){
                System.out.println(gv);
                cntHT++;
            } else if(tmp.compareTo("HP") == 0 && cntHP < 2){
                System.out.println(gv);
                cntHP++;
            }else if(tmp.compareTo("GV") == 0){
                System.out.println(gv);
            }
        }
    }
}
