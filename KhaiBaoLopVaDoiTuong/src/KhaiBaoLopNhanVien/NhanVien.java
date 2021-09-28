package KhaiBaoLopNhanVien;

public class NhanVien {
    private String id;
    private String name;
    private String gender;
    private String dob;
    private String address;
    private String taxCode;
    private String signDate;

    public NhanVien(String name, String gender, String dob, String address, String taxCode, String signDate){
        this.id = "00001";
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + taxCode + " " + signDate;
    }
}
