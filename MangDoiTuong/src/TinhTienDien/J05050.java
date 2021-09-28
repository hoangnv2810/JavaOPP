package TinhTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class J05050 {
    public static void main(String[] args) {
        ArrayList<KhachHang> listKh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            KhachHang kh = new KhachHang(i, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            listKh.add(kh);
        }
        for(KhachHang kh:listKh){
            System.out.println(kh);
        }
    }
}
