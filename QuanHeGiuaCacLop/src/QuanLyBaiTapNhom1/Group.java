package QuanLyBaiTapNhom1;

public class Group {
    private String idGroup;
    private String nameBT;

    public Group(String idGroup, String nameBT) {
        this.idGroup = idGroup;
        this.nameBT = nameBT;
    }

    public String getIdGroup() {
        return idGroup;
    }

    @Override
    public String toString() {
        return nameBT;
    }
}
