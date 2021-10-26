package BangKeTienLuong;

public class NhanVien {
    private String id;
    private String name;
    private int luongNgay;
    private int soNC;
    private String chucVu;

    public NhanVien(int n, String name, int luongNgay, int soNC, String chucVu) {
        this.id = "NV" + String.format("%02d", n);
        this.name = name;
        this.luongNgay = luongNgay;
        this.soNC = soNC;
        this.chucVu = chucVu;
    }

    private long luongThang(){
        return luongNgay*soNC;
    }

    private long thuong(){
        if(soNC >= 25){
            return (long) (0.2*luongThang());
        } else if(soNC >= 22){
            return (long) (0.1*luongThang());
        } else{
            return 0;
        }
    }

    private int phuCap(){
        if(chucVu.compareTo("GD") == 0){
            return 250000;
        } else if(chucVu.compareTo("PGD") == 0){
            return 200000;
        } else if(chucVu.compareTo("TP") == 0){
            return 180000;
        } else {
            return 150000;
        }
    }

    public long total(){
        return luongThang() + thuong() + phuCap();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + total();
    }
}
