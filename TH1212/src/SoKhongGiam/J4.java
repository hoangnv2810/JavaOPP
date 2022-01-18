package SoKhongGiam;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class J4 {
    private static boolean check(int num){
        String number = String.valueOf(num);
        if(number.length() > 4 || number.length() == 1){
            return false;
        }
        for(int i = 1; i < number.length(); i++){
            if(Integer.parseInt(String.valueOf(number.charAt(i))) < Integer.parseInt(String.valueOf(number.charAt(i-1)))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(59);
//        a.add(59);
//        a.add(87);
//        a.add(66);
//        a.add(1228);
//        a.add(1228);
//        out.writeObject(a);
//
//        ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(59);
//        a1.add(68);
//        a1.add(66);
//        a1.add(131333);
//        a1.add(1);
//        a1.add(1228);
//        a1.add(1228);
//        out1.writeObject(a1);


        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(Integer i:list1){
            if(check(i)){
                if(tm.containsKey(i)){
                    tm.put(i, tm.get(i)+1);
                } else {
                    tm.put(i, 1);
                }
            }
        }

        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) in.readObject();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer i:list2){
            if(check(i)){
                if(hm.containsKey(i)){
                    hm.put(i, hm.get(i)+1);
                } else {
                    hm.put(i, 1);
                }
            }
        }



        for(Integer i:tm.keySet()){
            if(hm.containsKey(i)){
                System.out.println(i + " " + tm.get(i) + " " + hm.get(i));
            }
        }
    }
}
