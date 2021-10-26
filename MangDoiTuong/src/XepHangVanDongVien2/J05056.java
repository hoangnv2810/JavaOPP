package XepHangVanDongVien2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05056 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> listPrint = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            VanDongVien vdv = new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listPrint.add(vdv);
        }
        Collections.sort(listPrint);
        for (VanDongVien vdv : listPrint) {
            int index = listPrint.indexOf(vdv);
            while (index > 0 && listPrint.get(index).thoiGianXH().equals(listPrint.get(index - 1).thoiGianXH())) {
                index--;
            }
            int xh = listPrint.indexOf(listPrint.get(index))+1;
            System.out.println(vdv + " " + xh);
        }
    }

}
