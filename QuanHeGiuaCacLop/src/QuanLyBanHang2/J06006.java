package QuanLyBanHang2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J06006 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            KhachHang kh = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listKH.add(kh);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            MatHang mh = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listMH.add(mh);
        }

        n = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> listHD = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String tmp = sc.nextLine();
            KhachHang k = null;
            MatHang m = null;
            for(KhachHang kh: listKH){
                if(kh.getMa().compareTo(tmp.split("\\s+")[0]) == 0){
                    k = kh;
                    break;
                }
            }

            for(MatHang mh: listMH){
                if(mh.getMa().compareTo(tmp.split("\\s+")[1]) == 0){
                    m = mh;
                    break;
                }
            }
            HoaDon hd = new HoaDon(i, k, m, Integer.parseInt(tmp.split("\\s+")[2]));
            listHD.add(hd);
        }

        Collections.sort(listHD);
        for(HoaDon hd: listHD){
            System.out.println(hd);
        }
    }
}
