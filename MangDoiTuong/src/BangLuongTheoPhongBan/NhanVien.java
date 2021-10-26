package BangLuongTheoPhongBan;

public class NhanVien {
    private String id;
    private String name;
    private int salary;
    private int numWork;

    public NhanVien(String id, String name, int salary, int numWork) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.numWork = numWork;
    }

    private String groupEmp() {
        if (id.startsWith("A")) {
            return "A";
        } else if (id.startsWith("B")) {
            return "B";
        } else if (id.startsWith("C")) {
            return "C";
        } else return "D";
    }

    private int numYear() {
        return Integer.parseInt(id.substring(1, 3));
    }

    public String phongBan() {
        return id.substring(3, 5);
    }

    private int heSo() {
        if (groupEmp().compareTo("A") == 0) {
            if (numYear() >= 16) {
                return 20;
            } else if (numYear() >= 9) {
                return 14;
            } else if (numYear() >= 4) {
                return 12;
            } else {
                return 10;
            }
        } else if (groupEmp().compareTo("B") == 0) {
            if (numYear() >= 16) {
                return 16;
            } else if (numYear() >= 9) {
                return 13;
            } else if (numYear() >= 4) {
                return 11;
            } else {
                return 10;
            }
        } else if (groupEmp().compareTo("C") == 0) {
            if (numYear() >= 16) {
                return 14;
            } else if (numYear() >= 9) {
                return 12;
            } else if (numYear() >= 4) {
                return 10;
            } else {
                return 9;
            }
        } else {
            if (numYear() >= 16) {
                return 13;
            } else if (numYear() >= 9) {
                return 11;
            } else if (numYear() >= 4) {
                return 9;
            } else {
                return 8;
            }
        }
    }

    public long income() {
        return heSo() * numWork * salary * 1000;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + income();
    }


}
