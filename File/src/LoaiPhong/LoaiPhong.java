package LoaiPhong;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyHieu;
    private String loaiPhong;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String str) {
        String s[] = str.split("\\s+");
        this.kyHieu = s[0];
        this.loaiPhong = s[1];
        this.donGia = Integer.parseInt(s[2]);
        this.phiPhucVu = Double.parseDouble(s[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        if(loaiPhong.compareTo(o.loaiPhong) > 0){
            return 1;
        } else if(loaiPhong.compareTo(o.loaiPhong) < 0){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return kyHieu + " " + loaiPhong + " " + donGia + " " + phiPhucVu;
    }
}
