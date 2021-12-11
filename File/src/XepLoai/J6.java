package XepLoai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> listBD = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String line[] = new String[4];
            docFile(sc, line, 4);
            listBD.add(new BangDiem(i, line));
        }
        Collections.sort(listBD);
        for(BangDiem bd:listBD){
            System.out.println(bd);
        }
    }

    private static void docFile(Scanner sc, String[] line, int soDong) {
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
