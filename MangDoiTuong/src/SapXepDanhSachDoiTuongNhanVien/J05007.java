package SapXepDanhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listEmp = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            NhanVien tmp = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listEmp.add(tmp);
        }
        Collections.sort(listEmp);
        for(NhanVien emp : listEmp){
            System.out.println(emp);
        }
    }
}
