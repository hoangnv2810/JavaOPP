package TinhTienDien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String line[] = new String[2];
            docFile(sc, line, 2);
            listKH.add(new KhachHang(i, line));
        }
        Collections.sort(listKH);
        for(KhachHang kh:listKH){
            System.out.println(kh);
        }
    }

    private static void docFile(Scanner sc, String[] line, int soDong) {
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
