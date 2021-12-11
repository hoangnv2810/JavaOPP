package TinhCuocDienThoaiCoDinh1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuocGoi {
    private String thueBao;
    private Date start;
    private Date end;
    private Tinh tinh;

    public CuocGoi(String thueBao, String start, String end, Tinh tinh) throws ParseException {
        this.thueBao = thueBao;
        this.start = new SimpleDateFormat("HH:mm").parse(start);
        this.end = new SimpleDateFormat("HH:mm").parse(end);
        this.tinh = tinh;
    }

    public CuocGoi(String thueBao, String start, String end) throws ParseException {
        this.thueBao = thueBao;
        this.start = new SimpleDateFormat("HH:mm").parse(start);
        this.end = new SimpleDateFormat("HH:mm").parse(end);
    }

    public long soPhut(){
        long diff = end.getTime()-start.getTime();
        long minutes = diff/(1000*60)%60;
        long hours = diff/(1000*60*60)%60;
        long sum = minutes + hours*60;
        if(thueBao.startsWith("0")){
            return sum;
        } else {
            return Math.round(sum/3.0);
        }
    }

    public long giaCuoc(){
        if(thueBao.startsWith("0")){
            return soPhut()*tinh.getGiaCuoc();
        } else {
            return soPhut()*800;
        }
    }

    public String getNameDic(){
        if(thueBao.startsWith("0")){
            return tinh.getTen();
        } else {
            return "Noi mang";
        }
    }
    @Override
    public String toString() {
        return thueBao + " " + getNameDic() + " " + soPhut() + " " + giaCuoc();
    }
}
