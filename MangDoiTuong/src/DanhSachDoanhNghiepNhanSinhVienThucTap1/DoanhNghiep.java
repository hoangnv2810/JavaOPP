package DanhSachDoanhNghiepNhanSinhVienThucTap1;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id;
    private String name;
    private int numberSt;

    public DoanhNghiep(String id, String name, int numberSt) {
        this.id = id;
        this.name = name;
        this.numberSt = numberSt;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberSt;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(numberSt < o.numberSt){
            return 1;
        } else if(numberSt == o.numberSt){
            if(id.compareTo(o.id) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
