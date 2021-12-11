package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class J7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) in.readObject();
        TreeSet<Pair> ts = new TreeSet<>();
        for(Pair p:list){
            if(p.getFirst() < p.getSecond()){
                ts.add(p);
            }
        }
        ArrayList<Pair> res = new ArrayList<>();
        res.addAll(ts);
//        Collections.sort(res);
        for(Pair p:res){
            System.out.println(p);
        }
    }
}
