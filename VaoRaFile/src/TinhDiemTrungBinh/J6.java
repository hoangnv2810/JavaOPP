package TinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J6 {
    static ArrayList<SinhVien> listSV = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String line[] = new String[4];
            docFile(sc, line, 4);
            listSV.add(new SinhVien(i, line));
        }
        Collections.sort(listSV);
        for (SinhVien sv: listSV){
            System.out.println(sv + " " + xepHang(sv));
        }
    }

    private static int xepHang(SinhVien sv){
        int index = listSV.indexOf(sv);
        while (index > 0 && listSV.get(index).diemTB() == listSV.get(index-1).diemTB()){
            index--;
        }
        return listSV.indexOf(listSV.get(index))+1;
    }

    private static void docFile(Scanner sc, String[] line, int soDong) {
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
