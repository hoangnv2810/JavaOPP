package SoThuanNghichTrongFile;

import sun.misc.Signal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class J07032 {
    private static boolean soThuanNghich(int num){
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        if(sb.reverse().toString().compareTo(String.valueOf(num)) != 0){
            return false;
        }
        String number = String.valueOf(num);
        if(number.length()%2 == 0 || number.length() == 1){
            return false;
        }
        for(int i = 0; i < number.length(); i++){
            if(Integer.parseInt(String.valueOf(number.charAt(i)))%2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i:list1){
            if(soThuanNghich(i)){
                if (tm.containsKey(i)) {
                    tm.put(i, tm.get(i)+1);
                } else {
                    tm.put(i, 1);
                }
            }
        }
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        for(Integer i:list2){
            if(soThuanNghich(i)){
                if(tm2.containsKey(i)){
                    tm2.put(i, tm2.get(i)+1);
                } else {
                    tm2.put(i, 1);
                }
            }
        }
        int cnt = 10;
        for(Integer i:tm.keySet()){
            if(tm2.containsKey(i) && cnt > 0){
                System.out.println(i + " " + (tm.get(i)+tm2.get(i)));
                cnt--;
            }
        }
    }
}
