package HocBongSinhVien;

import javax.crypto.Cipher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05062 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        ArrayList<Double> listGPA = new ArrayList<>();
        while (n-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextDouble(), Integer.parseInt(sc.nextLine().trim()));
            listSV.add(sv);
            listGPA.add(sv.getTbc());
        }
        Collections.sort(listGPA);
        Collections.reverse(listGPA);
        double gpaHb = 0;
        for(Double d:listGPA){
            if(m > 0){
                gpaHb = d;
                m--;
            } else {
                break;
            }
        }
        for(SinhVien sv:listSV){
            if(sv.getTbc() >= gpaHb){
                System.out.println(sv.getTen() + ": " + sv.hocBong(sv.getTbc()));
            } else {
                System.out.println(sv.getTen() + ": " + "KHONG");
            }
        }
    }
}
