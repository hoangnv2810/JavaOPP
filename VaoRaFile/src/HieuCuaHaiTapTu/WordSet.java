package HieuCuaHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private String path;

    public WordSet(String s) {
        this.path = s;
    }

    private TreeSet<String> readFile(String str) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(str));
        String s = "";
        while (sc.hasNextLine()){
            s += sc.nextLine() + " ";
        }
        String tmp[] = s.toLowerCase().split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for(String i : tmp){
            set.add(i);
        }
        return set;
    }

    public String difference(WordSet ws2) throws FileNotFoundException {
        TreeSet<String> a = readFile(path);
        TreeSet<String> b = readFile(ws2.path);
        a.removeAll(b);
        String tmp = "";
        for(String i: a){
            tmp += i + " ";
        }
        return tmp.trim();
    }

}
