package ThongKeTuKhacNhauTrongFileNhiPhan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class J07012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();

        String s = "";
        for (String i : a) {
            s += i + " ";
        }

        String tmp[] = s.toLowerCase().split("\\W+");
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (String str : tmp) {
            if (tm.containsKey(str)) {
                tm.put(str, tm.get(str) + 1);
            } else {
                tm.put(str, 1);
            }
        }

        ArrayList<Pair> listP = new ArrayList<>();
        for (String key : tm.keySet()) {
            listP.add(new Pair(key, tm.get(key)));
        }

        Collections.sort(listP, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else if (o1.getValue() == o2.getValue()) {
                    if (o1.getKey().compareTo(o2.getKey()) > 0) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
                return -1;
            }
        });
        for (Pair x : listP) {
            System.out.println(x);
        }
    }
}
