package TinhTienDien;

public class KhachHang {
    private String id;
    private String loaiSD;
    private long chiSoCu;
    private long chiSoMoi;

    public KhachHang(int id, String loaiSD, long chiSoCu, long chiSoMoi) {
        this.id = "KH" + String.format("%02d", id);
        this.loaiSD = loaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int heSo(){
        if(loaiSD.equals("NN")){
            return 5;
        } else if(loaiSD.equals("TT")){
            return 4;
        } else if(loaiSD.equals("KD")){
            return 3;
        } else {
            return 2;
        }
    }

    private long thanhTien(){
        return (chiSoMoi-chiSoCu)*heSo()*550;
    }

    private long phuTroi(){
        if(chiSoMoi-chiSoCu > 100){
            return thanhTien();
        } else if(chiSoMoi-chiSoCu >= 50){
            return (long)(Math.ceil(thanhTien()*0.35)); // note wa
        } else {
            return 0;
        }
    }

    private long tongTien(){
        return phuTroi()+thanhTien();
    }

    @Override
    public String toString() {
        return id + " " + heSo() + " " + thanhTien() + " " + phuTroi() + " " + tongTien();
    }
}
