package TuyenDung;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten;
    private float diemLT, diemTH;

    public ThiSinh(int ma, String ten, float diemLT, float diemTH) {
        this.ma = "TS" + String.format("%02d", ma);
        this.ten = ten;
        this.diemLT = chuanHoa(diemLT);
        this.diemTH = chuanHoa(diemTH);
    }

    private float chuanHoa(float diem){
        String tmp = String.valueOf(diem);
        if(diem > 10){
            return (diem/10);
        }
        return diem;
    }

    private float diemTB(){
        return (diemLT+diemTH)/2;
    }

    private String xepLoai(){
        if(diemTB() > 9.5){
            return "XUAT SAC";
        } else if(diemTB() >= 8){
            return "DAT";
        } else if(diemTB() >= 5){
            return "CAN NHAC";
        } else {
            return "TRUOT";
        }
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(diemTB() < o.diemTB()){
            return 1;
        } else if(diemTB() > o.diemTB()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", diemTB()) + " " + xepLoai();
    }
}
