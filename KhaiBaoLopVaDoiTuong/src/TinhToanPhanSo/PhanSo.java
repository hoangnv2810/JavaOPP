package TinhToanPhanSo;

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

    public PhanSo compact(PhanSo p){
        PhanSo tmp = new PhanSo();
        long g = gcd(p.tu, p.mau);
        tmp.tu = p.tu/g;
        tmp.mau = p.mau/g;
        return tmp;
    }

    public PhanSo sumPs(PhanSo p){
        PhanSo res = new PhanSo();
        res.tu = tu*p.mau + p.tu*mau;
        res.mau = mau*p.mau;
        return compact(res);
    }

    public PhanSo mulPs(PhanSo p){
        PhanSo res = new PhanSo();
        res.tu = tu*p.tu;
        res.mau = mau*p.mau;
        return compact(res);
    }

    @Override
    public String toString() {
        if(tu < 0 && mau < 0){
            tu = Math.abs(tu);
            mau = Math.abs(mau);
        } else if(tu > 0 && mau < 0){
            tu = -tu;
            mau = Math.abs(mau);
        }
        return tu + "/" + mau;
    }
}
