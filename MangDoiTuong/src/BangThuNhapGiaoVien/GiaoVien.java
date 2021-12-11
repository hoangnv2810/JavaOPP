package BangThuNhapGiaoVien;

public class GiaoVien {
    private String id;
    private String name;
    private int salary;

    public GiaoVien(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    private int heSo(){
        return Integer.parseInt(id.substring(2, 4));
    }

    private long bonus(){
        if(id.startsWith("HT")){
            return 2_000_000;
        } else if(id.startsWith("HP")){
            return 900_000;
        } else {
            return 500_000;
        }
    }

    private long income(){
        return heSo()*salary+bonus();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + heSo() + " " + bonus() + " " + income();
    }
}
