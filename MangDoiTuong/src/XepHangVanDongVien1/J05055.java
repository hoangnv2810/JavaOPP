package XepHangVanDongVien1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05055 {
    static ArrayList<VanDongVien> listVdv = new ArrayList<>();
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> listPrint = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            VanDongVien vdv = new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listVdv.add(vdv);
            listPrint.add(vdv);
        }
        Collections.sort(listVdv);
        for(VanDongVien vdv:listPrint) {
            System.out.println(vdv + " " + xepHang(vdv));
        }
    }

    public static int xepHang(VanDongVien vdv) throws ParseException {
        int index = listVdv.indexOf(vdv);
        while (index > 0 && listVdv.get(index).thoiGianXH().equals(listVdv.get(index-1).thoiGianXH())){
            index--;
        }
        return listVdv.indexOf(listVdv.get(index))+1;
    }
}
