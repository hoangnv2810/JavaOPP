package TimKiemNhanVienTheoTen;

public class NhanVien implements Comparable<NhanVien>{
    private String id;
    private String name;

    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String chucVu(){
        return id.substring(0, 2);
    }

    public String heSoLuong(){
        return id.substring(2, 4);
    }

    public String soHieu(){
        return id.substring(4);
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + chucVu() + " " + soHieu() + " " + heSoLuong();
    }

    public String getName() {
        return name;
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
