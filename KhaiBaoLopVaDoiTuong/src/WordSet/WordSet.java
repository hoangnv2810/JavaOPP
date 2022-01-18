package WordSet;
import java.util.TreeSet;

public class WordSet {
    private String s;

    public WordSet(String s) {
        this.s = s;
    }

    public String union(WordSet s2) {
        String tmp[] = s.split("\\s+");
        TreeSet<String> ts = new TreeSet<>();
        for(String str:tmp){
            ts.add(str.toLowerCase());
        }
        TreeSet<String> ts1 = new TreeSet<>();
        String tmp2[] = s2.s.split("\\s+");
        for(String str:tmp2){
            ts1.add(str.toLowerCase());
        }
        ts.addAll(ts1);
        String res = "";
        for(String str:ts){
            res += str+ " ";
        }
        return res.trim();
    }

    public String intersection(WordSet s2) {
        String tmp[] = s.split("\\s+");
        TreeSet<String> ts = new TreeSet<>();
        for(String str:tmp){
            ts.add(str.toLowerCase());
        }
        TreeSet<String> ts1 = new TreeSet<>();
        String tmp2[] = s2.s.split("\\s+");
        for(String str:tmp2){
            ts1.add(str.toLowerCase());
        }
        ts.retainAll(ts1);
        String res = "";
        for(String str:ts){
            res += str+ " ";
        }
        return res.trim();
    }
}
