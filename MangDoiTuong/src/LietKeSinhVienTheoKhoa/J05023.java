package LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSV.add(sv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(SinhVien sv:listSV){
                if(sv.getClassName().compareTo(s) == 0)
                    System.out.println(sv);
            }
        }
    }
}
