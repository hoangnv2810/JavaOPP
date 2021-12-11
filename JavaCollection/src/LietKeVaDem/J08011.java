package LietKeVaDem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J08011 {
    public static boolean check(String s){
//        String s = String.valueOf(n);
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        while (sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                if(lhm.containsKey(s)){
                    lhm.put(s, lhm.get(s) + 1);
                } else {
                    lhm.put(s, 1);
                }
            }
        }
        ArrayList<Pair> a = new ArrayList<>();
        for(String s:lhm.keySet()){
            a.add(new Pair(s, lhm.get(s)));
//            System.out.println(s + " " + lhm.get(s));
        }
        Collections.sort(a);
        for(Pair p:a){
            System.out.println(p);
        }
    }
}
