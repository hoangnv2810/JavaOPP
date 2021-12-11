package XacDinhDanhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05059 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> listTs = new ArrayList<>();
        ArrayList<Double> listDiem = new ArrayList<>();
        while (t-- > 0){
            ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            listTs.add(ts);
            listDiem.add(ts.tong());
        }
        Collections.sort(listTs);
        int n = Integer.parseInt(sc.nextLine());
        double diemChuan = 0;
        for(ThiSinh ts:listTs){
            if(n > 0){
                diemChuan = ts.tong();
                n--;
            } else {
                break;
            }
        }
        System.out.println(diemChuan);
        for(ThiSinh ts:listTs){
            if(diemChuan <= ts.tong()){
                System.out.println(ts + " TRUNG TUYEN");
            } else {
                System.out.println(ts + " TRUOT");
            }
        }

    }
}
