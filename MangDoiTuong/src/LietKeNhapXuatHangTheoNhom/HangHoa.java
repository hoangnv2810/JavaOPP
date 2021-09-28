package LietKeNhapXuatHangTheoNhom;

public class HangHoa implements Comparable<HangHoa>{
    private String id;
    private int soLuongNhap;

    public HangHoa(String id, int soLuongNhap) {
        this.id = id;
        this.soLuongNhap = soLuongNhap;
    }

    public String ktDau(){
        return id.substring(0,1);
    }

    private String ktCuoi(){
        return id.substring(id.length()-1, id.length());
    }

    private int soLuongXuat(){
        if(ktDau().equals("A")){
            return (int)Math.round(0.6*soLuongNhap);
        }
        return (int)Math.round(0.7*soLuongNhap);
    }

    private int donGia(){
        if(ktCuoi().equals("Y")){
            return 110000;
        } else {
            return 135000;
        }
    }

    private long tien(){
        return soLuongXuat()*donGia();
    }

    private long thue(){
        long price = tien();
        String ktdau = ktDau();
        String ktcuoi = ktCuoi();
        if(ktdau.equals("A") && ktcuoi.equals("Y")){
            return (long)(0.08*price);
        } else if(ktdau.equals("A") && ktcuoi.equals("N")){
            return (long)(0.11*price);
        } else if(ktdau.equals("B") && ktcuoi.equals("Y")){
            return (long)(0.17*price);
        } else {
            return (long)(0.22*price);
        }
    }

    @Override
    public String toString() {
        return id + " " + soLuongNhap + " " + soLuongXuat() + " " + donGia() + " " + tien() + " " + thue();
    }

    @Override
    public int compareTo(HangHoa o) {
        if(thue() < o.thue()){
            return 1;
        } else if(thue() > o.thue()){
            return -1;
        }
        return 0;
    }
}
