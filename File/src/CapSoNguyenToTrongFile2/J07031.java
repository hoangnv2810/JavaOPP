package CapSoNguyenToTrongFile2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class J07031 {
    private static boolean prime(int n){
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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(list);
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in.readObject();
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(list1);
        for(Integer n:ts){
            int m = 1000000-n;
            if(n < m && prime(m) && prime(n) && !hs.contains(m) && !hs.contains(n) && ts.contains(m)){
                System.out.println(n + " " + m);
            }
        }

    }
}
