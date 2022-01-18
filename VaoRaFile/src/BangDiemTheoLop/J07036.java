package BangDiemTheoLop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07036 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listsv = new ArrayList<>();
        while (t-- > 0){
            listsv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> listmh = new ArrayList<>();
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            listmh.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> listbd = new ArrayList<>();
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String tmp[] = sc.nextLine().split("\\s+");
            SinhVien s = new SinhVien();
            for(SinhVien sv:listsv){
                if(sv.getMa().compareTo(tmp[0]) == 0){
                    s = sv;
                    break;
                }
            }
            MonHoc m = new MonHoc();
            for(MonHoc mh:listmh){
                if(mh.getMa().compareTo(tmp[1]) == 0){
                    m = mh;
                    break;
                }
            }
            listbd.add(new BangDiem(s, m, tmp[2]));
        }
        Collections.sort(listbd);
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String maLop = sc.nextLine();
            System.out.println("BANG DIEM lop " + maLop + ":");
            for(BangDiem bd:listbd){
                if(bd.getSv().getLop().compareTo(maLop) == 0){
                    System.out.println(bd);
                }
            }
        }
    }
}
