package BaiToanTinhCong;

public class Employee {
    private String id;
    private String name;
    private long salary;
    private long workDay;
    private String position;

    public Employee() {
    }

    public Employee(int n, String name, long salary, long workDay, String position) {
        this.id = "NV" + String.format("%02d", n);
        this.name = name;
        this.salary = salary;
        this.workDay = workDay;
        this.position = position;
    }

    private long monthlySalary(){
        return workDay*salary;
    }

    private double bonus(){
        if(this.workDay >= 25){
            return monthlySalary()*0.2;
        } else if(this.workDay >= 22){
            return monthlySalary()*0.1;
        } else {
            return 0;
        }
    }

    private int allowance(){
        if(this.position.equals("GD")){
            return 250000;
        } else if(this.position.equals("PGD")){
            return 200000;
        } else if(this.position.equals("TP")){
            return 180000;
        } else {
            return 150000;
        }
    }

    private double income(){
        return monthlySalary()+bonus()+allowance();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + monthlySalary() + " " + (long)bonus() + " " + allowance() + " " + (long)income();
    }
}
