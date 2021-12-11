package XetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class J4 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String line[] = new String[4];
            docFile(sc, line, 4);
            System.out.println(new ThiSinh(i, line));
        }
    }
    public static void docFile(Scanner sc, String line[], int soDong){
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
