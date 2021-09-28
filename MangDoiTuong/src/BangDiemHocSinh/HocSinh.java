package BangDiemHocSinh;

public class HocSinh implements Comparable<HocSinh>{
    private String id;
    private String name;
    private double gpa;
    private double[] point;

    public HocSinh(int n, String name, String point) {
        this.id = "HS" + String.format("%02d", n);
        this.name = name;
        double[] fb = new double[10];
        String[] s = point.split("\\s+");
        for(int i = 0; i < 10; i++){
            fb[i] = Double.parseDouble(s[i]);
        }
        this.point = fb;
        calGpa();
    }

    private void calGpa(){
        double sum = 0;
        for(int i = 0; i < 10; i++){
            if(i == 0 || i == 1){
                sum += point[i]*2;
            }
            else {
                sum += point[i];
            }
        }
        this.gpa = Math.round((sum/12)*10.0) / 10.0;
    }

    private String calRank(){
        if(gpa >= 9){
            return "XUAT SAC";
        } else if(gpa >= 8){
            return "GIOI";
        } else if(gpa >= 7){
            return "KHA";
        } else if(gpa >= 5){
            return "TB";
        } else {
            return "YEU";
        }
    }

    @Override
    public int compareTo(HocSinh o) {
        if(gpa < o.gpa) return 1;
        if(gpa == o.gpa){
            if(id.compareTo(o.id) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", gpa) + " " + calRank();
    }
}
