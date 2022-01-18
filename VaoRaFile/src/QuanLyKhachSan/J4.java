package QuanLyKhachSan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J4 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<LoaiPhong> listLP = new ArrayList<>();
        while (t-- > 0){
            listLP.add(new LoaiPhong(sc.nextLine()));
        }

        t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String name = sc.nextLine();
            String maPhong = sc.nextLine();
            String ngayDen = sc.nextLine();
            String ngayDi = sc.nextLine();
            for(LoaiPhong lp:listLP){
                if(lp.getKyHieu().compareTo(String.valueOf(maPhong.charAt(2))) == 0){
                    KhachHang kh = new KhachHang(i, name, maPhong, ngayDen, ngayDi, lp);
                    listKH.add(kh);
                    break;
                }
            }
        }
        Collections.sort(listKH);
        for(KhachHang kh:listKH){
            System.out.println(kh);
        }
    }
}
