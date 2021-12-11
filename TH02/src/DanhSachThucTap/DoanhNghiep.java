package DanhSachThucTap;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id;
    private String name;
    private int number;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public DoanhNghiep() {
    }

    public DoanhNghiep(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(id.compareTo(o.id) > 0){
            return 1;
        } else if(id.compareTo(o.id) < 0){
            return -1;
        }
        return 0;
    }
}
