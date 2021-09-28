package SapXepTheoMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05021 {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSV.add(sv);
        }

        Collections.sort(listSV);
        for(SinhVien sv:listSV){
            System.out.println(sv);
        }
    }
}
