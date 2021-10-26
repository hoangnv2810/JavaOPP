package SoPhuc;

public class SoPhuc {
    private double thuc;
    private double ao;

    public SoPhuc() {
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc mul(SoPhuc b){
        SoPhuc res = new SoPhuc();
        res.thuc = this.thuc*b.thuc - this.ao*b.ao;
        res.ao = this.thuc*b.ao + this.ao*b.thuc;
        return res;
    }

    public SoPhuc sum(SoPhuc b){
        return new SoPhuc(this.thuc+b.thuc, this.ao+b.ao);
    }

    private String convert(double a){
        if(a == (int)a){
            return String.valueOf((int)a);
        } else {
            return String.valueOf(a);
        }
    }
    @Override
    public String toString() {
        if(ao > 0) return convert(thuc) + " + " + convert(ao) + "i";
        else return convert(thuc) + " - " + convert(Math.abs(ao)) + "i";
    }
}
