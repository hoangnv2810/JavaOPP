package SoKhacNhauTrongFile3;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i:list){
            if(tm.containsKey(i)){
                tm.put(i, tm.get(i)+1);
            } else {
                tm.put(i, 1);
            }
        }
        for(Integer i:tm.keySet()){
            System.out.println(i + " " + tm.get(i));
        }

    }
}
