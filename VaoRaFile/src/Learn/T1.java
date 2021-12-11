package Learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            String w = sc.next();
            System.out.println(w);
        }
    }
}
