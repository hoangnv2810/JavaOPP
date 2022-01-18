package HopVaGiaoCuaHaiFileVanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet implements Serializable {
    private String s;

    public WordSet(String s){
        this.s = s;
    }

    private ArrayList<String> convert(String path) throws FileNotFoundException {
        Scanner in = new Scanner(new File(path));
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()){
            list.add(in.next().toLowerCase());
        }
        return list;
    }

    public String union(WordSet s2) throws FileNotFoundException {
        TreeSet<String> a = new TreeSet<>();
        a.addAll(convert(s));
        TreeSet<String> b = new TreeSet<>();
        b.addAll(convert(s2.s));
        a.addAll(b);
        String res = "";
        for(String i: a){
            res += i + " ";
        }
        return res.trim();
    }

    public String intersection(WordSet s2) throws FileNotFoundException {
        TreeSet<String> a = new TreeSet<>();
        a.addAll(convert(s));
        TreeSet<String> b = new TreeSet<>();
        b.addAll(convert(s2.s));
        a.retainAll(b);
        String res = "";
        for(String i: a){
            res += i + " ";
        }
        return res.trim();
    }

//    @Override
//    public String toString() {
//        return ;
//    }
}
