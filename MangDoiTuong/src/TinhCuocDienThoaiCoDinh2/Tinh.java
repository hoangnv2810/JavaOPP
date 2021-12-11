package TinhCuocDienThoaiCoDinh2;

public class Tinh {
    private String maVung;
    private String ten;
    private int giaCuoc;

    public Tinh(String maVung, String ten, int giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public String getMaVung() {
        return maVung;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }
}
