package BangDiemThanhPhan1;

public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String name;
    private String className;
    private double[] point;

    public SinhVien(String id, String name, String className, double[] point) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.point = point;
    }

    @Override
    public String toString() {
        String tmp = "";
        for(Double d:point){
            tmp += d + " ";
        }
        tmp.trim();
        return id + " " + name + " " + className + " " + tmp;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(id.compareTo(o.id) > 0){
            return 1;
        } else if(id.compareTo(o.id) < 0){
            return -1;
        }
        return 0;
    }
}
