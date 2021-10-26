package SapXepBangGiaXangDau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> listDh = new ArrayList<>();
        while (t-- > 0){
            String s = sc.nextLine();
            DonHang dh = new DonHang(s.split("\\s+")[0], Integer.parseInt(s.split("\\s+")[1]));
            listDh.add(dh);
        }

        Collections.sort(listDh);
        for(DonHang dh:listDh){
            System.out.println(dh);
        }
    }
}
