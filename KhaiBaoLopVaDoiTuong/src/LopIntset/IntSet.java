package LopIntset;

import java.util.Arrays;
import java.util.TreeSet;

public class IntSet {
    private int a[];

    public IntSet(int[] a) {
        this.a = a;
    }

    public IntSet union(IntSet b) {
        TreeSet<Integer> set = new TreeSet<>();
        for(Integer x : a){
            set.add(x);
        }
        for(Integer x: b.a){
            set.add(x);
        }
        int res[] = new int[set.size()], i = 0;
        for(Integer x: set){
            res[i] = x;
            i++;
        }
        return new IntSet(res);
    }

    @Override
    public String toString() {
        String res = "";
        for(int x:a){
            res += x + " ";
        }
        return res.trim();
    }
}
