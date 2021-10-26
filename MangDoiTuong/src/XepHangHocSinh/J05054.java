package XepHangHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05054 {
    static ArrayList<HocSinh> lsHs = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> listHs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            HocSinh hs = new HocSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()));
            lsHs.add(hs);
            listHs.add(hs);
        }
        for(HocSinh hs: listHs){
            System.out.println(hs + " " + xepHang(hs));
        }
    }

    public static int xepHang(HocSinh hs){
        Collections.sort(lsHs);
        int index = lsHs.indexOf(hs);
        while (index > 0 && lsHs.get(index).getGpa() == lsHs.get(index-1).getGpa()){
            index--;
        }
        return lsHs.indexOf(lsHs.get(index))+1;
    }
}
