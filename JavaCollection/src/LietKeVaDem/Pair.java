package LietKeVaDem;

public class Pair implements Comparable<Pair>{
    private String key;
    private int value;

    public Pair(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair o) {
        if(value < o.value){
            return 1;
        } else if(value > o.value){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
