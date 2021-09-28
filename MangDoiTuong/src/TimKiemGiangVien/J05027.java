package TimKiemGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
    public static void main(String[] args) {
        ArrayList<GiangVien> listGV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            GiangVien gv = new GiangVien(i, sc.nextLine(), sc.nextLine());
            listGV.add(gv);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String key = sc.nextLine();
            String keyword = key.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for (GiangVien gv : listGV) {
                if(gv.search(keyword) && key.compareTo(" ") != 0){
                    System.out.println(gv);
                }
            }
        }
    }
}
