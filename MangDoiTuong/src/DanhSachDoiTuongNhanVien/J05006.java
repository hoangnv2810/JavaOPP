package DanhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05006 {
    public static void main(String[] args) throws ParseException {
        ArrayList<NhanVien> listEmp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            NhanVien emp = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listEmp.add(emp);
        }
        for(NhanVien emp:listEmp){
            System.out.println(emp);
        }
    }
}
