package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author This MC
 */
public class J07016main {
    public static boolean tn(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        String tmp = sb.reverse().toString();
        if (s.compareTo(tmp) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checksnt(int n) {
        if (tn(n)) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ans1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ans2 = (ArrayList<Integer>) ois2.readObject();
        Map<Integer, Integer> m1 = new TreeMap<>();
        Map<Integer, Integer> m2 = new TreeMap<>();
        for (int i : ans1) {
            if (checksnt(i)) {
                if (m1.containsKey(i)) {
                    m1.put(i, m1.get(i) + 1);
                } else {
                    m1.put(i, 1);
                }
            }
        }
        for (int i : ans2) {
            if (checksnt(i)) {
                if (m2.containsKey(i)) {
                    m2.put(i, m2.get(i) + 1);
                } else {
                    m2.put(i, 1);
                }
            }
        }
        for (Integer i : m1.keySet()) {
            if (m2.containsKey(i)) {
                System.out.println(i + " " + m1.get(i) + " " + m2.get(i));
            }

        }
    }

}
