package LietKeNhanVienTheoChucVu;

public class NhanVien {
    private String codeEmp;
    private String name;
    private String position;
    private long salary;
    private int numberWork;

    public NhanVien(int n, String name, String position, long salary, int numberWork) {
        this.codeEmp = "NV" + String.format("%02d", n);
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.numberWork = numberWork;
    }

    public String getPosition() {
        return position;
    }

    private int bonus(){
        if(position.compareTo("GD") == 0){
            return 500;
        } else if(position.compareTo("PGD") == 0){
            return 400;
        } else if(position.compareTo("TP") == 0){
            return 300;
        } else if(position.compareTo("KT") == 0){
            return 250;
        }
        return 100;
    }

    private long totalSalary(){
        return salary*numberWork;
    }

    private long advanceSalary(){
        double tmp = (totalSalary()+bonus())*2/3.0;
        if(tmp < 25000){
            return Math.round(tmp/1000)*1000;
        }
        return 25000;
    }


    @Override
    public String toString() {
        long remainSalary = totalSalary()+bonus()-advanceSalary();
        return codeEmp + " " + name + " " + bonus() + " " + totalSalary() + " " + advanceSalary() + " " + remainSalary;
    }
}
