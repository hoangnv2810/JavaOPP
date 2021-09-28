package BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class J05048 {
    public static void main(String[] args) {
        ArrayList<HangHoa> listHh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            HangHoa hh = new HangHoa(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listHh.add(hh);
        }
        for(HangHoa hh:listHh){
            System.out.println(hh);
        }
    }
}
