package BangDiemThanhPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05030 {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            double[] point = new double[3];
            for(int i = 0; i < 3; i++){
                point[i] = Double.parseDouble(sc.nextLine())*1.0;
            }
            SinhVien sv = new SinhVien(id, name, className, point);
            listSv.add(sv);
        }
        Collections.sort(listSv);
        int stt = 1;
        for(SinhVien sv:listSv){
            System.out.println(stt++ + " " + sv);
        }
    }
}
