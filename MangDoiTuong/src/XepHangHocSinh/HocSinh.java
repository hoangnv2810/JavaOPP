package XepHangHocSinh;

public class HocSinh implements Comparable<HocSinh>{
    private String id;
    private String name;
    private double gpa;

    public HocSinh(int n, String name, double gpa) {
        this.id = "HS" + String.format("%02d", n);
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    private String xepLoai(){
        if(gpa >= 9){
            return "Gioi";
        } else if(gpa >= 7){
            return "Kha";
        } else if(gpa >= 5){
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    @Override
    public int compareTo(HocSinh o) {
        if(gpa > o.gpa){
            return -1;
        } else if(gpa < o.gpa){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gpa + " " + xepLoai();
    }
}
