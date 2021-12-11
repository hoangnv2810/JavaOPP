package XepHang;

public class XepHang implements Comparable<XepHang>{
    private int thoiDiem;
    private int thoiGian;

    public XepHang(int thoiDiem, int thoiGian) {
        this.thoiDiem = thoiDiem;
        this.thoiGian = thoiGian;
    }

    public int tong(XepHang b){
        if(b.thoiGian > thoiDiem+thoiGian){
            return b.thoiGian+b.thoiDiem + thoiDiem+thoiGian;
        }
//        else if(b.thoiDiem <
        return 1;
    }
    @Override
    public int compareTo(XepHang o) {
        if(thoiDiem > o.thoiDiem){
            return 1;
        } else if(thoiDiem == o.thoiDiem){
            if(thoiGian > o.thoiGian){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return thoiDiem + " " + thoiGian;
    }
}
