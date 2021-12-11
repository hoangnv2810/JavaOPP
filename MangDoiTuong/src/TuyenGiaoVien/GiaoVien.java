package TuyenGiaoVien;

public class GiaoVien implements Comparable<GiaoVien>{
    private String ma, ten, maXT;
    private float diemTin, diemCM;

    public GiaoVien(int ma, String ten, String maXT, float diemTin, float diemCM) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.maXT = maXT;
        this.diemTin = diemTin;
        this.diemCM = diemCM;
    }

    private String monHoc(){
        if(maXT.startsWith("A")){
            return "TOAN";
        } else if(maXT.startsWith("B")){
            return "LY";
        } else {
            return "HOA";
        }
    }

    private float diemUT(){
        if(maXT.endsWith("1")){
            return 2;
        } else if(maXT.endsWith("2")){
            return 1.5F;
        } else if(maXT.endsWith("3")){
            return 1;
        } else {
            return 0;
        }
    }

    private float tong(){
        return diemTin*2+diemCM+diemUT();
    }

    private String xepLoai(){
        if(tong() >= 18){
            return "TRUNG TUYEN";
        }
        return "LOAI";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + monHoc() + " " + String.format("%.1f", tong()) + " " + xepLoai();
    }

    @Override
    public int compareTo(GiaoVien o) {
        if(tong() < o.tong()){
            return 1;
        } else if(tong() > o.tong()){
            return -1;
        }
        return 0;
    }
}
