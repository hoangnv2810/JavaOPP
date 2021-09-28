package SapXepThoiGian;

import java.util.StringTokenizer;

public class Time implements Comparable<Time>{
    private String time;

    public Time(String time){
        this.time = time;
        handle();
    }

    public void handle(){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(time);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            sb.append(t+" ");
        }
        time = sb.toString().trim();
    }

    @Override
    public int compareTo(Time o) {
        if(time.compareTo(o.time) > 0) return 1;
        if(time.compareTo(o.time) < 0) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return time;
    }
}
