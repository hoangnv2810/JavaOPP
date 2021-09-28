package TongPhanSo;

public class PhanSo {
    private long tu;
    private long mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    private void ruGon(){
        long x = gcd(tu, mau);
        tu = tu/x;
        mau = mau/x;
    }
    public PhanSo sumPs(PhanSo a){
        PhanSo res = new PhanSo();
        res.tu = a.tu*this.mau + this.tu*a.mau;
        res.mau = a.mau*this.mau;
        res.ruGon();
        return res;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
