package SapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrSV.add(sv);
        }
        Collections.sort(arrSV);
        for(SinhVien sv:arrSV){
            System.out.println(sv);
        }
    }
}
