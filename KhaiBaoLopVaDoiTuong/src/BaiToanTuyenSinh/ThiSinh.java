package BaiToanTuyenSinh;

public class ThiSinh {
    private String id;
    private String name;
    private double pointMath;
    private double pointPhysics;
    private double pointChemistry;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name, double pointMath, double pointPhysics, double pointChemistry) {
        this.id = id;
        this.name = name;
        this.pointMath = pointMath;
        this.pointPhysics = pointPhysics;
        this.pointChemistry = pointChemistry;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPointMath() {
        return pointMath;
    }

    public double getPointPhysics() {
        return pointPhysics;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public void setPointPhysics(double pointPhysics) {
        this.pointPhysics = pointPhysics;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    private double totalPoint(){
        return pointMath*2+pointChemistry+pointPhysics;
    }

    private double priorityPoint(){
        String tmp = getId().substring(0, 3);
        if(tmp.equals("KV1")){
            return 0.5;
        } else if(tmp.equals("KV2")){
            return 1.0;
        } else {
            return 2.5;
        }
    }

    private String check(){
        if(priorityPoint()+totalPoint() >= 24){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }

    private String handle(Double a){
        String s = Double.toString(a);
        int dot = s.indexOf('.');
        if(s.charAt(dot+1) == '0'){
            return s.substring(0, dot);
        } else {
            return s;
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + handle(priorityPoint()) + " " + handle(totalPoint()) + " " + check();
    }
}
