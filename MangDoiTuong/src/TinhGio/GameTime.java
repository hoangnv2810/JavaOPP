package TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GameTime extends Gamer implements Comparable<GameTime>{
    private long diffMinutes;
    private long diffHours;

    public GameTime(String id, String name, String entryTime, String timeOut) throws ParseException {
        super(id, name, entryTime, timeOut);
        calTime();
    }

    public Date calTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long diff = getTimeOut().getTime()-getEntryTime().getTime();
        diffMinutes = diff/(60*1000)%60;
        diffHours = diff/(60*60*1000)%24;
        String s = String.valueOf(diffHours) + ":" + String.valueOf(diffMinutes);
        return sdf.parse(s);
    }

    @Override
    public int compareTo(GameTime o) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        try {
            c1.setTime(calTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            c2.setTime(o.calTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(c1.after(c2)) return -1;
        if(c1.before(c2)) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + diffHours + " gio " + diffMinutes + " phut";
    }
}
