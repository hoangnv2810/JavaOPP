package SapXepMatHang;

public class MatHang implements Comparable<MatHang>{
    private String maHang;
    private String tenHang;
    private String nhomHang;
    private float giaMua;
    private float giaBan;

    public MatHang(int n, String[] line) {
        this.maHang = "MH" + String.format("%02d", n);
        this.tenHang = line[0];
        this.nhomHang = line[1];
        this.giaMua = Float.parseFloat(line[2]);
        this.giaBan = Float.parseFloat(line[3]);
    }

    private float loiNhuan(){
        return giaBan-giaMua;
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", loiNhuan());
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
