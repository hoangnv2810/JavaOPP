package TimKiemNhanVienTheoTen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05066 {
    public static int cntGD = 1, cntTP = 3, cntPP = 3;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        while (t-- > 0){
            String ma = sc.next();
            NhanVien nv = new NhanVien(ma, sc.nextLine().trim());
            int soHieu = Integer.parseInt(ma.substring(4));
            if(nv.chucVu().compareTo("GD") == 0 && cntGD > 0 && soHieu == 1){
                cntGD--;
            } else if(nv.chucVu().compareTo("TP") == 0 && cntTP > 0 && soHieu <= 3){
                cntTP--;
            } else if(nv.chucVu().compareTo("PP") == 0 && cntPP > 0 && soHieu <= 3){
                cntPP--;
            } else {
                String s = "NV" + nv.getId().substring(2);
                nv.setId(s);
            }
            listNV.add(nv);
        }

        Collections.sort(listNV);
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String key = sc.nextLine();
            for (NhanVien nv:listNV){
                if(nv.getName().toLowerCase().contains(key.toLowerCase())){
                    System.out.println(nv);
                }
            }
            System.out.println();
        }
    }
}
