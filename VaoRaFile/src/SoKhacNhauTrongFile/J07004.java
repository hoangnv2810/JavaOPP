package SoKhacNhauTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            if(tm.containsKey(n)){
                tm.put(n, tm.get(n)+1);
            } else {
                tm.put(n, 1);
            }
        }
        Set<Integer> set = tm.keySet();
        for(Integer key: set){
            System.out.println(key + " " + tm.get(key));
        }

    }
}
