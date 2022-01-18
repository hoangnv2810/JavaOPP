package QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07027 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSV.add(sv);
        }

        sc = new Scanner(new File("BAITAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BaiTap> listBT = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.valueOf(i);
            BaiTap bt = new BaiTap(id, sc.nextLine());
            listBT.add(bt);
        }

        sc = new Scanner(new File("NHOM.in"));
        ArrayList<Nhom> listN = new ArrayList<>();
        while (sc.hasNextLine()){
            String s[] = sc.nextLine().split("\\s+");
            SinhVien sv = new SinhVien();
            BaiTap bt = new BaiTap();
            for(SinhVien st:listSV){
                if(st.getId().compareTo(s[0]) == 0){
                    sv = st;
                    break;
                }
            }
            for(BaiTap b: listBT){
                if(b.getId().compareTo(s[1]) == 0){
                    bt = b;
                    break;
                }
            }
            Nhom g = new Nhom(sv, bt);
            listN.add(g);
        }
        Collections.sort(listN);
        for(Nhom g:listN){
            System.out.println(g);
        }

    }
}
