package SapXepKetQuaTuyenSinh;

public class HocSinh implements Comparable<HocSinh>{
    private String id;
    private String name;
    private float[] point;

    public HocSinh(String id, String name, float[] point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    private float diemUT(){
        if(id.startsWith("KV1")){
            return 0.5F;
        } else if(id.startsWith("KV2")){
            return 1;
        } else {
            return 2.5F;
        }
    }

    private float tongDiem(){
        float sum = 0;
        for(int i = 0; i < 3; i++){
            if(i == 0) sum += point[i]*2;
            else sum += point[i];
        }
        return sum;
    }

    private String check(){
        if(tongDiem()+diemUT() >= 24){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }

    private String convert(float num){
        if(num == (int)num){
            return String.valueOf((int)num);
        }
        return String.valueOf(num);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + convert(diemUT()) + " " + convert(tongDiem()+diemUT()) + " " + check();
    }

    @Override
    public int compareTo(HocSinh o) {
        float cmp1 = tongDiem()+diemUT();
        float cmp2 = o.tongDiem()+o.diemUT();
        if(cmp1 > cmp2){
            return -1;
        } else if(cmp1 == cmp2){
            if(id.compareTo(o.id) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return 1;
    }
}
