package SoNguyenToTrongHaiFileNhiPhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class J07016 {
    private static boolean prime[] = new boolean[10001];

    private static void sieve() {
        for (int i = 0; i < 10001; i++) {
            prime[i] = true;
        }
        prime[0] = prime[1] = false;
        for (int i = 2; i * i < 10001; i++) {
            if (prime[i]) {
                for (int j = i * i; j < 10001; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        sieve();
        for (Integer x : a) {
            if (prime[x]) {
                if (tm1.containsKey(x)) {
                    tm1.put(x, tm1.get(x) + 1);
                } else {
                    tm1.put(x, 1);
                }
            }
        }

        for (Integer x : b) {
            if (prime[x]) {
                if (tm2.containsKey(x)) {
                    tm2.put(x, tm2.get(x) + 1);
                } else {
                    tm2.put(x, 1);
                }
            }
        }

        TreeSet<Integer> ts = new TreeSet<>(tm1.keySet());
        for (Integer x : ts) {
            if (tm2.containsKey(x)) {
                System.out.println(x + " " + tm1.get(x) + " " + tm2.get(x));
            }
        }

    }
}
