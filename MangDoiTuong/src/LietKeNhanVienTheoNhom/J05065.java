package LietKeNhanVienTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> listNV = new ArrayList<>();
        int cntGD = 0, cntTP = 0, cntPP = 0;
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String ma = sc.next();
            String name = sc.nextLine();
            String id = ma.substring(0,2);
            NhanVien nv;
            if(id.compareTo("GD") == 0 && cntGD == 0){
                nv = new NhanVien(ma, name.trim());
                cntGD++;
            } else if(id.compareTo("TP") == 0 && cntTP < 3){
                nv = new NhanVien(ma, name.trim());
                cntTP++;
            } else if(id.compareTo("PP") == 0 && cntPP < 3){
                nv = new NhanVien(ma, name.trim());
                cntPP++;
            } else if(id.compareTo("NV") == 0){
                nv = new NhanVien(ma, name.trim());
            } else {
                String tmp = "NV" + ma.substring(2);
                nv = new NhanVien(tmp, name.trim());
            }
            listNV.add(nv);
        }
        Collections.sort(listNV);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String temp = sc.nextLine();
            for(NhanVien nv:listNV){
                if(temp.compareTo(nv.chuVu()) == 0){
                    System.out.println(nv);
                }
            }
            System.out.println();
        }
    }
}
