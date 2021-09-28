package DanhSachDoiTuongSinhVien1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05003 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSv= new ArrayList<>();
        for(int i = 1; i <= n; i++){
            SinhVien sv =  new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            listSv.add(sv);
        }
        for(SinhVien sv: listSv){
            System.out.println(sv);
        }
    }
}
