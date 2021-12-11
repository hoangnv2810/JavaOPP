package DuaXeDap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, donvi;
    private Date time;

    public ThiSinh(String ten, String donvi, String time) throws ParseException {
        this.ma = createCode(ten, donvi);
        this.ten = ten;
        this.donvi = donvi;
        this.time = new SimpleDateFormat("h:mm").parse(time);
    }

    private String createCode(String ten, String donvi) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(donvi);
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
        }
        st = new StringTokenizer(ten);
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return sb.toString().trim();
    }

    private int vantocTB() throws ParseException {
        Date start = new SimpleDateFormat("h:mm").parse("6:00");
        long diff = time.getTime()-start.getTime();
        long minutes = (diff/(1000*60*60)%60)*60 + diff/(1000*60)%60;
        return (int) Math.round(120/((double) minutes/60));
    }

    @Override
    public String toString() {
        try {
            return ma + " " + ten + " " + donvi + " " + vantocTB() + " Km/h";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(time.after(o.time)){
            return 1;
        } else if(time.before(o.time)){
            return -1;
        }
        return 0;
    }
}
