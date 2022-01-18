package LopInset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }

    public IntSet intersection(IntSet b) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(Integer i:a){
            ts.add(i);
        }
        TreeSet<Integer> ts1 = new TreeSet<>();
        for(Integer i:b.a){
            ts1.add(i);
        }
        ts.retainAll(ts1);
        int[] res = new int[ts.size()];
        int i = 0;
        for(Integer x:ts){
            res[i] = x;
            i++;
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(Integer i:a){
            res += i + " ";
        }
        return res.trim();
    }
}
