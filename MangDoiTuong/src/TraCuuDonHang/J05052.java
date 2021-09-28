package TraCuuDonHang;

import java.util.ArrayList;
import java.util.Scanner;

public class J05052 {
    public static void main(String[] args) {
        ArrayList<DonHang> listDh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            DonHang dh = new DonHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt((sc.nextLine())));
            listDh.add(dh);
        }
        for(DonHang dh:listDh){
            System.out.println(dh);
        }
    }
}
