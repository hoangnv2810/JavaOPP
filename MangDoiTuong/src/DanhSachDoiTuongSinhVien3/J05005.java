package DanhSachDoiTuongSinhVien3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSt = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            SinhVien temp = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            listSt.add(temp);
        }
        Collections.sort(listSt);
        for(SinhVien sv : listSt){
            System.out.println(sv);
        }
    }
}
