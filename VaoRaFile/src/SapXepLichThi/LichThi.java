package SapXepLichThi;

public class LichThi implements Comparable<LichThi>{
    private CaThi ct;
    private MonThi mt;
    private String maNhom;
    private int soSV;


    public LichThi(CaThi ct, MonThi mt, String maNhom, String soSV) {
        this.ct = ct;
        this.mt = mt;
        this.maNhom = maNhom;
        this.soSV = Integer.parseInt(soSV);
    }

    @Override
    public String toString() {
        return ct + " " + mt + " " + maNhom + " " + soSV;
    }

    @Override
    public int compareTo(LichThi o) {
        if(ct.getNgayThi().after(o.ct.getNgayThi())){
            return 1;
        } else if(ct.getNgayThi().before(o.ct.getNgayThi())){
            return -1;
        } else {
            if(ct.getGioThi().after(o.ct.getGioThi())){
                return 1;
            } else if(ct.getGioThi().before(o.ct.getGioThi())){
                return -1;
            } else {
                if(ct.getMa().compareTo(o.ct.getMa()) > 0){
                    return 1;
                } else if(ct.getMa().compareTo(o.ct.getMa()) < 0){
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
