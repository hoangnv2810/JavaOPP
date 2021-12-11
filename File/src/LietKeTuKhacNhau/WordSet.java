package LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private String s;

    public WordSet(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(s));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.next().toLowerCase());
        }
        TreeSet<String> set = new TreeSet<>();
        set.addAll(list);
        String res = "";
        for(String s: set){
            res += s + "\n";
        }
        return res.substring(0,res.length()-1);
    }
}
