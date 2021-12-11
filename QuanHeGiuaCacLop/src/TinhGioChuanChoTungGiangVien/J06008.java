package TinhGioChuanChoTungGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class J06008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        while (t-- > 0) {
            String id = sc.next();
            String nameMH = sc.nextLine().trim();
            MonHoc mh = new MonHoc(id, nameMH);
            listMH.add(mh);
        }

        t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> listGV = new ArrayList<>();
        while (t-- > 0) {
            String id = sc.next();
            String nameGV = sc.nextLine().trim();
            GiangVien gv = new GiangVien(id, nameGV);
            listGV.add(gv);
        }

        t = Integer.parseInt(sc.nextLine());
        ArrayList<Day> listD = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            GiangVien g = new GiangVien();
            for (GiangVien gv : listGV) {
                if (gv.getMa().compareTo(s.split("\\s+")[0]) == 0) {
                    g = gv;
                    break;
                }
            }
            MonHoc m = new MonHoc();
            for (MonHoc mh : listMH) {
                if (mh.getMa().compareTo(s.split("\\s+")[1]) == 0) {
                    m = mh;
                    break;
                }
            }
            Day d = new Day(g, m, Double.parseDouble(s.split("\\s+")[2]));
            listD.add(d);
        }

        String mGV = sc.nextLine();
        double tmp = 0;
        for (GiangVien gv: listGV){
            if(gv.getMa().compareTo(mGV) == 0){
                System.out.println("Giang vien: " + gv);
            }
        }
        for (Day d : listD) {
            if(d.getGv().getMa().compareTo(mGV) == 0){
                System.out.println(d.getMh().getName() + " " + d.getGio());
                tmp += d.getGio();
            }
        }
        System.out.println("Tong: " + String.format("%.2f", tmp));
    }
}
