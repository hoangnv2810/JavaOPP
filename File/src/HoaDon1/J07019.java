package HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07019 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> listSP = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listSP.add(sp);
        }

        sc = new Scanner(new File("DATA2.in"));
        t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            String s = sc.nextLine();
            for(SanPham sp: listSP){
                if(s.split("\\s+")[0].startsWith(sp.getId())){
                    HoaDon hd = new HoaDon(i, s.split("\\s+")[0], sp, Integer.parseInt(s.split("\\s+")[1]));
                    System.out.println(hd);
                }
            }
        }
    }
}
