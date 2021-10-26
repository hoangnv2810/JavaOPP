package LietKeNhanVienTheoNhom;

public class NhanVien implements Comparable<NhanVien>{
    private String ma;
    private String name;

    public NhanVien(String ma, String name) {
        this.ma = ma;
        this.name = name;
    }

    public String chuVu(){
        return ma.substring(0,2);
    }

    private String heSoLuong(){
        return ma.substring(2,4);
    }

    private String soHieu(){
        return ma.substring(4, ma.length());
    }

    @Override
    public String toString() {
        return name + " " + chuVu() + " " + soHieu() + " " + heSoLuong();
    }

    @Override
    public int compareTo(NhanVien o) {
        if(heSoLuong().compareTo(o.heSoLuong()) < 0){
            return 1;
        } else if(heSoLuong().compareTo(o.heSoLuong()) == 0){
            if(soHieu().compareTo(o.soHieu()) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}