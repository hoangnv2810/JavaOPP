package TinhToanHoaDonBanQuanAo;

import java.util.ArrayList;
import java.util.Scanner;

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> listSP = new ArrayList<>();
        while (t-- > 0){
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listSP.add(sp);
        }

        t = Integer.parseInt(sc.nextLine());
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
            System.out.println(hd);
        }
    }
}
