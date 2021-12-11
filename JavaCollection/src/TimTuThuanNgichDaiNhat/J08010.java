package TimTuThuanNgichDaiNhat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J08010 {
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().compareTo(s) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        int mx = -1;
        while (sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                if(s.length() > mx){
                    mx = s.length();
                }
                if(lhm.containsKey(s)){
                    lhm.put(s, lhm.get(s)+1);
                } else {
                    lhm.put(s, 1);
                }
            }
        }
        for (String s:lhm.keySet()){
            if(s.length() == mx){
                System.out.println(s + " " + lhm.get(s));
            }
        }
    }
}
