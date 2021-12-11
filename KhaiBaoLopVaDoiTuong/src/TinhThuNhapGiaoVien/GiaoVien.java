package TinhThuNhapGiaoVien;

public class GiaoVien {
    private String id;
    private String name;
    private long salary;

    public GiaoVien(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    private int heSo(){
        return Integer.parseInt(id.substring(2, 4));
    }

    private long income(){
        return salary*heSo()+bonus();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + heSo() + " " + bonus() + " " + income();
    }
}
