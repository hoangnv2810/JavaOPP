package SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            MatHang mh = new MatHang(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            listMh.add(mh);
        }
        Collections.sort(listMh);
        for(MatHang mh: listMh){
            System.out.println(mh);
        }
    }
}
