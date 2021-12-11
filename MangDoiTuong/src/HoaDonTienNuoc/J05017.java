package HoaDonTienNuoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> listKH = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            listKH.add(new KhachHang(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(listKH);
        for(KhachHang kh:listKH){
            System.out.println(kh);
        }
    }
}
