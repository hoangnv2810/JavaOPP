package ChuaHoaDanhSachSinhVien;


import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

public class J6 {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            System.out.println(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
    }
}
