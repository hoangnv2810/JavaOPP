package TinhGioChuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07028 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        while (n-- > 0){
            MonHoc mh = new MonHoc(sc.next(), sc.nextLine().trim());
            listMH.add(mh);
        }

        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> listGV = new ArrayList<>();
        while (n-- > 0){
            GiangVien gv = new GiangVien(sc.next(), sc.nextLine().trim());
            listGV.add(gv);
        }

        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<GioChuan> listGC = new ArrayList<>();
        while (n-- > 0){
            String s[] = sc.nextLine().split("\\s+");
            GiangVien gv = new GiangVien();
            MonHoc mh = new MonHoc();
            for(GiangVien g:listGV){
                if(g.getId().compareTo(s[0]) == 0){
                    gv = g;
                    break;
                }
            }
            for(MonHoc m:listMH){
                if(m.getId().compareTo(s[1]) == 0){
                    mh = m;
                    break;
                }
            }
            GioChuan gc = new GioChuan(gv, mh, Double.parseDouble(s[2]));
            listGC.add(gc);
        }

        for(GiangVien gv:listGV){
            Double tmp = 0.0;
            for(GioChuan gc:listGC){
                if(gv.getId().compareTo(gc.getGv().getId()) == 0){
                    tmp += gc.getGio();
                }
            }
            GioChuan gc = new GioChuan(gv, new MonHoc(), tmp);
            System.out.println(gc);
        }
    }
}
