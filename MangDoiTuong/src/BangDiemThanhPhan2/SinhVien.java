package BangDiemThanhPhan2;

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
        if(name.compareTo(o.name) > 0){
            return 1;
        } else if(name.compareTo(o.name) < 0){
            return -1;
        }
        return 0;
    }
}
