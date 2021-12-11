package SapXepMatHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String line[] = new String[4];
            docFile(sc, line, 4);
            listMH.add(new MatHang(i, line));
        }
        Collections.sort(listMH);
        for(MatHang mh:listMH){
            System.out.println(mh);
        }
    }

    public static void docFile(Scanner sc, String line[], int soDong){
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }

}
