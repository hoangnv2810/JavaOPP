package NguyenToThuanNghich;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07023 {
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean thuanNgich(int n){
        if(isPrime(n)){
            String s = String.valueOf(n);
            StringBuilder sb = new StringBuilder(s);
            String tmp = sb.reverse().toString();
            if(s.compareTo(tmp) == 0){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i: a){
            if(thuanNgich(i)){
                if(tm.containsKey(i)){
                    tm.put(i, tm.get(i)+1);
                } else {
                    tm.put(i, 1);
                }
            }
        }

        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        for(Integer i: b){
            if(thuanNgich(i)){
                if(tm2.containsKey(i)){
                    tm2.put(i, tm2.get(i) + 1);
                } else {
                    tm2.put(i, 1);
                }
            }
        }

        for(Integer i: tm.keySet()){
            if(tm2.containsKey(i)){
                System.out.println(i + " " + tm.get(i) + " " + tm2.get(i));
            }
        }
    }
}
