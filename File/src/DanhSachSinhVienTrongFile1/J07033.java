package DanhSachSinhVienTrongFile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07033 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (t-- > 0){
            listSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(listSV);
        for(SinhVien sv:listSV){
            System.out.println(sv);
        }
    }
}
