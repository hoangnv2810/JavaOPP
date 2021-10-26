package TimThuKhoaCuaKyThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HocSinh implements Comparable<HocSinh>{
    private int id;
    private String name;
    private Date dob;
    private float[] point;

    public HocSinh(int id, String name, String dob, float[] point) throws ParseException {
        this.id = id;
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.point = point;
    }

    public float tongDiem(){
        float sum = 0;
        for(int i = 0; i < 3; i++){
            sum += point[i];
        }
        return sum;
    }

    private String convert(float num){
        if(num == (int)num){
            return String.valueOf((int)num);
        }
        return String.valueOf(num);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + convert(tongDiem());
    }

    @Override
    public int compareTo(HocSinh o) {
        if(tongDiem() > o.tongDiem()){
            return -1;
        } else if(tongDiem() == o.tongDiem()){
            if(id > o.id){
                return 1;
            } else {
                return -1;
            }
        }
        return 1;
    }
}
