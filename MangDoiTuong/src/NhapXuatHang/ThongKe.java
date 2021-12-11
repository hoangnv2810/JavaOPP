package NhapXuatHang;

public class ThongKe {
    private MatHang mh;
    private int slNhap, slXuat, donGiaNhap;

    public ThongKe(MatHang mh, int slNhap, int donGiaNhap, int slXuat) {
        this.mh = mh;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
        this.donGiaNhap = donGiaNhap;
    }

    private int tongGTX(){
        if(mh.getXepLoai().compareTo("A") == 0){
            return donGiaNhap*slXuat*108/100;
        } else if(mh.getXepLoai().compareTo("B") == 0){
            return donGiaNhap*slXuat*105/100;
        } else {
            return donGiaNhap*slXuat*102/100;
        }
    }

    @Override
    public String toString() {
        return mh.getMa() + " " + mh.getTen() + " " + slNhap*donGiaNhap + " " + tongGTX();
    }
}
