package QuanLyKhoXangDau;

public class DonHang {
    private String id;
    private int soLuong;

    public DonHang(String id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }

    private long donGia() {
        if (id.startsWith("X")) {
            return 128000;
        } else if (id.startsWith("D")) {
            return 11200;
        } else {
            return 9700;
        }
    }

    private String hang() {
        if (id.endsWith("BP")) {
            return "British Petro";
        } else if (id.endsWith("ES")) {
            return "Esso";
        } else if (id.endsWith("SH")) {
            return "Shell";
        } else if (id.endsWith("CA")) {
            return "Castrol";
        } else if (id.endsWith("MO")) {
            return "Mobil";
        } else {
            return "Trong Nuoc";
        }
    }

    private long tongTien() {
        return soLuong * donGia();
    }

    private long tienThue() {
        if (id.endsWith("TN")) {
            return 0;
        } else if (id.startsWith("X")) {
            return tongTien() * 3 / 100;
        } else if (id.startsWith("D")) {
            return tongTien() * 35 / 1000;
        } else {
            return tongTien() * 2 / 100;
        }
    }

    private long thanhTien() {
        return tongTien() + tienThue();
    }

    @Override
    public String toString() {
        return id + " " + hang() + " " + donGia() + " " + tienThue() + " " + thanhTien();
    }
}
