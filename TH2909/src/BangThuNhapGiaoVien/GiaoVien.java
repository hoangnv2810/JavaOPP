package BangThuNhapGiaoVien;

public class GiaoVien {
    private String ma;
    private String name;
    private long luongCB;

    public GiaoVien(String ma, String name, long luongCB) {
        this.ma = ma;
        this.name = name;
        this.luongCB = luongCB;

    }

    public String getMa() {
        return ma;
    }

    private String chucVu(){
        return ma.substring(0,2);
    }

    private int heSo(){
        return Integer.parseInt(ma.substring(2, 4));
    }

    private int phuCap(){
        String tmp = chucVu();
        if(tmp.equals("HT")){
            return 2000000;
        } else if(tmp.equals("HP")){
            return 900000;
        } else if(tmp.equals("GV")){
            return 500000;
        }
        return 0;
    }

    private long thuNhap(){
        return luongCB*heSo()+phuCap();
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + heSo() + " " + phuCap() + " " + thuNhap();
    }
}
