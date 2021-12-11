package HocBongSinhVien;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private double tbc;
    private int rl;

    public SinhVien(String ten, double tbc, int rl) {
        this.ten = ten;
        this.tbc = tbc;
        this.rl = rl;
    }

    public String getTen() {
        return ten;
    }

    public String hocBong(double tbc){
        if(tbc >= 3.6 && rl >= 90){
            return "XUATSAC";
        } else if(tbc >= 3.2 && rl >= 80){
            return "GIOI";
        } else if(tbc >= 2.5 && rl >= 70){
            return "KHA";
        } else {
            return "KHONG";
        }
    }

    public double getTbc() {
        return tbc;
    }


    @Override
    public int compareTo(SinhVien o) {
        if(tbc < o.tbc){
            return 1;
        } else if(tbc > o.tbc){
            return -1;
        }
        return 0;
    }
}
