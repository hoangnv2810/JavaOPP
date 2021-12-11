package TinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String line[] = new String[5];
            docFile(sc, line, 5);
            listKH.add(new KhachHang(i, line));
        }
        Collections.sort(listKH);
        for(KhachHang kh:listKH){
            System.out.println(kh);
        }
    }

    public static void docFile(Scanner sc, String line[], int soDong){
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
