package DiemTuyenSinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> listTS = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String line[] = new String[4];
            docFile(sc, line, 4);
            listTS.add(new ThiSinh(i, line));
        }
        Collections.sort(listTS);
        for(ThiSinh ts:listTS){
            System.out.println(ts);
        }
    }

    private static void docFile(Scanner sc, String[] line, int soDong) {
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
