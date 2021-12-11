package QuanLyKhachSan;

public class LoaiPhong {
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

    public String getKyHieu() {
        return kyHieu;
    }

    public int getDonGia() {
        return donGia;
    }

    public double getPhiPhucVu() {
        return phiPhucVu;
    }
}
