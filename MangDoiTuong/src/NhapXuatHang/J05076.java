package NhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        while (t-- > 0){
            listMH.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String tmp[] = sc.nextLine().split("\\s+");
            for(MatHang mh:listMH){
                if(tmp[0].compareTo(mh.getMa()) == 0){
                    System.out.println(new ThongKe(mh, Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3])));
                    break;
                }
            }
        }
    }
}
