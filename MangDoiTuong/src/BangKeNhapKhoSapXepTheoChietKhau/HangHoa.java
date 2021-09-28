package BangKeNhapKhoSapXepTheoChietKhau;

public class HangHoa implements Comparable<HangHoa>{
    private String id;
    private String name;
    private int soLuong;
    private long donGia;

    public HangHoa(String name, int soLuong, long donGia) {
        this.name = name;
        this.id = handle(name);
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getName() {
        return name;
    }

    public String handle(String id) {
        String[] tmp = name.split("\\s+");
        String code = "";
        for(int i = 0; i < 2; i++){
            code += Character.toUpperCase(tmp[i].charAt(0));
        }

        if(J05047.mp.containsKey(code)){
            int t = J05047.mp.get(code) + 1;
            J05047.mp.put(code, t);
        } else {
            J05047.mp.put(code, 1);
        }
        return code + String.format("%02d", J05047.mp.get(code));
    }

    private double chietKhau(){
        long tmp = donGia*soLuong;
        if(soLuong > 10){
            return 0.05*tmp;
        } else if(soLuong >= 8){
            return 0.02*tmp;
        } else if(soLuong >= 5){
            return 0.01*tmp;
        } else {
            return 0;
        }
    }

    private long total(){
        return (long) (donGia*soLuong-chietKhau());
    }

    @Override
    public String toString() {
        return id + " " + name + " " +  (long)chietKhau() + " " + total();
    }

    @Override
    public int compareTo(HangHoa o) {
        long ck1 = (long)chietKhau();
        long ck2 = (long)o.chietKhau();
        if(ck1 < ck2){
            return 1;
        } else if(ck1 > ck2){
            return -1;
        }
        return 0;
    }
}
