package SapXepHoaDonQuanAo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J06002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> listSP = new ArrayList<>();
        while (t-- > 0){
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listSP.add(sp);
        }

        t = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> listHD = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String tmp = sc.nextLine();
            SanPham s = new SanPham();
            for(SanPham sp: listSP){
                if(tmp.split("\\s+")[0].startsWith(sp.getId())){
                    s = sp;
                    break;
                }
            }
            HoaDon hd = new HoaDon(i, tmp.split("\\s+")[0], s, Integer.parseInt(tmp.split("\\s+")[1]));
            listHD.add(hd);
        }
        Collections.sort(listHD);
        for(HoaDon hd: listHD){
            System.out.println(hd);
        }
    }
}
