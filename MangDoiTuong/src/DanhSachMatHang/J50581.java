package DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J50581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            listMH.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(listMH);
        for(MatHang mh:listMH){
            System.out.println(mh);
        }
    }
}
