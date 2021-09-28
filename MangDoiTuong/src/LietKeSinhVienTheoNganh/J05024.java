package LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
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
            String industryName = sc.nextLine();
            String s = SinhVien.handle(industryName);
            System.out.println("DANH SACH SINH VIEN NGANH " + industryName.toUpperCase() + ":");
            for(SinhVien sv:listSV){
                if(s == "DCCN" || s == "DCAT"){
                    if(sv.getId().compareTo(s) == 0 && sv.getClassName().compareTo("E") != 0)
                        System.out.println(sv);
                } else {
                    if(sv.getId().compareTo(s) == 0){
                        System.out.println(sv);
                    }
                }

            }
        }
    }
}
