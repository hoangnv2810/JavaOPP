package TinhTong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()){
            String s = sc.next();
            try {
                int num = Integer.parseInt(s);
                sum += num;
            } catch (Exception e){
                continue;
            }
        }
        System.out.println(sum);
    }
}
