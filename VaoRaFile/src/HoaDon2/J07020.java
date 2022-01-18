package HoaDon2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07020 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            KhachHang kh = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listKH.add(kh);
        }

        sc = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            MatHang mh = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listMH.add(mh);
        }

        sc = new Scanner(new File("HD.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++){
            String s[] = sc.nextLine().split("\\s+");
            KhachHang k = new KhachHang();
            MatHang m = new MatHang();
            for (KhachHang kh: listKH){
                if(kh.getId().compareTo(s[0]) == 0){
                    k = kh;
                    break;
                }
            }
            for (MatHang mh: listMH){
                if(mh.getId().compareTo(s[1]) == 0){
                    m = mh;
                    break;
                }
            }
            HoaDon hd = new HoaDon(i, k, m, Integer.parseInt(s[2]));
            System.out.println(hd);
        }
    }
}
