package TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Gamer{
    private String id;
    private String name;
    private Date entryTime;
    private Date timeOut;

    public Gamer(String id, String name, String entryTime, String timeOut) throws ParseException {
        this.id = id;
        this.name = chuanHoa(name);
        this.entryTime = new SimpleDateFormat("HH:mm").parse(entryTime);
        this.timeOut = new SimpleDateFormat("HH:mm").parse(timeOut);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    private String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++){
                sb.append(Character.toLowerCase(t.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

}
