package TuyenGiaoVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> listGV = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            listGV.add(new GiaoVien(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }

        Collections.sort(listGV);
        for(GiaoVien gv:listGV){
            System.out.println(gv);
        }
    }
}
