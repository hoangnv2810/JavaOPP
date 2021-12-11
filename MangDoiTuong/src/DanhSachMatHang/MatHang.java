package DanhSachMatHang;

public class MatHang implements Comparable<MatHang>{
    private String ma, ten, donvi;
    private int giaMua, giaBan;

    public MatHang(int ma, String ten, String donvi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.donvi = donvi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    private int loiNhuan(){
        return giaBan-giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + giaMua + " " + giaBan + " " + loiNhuan();
    }

    @Override
    public int compareTo(MatHang o) {
        if(loiNhuan() < o.loiNhuan()){
            return 1;
        } else if(loiNhuan() > o.loiNhuan()){
            return -1;
        }
        return 0;
    }
}
